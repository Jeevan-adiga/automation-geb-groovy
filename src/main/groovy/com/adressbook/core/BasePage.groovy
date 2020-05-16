package com.adressbook.core

import com.adressbook.module.NavigationModule
import geb.Page

class BasePage extends Page {

    static content = {
        navigationbar { $("#navbar").module(NavigationModule) }
    }
}
