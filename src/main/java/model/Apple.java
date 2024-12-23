package model;

import static model.constants.Colour.COLOUR_RED;
import static model.constants.Discount.DISCOUNT_0;
import static model.constants.Discount.DISCOUNT_60;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, String colour) {
        super (amount, price, true);
        this.colour=colour;
    }

    @Override
    public double getDiscount() {
        return (this.colour.equals(COLOUR_RED)) ? DISCOUNT_60 : DISCOUNT_0;
        /* тернарный оператор условия: если выполняется условие
        (this.colour.equals(COLOUR_RED)), тогда возвращается DISCOUNT_60,
        иначе (:) DISCOUNT_0 */
    }
}