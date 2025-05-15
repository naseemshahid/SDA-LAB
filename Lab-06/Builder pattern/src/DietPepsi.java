public class DietPepsi implements Item {
    @Override
    public String name() {
        return "Diet Pepsi";
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