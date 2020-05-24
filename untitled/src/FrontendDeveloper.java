public class FrontendDeveloper extends Developer {
    public FrontendDeveloper(String name, String position, String email, int cost) {
        super(name, position, email, cost);
    }

    @Override
    void writeCode() {
        System.out.println("Application of frontend is created");
    }
}
