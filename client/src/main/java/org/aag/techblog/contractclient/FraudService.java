package org.aag.techblog.contractclient;

import org.aag.techblog.contractclient.beans.LoanRequest;
import org.springframework.stereotype.Component;

@Component
public class FraudService {
    private FraudConsumer consumer;

    public FraudService(FraudConsumer feignClient){
        this.consumer = feignClient;
    }
    public String checkTheFraud(){
        return consumer.check(LoanRequest.builder()
                .loanAmount(99999L)
                .clientId("1234567890")
                .build());
    }
}
