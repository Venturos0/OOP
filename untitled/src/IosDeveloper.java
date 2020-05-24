public class IosDeveloper extends Developer {
    public IosDeveloper(String name, String position, String email, int cost) {
        super(name, position, email, cost);
    }

    @Override
    void writeCode() {
        System.out.println("Application of IOS is created");
    }
}
