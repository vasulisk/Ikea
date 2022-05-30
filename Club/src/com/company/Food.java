package com.company;

 class Food {
    //Змінні екземпляру класу
    private double meat;
    private double bread;
    private double sweet;
    private double fish;
    private double price;
    private double fruits;


    //Конструктор
    Food( double meat, double bread,double sweet,double fish,double price,double fruits) {
        super();
        this.meat = meat;
        this.bread = bread;
        this.sweet = sweet;
        this.fish = fish;
        this.price = price;
        this.fruits = fruits;
    }
    //Перевизначенний конструктор
    Food( double meat, double bread,double price,double fruits) {
        super();
        this.meat = meat;
        this.bread = bread;
        this.price = price;
        this.fruits = fruits;
    }
    void count(){
        if (meat > 200){
            price = price /1.5;
            System.out.println(" У вас знижка на: " + price);
            return;
        }
        else if (meat < 200){
            price = price /1.2;
            System.out.println("У вас знижка на: " + price);
            return;
        }

    }
    public double getPrice(){
        return price;
    }
    public  void  setprice(double price){
        this.price = price;
    }
    public double getMeat(){
        return meat;
    }
    public  void  setMeat(double meat){
        this.meat = meat;
    }
    public double getBread(){
        return bread;
    }
    public  void  setBread(double bread){
        this.bread = bread;
    }
    public double getFruits(){
        return fruits;
    }
    public  void  setFruits(double fruits){
        this.fruits = fruits;
    }
}

