package goods.dolls;

public enum EyeColor {
    BLUE("rgb value for blue"),
    BROWN("rgb value for brown"),
    GREEN("rgb value for green"),
    YELLOW("rgb value for yellow"),
    RED("rgb value for red"),
    GREY("rgb value for grey");

    String rgbColor;


    EyeColor(String rgbColor) {
        this.rgbColor = rgbColor;
    }

}
