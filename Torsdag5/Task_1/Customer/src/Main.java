import java.util.ArrayList;

public class Main {

    public static ArrayList<String> customers = new ArrayList<String>();

    public static void  main(String[] args) {
        customers.add("Matthias");
        customers.add("Siggi");
        customers.add("John");
        customers.add("Per");
        customers.add("Ludwig");
        customers.add("Hanna");

        //Customer customer1 = new Customer("Matthias ", "Sigurdsson ", "Madios ");
        //System.out.println(customer1);
        printCustomers();
    }

    private static void printCustomers() {
        for (String customer: customers){
            System.out.println(customer);
        }
    }
}
