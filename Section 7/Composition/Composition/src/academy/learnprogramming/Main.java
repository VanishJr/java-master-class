package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, motherboard);
        thePC.powerUp();

        System.out.println("*******************************************");

        Wardrobe wardrobe = new Wardrobe("Walk-in", 50, 25, 200);
        Table table = new Table("Wood", 30, 15, 50);
        Bed bed = new Bed("Waterbed",70,200, 40);

        SingleRoom singleRoom = new SingleRoom(wardrobe, table, bed);

        System.out.println("There is my day");
        singleRoom.myDay();




    }
}