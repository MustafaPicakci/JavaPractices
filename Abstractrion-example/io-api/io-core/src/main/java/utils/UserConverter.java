package utils;

import com.bocek.api.Converter;
import models.User;

public class UserConverter implements Converter<String, User> {

    @Override
    public User convert(String s) {
        String[] records = s.split(",");

        User user = new User();
        user.setId(Long.parseLong(records[0]));
        user.setName(records[1]);
        user.setLastName(records[2]);
        user.setLanguage(records[3]);
        return user;
    }
}
