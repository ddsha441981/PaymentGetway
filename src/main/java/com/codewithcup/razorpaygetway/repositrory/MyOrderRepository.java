package com.codewithcup.razorpaygetway.repositrory;

import com.codewithcup.razorpaygetway.model.MyOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyOrderRepository extends JpaRepository<MyOrder, Long> {

    //getting orderId
    public MyOrder  findByOrderId(String orderId);

}
