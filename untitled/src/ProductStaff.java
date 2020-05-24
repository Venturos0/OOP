abstract public class ProductStaff extends Employee {
    public ProductStaff(String name, String position, String email, int cost) {
        super(name, position, email, cost);
    }

    @Override
    public void work() {
        manage();
    }

    abstract public void manage();
}
