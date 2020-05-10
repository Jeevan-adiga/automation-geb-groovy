package com.adressbook

import com.adressbook.core.BaseSpec
import com.adressbook.pages.HomePage
import com.adressbook.pages.SignInPage

class GebTestCase extends BaseSpec {

    def 'testcase'() {
        given:
            go("http://a.testaddressbook.com/")
        expect:
            HomePage homePage = at HomePage
            SignInPage signInPage = homePage.navigationbar.clickOnSignIn()
            signInPage.signIn("test@ahem.email", "test")

    }
}
