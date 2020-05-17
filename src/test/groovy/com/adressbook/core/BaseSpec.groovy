package com.adressbook.core

import geb.spock.GebSpec

class BaseSpec extends GebSpec {

    def setupSpec() {
        reportHeader "Browser Name: ${driver.capabilities['browserName']}"
        reportHeader "Platform: ${System.getProperty('os.name')}"
        reportHeader "SessionId: ${driver.sessionId}"
    }
}
