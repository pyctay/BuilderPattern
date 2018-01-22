import com.lizx.Meal;
import com.lizx.MealBuilder;

/**
 * 测试主类
 */
public class Main {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        System.out.println("套餐一");
        Meal one = mealBuilder.one();
        one.getCost();
        one.showItems();
        System.out.println("套餐二");
        Meal two = mealBuilder.two();
        two.getCost();
        two.showItems();
    }
}
