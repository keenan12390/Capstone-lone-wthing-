package za.ac.cput.factory;

import za.ac.cput.domain.Pizza;
import za.ac.cput.util.Helper;


/* PizzaFactory.java
 Author: Timothy Lombard (220154856)
 Date: 5th April (last updated) 2023
*/

    public class PizzaFactory {

        public static Pizza buildPizza(String itemName, String itemDescription, String size, boolean vegetarianOrNot, double price) {
            if (Helper.isNullOrEmpty(itemName) || Helper.isNullOrEmpty(itemDescription) || Helper.isNullOrEmpty(size) || Helper.isNullOrEmpty(String.valueOf(vegetarianOrNot)) || Helper.isNullOrEmpty(String.valueOf(price))) {
                return null;
            }

            String pizzaId = Helper.generateId();

            Pizza pizza = new Pizza.Builder().setPizzaId(pizzaId).setItemName(itemName).setItemDescription(itemDescription).setSize(size).setVegetarianOrNot(vegetarianOrNot).setPrice(price).build();
            return pizza;

        }

    }

