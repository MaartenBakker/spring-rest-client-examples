package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static reactor.core.publisher.Mono.when;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void getUsers() {

        List<User> users = apiService.getUsers();

        assertNotNull(users);
        log.error(users.get(0).toString());

    }
}