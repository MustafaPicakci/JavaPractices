package com.phexum.formHandler.domain.common;

import java.util.List;
import java.util.Optional;

public class CrudServiceImpl<R extends BaseRepository<T, ID>, T, ID> implements CrudService<T, ID> {

    protected R repository;

    public CrudServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public T update(T entity) {
        return repository.update(entity);
    }

    @Override
    public Optional<T> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
