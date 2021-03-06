package com.corp.api.service;

import com.corp.api.controller.response.CustomerResponse;
import com.corp.api.entity.Customer;

import java.io.IOException;

public interface CustomerService{
    CustomerResponse getCustomerByIdentityDocument(String identityDocument) throws IOException, InterruptedException;
}
