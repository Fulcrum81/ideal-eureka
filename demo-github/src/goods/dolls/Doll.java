package goods.dolls;

import goods.GoodsItem;

public class Doll extends GoodsItem {

    private DollHead head;
    private DollOutfit outfit;
    private String skinColor;
    private String name;
    private boolean isCollectible;

    public Doll(DollHead head, DollOutfit outfit, String skinColor, String name, boolean isCollectible, double price) {
        this.head = head;
        this.outfit = outfit;
        this.skinColor = skinColor;
        this.name = name;
        this.isCollectible = isCollectible;
        this.price = price;
    }

    public Doll(String hairColor, EyeColor eyeColor, boolean hasFreckles, String outfitType, String outfitColor,
                String skinColor, String name, boolean isCollectible, double price) {

        this.head = new DollHead(hairColor, eyeColor, hasFreckles);
        this.outfit = new DollOutfit(outfitType, outfitColor);
        this.skinColor = skinColor;
        this.name = name;
        this.isCollectible = isCollectible;
        this.price = price;
    }

    public DollHead getHead() {
        return head;
    }

    public DollOutfit getOutfit() {
        return outfit;
    }

    public String getName() {
        return name;
    }

    public String getDollInfo() {
        return "My name is " + name + ", My eye color is " + head.getEyeColor().rgbColor;
    }
}
