import java.util.List;

/**
 * This class is for calculating customer bill
 *
 * @author Ritul Kumar
 */
public class Customer {
    List<Product> product;

    /**
     * This method is for calculating overall bill amount
     * @return  The total bill amount
     */
    public double calculateBill(){
        double overallPrice=0.0;

        for (Product i:product){
            overallPrice += i.getTotalPrice();
        }
        return overallPrice;
    }

    //  getter and setter methods

    /**
     *
     * @return list of the product
     */
    public List<Product> getProduct() {
        return product;
    }

    /**
     *
     * @param product product to set
     */
    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
