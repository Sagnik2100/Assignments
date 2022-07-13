package day10;

import javax.xml.validation.ValidatorHandler;

public interface libraryUser {
    int registerAccount();
    int requestBook();
}
class kidsUser implements libraryUser{
    int age;
    String bookType;
    @Override
    public int registerAccount(int age) {
        if(age<12){
            System.out.println("You have successfully registered under a Kids Account");
        }
        else{
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
        return 0;
    }

    @Override
    public int requestBook(String bookType) {
        
        
    }

}