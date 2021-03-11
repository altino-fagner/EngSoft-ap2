public class TextStatement extends Statement {

    protected String getHeaderString(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    protected String getBodyString(Rental each) {
        return "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
    }

    protected String getFooterString(Customer aCustomer) {
        String result;
        result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + 
                " frequent renter points";
        return result;
    }
}
