package Recursion_In_Java;

public class Recursion_01 {
    public static void messasge(){
        System.out.println("hello world!");
        message1();
    }
    public static void message1(){
        System.out.println("hello world!");
        message2();
    }
    public static void message2(){
        System.out.println("hello world!");
        message3();
    }
    public static void message3(){
        System.out.println("hello world!");
        message4();
    }
    public static void message4(){
        System.out.println("hello world!");
    }
    public static void main(String[] args){
        System.out.println("hello world!");
        message1();
    }
}
