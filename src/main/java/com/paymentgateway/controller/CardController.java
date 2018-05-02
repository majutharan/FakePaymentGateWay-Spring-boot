package com.paymentgateway.controller;

import com.paymentgateway.domain.CardDetails;
import com.paymentgateway.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/card")
public class CardController {
    @Autowired
    CardRepository cardRepository;

    @PostMapping(path = "/cardAuthenticate")
    public @ResponseBody CardDetails authenticate(@RequestBody @Valid CardDetails card) {


        System.out.println("cardNo" + card.getCardNo());
        System.out.println("cardCvv" + card.getCvv());
        System.out.println("expiarydate" + card.getExpiaryDate());
        CardDetails c = cardRepository.findCardDetailsByCardNoAndCvvAndExpiaryDate(card.getCardNo(), card.getCvv(), card.getExpiaryDate());
        CardDetails response = new CardDetails();
        if (c != null) {
            response = c;
            response.setToken("1234567891011");
        }
        else {
            response.setToken("");
        }
        return response;
    }
}
