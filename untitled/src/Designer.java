public class Designer extends Employee{
    public Designer(String name, String position, String email, int cost) {
        super(name, position, email, cost);
    }

    @Override
    public void work() {
        System.out.println("All design of app created");
    }
}
