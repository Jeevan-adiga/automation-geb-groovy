package com.adressbook.pages

import auto.framework.BasePage
import com.adressbook.module.NavigationModule

class HomePage extends BasePage {

    static at = {
        waitFor { welcomeText.text() == "Welcome to Address Book\n" }
    }

    static content = {
        welcomeText { $("h1") }
        descriptionText { $("h4") }
        navigationbar { $("#navbar").module(NavigationModule) }
    }

}