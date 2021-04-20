/*
 file name: 2-4
 author: Ji woo Kim
 modified; 04.19, 2021
*/
import java.util.Scanner;
public class hw2_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message;

        int key = 10;

        System.out.print("type a message:");
        message = scanner.nextLine();
        System.out.println();

        char[] encryption = new char[message.length()];
        char[] decryption = new char[message.length()];

        System.out.print("Encrypted message:");

        for(int i=0; i<message.length();i++){
            char word = message.charAt(i);
            int num = (int) word;

            if(num + 10 > 126)
                num = (num + 10) - 127 +32;
            else
                num = num + 10;

            char en_word = (char)num;

            encryption[i] = en_word;

            System.out.print(en_word);
        }

        System.out.println();
        System.out.println();
        System.out.print("decrypted message:");

        for(int i=0;i<message.length();i++){
            char word = encryption[i];
            int num = (int) word;

            if(num - 10 <32)
                num = (num + 127) - 32 -10;
            else
                num = num - 10;

            char dn_word = (char)num;

            decryption[i] = dn_word;

            System.out.print(dn_word);
        }

        System.out.println();
    }
}
