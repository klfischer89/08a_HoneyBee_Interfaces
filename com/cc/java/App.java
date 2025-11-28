package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();
        Bird bird = new Bird();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        pollObj(bird);

        isFlyable(queen);
        isFlyable(worker);
        isFlyable(drone);
        isFlyable(bird);
    }

    // 2. Variante Polymorphie
    private static void pollObj(HoneyBee bee) {
        output(bee.doYourJob());
        output(bee.fly());
        output("-------------------");
    }

    private static void pollObj(Bird obj){
        output(obj.hasFeathers());
        output(obj.fly());
        output("-------------------");
    }

    private static void isFlyable(Flyable fly){
        output(fly.canFly());
        output("+++++++++++++++++++");
    }
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

