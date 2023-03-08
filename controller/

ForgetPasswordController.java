

package com.sacaral.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForgetPasswordController {

    @RequestMapping(value = "/forgetPassword", method = RequestMethod.GET)
    public ModelAndView forgetPassword() {
        return new ModelAndView("forgetPassword");
    }

    @RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
    public ModelAndView resetPassword(@RequestParam("email") String email) {
        //verify the registered email address
        if(verifyEmail(email)) {
            //send the reset password link to the provided email
            sendResetPasswordLink(email);
            return new ModelAndView("resetPassword");
        } else {
            return new ModelAndView("forgetPassword");
        }
    }

    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    public ModelAndView updatePassword(@RequestParam("oldPassword") String oldPassword, 
                                       @RequestParam("newPassword") String newPassword,
                                       @RequestParam("confirmPassword") String confirmPassword) {
        //verify the old password and new password
        if(verifyPassword(oldPassword, newPassword, confirmPassword)) {
            //update the password
            updatePassword(newPassword);
            return new ModelAndView("login");
        } else {
            return new ModelAndView("resetPassword");
        }
    }

    private boolean verifyEmail(String email) {
        //verify the registered email address
        //return true if the email address is valid
        //return false if the email address is invalid
        return true;
    }

    private void sendResetPasswordLink(String email) {
        //send the reset password link to the provided email
    }

    private boolean verifyPassword(String oldPassword, String newPassword, String confirmPassword) {
        //verify the old password and new password
        //return true if the passwords are valid
        //return false if the passwords are invalid
        return true;
    }

    private void updatePassword(String newPassword) {
        //update the new password
    }
}