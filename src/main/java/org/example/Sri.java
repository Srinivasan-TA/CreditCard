package org.example;

import java.util.Scanner;

class Sri{
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the credit card name:");
        String name = sc.nextLine();
        System.out.println("Enter the credit card number:");
        String number = sc.nextLine();
        System.out.println("enter the expiration date");
        String date=sc.nextLine();
        System.out.println("Enter the credit card number:");
        String number1 = sc.nextLine();
        Card s1=new Card(name,number,date);
        Card s3=(Card)s1.clone();
        System.out.println("result is "+ s3.equalling(number1));
    }
}
class Card implements Cloneable{
    static  String name;
    static String number ;
    static String date;
    Card(String name,String number,String date){
        Card.name =name;
        Card.number =number;
        Card.date =date;
    }
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public boolean equalling(String number1){
            return number.equals(number1);
    }
}

