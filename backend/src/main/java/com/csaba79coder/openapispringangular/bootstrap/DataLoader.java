package com.csaba79coder.openapispringangular.bootstrap;

import com.csaba79coder.openapispringangular.entity.User;
import com.csaba79coder.openapispringangular.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {

    private final UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User();
        user.setEmail("csabavadasz79@gmail.com");
        user.setName("Csaba Vadasz");
    }
}
