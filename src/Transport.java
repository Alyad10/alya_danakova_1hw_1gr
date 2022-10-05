public class Transport {
    private int num;
    private String Type;
    private VolumetricEngine volumetricEngine;
    private ColorEnum colorEnum;

    public Transport(int num, String type, VolumetricEngine volumetricEngine, ColorEnum colorEnum) {
        this.num = num;
        Type = type;
        this.volumetricEngine = volumetricEngine;
        this.colorEnum = colorEnum;
    }

    public int getNum() {
        return num;
    }

    public String getType() {
        return Type;
    }

    public VolumetricEngine getVolumetricEngine() {
        return volumetricEngine;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }
    public String printInfo(){
        return "Num: " + num +
                "\nType:  " + Type +
                "\nVolumetricEngine volume: " + volumetricEngine.getVolume() +
                "\nVolumetricEngine yearOfIssue: " +volumetricEngine.getYearOfIssue();


    }
}
