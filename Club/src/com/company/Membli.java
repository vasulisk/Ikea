package com.company;

 class Membli {
     //Змінні екземпляру класу
     private double size;
     private String type;
     private String model;
     private String color;
     private double price;
     private String material;


     //Конструктор
     Membli( double size,String type,String model,String color,double price,String material) {
         super();
         this.size = size;
         this.type = type;
         this.model = model;
         this.color = color;
         this.price = price;
         this.material = material;
     }
     void quality(){
         if (material.equalsIgnoreCase(" Неякісний!! ")){
             price =- price/2;
             System.out.println("Ціну даного товару знижено на: " + price);
             return;
         }

         else if (material.equalsIgnoreCase("Якісний!! ")){
             price =+ price * 2;
             System.out.println("Ціну даного товару збільшено на: " + price);
             return;
         }
     }
     void pricesize(){
         if (size > 1280){
             price =+ 150;
             System.out.println("Ціна збільшується на " + price);
             return;
         }
         else if (size < 1280);
             price =-300;
             System.out.println("Ціна зменшується на " + price);
             return;
         }
     public double getSize(){
         return size;
     }
     public  void  setSize(double size){
         this.size = size;
     }
     public String getModel(){
         return model;
     }
     public  void  setModel(String model){
         this.model = model;
     }
     public String getColor(){
         return color;
     }
     public  void  setColor(String color){
         this.color = color;
     }
     public double getPrice(){
         return price;
     }
     public  void  setPrice(double price){
         this.price = price;
     }
     public String getMaterial(){
         return material;
     }
     public  void  setMaterial(String material){
         this.material = material;
     }
     public String getType() {
         return type;
     }
     public void setType(String type){
         this.type = type;
     }
     }

