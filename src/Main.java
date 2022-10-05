public class Main {
    public static void main(String[] args) {
      VolumetricEngine volumetricEngine = new VolumetricEngine(7,1993);
        Truck truck = new Truck(10,"Автовоз",volumetricEngine, ColorEnum.BLACK, 8,"Gaz 3308");
        System.out.println(truck.printInfo());

        Kamaz kamaz = new Kamaz(40,"Бортовой",volumetricEngine,ColorEnum.BROWN, 10,"Шасси 5350");
        Kamaz kamaz1 = new Kamaz(60,"Манипулятор",volumetricEngine,ColorEnum.GRAY,6,"Самосвал 43255");
        kamaz.brendOfTruck();
        truck.brendOfTruck();
        kamaz1.brendOfTruck(kamaz1.getModel());

        System.out.println(kamaz.printInfo());
        System.out.println(kamaz1.printInfo());




    }

}
