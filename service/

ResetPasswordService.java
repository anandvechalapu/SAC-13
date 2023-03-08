

package com.sacaral.service;

import com.sacaral.dto.UserDto;

public interface ResetPasswordService {

    // Ability to go to the Sacaral.ai login page.
    public void goToLoginPage();

    // Ability to click on the “Forgot Password” link.
    public void clickOnForgotPasswordLink();

    // Ability input their registered email address to get a password reset link through email.
    public void enterRegisteredEmailId(String emailId);

    // Ability to click on the link which is sent to the email.
    public void clickOnLinkSentToMail();

    // Ability to enter the following details:
    // Old password
    // New password
    // Confirm password
    public void enterPasswordDetails(String oldPassword, String newPassword, String confirmPassword);

    // Ability to click on submit.
    public void clickOnSubmit();

    // Ability to login into the website using new password.
    public UserDto loginWithNewPassword();

    // Verify to make sure the user has access to a registered email address before allowing them to reset their password.
    public boolean verifyUserHasRegisteredEmail(String emailId);

    // Verify to make sure to get the verification link.
    public boolean verifyVerificationLink(String emailId);

    // Verify to make sure the user clicked the right link to change their password.
    public boolean verifyUserClickedRightLink();

    // Verify to make sure that the user has created a new password that satisfies with the security criteria (for example, it should be strong and unique).
    public boolean verifyNewPasswordSatisfiesCriteria(String newPassword);

    // Verify to see the user is responsible for safeguarding their new password and for any actions taken using their accounts.
    public boolean verifyUserResponsibleForNewPassword();

    // Verify to make sure the user is not permitted to use the previous password.
    public boolean verifyUserNotPermittedToUsePreviousPassword();

}