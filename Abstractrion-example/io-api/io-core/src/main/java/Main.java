import com.bocek.api.CsvReader;
import com.bocek.api.Reader;
import models.Address;
import models.User;
import utils.AddressConverter;
import utils.UserConverter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UserConverter userConverter = new UserConverter();
        AddressConverter addressConverter = new AddressConverter();

        Reader<String, User> userReader = new CsvReader("/Users/user/Documents/Projects/io-api/io-core/src/main/resources/files/test.csv", userConverter);
        Reader<String, Address> addressReader = new CsvReader("/Users/user/Documents/Projects/io-api/io-core/src/main/resources/files/address.csv", addressConverter);

        while (userReader.hasNext()) {
            System.out.println(userReader.next().toString());
        }
        System.out.println("--------------------------------------------");
        while (addressReader.hasNext()){
            System.out.println(addressReader.next().toString());
        }
    }


}
