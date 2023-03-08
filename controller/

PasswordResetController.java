

@RestController
@RequestMapping("/forget-password")
public class PasswordResetController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordResetService passwordResetService;

    @Autowired
    private PasswordValidator passwordValidator;

    @PostMapping("/reset")
    public ResponseEntity<String> resetPassword(@RequestParam("email") String email) {

        // Validate that the user has a registered email address
        if (!userService.isRegistered(email)) {
            return ResponseEntity.badRequest().body("Email is not registered.");
        }

        // Generate reset password link
        String resetLink = passwordResetService.generateResetLink(email);

        // Send the reset password link to the registered email address
        passwordResetService.sendResetLink(resetLink);

        return ResponseEntity.ok("Password reset link sent to the registered email address.");
    }

    @PutMapping("/reset/{resetLink}")
    public ResponseEntity<String> newPassword(@PathVariable("resetLink") String resetLink,
            @RequestParam("oldPassword") String oldPassword,
            @RequestParam("newPassword") String newPassword,
            @RequestParam("confirmPassword") String confirmPassword) {

        // Validate the reset link
        if (!passwordResetService.isValidResetLink(resetLink)) {
            return ResponseEntity.badRequest().body("Invalid reset link.");
        }
        // Validate the new password
        if (!passwordValidator.isValidPassword(newPassword)) {
            return ResponseEntity.badRequest().body("Invalid new password.");
        }
        // Validate the confirm password
        if (!newPassword.equals(confirmPassword)) {
            return ResponseEntity.badRequest().body("Passwords do not match.");
        }
        // Validate the old password
        if (!passwordResetService.isValidOldPassword(resetLink, oldPassword)) {
            return ResponseEntity.badRequest().body("Old password does not match.");
        }

        // Reset the password
        passwordResetService.changePassword(resetLink, newPassword);

        return ResponseEntity.ok("Password changed successfully.");
    }
}