public class Gear {
    //Gear attributes
    String name;
    String type;
    String rarity;
    float weight;
    String description;
   

    public void displayGearDescription()
    {
        System.out.println("Description:" + description);
    }

    public void showAllAttribute()
    {
        System.out.println("Name:" + name);
        System.out.println("Type:" + type);
        System.out.println("Rarity:" + rarity);
        System.out.println("weight:" + weight);
        System.out.println("Description:" + description);

    }
}
