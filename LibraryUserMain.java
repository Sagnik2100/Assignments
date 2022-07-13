package day10;
public class LibraryUserMain{
    public static void main(String[] args) {
        KidUsers k1= new KidUsers();
            k1.age=10;
            k1.bookType="kids";
            k1.registerAccount();
            k1.requestBook();

        adultUser a1= new adultUser();
        a1.age=23;
        a1.bookType="Fiction";
        a1.registerAccount();
        a1.requestBook();

    }
}
 interface LibraryUser {
    void registerAccount();
    void requestBook();
}
class KidUsers implements LibraryUser{
    int age;
    String bookType;
    @Override
    public void registerAccount() {
        if(age<12){
            System.out.println("You have successfully registered under a Kids Account");
        }
        else{
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
        
    }

    @Override
    public void requestBook() {
        if(bookType=="kids"){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
class adultUser implements LibraryUser{

    int age;
    String bookType;
    @Override
    public void registerAccount() {
        if(age>12){
            System.out.println("You have successfully registered under an Adult Account");
        }
        else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
        
    }

    @Override
    public void requestBook() {
        if(bookType=="Fiction"){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
        
    }
    
}
