package com.adressbook.helpers

import com.adressbook.pages.AddressListPage
import com.adressbook.pages.HomePage
import com.adressbook.pages.NewAddressPage
import com.adressbook.pages.SignInPage

trait AddressListHelper {

    AddressListPage addressListPage = this

    NewAddressPage clickOnNewAddress() {
        addressListPage.newAddressLink.click()
        addressListPage.browser.at(NewAddressPage)
    }
}