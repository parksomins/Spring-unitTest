package com.koreait.day2.repository;

import com.koreait.day2.Day2ApplicationTests;
import com.koreait.day2.model.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UsersRepositoryTest extends Day2ApplicationTests {

    @Autowired
    private UsersRepository userRepository;

    @Test
    public void create() {
        Users user = Users.builder()
                .userid("somin")
                .userpw("1212")
                .hp("010-0202-0202")
                .email("somin@somin.com")
                .regDate(LocalDateTime.now())
                .build();
        Users newUser = userRepository.save(user);
        // Users newUser에 담는 이유는 다음에 쓸 때 편하게 쓰려고 (지금은 굳이 안써도됨 )
        // userRepository.save(user) : UsersRepository.java에 user를 저장한다는 뜻
    }
}
