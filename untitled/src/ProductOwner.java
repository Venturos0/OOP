public class ProductOwner extends ProductStaff{
    public ProductOwner(String name, String position, String email, int cost) {
        super(name, position, email, cost);
    }

    @Override
    public void manage() {
        System.out.println("All product of owner managed");
    }
}
