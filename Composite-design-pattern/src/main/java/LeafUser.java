public class LeafUser implements User {
    private int id;
    private String name;
    private String eyeColor;

    public LeafUser(int id, String name, String eyeColor) {
        this.id = id;
        this.name = name;
        this.eyeColor = eyeColor;
    }

    @Override
    public void changeEyeColor() {
        this.eyeColor = "red";
    }

    @Override
    public void addSubUser(User user) {

    }

    @Override
    public void removeSubUser(User user) {

    }

    @Override
    public String toString() {
        return "LeafUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
