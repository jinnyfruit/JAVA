/*
 file name: PersonAddress
 author: Ji woo Kim
 modified; 05.24 , 2021
*/
import java.util.Scanner;
public class PersonAddress {

    String firstName;
    String lastName;
    String email;
    String phoneNum;

    public void init(String firstName, String lastName, String email, String phoneNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public boolean equal (PersonAddress other){
        if(other.getFirstName().equals(firstName)==false)
            return false;
        else if(other.getLastName().equals(lastName)==false)
            return false;
        else if(other.getEmail().equals(email)==false)
            return false;
        else if(other.getPhoneNum().equals(phoneNum)==false)
            return false;
        else
            return true;
    }

}
