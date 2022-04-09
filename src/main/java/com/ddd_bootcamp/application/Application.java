package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Item;
import com.ddd_bootcamp.domain.Price;
import com.ddd_bootcamp.domain.Product;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product headphone = new Product("Sony Wireless headphone",
                new Price(BigDecimal.valueOf(10), Currency.getInstance("USD")));
        Item headphoneItem = new Item(headphone, 1);
        cart.add(headphoneItem);

        Product applePencil = new Product("Apple Pencil",
                new Price(BigDecimal.valueOf(100), Currency.getInstance("USD")));
        Item applePencilItem = new Item(applePencil, 2);
        cart.add(applePencilItem);

        List<Item> items = cart.getItems();
        System.out.println("items = " + items);

        Product applePencil1 = new Product("Apple Pencil",
                new Price(BigDecimal.valueOf(10), Currency.getInstance("USD")));
        Item applePencilItem1 = new Item(applePencil1, 2);

        cart.remove(applePencilItem1);


        System.out.println("After Removing Apple Pencil with 2 quantity");
        System.out.println("Cart = " + cart);
        List<Item> items1 = cart.getItems();
        System.out.println("items = " + items1);

        System.out.println("----------------------------------------");
        Price price1 = new Price(new BigDecimal(11), Currency.getInstance("USD"));
        Price price2 = new Price(new BigDecimal(11), Currency.getInstance("USD"));
        System.out.println("price 1 and price 2 sameValueAs :" + price1.sameValueAs(price2));
        System.out.println("price 1 and price 2 equals :" + price1.equals(price2));

        System.out.println("----------------------------------------");





        //Code Problem 6
        //codeProblem6();

    }


    private static void codeProblem6() {
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        Product headphone1 = new Product("Sony Wireless headphone",
                new Price(BigDecimal.valueOf(10), Currency.getInstance("USD")));
        Item headphoneItem1 = new Item(headphone1, 1);

        Product headphone2 = new Product("Sony Wireless headphone",
                new Price(BigDecimal.valueOf(10), Currency.getInstance("USD")));
        Item headphoneItem2 = new Item(headphone2, 1);

        cart1.add(headphoneItem1);
        cart2.add(headphoneItem2);

        System.out.println(cart1.equals(cart2) ? "Carts are same" : "Carts are different");
        System.out.println(cart1.hasSameIdentityAs(cart2) ? "Carts are same" : "Carts are different");
    }
}
