public class Tea implements Item {
    private String name = "Tea";
    private float basePrice = 15.0f;
    private int sweetnessLevel = 0;
    private boolean hasCream = false;
    
    @Override
    public String name() {
        String description = name;
        if (hasCream) {
            description += " with Cream";
        }
        if (sweetnessLevel > 0) {
            description += " (" + sweetnessLevel + " spoons of sugar)";
        }
        return description;
    }
    
    @Override
    public Packing packing() {
        return new Bottle();
    }
    
    @Override
    public float price() {
        float totalPrice = basePrice;
        if (hasCream) {
            totalPrice += 5.0f;
        }
        totalPrice += sweetnessLevel * 2.0f;  // Each spoon of sugar costs 2.0
        return totalPrice;
    }
    
    public void addCream() {
        this.hasCream = true;
    }
    
    public void setSweetnessLevel(int spoons) {
        this.sweetnessLevel = spoons;
    }
} 