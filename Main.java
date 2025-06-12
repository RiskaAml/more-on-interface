interface Cashier {
    void processPayment();
    void printReceipt();
}
interface Cook {
    void prepareMeal();
}
interface ProfessionalCook extends Cook{
    void tasteMeal();
}
class Staff implements Cashier, ProfessionalCook{
    public void processPayment(){
        System.out.println("Processing customer payment...");
    }
    public void printReceipt(){
        System.out.println("Printing receipt for the customer...");
    }
    public void prepareMeal(){
        System.out.println("Preparing the customer's meal...");
    }
    public void tasteMeal(){
        System.out.println("Tasting the meal before serving...");
    }
}
public class Main {

    public static void main(String[] args) {
        Cashier staff1 = new Staff();
        staff1.processPayment();
        staff1.printReceipt();
        
        Cook staff2 = new Staff();
        staff2.prepareMeal();
        
        ProfessionalCook staff3 = new Staff();
    }
    
}
