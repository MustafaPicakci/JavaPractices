public interface User {
    void print(String indent);

    void changeEyeColor(String color);

    void addSubUser(User user);

    void removeSubUser(User user);
}

