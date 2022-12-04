package model;

public class UnRegisteredUser extends User{
    
    public UnRegisteredUser(String firstName, String lastName, String email){
        super(firstName, lastName, email, false);
    }
}
