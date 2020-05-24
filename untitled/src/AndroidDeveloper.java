public class AndroidDeveloper extends Developer{
    public AndroidDeveloper(String name, String position, String email, int cost) {
        super(name, position, email, cost);
    }
    @Override
    void writeCode() {
        System.out.println("Application of android is created");
    }
}
