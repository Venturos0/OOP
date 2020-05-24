public class ScrumMaster extends ProductStaff{
    public ScrumMaster(String name, String position, String email, int cost) {
        super(name, position, email, cost);
    }

    @Override
    public void manage() {
        System.out.println("All process of scrum managed");
    }
}
