package com.adressbook.module

import com.adressbook.core.BaseModule

class AddressRowModule extends BaseModule {

    static content = {
        firstNameLabel { $("td[1]") }
        lastNameLabel { $("td[2]") }
        cityLabel { $("td[3]") }
        stateLabel { $("td[4]") }
        showLink { $("[data-test*=show]") }
        editLink { $("[data-test*=edit]") }
        destroyLink { $("[data-test*=destroy]") }
    }
}
