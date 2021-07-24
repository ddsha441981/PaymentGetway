package com.codewithcup.razorpaygetway.service;

import com.codewithcup.razorpaygetway.model.MyOrder;

public interface OrderService {

    //    Save order
    public MyOrder saveOrder(MyOrder myOrder);

    //calling repository method
    public MyOrder getOrderIdBy(String orderId);
}
