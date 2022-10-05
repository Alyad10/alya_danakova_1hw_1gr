public class Kamaz extends Truck{


    public Kamaz(int num, String type, VolumetricEngine volumetricEngine,
                 ColorEnum colorEnum, int numberOfWheels, String model) {
        super(num, type, volumetricEngine, colorEnum, numberOfWheels, model);
    }




    @Override
    public String printInfo() {
        return super.printInfo() +
                "\nNumberOfWheels: " + getNumberOfWheels() +
                "\nModel: " + getModel();

    }
}






