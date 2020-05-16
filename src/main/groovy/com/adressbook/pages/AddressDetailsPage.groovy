package com.adressbook.pages

import com.adressbook.core.BasePage
import com.adressbook.helpers.AddressDetailsHelper
import geb.module.RadioButtons
import geb.module.Select

class AddressDetailsPage extends BasePage implements AddressDetailsHelper {

    String SUCCESS_MSG = "Address was successfully created."

    static at = {
        waitFor { firstNameLabel.displayed }
    }

    static content = {
        header { $("h2") }

        addressCreatedSuccessMsg { $("[data-test='notice']") }

        firstNameLabel { $("[data-test='first_name']") }
        lastNameLabel { $("[data-test='last_name']") }
        address1Label { $("[data-test='street_address']") }
        address2Label { $("[data-test='secondary_address']") }
        cityLabel { $("[data-test='city']") }
        stateLabel { $("[data-test='state']") }
        zipCodeLabel { $("[data-test='zip_code']") }
        countryLabel { $("[data-test='country']") }
        birthdayLabel { $("[data-test='birthday']") }
        // color
        ageLabel { $("[data-test='age']") }
        websiteLabel { $("[data-test='website']") }
        phoneLabel { $("[data-test='phone']") }
        // common interests
        noteLabel { $("[data-test='note']") }

        editLink { $("[data-test=submit]") }
        listLink { $("[data-test=list]") }
    }
}
