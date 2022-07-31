package org.aag.techblog.contractclient.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Builder
public class LoanRequest {

    @JsonProperty("client.id")
    @Getter @Setter
    private String clientId;

    @Getter @Setter
    private Long loanAmount;
}
