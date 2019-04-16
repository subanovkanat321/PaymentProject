package com.example.demo.controller;

import com.example.demo.model.Payment;
import com.example.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    private List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }

    @GetMapping("/{id}")
    private Payment getOnePayment(@PathVariable Long id){
        return paymentService.getPaymentById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Payment addPayment(@RequestBody Payment c){
        return paymentService.addPayment(c);
    }


}