package com.adressbook.pages

import auto.framework.BasePage

class HomePage extends BasePage {

    static content = {
        welcomeText { $("h1") }
        descriptionText { $("h4") }
        navigationbar { $("#navbar") }.module(Na)

    }
}
