package com.adressbook.helpers

import com.adressbook.pages.AddressListPage
import com.adressbook.pages.NewAddressPage

trait AddressListHelper {

    AddressListPage addressListPage = this

    NewAddressPage clickOnNewAddress() {
        addressListPage.newAddressLink.click()
        addressListPage.browser.at(NewAddressPage)
    }
}