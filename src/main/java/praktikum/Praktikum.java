package praktikum;
import java.util.List;

public class Praktikum {

    public static void main(String[] args) {
        // Инициализируется база данных
        Database database = new Database();

        // Создадается новый бургер
        Burger burger = new Burger();

        // Считается список доступных булок из базы данных
        List<Bun> buns = database.availableBuns();

        // Считается список доступных ингредиентов из базы данных
        List<Ingredient> ingredients = database.availableIngredients();

        // Соберается бургер
        burger.setBuns(buns.get(0));

        burger.addIngredient(ingredients.get(1));
        burger.addIngredient(ingredients.get(4));
        burger.addIngredient(ingredients.get(3));
        burger.addIngredient(ingredients.get(5));

        // Переместить слой с ингредиентом
        burger.moveIngredient(2, 1);

        // Удаляется ингредиент
        burger.removeIngredient(3);

        // Распечатывается рецепт бургера
        System.out.println(burger.getReceipt());
    }

}