package com.adressbook.pages

import com.adressbook.core.BasePage
import geb.module.RadioButtons
import geb.module.Select

class NewAddressPage extends BasePage {

    static at = {
        waitFor { header.text() == "New Address" }
    }

    static content = {
        header { $("h2") }

        firstNameInput { $("#address_first_name") }
        lastNameInput { $("#address_last_name") }
        address1Input { $("#address_street_address") }
        address2Input { $("#address_secondary_address") }
        cityInput { $("#address_city") }
        stateDropDown { $("#address_state").module(Select) }
        zipCode { $("#address_zip_code") }
        country { $(name: "address[country]").module(RadioButtons) }
        birthdayInput { $("#address_birthday") }
        // color
        ageInput { $("#address_age") }
        websiteInput { $("#address_website") }
        pictureInput { $("#address_picture") }
        phoneInput { $("#address_phone") }
        // common interests
        noteInput { $("#address_note") }

        createAddressButton { $("[data-test=submit]") }
        listLink { $("[data-test=list]") }
    }
}
