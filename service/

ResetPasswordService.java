

import org.springframework.stereotype.Service;

@Service
public class ResetPasswordService {

    public void resetPassword(String emailAddress) {
        // validate that the user has access to a registered email address
        // send a reset password link to the registered email address
        // validate that the new password meet the minimum complexity requirements
        // send a confirmation message to their email once the password is changed successfully
        // validate that the user is able to access the functionalities upon successful login
    }
}