import org.example.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {


    Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Katie", 5000);
    }
    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("Katie");
    }
    @Test
    public void testSetName(){
        customer.setName("Tharahan");
        assertThat(customer.getName()).isEqualTo("Tharahan");
    }

    @Test
    public void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(5000);
    }
    @Test
    public void testSetWallet(){
        customer.setWallet(8000);
        assertThat(customer.getWallet()).isEqualTo(8000);
    }
}
