package org.aag.techblog.contractclient;

import org.aag.techblog.contractclient.beans.LoanRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="stores-service", url="http://localhost:8080")
public interface FraudConsumer {
    @RequestMapping(method = RequestMethod.PUT, value = "/fraudcheck")
    String check(LoanRequest loanRequest);
}
