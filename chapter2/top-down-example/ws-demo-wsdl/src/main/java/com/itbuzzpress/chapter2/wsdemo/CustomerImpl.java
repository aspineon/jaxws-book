package com.itbuzzpress.chapter2.wsdemo;

import javax.jws.WebService;

 
@WebService(endpointInterface="com.itbuzzpress.chapter2.wsdemo.Customer")
public class CustomerImpl implements Customer {
    public CustomerRecord locateCustomer(String firstName, String lastName, USAddress address) {
        CustomerRecord cr = new CustomerRecord();
        cr.setFirstName(firstName);
        cr.setLastName(lastName);
        return cr;
    }
}
