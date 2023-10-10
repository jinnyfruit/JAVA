/*
 file name: PersonAddress Test
 author: Ji woo Kim
 modified; 05.24 , 2021
*/
public class PersonAddressTest {

    public static void main(String[] args) {
        PersonAddress jinny = new PersonAddress();
        PersonAddress Daehun = new PersonAddress();

        jinny.init("Ji Woo","Kim","jinnyfruit0527@gmail.com","01012345678");
        Daehun.init("Daehun","Kim", "AnonKorea@naver.com","01034567890");

        System.out.println("first name: " + jinny.firstName);
        System.out.println("last name: " + jinny.lastName);
        System.out.println("email: " + jinny.email);
        System.out.println("phone number: " + jinny.phoneNum);

        System.out.println();

        System.out.println("first name: " + Daehun.firstName);
        System.out.println("last name: " + Daehun.lastName);
        System.out.println("email: " + Daehun.email);
        System.out.println("phone number: " + Daehun.phoneNum);

        System.out.println();

        System.out.println("Compare jinny and Daehun: " + jinny.equal(Daehun));

        jinny.email = "jinnyfruit@naver.com";
        System.out.println("updated data");
        System.out.println("first name: " + jinny.firstName);
        System.out.println("last name: " + jinny.lastName);
        System.out.println("email: " + jinny.email);
        System.out.println("phone number: " + jinny.phoneNum);

        System.out.println();

        Daehun.phoneNum = "01098765432";
        System.out.println("updated data");
        System.out.println("first name: " + Daehun.firstName);
        System.out.println("last name: " + Daehun.lastName);
        System.out.println("email: " + Daehun.email);
        System.out.println("phone number: " + Daehun.phoneNum);

    }
}
