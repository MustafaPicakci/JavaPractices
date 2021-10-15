import java.util.ArrayList;
import java.util.List;

public class CompositeUser implements User {
    private int id;
    private String name;
    private String eyeColor;
    private List<User> subUsers;

    public CompositeUser(int id, String name, String eyeColor) {
        this.id = id;
        this.name = name;
        this.eyeColor = eyeColor;
        this.subUsers = new ArrayList<>();
    }

    @Override
    public void print(String indent) {
        indent += indent;
        System.out.println(indent+this);
        for(User sub: this.subUsers){
            sub.print(indent);
        }

    }

    @Override
    public void changeEyeColor(String color) {
        this.eyeColor=color;
        for(User sub: this.subUsers){
            sub.changeEyeColor(color);
        }
    }

    @Override
    public void addSubUser(User user) {
        subUsers.add(user);
    }

    @Override
    public void removeSubUser(User user) {
        subUsers.remove(user);
    }

    @Override
    public String toString() {
        return "CompositeUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", subUsers=" + subUsers +
                '}';
    }
}
