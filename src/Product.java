class Product {
    private String name;
    private int price;

    Product(String name, int prices) {
        setName(name);
        setPrice(prices);
    }

    // getters
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int prices) {
        this.price = prices;
    }

    void displayProduct() {
        System.out.println("Product name : " + name + "\nProduct price : " + price);
    }

    double computeTotal(int quantity) {
        return price * quantity; // Fixed: added '*' operator
    }
}