package com.adressbook.module

import auto.framework.BaseModule

class NavigationModule extends BaseModule {

    static content = {
        homeLink { $("[data-test=home]") }
        addressesLink { $("[data-test=addresses]") }
        signOutLink { $("[data-test=sign-out]") }
        currentUserLabel { $("[data-test=current-user]") }
    }
}
