package org.aag.techblog.contractclient;

import org.aag.techblog.contractclient.beans.LoanRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(value="stores-service", url="http://localhost:8080")
public interface FraudConsumer {
    @PutMapping(value = "/fraudcheck")
    String check(LoanRequest loanRequest);
}
