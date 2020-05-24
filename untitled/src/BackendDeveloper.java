public class BackendDeveloper extends Developer {
    public BackendDeveloper(String name, String position, String email, int cost) {
        super(name, position, email, cost);
    }

    @Override
    void writeCode() {
        System.out.println("Application of backend is created");
    }
}
