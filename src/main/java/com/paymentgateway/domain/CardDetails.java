package com.paymentgateway.domain;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class CardDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @NotNull(message = "Please enter your card number")
    public String cardNo;

    public String cardName;
    public String cvv;
    public String expiaryDate;
    public String cardType;
    public String bankName;
    private String token;


    public void setId(Long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public String getCardName() {
        return cardName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public Long getId() {
        return id;
    }

    public String getCvv() {
        return cvv;
    }

    public String getExpiaryDate() {
        return expiaryDate;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setExpiaryDate(String expiaryDate) {
        this.expiaryDate = expiaryDate;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "CardDetails{" +
                "id=" + id +
                ", cardNo='" + cardNo + '\'' +
                ", cardName='" + cardName + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expiaryDate='" + expiaryDate + '\'' +
                ", cardType='" + cardType + '\'' +
                ", bankName='" + bankName + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
