class Grocery extends Product {
    private String expiryDate;

    Grocery(String name, int price, String expiryDate) {
        super(name, price);
        setExpiryDate(expiryDate);
    }

    // getter
    public String getExpiryDate() {
        return expiryDate;
    }

    // setter
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void displayExpiryDate() {
        System.out.println("Expiry date : " + expiryDate);
    }
}