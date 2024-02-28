package com.solredes.sports.Solredessports.service;

import com.solredes.sports.Solredessports.model.Torneo;
import com.solredes.sports.Solredessports.repository.TorneoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TorneoService implements TorneoRepository{

    @Autowired
    private TorneoRepository torneoRepository;

    @Override
    public List<Torneo> findAll() {
        return torneoRepository.findAll();
    }

    @Override
    public List<Torneo> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Torneo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Torneo> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        torneoRepository.deleteById(aLong);
    }

    @Override
    public void delete(Torneo entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Torneo> entities) {

    }

    @Override
    public void deleteAll() {
        torneoRepository.deleteAll();
    }

    @Override
    public <S extends Torneo> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Torneo> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Torneo> findById(Long aLong) {
        return torneoRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Torneo> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Torneo> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Torneo> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Torneo getOne(Long aLong) {
        return null;
    }

    @Override
    public Torneo getById(Long aLong) {
        return torneoRepository.getById(aLong);
    }

    @Override
    public <S extends Torneo> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Torneo> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Torneo> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Torneo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Torneo> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Torneo> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Torneo, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
