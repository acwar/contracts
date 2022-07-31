package org.aag.techblog.producer.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class LoanRequest {

    @JsonProperty("client.id")
    @Getter @Setter
    private String clientId;

    @Getter @Setter
    private Long loanAmount;
}
