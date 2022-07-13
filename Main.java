package day10;

public class Main extends BankDetails {
    public static void main(String[] args) {
        BankDetails b1= new BankDetails();
        
        System.out.println("The Name is "+ b1.getName());
        System.out.println("The Email is "+ b1.getEmail());
        System.out.println("The Amount is "+b1.getAmount());
        System.out.println("The AccountNumber is "+b1.getAccount_number());
    }

}
class BankDetails{
    private int Account_number=1009954;
    private String Name="Sagnik";
    private String Email="abc@xyz.com";
    private int Amount=55224;
    
    int getAccount_number(){
       return this.Account_number; 
    }
    String getName(){
        return this.Name;
    }
    String getEmail(){
        return this.Email;
    }
    int getAmount(){
        return this.Amount;
    }
}