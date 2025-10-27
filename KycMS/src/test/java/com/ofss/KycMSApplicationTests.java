package com.ofss;

import com.ofss.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@ActiveProfiles("test") // ✅ Uses src/test/resources/application-test.yml
class KycMSApplicationTests {

    // ✅ Mock external dependencies so context starts cleanly
    @MockBean
    private EmailService emailService;

    @MockBean
    private RestTemplate restTemplate;

    @Test
    void contextLoads() {
        // ✅ Verifies that the Spring context loads successfully
    }
}
