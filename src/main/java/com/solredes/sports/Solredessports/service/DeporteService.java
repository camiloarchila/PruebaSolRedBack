package com.solredes.sports.Solredessports.service;

import com.solredes.sports.Solredessports.model.Deporte;
import com.solredes.sports.Solredessports.model.TorneoDeporte;
import com.solredes.sports.Solredessports.repository.DeporteRepository;
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
public class DeporteService implements DeporteRepository {

    @Autowired
    private DeporteRepository deporteRepository;


    @Override
    public List<Deporte> findAll() {
        return deporteRepository.findAll();
    }

    @Override
    public List<Deporte> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Deporte> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Deporte> findAllById(Iterable<Long> longs) {
        return deporteRepository.findAllById(longs);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        deporteRepository.deleteById(aLong);
    }

    @Override
    public void delete(Deporte entity) {
        deporteRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Deporte> entities) {

    }

    @Override
    public void deleteAll() {
        deporteRepository.deleteAll();
    }

    @Override
    public <S extends Deporte> S save(S entity) {
        return deporteRepository.save(entity);
    }

    @Override
    public <S extends Deporte> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Deporte> findById(Long aLong) {
        return deporteRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Deporte> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Deporte> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Deporte> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Deporte getOne(Long aLong) {
        return null;
    }

    @Override
    public Deporte getById(Long aLong) {
        return deporteRepository.getById(aLong);
    }

    @Override
    public <S extends Deporte> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Deporte> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Deporte> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Deporte> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Deporte> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Deporte> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Deporte, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
