package model.service;

import model.Food;

public class ShoppingCart {
    private Food[] allProducts;

    public ShoppingCart(Food[] allProducts) {
        this.allProducts = allProducts;
    }

    // переменные, в которые будет записываться результат вычислений сумм
    double totalNoDiscount = 0;
    double totalWithDiscount = 0;
    double totalVeganNoDiscount = 0;

    // сумма заказа без скидок
    public double getTotalNoDiscount() {
        for (int i = 0; i < allProducts.length; i++) { // можно foreach, но такой способ пока не изучался
            totalNoDiscount = totalNoDiscount + (allProducts[i].getAmount() * allProducts[i].getPrice());
        } return totalNoDiscount;
    }

    // сумма заказа с учетом скидок
    public double getTotalWithDiscount() {
        for (int i = 0; i < allProducts.length; i++) {
            totalWithDiscount = totalWithDiscount + (allProducts[i].getPrice()*(1-allProducts[i].getDiscount()/100)*allProducts[i].getAmount());
        } return totalWithDiscount;
    }

    // сумма веганских товаров
    public double getTotalVeganNoDiscount () {
        for (int i = 0; i < allProducts.length; i++) {
            if (allProducts[i].isVegetarian()) {
                totalVeganNoDiscount = totalVeganNoDiscount + (allProducts[i].getAmount() * allProducts[i].getPrice());
            }
        } return totalVeganNoDiscount;
    }
}