

import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordResetRepository extends JpaRepository<PasswordReset, Long> {
 
    PasswordReset findByEmail(String email);
 
    PasswordReset findByResetToken(String resetToken);
 
    PasswordReset findByOldPassword(String oldPassword);
 
    PasswordReset findByNewPassword(String newPassword);
 
    PasswordReset findByConfirmPassword(String confirmPassword);
 
}