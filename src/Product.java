class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product name : " + name + "\nProduct price : " + price);
    }

    double computeTotal(int quantity) {
        return price * quantity; // Fixed: added '*' operator
    }
}