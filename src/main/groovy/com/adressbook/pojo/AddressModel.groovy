package com.adressbook.pojo

import com.github.javafaker.Faker

/**
 * this class represent Address
 */
public class AddressModel {

    Faker faker;

    public AddressModel() {
        faker = new Faker()

        firstName = faker.name().firstName()
        lastName = faker.name().lastName()

        address1 = faker.address().streetAddress()
        address2 = faker.address().secondaryAddress()
        city = faker.address().cityName()
        state = State.ALASKA //faker.address().stateAbbr()
        zipCode = faker.address().zipCode()
        country = Country.UNITED_STATES
    }

    String firstName
    String lastName

    String address1
    String address2
    String city
    State state //faker.address().stateAbbr()
    String zipCode
    Country country

    String birthDay

    String color
    String age
    String website
    String picture
    String phone
    String commonIntrests
    String note

}
