package com.store.main;

import com.store.order.*;
import com.store.payment.Payable;
import java.util.ArrayList;
import java.util.Iterator;

class OrderApp {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        
        OnlineOrder order1 = new OnlineOrder(10001, 500.00);
        OnlineOrder order2 = new OnlineOrder(10002, 1250.25);
        OnlineOrder order3 = new OnlineOrder(10003, 750.65);
        
        order1.processOrder();
        order1.pay();
        
        order2.processOrder();
        
        order3.processOrder();
        order3.pay();
        
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        
        System.out.println("\n - - - ORDER LIST - - - ");
        Iterator<Order> it = orders.iterator();
        
        while (it.hasNext()) {
            Order order = it.next();
            System.out.println(order.getOrderSummary());
            
            if (order.getStatus() == OrderStatus.CANCELLED) {
                it.remove();
            }
        }
        
        System.out.println("\n - - - FINAL LIST - - -");
        for (Order order : orders) {
            System.out.println(order.getOrderSummary());
        }
    }
}
