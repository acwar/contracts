package org.aag.techblog.contractclient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(
        classes = { ContractClientApplication.class }
)
@AutoConfigureStubRunner(
        ids = {"org.aag.techblog:producer:+:stubs:8080"},
        stubsMode = StubRunnerProperties.StubsMode.LOCAL
)
class FraudServiceTest {
    @Autowired
    private FraudService subject;
    @Test
    public void testFraudController(){
        assertNotNull(subject.checkTheFraud());
    }
}