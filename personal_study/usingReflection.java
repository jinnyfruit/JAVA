/*
 file name: 리플렉션(Reflection)을 이용하여 class정보 출력하기 -> 수정 요망
 author: Ji woo Kim
 modified; 05.01 , 2021
*/
import java.util.Scanner;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
*  [리플렉션]
*  리플렉션을 사용하면 클레스에 대한 생성자와 메서드 등에 대한 정보를 얻을 수 있다.
*/
public class usingReflection {

    public static String toModi(int n){
        String s ="";

        switch (n){
            case 0: s = "";
                break;
            case 1: s = "public";
                break;
            case 2: s = "private";
                break;
            case 4: s = "protected";
                break;
            case 8: s = "static";
                break;
            case 10: s = "private static";
                break;
            case 9:
            case 137: s = "public static";
                break;
            case 17: s = "public final";
                break;
            case 257: s = "public native";
                break;
            case 260: s = "public final native ";
                break;
            case 273: s = "public final native";
                break;
            default: s = "xxxx";
                break;
        }
        return s;
    }
    
    public static String toRe(String msg){
        String s = "";
        
        if(msg.indexOf("[")!=-1){
            if(msg.contains("[C")){
                s = msg.substring(msg.indexOf("")+1).trim();
                s = s.replace("[C","char[]");
            }
            else if(msg.contains("[L")){
                s = msg.substring(msg.indexOf("")+1).trim();
                s = s.replace("[L","").replace(":"."");
                s = s.concat("[ ]");
            }
            else if(msg.contains("[B")){
                s = msg.substring(msg.indexOf("")+1).trim();
                s = s.replace("[B", "byte[]");
            }
            else if(msg.indexOf("")!=-1){
                s = msg.substring(msg.indexOf("")+1).trim();
            }
            else{
                s = msg.trim();
            }
        }
        return s;
    }

    public static void main(String[] args){

        Object
        
    }

}
