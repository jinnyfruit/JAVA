/*
 file name: String 가공하기
 author: Ji woo Kim
 modified; 04.30, 2021
*/
import java.util.Locale;
import java.util.Scanner;
public class StringTest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("type a string:");
        String line = scanner.nextLine();

        System.out.println("test charAt(2)");
        System.out.println("result: " + line.charAt(2));
        System.out.println();

        System.out.println("test concat(\"s\")");
        System.out.println("result: " + line.concat("s"));
        System.out.println();

        System.out.println("test contains(\"And\")");
        System.out.println("result: " + line.contains("And"));
        System.out.println();

        System.out.println("test equals(\"com\")");
        System.out.println("result: " + line.equals("com"));
        System.out.println();

        System.out.println("test equalsIgnoreCase(\"com\")");
        System.out.println("result: " + line.equalsIgnoreCase("com"));
        System.out.println();

        System.out.println("test indexOf(\"a\")");
        System.out.println("result: " + line.indexOf("a"));
        System.out.println();

        System.out.println("test lastIndexOf(\"a\")");
        System.out.println("result: " + line.lastIndexOf("a"));
        System.out.println();

        System.out.println("test trim()");
        System.out.println("result: " + line.trim());
        System.out.println();

        System.out.println("test length()");
        System.out.println("result: " + line.length());
        System.out.println();

        System.out.println("test substring(7)");
        System.out.println("result: " + line.substring(7));
        System.out.println();

        System.out.println("test substring(7,11)");
        System.out.println("result: " + line.substring(7,11));
        System.out.println();

        System.out.println("test replace(\" \",\"-\")");
        System.out.println("result: " + line.replace(" ","-"));
        System.out.println();

        System.out.println("test replaceAll(\" \",\"-\")");
        System.out.println("result: " + line.replaceAll(" ","-"));
        System.out.println();

        System.out.println("test toUpperCase()");
        System.out.println("result: " + line.toUpperCase());
        System.out.println();

        System.out.println("test toLowerCase()");
        System.out.println("result: " + line.toLowerCase());
        System.out.println();

    }

}
