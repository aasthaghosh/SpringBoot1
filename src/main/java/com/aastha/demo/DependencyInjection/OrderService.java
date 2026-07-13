package com.aastha.demo.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {





    //feild injection
//    @Autowired
    PaymentService paymentService;

    //Constructor Injection - You may not write @Autowired when there is a single
    OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

//    @Autowired
    public void setPaymentService(PaymentService paymentService){
        this.paymentService = paymentService;
    }



    public void placeOrder(){
        paymentService.payment();
        System.out.println("Order placed");
    }
}
