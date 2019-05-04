package com.smartaddress.demo;

import com.github.jsonzou.jmockdata.MockConfig;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@ActiveProfiles({"test"})
@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public abstract class TestBase {
    protected final  MockConfig MOCK_CONFIG = new MockConfig()
            .globalConfig().stringRegex("[a-zA-Z_]{1}[a-z0-9_]{5,15}");
}
