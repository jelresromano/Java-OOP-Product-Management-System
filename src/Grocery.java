class Grocery extends Product {
    private String expiryDate;

    Grocery(String name, int price, String expiry) {
        super(name, price);
        setExpiryDate(expiry);
    }

    // getter
    public String getExpiryDate() {
        return expiryDate;
    }

    // setter
    public void setExpiryDate(String expiry) {
        this.expiryDate = expiry;
    }

    public void displayExpiryDate() {
        System.out.println("Expiry date : " + expiryDate);
    }
}