enum Category {
    FOOD, ELECTRONICS, CLOTHING
}

public class Product {
    private String name;
    private Category category;

    public Product(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public String toString() {
        return "Product: " + name + ", category: " + category;
    }
}