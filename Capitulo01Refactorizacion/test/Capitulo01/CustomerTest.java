package Capitulo01;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CustomerTest {

    private static final Movie EL_RENACIDO = new Movie("El Renacido", Movie.CHILDREN);
   
    private final Customer customer = new Customer("Esteban");

    @Test
    public void basicChildrenRental() {
        customer.addRental(new Rental(EL_RENACIDO, 2));
        assertThat(customer.statement(), is(expectedMessageFor("El Renacido", 1.5, 1.5, 1)));
    }

    @Test
    public void shouldDiscountChildrensRentals() {
        customer.addRental(new Rental(EL_RENACIDO, 4));
        assertThat(customer.statement(), is(expectedMessageFor("El Renacido", 3.0, 3.0, 1)));
    }
  
    private static String expectedMessageFor(String rental, double price, double total, int renterPointsEarned) {
        return "Rental record for Esteban\n\t" + rental + "\t" + price + "\nAmount owed is " + total + "\nYou earned " + renterPointsEarned + " frequent renter points";
    }

}