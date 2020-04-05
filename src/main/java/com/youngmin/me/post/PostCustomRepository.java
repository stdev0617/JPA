package com.youngmin.me.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface PostCustomRepository<T> {

    List<Post> findMyPost();

    void delete(T entity);
}
