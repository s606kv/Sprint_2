import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

import static model.constants.Colour.COLOUR_GREEN;
import static model.constants.Colour.COLOUR_RED;

public class Main {
    public static void main(String[] args) {

        Meat meatBag = new Meat(5, 100);
        Apple appleBag1 = new Apple(10, 50, COLOUR_RED);
        Apple appleBag2 = new Apple(8, 60, COLOUR_GREEN);

        Food[] allProducts = {meatBag, appleBag1, appleBag2};

        ShoppingCart shoppingCart = new ShoppingCart (allProducts);

        System.out.printf("Сумма товаров без скидки: %.2f рублей.%n", shoppingCart.getTotalNoDiscount());
        System.out.printf("Сумма товаров со скидкой: %.2f рублей.%n", shoppingCart.getTotalWithDiscount());
        System.out.printf("Сумма вегетарианских продуктов без скидки: %.2f рублей.", shoppingCart.getTotalVeganNoDiscount());
    }
}