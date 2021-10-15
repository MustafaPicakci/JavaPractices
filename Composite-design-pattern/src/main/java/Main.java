public class Main {
    public static void main(String[] args) {
    User leafUser1=new LeafUser(1,"leafUser1","blue");
    User leafUser2=new LeafUser(2,"leafUser2","blue");
    User leafUser3=new LeafUser(3,"leafUser3","blue");
    User leafUser4=new LeafUser(4,"leafUser3","blue");

    CompositeUser compositeUser1=new CompositeUser(5,"compositeUser1","black");
    CompositeUser compositeUser2=new CompositeUser(6,"compositeUser2","black");
    compositeUser1.addSubUser(leafUser1);
    compositeUser1.addSubUser(leafUser2);
    compositeUser2.addSubUser(leafUser3);
    compositeUser1.addSubUser(compositeUser2);

        compositeUser1.changeEyeColor();
        System.out.println(compositeUser1);
        System.out.println(compositeUser2);
        System.out.println(leafUser1);
        System.out.println(leafUser2);
        System.out.println(leafUser3);
        System.out.println(leafUser4);

    }

}
