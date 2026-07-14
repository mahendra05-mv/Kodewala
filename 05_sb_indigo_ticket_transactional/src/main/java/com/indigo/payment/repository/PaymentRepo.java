package com.indigo.payment.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.indigo.payment.entity.PaymentEntity;

public interface PaymentRepo extends JpaRepository<PaymentEntity, Long>
{

}