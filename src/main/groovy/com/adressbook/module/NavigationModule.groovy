package com.adressbook.module

import com.adressbook.core.BaseModule
import com.adressbook.pages.AddressListPage
import com.adressbook.pages.SignInPage

class NavigationModule extends BaseModule {

    static content = {
        homeLink { $("[data-test=home]") }
        addressesLink { $("[data-test=addresses]") }
        signInLink { $("[data-test=sign-in]") }
        signOutLink { $("[data-test=sign-out]") }
        currentUserLabel { $("[data-test=current-user]") }
    }

    SignInPage clickOnSignIn() {
        signInLink.click(SignInPage)
        browser.at SignInPage
    }

    AddressListPage clickOnAddresses() {
        addressesLink.click(AddressListPage)
        browser.at AddressListPage
    }
}
