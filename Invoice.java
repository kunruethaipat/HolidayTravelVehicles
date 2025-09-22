import java.util.Date;

public class Invoice {
    private String invoiceNo;
    private Date date;
    private double negotiatedPrice;
    private double taxes;
    private double licenseFees;
    private double tradeInAllowance;
    private double optionPrice;
    private double total;
    private boolean customerSignature;

    public Invoice(String invoiceNo, Date date, double negotiatedPrice, double taxes,
                   double licenseFees, double tradeInAllowance, double optionPrice,
                   double total, boolean customerSignature) {
        this.invoiceNo = invoiceNo;
        this.date = date;
        this.negotiatedPrice = negotiatedPrice;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.tradeInAllowance = tradeInAllowance;
        this.optionPrice = optionPrice;
        this.total = total;
        this.customerSignature = customerSignature;
    }

    @Override
    public String toString() {
        return String.format(
            "Invoice [No: %s, Date: %s, NegotiatedPrice: %.2f, Taxes: %.2f, LicenseFees: %.2f, " +
            "TradeInAllowance: %.2f, OptionPrice: %.2f, Total: %.2f, Signed: %b]",
            invoiceNo, date, negotiatedPrice, taxes, licenseFees,
            tradeInAllowance, optionPrice, total, customerSignature
        );
    }
}
