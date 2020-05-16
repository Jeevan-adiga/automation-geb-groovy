package com.adressbook.pages

import com.adressbook.core.BasePage

class HomePage extends BasePage {

    static final String HEADER_TEXT = "Welcome to Address Book"

    static at = {
        waitFor { welcomeText.text() == HEADER_TEXT }
    }

    static content = {
        welcomeText { $("h1") }
        descriptionText { $("h4") }
    }
}