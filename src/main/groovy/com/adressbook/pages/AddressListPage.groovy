package com.adressbook.pages

import auto.framework.BasePage
import com.adressbook.module.AddressRowModule

class AddressListPage extends BasePage {

    static at = {
        waitFor { header.text() == "Addresses" }
    }

    static content = {
        header { $("h2") }
        records { $(".table tbody tr").module(AddressRowModule) }
        newAddressLink { $("[data-test=create]") }
    }
}
