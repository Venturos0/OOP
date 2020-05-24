abstract public class Developer extends Employee {
    public Developer(String name, String position, String email, int cost) {
        super(name, position, email, cost);
    }

    @Override
    public void work() {
        writeCode();
    }
    abstract void writeCode();
}
