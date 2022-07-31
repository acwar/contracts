package org.aag.techblog.producer;

import org.aag.techblog.producer.beans.LoanRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraudController {

    @PutMapping(value = "/fraudcheck"
            ,consumes = MediaType.APPLICATION_JSON_VALUE
            ,produces = MediaType.APPLICATION_JSON_VALUE)
    public String check(@RequestBody LoanRequest loanRequest){
        if (loanRequest.getLoanAmount()>10000){
            return "{fraudCheckStatus: FRAUD, rejection.reason: Amount too high}";
        } else {
            return "{fraudCheckStatus: OK, acceptance.reason: Amount OK}";
        }
    }
}
