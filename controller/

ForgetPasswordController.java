

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/forgetPassword")
public class ForgetPasswordController {
    @GetMapping
    public String showForgetPasswordForm(){
        //return the form to enter email address
        return "forgetpasswordForm";
    }
    
    @PostMapping
    public String resetPassword(@RequestParam String emailAddress){
        //validate the email address
        //send reset password link to the email
        //return response
        return "Link Sent Successfully";
    }
    
    @GetMapping("/changePassword")
    public String showChangePasswordForm(){
        //return the form to enter old & new password
        return "changepasswordForm";
    }
    
    @PostMapping("/changePassword")
    public String changePassword(@RequestParam String oldPassword, @RequestParam String newPassword, @RequestParam String confirmPassword){
        //validate the old & new password
        //change the password
        //return response
        return "Password Changed Successfully";
    }
}