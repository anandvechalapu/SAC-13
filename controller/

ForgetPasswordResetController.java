

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForgetPasswordResetController {

    @Autowired
    private UserService userService;

    @GetMapping("/forgetPassword")
    public String forgetPassword(){
        return "Forget Password page";
    }

    @PostMapping("/resetPassword")
    public String resetPassword(@RequestParam String email){
        //Validate that the user has access to a registered email address before allowing them to reset their password.
        if(userService.validateEmail(email)){
            //Generate a reset password link and send it to the registered email address
            String resetPasswordLink = userService.generatePasswordResetLink(email);
            //Send the reset password link to the registered email address
            userService.sendResetPasswordLink(resetPasswordLink, email);
            //Return the reset password page
            return "Reset Password page";
        }
        else{
            //Return the error page
            return "Error page";
        }
    }

    @PostMapping("/updatePassword")
    public String updatePassword(@RequestParam String oldPassword, @RequestParam String newPassword, @RequestParam String confirmPassword){
        //Validate that the new password should meet the minimum complexity requirements and satisfies the security criteria
        if(userService.validatePassword(newPassword)){
            //Update the password
            userService.updatePassword(oldPassword, newPassword, confirmPassword);
            //Send a confirmation message to their email once the password has been changed successfully
            userService.sendPasswordChangeConfirmation(email);
            //Return the success page
            return "Success page";
        }
        else{
            //Return the error page
            return "Error page";
        }
    }
}