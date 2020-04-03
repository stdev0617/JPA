package com.youngmin.me.post;

import java.util.List;

public interface PostCustomRepository<Post, Long> {

    public List<Post> findMyPost();

    public void delete(Post entity);
}
