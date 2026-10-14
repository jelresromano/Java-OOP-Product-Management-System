class Transportation extends Product {
    private double speed;
    private String yearModel;
    private int capacity;
    private boolean isAvailable;

    Transportation(String name, int price, double speed, String yearModel, int capacity, boolean isAvailable) {
        super(name, price);
        setSpeed(speed);
        setYearModel(yearModel);
        setCapacity(capacity);
        setAvailable(isAvailable);
    }

    //getters
    public double getSpeed() {
        return speed;
    }

    public String getYearModel() {
        return yearModel;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // setters
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setYearModel(String yearModel) {
        this.yearModel = yearModel;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void displayTransportation() {
        System.out.println("Speed : " + speed);
        System.out.println("Year Model : " + yearModel);
        System.out.println("Capacity : " + capacity);
        System.out.println("Available: " + isAvailable);
    }
}
