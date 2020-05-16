package com.adressbook.helpers

import com.adressbook.pages.AddressDetailsPage
import com.adressbook.pages.AddressListPage
import com.adressbook.pages.NewAddressPage
import com.adressbook.pojo.AddressModel

trait NewAddressHelper {

    NewAddressPage newAddressPage = this

    AddressDetailsPage addNewAddress(AddressModel addressModel) {
        newAddressPage.firstNameInput << addressModel.firstName
        newAddressPage.lastNameInput << addressModel.lastName
        newAddressPage.address1Input << addressModel.address1
        newAddressPage.address2Input << addressModel.address2
        newAddressPage.cityInput << addressModel.city
        newAddressPage.stateDropDown.setSelected(addressModel.state.code)
        newAddressPage.zipCode << addressModel.zipCode
        newAddressPage.country.setChecked(addressModel.country.value)

        newAddressPage.createAddressButton.click()
        AddressDetailsPage addressDetailsPage = newAddressPage.browser.at(AddressDetailsPage)
        assert addressDetailsPage.addressCreatedSuccessMsg.text() == addressDetailsPage.SUCCESS_MSG
        addressDetailsPage
    }

}