package com.company;

 class Pruladu {


   //Змінні екземпляру класу
   private String type;
   private String color;
   private double price;
   private String quality;



   //Конструктор
   Pruladu( String type, String color, double price, String quality) {
    super();
    this.type = type;
    this.color = color;
    this.price = price;
    this.quality = quality;
   }
   void priceaction(){
       if (quality == "Погана"){
           price = price /2;
           System.out.println("Ціну знижено вдвічі");
           return;
       }
     }



     public String getType() {
         return type;
     }
     public void setType(String type){
         this.type = type;
     }
     public String getColor() {
         return color;
     }
     public void setColor(String color){
         this.color = color;
     }
     public String getQuality() {
         return quality;
     }
     public double getPrice(){
         return price;
     }
     public  void  setPrice(double price){
         this.price = price;
     }
     public void setQuality(String quality){
         this.quality = quality;
     }

 }
