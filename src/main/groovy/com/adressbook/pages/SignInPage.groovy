package com.adressbook.pages

import auto.framework.BasePage
import com.adressbook.helpers.SignInHelper

class SignInPage extends BasePage implements SignInHelper {

    String HEADER_TEXT = "Sign in"

    static at = {
        waitFor { headerLabel.text() == HEADER_TEXT }
    }

    static content = {
        headerLabel { $("h2") }
        emailInput { $("#session_email") }
        passwordInput { $("#session_password") }
        signInButton { $("[data-test=submit]") }
        signUpLink { $("[data-test=sign-up]") }
    }

}