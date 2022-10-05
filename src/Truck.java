public class Truck extends Transport{
    private int numberOfWheels;
    private final String model;

    public Truck(int num, String type,
                 VolumetricEngine volumetricEngine, ColorEnum colorEnum, int numberOfWheels, String model) {
        super(num, type, volumetricEngine, colorEnum);
        this.numberOfWheels = numberOfWheels;
        this.model = model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void brendOfTruck(int i){
        System.out.println("Volvo");}

     public void brendOfTruck(String truck){
         System.out.println(truck);}
    final public void brendOfTruck(){
        System.out.println("Scania");

    }






    public String getModel() {
        return model;
    }


}
