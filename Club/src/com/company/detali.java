package com.company;

class detali extends Pruladu {

  //Змінні екземпляру класу
  private double screws;
  private double keys;
  private double klapans;

    detali(double screws,double keys,double klapans,String type, String color, double price,String quality){
     super( type,color,price,quality);
     this.screws = screws;
     this.keys = keys;
     this.klapans = klapans;
    }

    void punkt_1(){
        System.out.println("-------------Умови обміну----------------");
        if (screws > 10){
            System.out.println("У вашому випадку омбін можливий");
        }
        else if(keys > 10){
            System.out.println("У вашому випадку омбін можливий");
        }
        else if (klapans > 7){
            System.out.println("У вашому випадку омбін можливий");
        }
    }



    public double getScrews(){
        return screws;
    }
    public  void  setScrews(double screws){
        this.screws = screws;
    }
    public double getKeys(){
        return keys;
    }
    public void setKeys(double keys){
        this.keys = keys;
    }
    public double getKlapans(){
        return klapans;
    }
    public void setKlapans(double klapans){
        this.klapans = klapans;
    }
 }
