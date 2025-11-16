import java.util.Enumeration;

public abstract class Statement {

    public String value(Customer aCustomer) {
        String result = header(aCustomer);

        Enumeration rentals = aCustomer.getRentals();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += rentalLine(each);
        }

        result += footer(aCustomer);

        return result;
    }

    protected abstract String header(Customer aCustomer);

    protected abstract String rentalLine(Rental each);

    protected abstract String footer(Customer aCustomer);
}
