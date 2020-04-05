package com.youngmin.me.post;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
<<<<<<< HEAD
=======
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
>>>>>>> 873a367003ad3bdad240b9c6b5ce8513eeced3d7
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
<<<<<<< HEAD
=======
@Import(PostRepositoryTestConfig.class) // 이거 추가됨
>>>>>>> 873a367003ad3bdad240b9c6b5ce8513eeced3d7
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

<<<<<<< HEAD
    @Test
    public void crud() {
        Post post = new Post();
        post.setTitle("hibernate");

        assertThat(postRepository.contains(post)).isFalse();

        postRepository.save(post);

        assertThat(postRepository.contains(post)).isTrue();

        postRepository.delete(post);
        postRepository.flush();
=======
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void event() {
        Post post = new Post();
        post.setTitle("event");
        PostPublishedEvent event = new PostPublishedEvent(post);
        applicationContext.publishEvent(event);
    }

    @Test
    public void crud() {
       Post post = new Post();
       post.setTitle("hibernate");

       assertThat(postRepository.contains(post)).isFalse();

       postRepository.save(post);

       assertThat(postRepository.contains(post)).isTrue();

       postRepository.delete(post);
       postRepository.flush()  ;
>>>>>>> 873a367003ad3bdad240b9c6b5ce8513eeced3d7
    }
}
