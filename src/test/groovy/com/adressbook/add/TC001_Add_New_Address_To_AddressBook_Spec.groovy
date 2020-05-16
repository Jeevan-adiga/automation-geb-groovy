package com.adressbook.add

import com.adressbook.core.BaseSpec
import com.adressbook.pages.AddressDetailsPage
import com.adressbook.pages.AddressListPage
import com.adressbook.pages.HomePage
import com.adressbook.pages.NewAddressPage
import com.adressbook.pages.SignInPage
import com.adressbook.pojo.AddressModel
import spock.lang.Shared

class TC001_Add_New_Address_To_AddressBook_Spec extends BaseSpec {

    @Shared AddressModel addressModel = new AddressModel()

    def "Adds a New Address to addressbook"() {
        given: "User is at home page"
            go("http://a.testaddressbook.com/")
            HomePage homePage = at HomePage
        when: "User login to application"
            SignInPage signInPage = homePage.navigationbar.clickOnSignIn()
            homePage = signInPage.signIn("test@ahem.email", "test")
        and: "User should be able to create new address"
            AddressListPage addressListPage = homePage.navigationbar.clickOnAddresses()
            NewAddressPage newAddressPage = addressListPage.clickOnNewAddress()
            AddressDetailsPage addressDetailsPage = newAddressPage.addNewAddress(addressModel)
        then: "New Address is created with correct details"
            addressDetailsPage.verifyAddressDetails(addressModel)
    }
}
