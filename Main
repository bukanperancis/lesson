import java.sql.SQLException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {

            // Creating an object called 'user' for the User class
            // User will be asked to enter user and password to run the program
            User user = new User();
            user.promptForIdAndPassword();

            // Using AddItem class to ask user for inputs
            // Inputs will be stored in an array of String
            String[] ingredients = AddItem.promptForIngredients();

            // RecipeManager handles the (mySQL) database of the program
            // A possible meal is suggested by selecting a meal that contains
            // the ingredients as in the user's input
            List<Recipe> recipes = RecipeManager.searchRecipes(ingredients);

            if (!recipes.isEmpty()) {

                // User receive possible meal recipes
                System.out.println("You can make these recipes:");

                // Recipe class return the name, ingredients, and instructions of the meal
                for (Recipe recipe : recipes) {
                    System.out.println("\n");
                    System.out.println(recipe.getName() + " - " + recipe.getIngredients());
                    System.out.println("Instructions:\n" + recipe.getInstructions());

                }
            }
            else {
                System.out.println("No recipes found.");
            }
        }
        catch (SQLException e) {
            System.out.println("Database connection failed.");
            e.printStackTrace();
        }
    }
}
