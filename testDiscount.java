
package pbo;

import java.util.Date;


public class testDiscount {

    
    public static void main(String[] args) {
        Customer c1 = new Customer(" Annisa", true, "Premium");
        System.out.println(c1.toString());
        
        visit v1 = new visit(c1, new Date());
        System.out.println(v1.toString());
        
        v1.setProductExpense(4.5);
        v1.setServiceExpense(8.5);
        v1.setProductExpense(1.5);
        System.out.println(v1.toString());
        System.out.println("Total expense made by " + v1.getCustomerName() + " = "
                            + v1.getTotalExpense());
    }
    
}
