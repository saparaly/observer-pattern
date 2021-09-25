package com.company;
import java.util.*;

public class Store implements Subject {
    private List<Observer> customers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer customer) {
        customers.add(customer);
    }
    @Override
    public void removeSubscriber(Observer customer) {
        customers.remove(customer);
    }
    @Override
    public void notifySubscribers() {
        System.out.println("A new item is on sale! Act fast before it sells out!");
        for(Observer customer: customers) {
            customer.update("Sale!");
        }
    }
}