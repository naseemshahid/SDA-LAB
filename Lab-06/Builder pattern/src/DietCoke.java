public class DietCoke implements Item {
    @Override
    public String name() {
        return "Diet Coke";
    }
    
    @Override
    public Packing packing() {
        return new Bottle();
    }
    
    @Override
    public float price() {
        return 35.0f;
    }
} 