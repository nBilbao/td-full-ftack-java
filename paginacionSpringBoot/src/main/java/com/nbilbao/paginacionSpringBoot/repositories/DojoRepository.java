package com.nbilbao.paginacionSpringBoot.repositories;

import com.nbilbao.paginacionSpringBoot.models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {

    @Override
    default <S extends Dojo> S save(S entity) {
        return null;
    }

    @Override
    default <S extends Dojo> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default Optional<Dojo> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Long aLong) {
        return false;
    }

    @Override
    default Iterable<Dojo> findAll() {
        return null;
    }

    @Override
    default Iterable<Dojo> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Long aLong) {

    }

    @Override
    default void delete(Dojo entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    default void deleteAll(Iterable<? extends Dojo> entities) {

    }

    @Override
    default void deleteAll() {

    }
}
