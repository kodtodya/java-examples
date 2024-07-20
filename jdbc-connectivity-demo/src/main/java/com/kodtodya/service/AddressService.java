package com.kodtodya.service;

import com.kodtodya.model.Address;
import com.kodtodya.repository.AddressRepository;

import java.util.List;

public class AddressService {

    private static final AddressRepository ADDRESS_REPO = new AddressRepository();

    public List<Address> retrieveAddresses() {
        return ADDRESS_REPO.retrieveAddresses();
    }
}
