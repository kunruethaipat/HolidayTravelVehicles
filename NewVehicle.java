public class NewVehicle extends Vehicle {
    private String name;
    private String manufacturer;
    private double baseCost;

    public NewVehicle(String serialNumber, String make, String model, int year,
                      String name, String manufacturer, double baseCost) {
        super(serialNumber, make, model, year);
        this.name = name;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format(", Name: %s, Manufacturer: %s, BaseCost: %.2f",
                       name, manufacturer, baseCost);
    }
}
