public class Vehicle {
    private String serialNumber;
    private String make;
    private String model;
    private int year;

    public Vehicle(String serialNumber, String make, String model, int year) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getSerialNumber() { return serialNumber; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return String.format("Serial: %s, Make: %s, Model: %s, Year: %d",
                serialNumber, make, model, year);
    }
}
