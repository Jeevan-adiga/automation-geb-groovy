package com.adressbook.pages

import com.adressbook.core.BasePage

class SignUpPage extends BasePage {

    static at = {
        waitFor { headerLabel.text() == "Sign up" }
    }

    static content = {
        headerLabel { $("h2") }
        emailInput { $("#user_email") }
        passwordInput { $("#user_password") }
        signUpButton { $("[data-test=submit]") }
        signIpLink { $("[data-test=sign-up]") }
    }

}