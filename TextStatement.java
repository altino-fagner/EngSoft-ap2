import java.util.Enumeration;

public class TextStatement extends Statement {

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


    private String getHeaderString(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    private String getBodyString(Rental each) {
        return "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
    }

    private String getFooterString(Customer aCustomer) {
        String result;
        result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + 
                " frequent renter points";
        return result;
    }
}
