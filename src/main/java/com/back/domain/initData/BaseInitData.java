package com.back.domain.initData;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseInitData {

    @Bean
    ApplicationRunner baseInitDataApplicationRunner() {
        return args -> {
            // 여기에 초기 데이터를 삽입하는 로직을 작성합니다.
            // 예: repository.save(new Entity(...));
            System.out.println("기본 데이터가 초기화되었습니다.");
        };
    }
}
