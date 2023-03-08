

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/password")
public class PasswordController {

    //Endpoint for the user to start the reset password flow
    @RequestMapping(value = "/forgotPassword", method = RequestMethod.GET)
    public void startForgotPasswordFlow(@RequestParam String email) {
        //Verify if the user has an active account associated with this email address
        //Send a reset password link to the registered email address
    }

    //Endpoint for the user to reset their password
    @RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
    public void resetPassword(@RequestParam String oldPassword, @RequestParam String newPassword, @RequestParam String confirmPassword) {
        //Verify to make sure that the user has created a new password that satisfies with the security criteria
        //Update the user's password in the database
        //Send a confirmation message to the user's email
    }
}