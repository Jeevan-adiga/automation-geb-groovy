package com.adressbook.helpers

import com.adressbook.pages.AddressDetailsPage
import com.adressbook.pages.AddressListPage
import com.adressbook.pojo.AddressModel

trait AddressDetailsHelper {

    AddressDetailsPage addressDetailsPage = this

    AddressListPage clickOnList() {
        addressDetailsPage.listLink.click()
        addressDetailsPage.browser.at(AddressListPage)
    }

    void verifyAddressDetails(AddressModel addressModel) {
        assert addressDetailsPage.firstNameLabel.text() == addressModel.firstName
        assert addressDetailsPage.lastNameLabel.text() == addressModel.lastName
        assert addressDetailsPage.address1Label.text() == addressModel.address1
        assert addressDetailsPage.address2Label.text() == addressModel.address2
        assert addressDetailsPage.stateLabel.text() == addressModel.state.code
        assert addressDetailsPage.zipCodeLabel.text() == addressModel.zipCode
    }
}