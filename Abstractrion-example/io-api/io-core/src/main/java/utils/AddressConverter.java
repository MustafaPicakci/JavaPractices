package utils;

import com.bocek.api.Converter;
import models.Address;

public class AddressConverter implements Converter<String, Address> {
    @Override
    public Address convert(String s) {
        String [] records =s.split(",");

        Address address=new Address();
        address.setId(Long.parseLong(records[0]));
        address.setCity(records[1]);
        address.setDistrict(records[2]);
        return  address;
    }
}
