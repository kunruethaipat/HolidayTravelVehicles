public class Option {
    private String optionCode;
    private String description;
    private double price;

    public Option(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Option [Code: %s, Description: %s, Price: %.2f]",
                optionCode, description, price);
    }
}
