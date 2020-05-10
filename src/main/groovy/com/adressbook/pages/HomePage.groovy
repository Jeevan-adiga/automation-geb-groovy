package com.adressbook.pages

import auto.framework.BasePage
import com.adressbook.module.NavigationModule

class HomePage extends BasePage {

    String HEADER_TEXT = "Welcome to Address Book"

    static at = {
        waitFor { welcomeText.text() == HEADER_TEXT }
    }

    static content = {
        welcomeText { $("h1") }
        descriptionText { $("h4") }
        navigationbar { $("#navbar").module(NavigationModule) }
    }
}