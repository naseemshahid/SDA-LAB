public class MealBuilder {

    public Meal prepareVegMeal(boolean dietDrink) {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(dietDrink ? new DietCoke() : new Coke());
        return meal;
    }   
 
    public Meal prepareNonVegMeal(boolean dietDrink) {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(dietDrink ? new DietPepsi() : new Pepsi());
        return meal;
    }

    public Meal prepareTeaMeal(boolean withCream, int sweetnessLevel) {
        Meal meal = new Meal();
        Tea tea = new Tea();
        if (withCream) {
            tea.addCream();
        }
        tea.setSweetnessLevel(sweetnessLevel);
        meal.addItem(tea);
        return meal;
    }
}