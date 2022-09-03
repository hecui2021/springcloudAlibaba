package com.study.springcloud.service;

import com.study.springcloud.entities.Payment;

public interface PaymentService {
    int insert(Payment payment);

    Payment getPaymentById(Long id);
}
