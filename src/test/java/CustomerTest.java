import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * This class is for testing the Customer Class
 */
public class CustomerTest {
    Customer custObj;

    /**
     * sets up the testing environment and make mock objects for testing
     */
    @Before
    public void setup(){
        custObj=new Customer();
        List<Product> product=new ArrayList<Product>();
        Product p1=mock(Product.class);
        Product p2=mock(Product.class);

        product.add(p1);
        product.add(p2);

        custObj.setProduct(product);
        System.out.println(custObj.getProduct().contains(p1));

        when(p1.getPname()).thenReturn("Soap");
        when(p1.getQty()).thenReturn(1);
        when(p1.getPrice()).thenReturn(100.0);
        when(p1.getTotalPrice()).thenReturn(100.0);

        when(p2.getPname()).thenReturn("Pen");
        when(p2.getQty()).thenReturn(1);
        when(p2.getPrice()).thenReturn(50.0);
        when(p2.getTotalPrice()).thenReturn(50.0);
    }

    /**
     * This method tests the customerBill method
     */
    @Test
    public void customerBillTest(){
        assertEquals(150.0, custObj.calculateBill(), 0.1);
    }
}
