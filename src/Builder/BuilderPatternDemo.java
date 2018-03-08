package Builder;

/*
https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
Builder - Separates the construction of a complex object from its representation
so that the same construction process can create different representations
Example : Kitchen is a Factory, Chef is a Builder where waiter tell to chef
"pizza with cheese, onion". Here chef exposed attributes but hidden implementation.
 */

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal:");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
