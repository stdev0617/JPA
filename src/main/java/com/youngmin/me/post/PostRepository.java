package com.youngmin.me.post;

import com.youngmin.me.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends MyRepository<Post, Long> {
}
