

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/forget-password/reset-password")
public class ForgetPasswordResetPasswordController {
    
    // Ability to go to the Sacaral.ai login page.
    @GetMapping("/login-page")
    public String getLoginPage() {
        return "Sacaral.ai login page";
    }
    
    // Ability to click on the “Forgot Password” link.
    @GetMapping("/forgot-password")
    public String getForgotPasswordLink() {
        return "Link for Forgot Password";
    }
    
    // Ability input their registered email address to get a password reset link through email.
    @PostMapping("/reset-link")
    public String getPasswordResetLink(@RequestParam String email) {
        return "Password reset link sent to " + email;
    }
    
    // Ability to click on the link which is sent to the email.
    @GetMapping("/link")
    public String getLink() {
        return "Link to reset password";
    }
    
    // Ability to enter the following details: Old password, New password, Confirm password.
    @PostMapping("/details")
    public String enterDetails(@RequestParam String oldPassword, @RequestParam String newPassword, @RequestParam String confirmPassword) {
        return "Password details entered";
    }
    
    // Ability to click on submit.
    @PostMapping("/submit")
    public String submit() {
        return "Submit button clicked";
    }
    
    // Ability to login into the website using new password.
    @PostMapping("/login")
    public String login(@RequestParam String newPassword) {
        return "Logged in with new password " + newPassword;
    }
}