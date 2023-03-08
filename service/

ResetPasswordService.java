

@Service
public class ResetPasswordService {
    
    public boolean resetPassword(String emailAddress, String oldPassword, String newPassword, String confirmPassword) {
        //Validate the user has access to a registered email address
        if (!isValidEmailAddress(emailAddress)) {
            return false;
        }
        
        //Validate that the user clicked the right link to change their password
        if (!isValidResetLink(emailAddress)) {
            return false;
        }
        
        //Validate that the user has created a new password that satisfies with the security criteria
        if (!isValidPassword(newPassword)) {
            return false;
        }
        
        //Validate to make sure the user is not permitted to use the previous password
        if (oldPassword.equals(newPassword)) {
            return false;
        }
        
        //Validate to make sure the user has entered the same password in confirm password field
        if (!confirmPassword.equals(newPassword)) {
            return false;
        }
        
        //Send a confirmation message to the user's email address once the password has been changed successfully
        sendPasswordConfirmationMessage(emailAddress);
        
        return true;
    }
    
    //Method to validate if the email address entered is valid
    private boolean isValidEmailAddress(String emailAddress) {
        //validation logic
    }
    
    //Method to validate if the reset link sent is valid
    private boolean isValidResetLink(String resetLink) {
        //validation logic
    }
    
    //Method to validate the new password
    private boolean isValidPassword(String password) {
        //validation logic
    }
    
    //Method to send a confirmation message to the user's email address once the password has been changed successfully
    private void sendPasswordConfirmationMessage(String emailAddress) {
        //send confirmation message logic
    }

}