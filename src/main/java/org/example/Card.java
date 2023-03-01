package org.example;
class Card implements Cloneable{
    String name;
    String number ;
    String date;
    Card(String name,String number,String date){
        this.name =name;
        this.number =number;
        this.date =date;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public boolean equalling(String number1){
        return number.equals(number1);
    }
}

