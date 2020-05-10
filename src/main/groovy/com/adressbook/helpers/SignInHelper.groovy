package com.adressbook.helpers

import com.adressbook.pages.HomePage
import com.adressbook.pages.SignInPage

trait SignInHelper {

    SignInPage signInPage = this

    void signIn(String emailId, String password) {
        assert signInPage.headerLabel.displayed
        assert signInPage.headerLabel.text() == signInPage.HEADER_TEXT
        signInPage.emailInput << emailId
        signInPage.passwordInput << password
        signInPage.signInButton.click()
        assert signInPage.browser.isAt(HomePage)
    }
}