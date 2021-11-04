package com.phexum.formHandler.domain.common;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<T,ID> {
    T save(T entity);

    T update(T entity);

    Optional<T> findById(long id);

    List<T> findAll();

    void deleteById(long id);

}

