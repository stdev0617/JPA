package com.youngmin.me.post;

import org.springframework.context.annotation.Bean;

public class PostRepositoryTestConfig {

    @Bean
    public PostListener postListener() {
        return new PostListener();
    }
}
