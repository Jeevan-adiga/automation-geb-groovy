package com.adressbook.helpers

import com.adressbook.pages.HomePage
import com.adressbook.pages.SignInPage

trait SignInHelper {

    SignInPage signInPage = this

    HomePage signIn(String emailId, String password) {
        assert signInPage.headerLabel.displayed
        assert signInPage.headerLabel.text() == signInPage.HEADER_TEXT
        signInPage.emailInput << emailId
        signInPage.passwordInput << password
        signInPage.signInButton.click()
        assert signInPage.browser.isAt(HomePage)
        assert signInPage.navigationbar.currentUserLabel.text() == emailId
        signInPage.browser.at HomePage
    }
}