import java.util.HashMap;

public class Patient {
    private String name;
    private int bloodLevel;
    private int healthLevel;

    public Patient(String name, int bloodLevel, int healthLevel) {
        this.name = "";
        this.bloodLevel = 20;
        this.healthLevel = 10;
    }

    @Override
    public String toString() {
        return " has a blood level of " + bloodLevel + " and has a health level of " + healthLevel;
    }

    public int bloodLevels() {
        return bloodLevel;
    }

    public void decreaseBloodLevels(int drawAmount) {
        bloodLevel -= drawAmount;
    }

    public int healthLevels() {
        return healthLevel;
    }

    public void increaseHealthLevels(int loveAmount) {
        healthLevel += loveAmount;
    }
}


