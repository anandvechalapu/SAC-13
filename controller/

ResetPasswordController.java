

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reset-password")
public class ResetPasswordController {

    @PostMapping
    public ResponseEntity<?> resetPassword(@RequestBody ResetPasswordRequest resetPasswordRequest) {
        //Validate if the user has access to a registered email address before allowing them to reset their password
        //Validate if the new password meets the security criteria
        //Send reset password link to the user's registered email address
        //Send a confirmation message to the user's email once the password has been changed successfully
        //Validate if the user is able to access the functionalities upon successful login

        return new ResponseEntity<>(HttpStatus.OK);
    }

}