public class Main {
    public static void main(String[] args) {
        Grocery soap = new Grocery("safeguard", 25, "2027-12-15");
        Transportation transportation = new Transportation("Toyota", 1000, 20.5, "1993", 6, true);

        System.out.println("Grocery");
        soap.displayProduct();
        soap.displayExpiryDate();
        System.out.println("Total of 2\n" + "Total Amount : " + soap.computeTotal(2));


        System.out.println("\nTransportation");
        transportation.displayProduct();
        transportation.displayTransportation();
        System.out.println("Total of 2\n" + "Total Amount : " + transportation.computeTotal(2));
    }
}