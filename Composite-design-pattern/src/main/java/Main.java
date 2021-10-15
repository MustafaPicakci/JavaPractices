public class Main {
    public static void main(String[] args) {
        CompositeUser compositeUser1 = new CompositeUser(1, "compositeUser1", "blue");
        CompositeUser compositeUser2 = new CompositeUser(2, "compositeUser2", "blue");
        CompositeUser compositeUser3 = new CompositeUser(3, "compositeUser3", "blue");
        CompositeUser compositeUser4 = new CompositeUser(4, "compositeUser4", "blue");
        CompositeUser compositeUser5 = new CompositeUser(5, "compositeUser5", "blue");
        CompositeUser compositeUser6 = new CompositeUser(6, "compositeUser6", "blue");

        compositeUser1.addSubUser(compositeUser2);
        compositeUser2.addSubUser(compositeUser3);
        compositeUser3.addSubUser(compositeUser4);
        compositeUser3.addSubUser(compositeUser5);
        compositeUser5.addSubUser(compositeUser6);

        compositeUser1.changeEyeColor("black");
        compositeUser3.changeEyeColor("pink");
        System.out.println(compositeUser1.toString());
        System.out.println("-----------------------------------------------------------------");
        compositeUser1.print(" ");
    }

}
