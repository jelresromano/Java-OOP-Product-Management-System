public class Main {
    public static void main(String[] args) {
        Grocery soap = new Grocery("safeguard", 25, "2027-12-15");

        System.out.println("Grocery");
        soap.displayProduct();
        soap.displayExpiryDate();
        System.out.println("Total of 2\n" + "Total Amount : " + soap.computeTotal(2));

    }
}