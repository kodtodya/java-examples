package com.kodtodya.service;

import com.kodtodya.model.Address;
import com.kodtodya.repository.AddressRepository;

import java.util.List;

public class AddressService {

    private static final AddressRepository addressRepository = new AddressRepository();

    public List<Address> retrieveAddresses() {
        return addressRepository.retrieveAddresses();
    }

    public boolean insertAddress(Address address) {
        return addressRepository.createAddress(address);
    }
}
