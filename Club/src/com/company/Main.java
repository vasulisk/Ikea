package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------Ukrainian Ikea -------------------------------------");
        Membli mb = new Membli(1300,"Шафа","Стандартна","Чорна",2300,"Червоне дерево");
        Pruladu pr = new Pruladu("Мікрофильова піча","Білий",950, "Хороша");
        detali dt = new detali(15,30,8,"Закріплючі деталі","Стандартний:  білий",499,"Хороша");
        Food mn1 = new Food(300,255,450,670,700,800);
        Food mn2 = new Food(243,124,377,900);

        System.out.println("----------------Membli----------------");
        System.out.println("__________Price: "+ mb.getPrice() + ",___________Size: " + mb.getSize() + ",____________Type: " + mb.getType() + ",__________Model: " + mb.getModel() + "___________Color: " + mb.getColor() + "___________Material: " + mb.getMaterial() );
        mb.pricesize();
        mb.quality();
        System.out.println("----------------Electronika----------------");
        System.out.println("____________Type: " + pr.getType() + "___________Color: " + pr.getColor() + "__________Price: "+ pr.getPrice() + "_________Quality: " + pr.getQuality() );
        pr.priceaction();
        System.out.println("----------------Detali----------------");
        System.out.println("____________Screws: " + dt.getScrews() + "____________Keys: " + dt.getKeys() + "____________Klapans: " + dt.getKlapans() + "____________Type: " + dt.getType() + "___________Color: " + dt.getColor() + "__________Price: "+ dt.getPrice() + "_________Quality: " + dt.getQuality() );
        dt.punkt_1();

        System.out.println("----------------Food----------------");
        System.out.println("__________Meat: " + mn2.getMeat() + "_________Bread: " + mn2.getBread() + "_________Price: " + mn2.getPrice() + "_________Fruits: " + mn2.getFruits());
        mn2.count();



        System.out.println("------------------------ДЯКУЄМО ЩО ВИБРАЛИ НАС!------------------------");
    }
}
