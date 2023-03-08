

@Repository
public class ResetPasswordRepository {
    
    public void resetPassword(String emailAddress) {
        // Validate that the user has access to a registered email address
        // Send a reset password link to the registered email address
    }
    
    public void verifyLink(String link) {
        // Validate that the user clicked the right link to change their password
    }
    
    public void updatePassword(String oldPassword, String newPassword, String confirmPassword) {
        // Validate that the user has created a new password that satisfies with the security criteria
        // Send a confirmation message to their email once the password has been changed successfully
    }
    
    public void validatePassword(String newPassword) {
        // Validate that the new password should meet the minimum complexity requirements and satisfies the security criteria
    }
    
    public void validateUser(String emailAddress) {
        // Validate that the user is able to access the functionalities upon successful login
    }
    
    public void validateOldPassword(String oldPassword) {
        // Validate that the user is not permitted to use the previous password
    }
}