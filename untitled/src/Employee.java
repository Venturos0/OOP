abstract public class Employee {
    private String name;
    private String position;
    private String email;
    private int cost;

    public Employee(String name, String position, String email, int cost) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.cost = cost;
    }

    abstract public void work();

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getCost() {
        return cost;
    }

    public String toString() {
        return name + " " + position + " - daily fee:" + cost;
    }
}
