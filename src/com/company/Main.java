package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

        // Initialization
        Subject fashionStores = new Store();
        Observer customer1 = new PassiveCustomer();
        Observer customer2 = new Customer();
        Observer customer3 = new Customer();

        // Adding two customers to the newsletter
        fashionStores.addSubscriber(customer1);
        fashionStores.addSubscriber(customer2);

        // Notifying customers (observers)
        fashionStores.notifySubscribers();

        // A customer has decided not to continue following the newsletter
        fashionStores.removeSubscriber(customer1);

        // customer2 told customer3 that a sale is going on
        fashionStores.addSubscriber(customer3);

        // Notifying the updated list of customers
        fashionStores.notifySubscribers();
    }
}
