package com.codewithcup.razorpaygetway.service.impl;

import com.codewithcup.razorpaygetway.model.MyOrder;
import com.codewithcup.razorpaygetway.repositrory.MyOrderRepository;
import com.codewithcup.razorpaygetway.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    MyOrderRepository orderRepository;

    @Override
    public MyOrder saveOrder(MyOrder myOrder) {
        return orderRepository.save(myOrder);
    }

    @Override
    public MyOrder getOrderIdBy(String orderId) {
        return orderRepository.findByOrderId(orderId);
    }
}
