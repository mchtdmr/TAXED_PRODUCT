import java.util.Scanner;
import static java.lang.System.out;
public class Taxed_Product_Codes {
    
    public static void main(String[] args) {
        
        double tax_free;
        double new_price;

        Scanner input= new Scanner(System.in);

        out.println("Enter the tax-free price of the product : ");
        tax_free=input.nextDouble();
        
        new_price = tax_free+ (tax_free * 0.18);
        
        out.println(" Taxed price of the product= " + new_price);
    }
}

