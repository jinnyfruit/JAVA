/*
file name: compare between char and string
author:jinnyfruit
modified: 01.14,2021
*/
public class letter {
     public static void main(String[] args){
         char a='F';
         String line="Jinny is Fruit.";
         int lineNumber=line.length();  //문자열의 길이를 구하는 메소드.
         int loc=line.indexOf(a);

         System.out.printf("string: %s\n",line);
         System.out.printf("F는 %d번째에 있습니다.",loc);
     }
}
