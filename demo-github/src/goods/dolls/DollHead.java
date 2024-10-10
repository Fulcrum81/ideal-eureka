package goods.dolls;

public class DollHead {
    private String hairColor;
    private EyeColor eyeColor;
    private boolean hasFreckles;

    public DollHead(String hairColor, EyeColor eyeColor, boolean hasFreckles) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.hasFreckles = hasFreckles;
    }

    public String getHairColor() {
        return "My hair color is" + hairColor;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public boolean getHasFreckles() {
        return hasFreckles;
    }
}
