package com.store.order;

import com.store.payment.Payable;

public class OnlineOrder extends Order implements Payable {
    public OnlineOrder(int orderId, double amount) {  // Fixed parameter name
        super(orderId, amount);
    }
    
    @Override
    public void processOrder() {
        System.out.println("Process online order number " + getOrderId());
    }
    
    @Override
    public void pay() {
        System.out.println("Paying for order number " + getOrderId());
        setStatus(OrderStatus.PAID);
    }
}
