import java.util.Date;

public class TradeInVehicle extends Vehicle {
    private Date acquiredDate;
    private String condition;

    public TradeInVehicle(String serialNumber, String make, String model, int year,
                          Date acquiredDate, String condition) {
        super(serialNumber, make, model, year);
        this.acquiredDate = acquiredDate;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format(", TradeInVehicle [AcquiredDate: %s, Condition: %s]",
                       acquiredDate, condition);
    }
}
