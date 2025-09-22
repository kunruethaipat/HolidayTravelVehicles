import java.util.Date;

public class Salesperson {
    private String salespersonId;
    private String name;
    private String phone;
    private Date hireDate;

    public Salesperson(String salespersonId, String name, String phone, Date hireDate) {
        this.salespersonId = salespersonId;
        this.name = name;
        this.phone = phone;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return String.format("Salesperson [ID: %s, Name: %s, Phone: %s, HireDate: %s]",
                salespersonId, name, phone, hireDate);
    }
}
