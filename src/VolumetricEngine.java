public class VolumetricEngine {
    private int volume;
    private int yearOfIssue;

    public VolumetricEngine(int volume, int yearOfIssue) {
        this.volume = volume;
        this.yearOfIssue = yearOfIssue;
    }

    public int getVolume() {
        return volume;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }
}
