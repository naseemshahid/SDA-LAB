import java.util.Scanner;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nWelcome to Meal Builder!");
            System.out.println("1. Veg Meal");
            System.out.println("2. Non-Veg Meal");
            System.out.println("3. Tea");
            System.out.println("4. Exit");
            System.out.print("Please select your meal type (1-4): ");
            
            int choice = scanner.nextInt();
            if (choice == 4) break;
            
            Meal meal = null;
            
            switch (choice) {
                case 1:
                    System.out.print("Would you like diet Coke? (yes/no): ");
                    boolean dietCoke = scanner.next().toLowerCase().startsWith("y");
                    meal = mealBuilder.prepareVegMeal(dietCoke);
                    break;
                    
                case 2:
                    System.out.print("Would you like diet Pepsi? (yes/no): ");
                    boolean dietPepsi = scanner.next().toLowerCase().startsWith("y");
                    meal = mealBuilder.prepareNonVegMeal(dietPepsi);
                    break;
                    
                case 3:
                    System.out.print("Would you like cream in your tea? (yes/no): ");
                    boolean withCream = scanner.next().toLowerCase().startsWith("y");
                    System.out.print("How many spoons of sugar would you like? (0-5): ");
                    int sweetnessLevel = Math.min(5, Math.max(0, scanner.nextInt()));
                    meal = mealBuilder.prepareTeaMeal(withCream, sweetnessLevel);
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }
            
            if (meal != null) {
                System.out.println("\nYour Order:");
                meal.showItems();
                System.out.println("Total Cost: " + meal.getCost());
            }
        }
        
        scanner.close();
        System.out.println("Thank you for using Meal Builder!");
    }
}