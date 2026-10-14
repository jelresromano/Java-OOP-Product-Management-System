class Grocery extends Product {
    private String expiryDate;

    Grocery(String name, int price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    void displayExpiryDate() {
        System.out.println("Expiry date : " + expiryDate);
    }

    // getter
    public String getExpiryDate() {
        return expiryDate;
    }

    // setter
    public void setExpiryDate() {
        this.expiryDate = expiryDate;
    }
}