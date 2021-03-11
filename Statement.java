import java.util.Enumeration;
public abstract class Statement {

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getHeaderString(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += getBodyString(each);
        }
        result += getFooterString(aCustomer);
        return result;
    }

    protected abstract String getHeaderString(Customer aCustomer);

    protected abstract String getBodyString(Rental aRental);

    protected abstract String getFooterString(Customer aCustomer);
}
