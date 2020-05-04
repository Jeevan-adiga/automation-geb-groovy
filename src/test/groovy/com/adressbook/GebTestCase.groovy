package com.adressbook

import auto.framework.BaseSpec

class GebTestCase extends BaseSpec {

    def 'testcase'() {
        given:
            go("http://www.google.com")
        expect:
            title == 'Google'
    }
}
