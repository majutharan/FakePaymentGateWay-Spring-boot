package com.paymentgateway.repository;

import com.paymentgateway.domain.CardDetails;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<CardDetails, Long> {
        CardDetails findCardDetailsByCardNoAndCvvAndExpiaryDate(String cardNo, String cvv, String expiaryDate);


}

