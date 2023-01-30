package org.example;

import java.util.Scanner;
import java.util.logging.Logger;


class Sri{
    public static Logger e = Logger.getLogger("com.api.jar");
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        e.info("Enter the credit card name:");
        String name = sc.nextLine();
        e.info("Enter the credit card number:");
        String number = sc.nextLine();
        e.info("enter the expiration date");
        String date=sc.nextLine();
        e.info("Enter the credit card number:");
        String number1 = sc.nextLine();
        Card s1=new Card(name,number,date);
        Card s3=(Card)s1.clone();
        e.info("result is "+ s3.equalling(number1));
        System.out.println(s1);
        System.out.println(s3);
    }
}
class Card implements Cloneable{
     String name;
     String number ;
     String date;
    Card(String name,String number,String date){
        this.name =name;
        this.number =number;
        this.date =date;
    }
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public boolean equalling(String number1){
            return number.equals(number1);
    }
}

