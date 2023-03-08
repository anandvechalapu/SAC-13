

@Repository
public interface ResetPasswordRepository {

    public void resetPassword(String emailAddress);
    
    public void validateVerificationLink(String verificationLink);
    
    public void updatePassword(String oldPassword, String newPassword, String confirmPassword);
    
    public void validatePasswordComplexity(String newPassword);
    
    public void sendConfirmationMessage(String emailAddress);
    
    public void validateLogin(String newPassword);
}