public class Menu {
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " | " + description;
    }
}
