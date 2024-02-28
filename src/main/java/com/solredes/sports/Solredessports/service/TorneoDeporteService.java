package com.solredes.sports.Solredessports.service;

import com.solredes.sports.Solredessports.model.Deporte;
import com.solredes.sports.Solredessports.model.Torneo;
import com.solredes.sports.Solredessports.model.TorneoDeporte;
import com.solredes.sports.Solredessports.repository.TorneoDeporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TorneoDeporteService implements TorneoDeporteRepository{

    @Autowired
    private TorneoDeporteRepository torneoDeporteRepository;

    public List<Deporte> findbyidtorneo(long idtorneo){
        List<Deporte> listadeportes = new ArrayList<>();
        List<TorneoDeporte> torneoDeportes = torneoDeporteRepository.findAll();
        for (int i=0; i<torneoDeportes.size(); i++){
            if(torneoDeportes.get(i).getTorneo().getIdTorneo() == idtorneo){
                listadeportes.add(torneoDeportes.get(i).getDeporte());
            }
        }
        return listadeportes;
    }

    public int findbyids(long idtorneo, long iddeporte){
        List<TorneoDeporte> torneoDeportes = torneoDeporteRepository.findAll();
        for(int i=0; i<torneoDeportes.size(); i++){
            if(torneoDeportes.get(i).getDeporte().getIdDeporte() == iddeporte && torneoDeportes.get(i).getTorneo().getIdTorneo() == idtorneo){
                return torneoDeportes.get(i).getIdTorneoDeporte();
            }
        }
        return 0;
    }

    @Override
    public List<TorneoDeporte> findAll() {
        return torneoDeporteRepository.findAll();
    }

    @Override
    public List<TorneoDeporte> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TorneoDeporte> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<TorneoDeporte> findAllById(Iterable<Long> longs) {
        return torneoDeporteRepository.findAllById(longs);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        torneoDeporteRepository.deleteById(aLong);
    }

    @Override
    public void delete(TorneoDeporte entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends TorneoDeporte> entities) {

    }

    @Override
    public void deleteAll() {
        torneoDeporteRepository.deleteAll();
    }

    @Override
    public <S extends TorneoDeporte> S save(S entity) {
        return null;
    }

    @Override
    public <S extends TorneoDeporte> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TorneoDeporte> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends TorneoDeporte> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends TorneoDeporte> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<TorneoDeporte> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TorneoDeporte getOne(Long aLong) {
        return null;
    }

    @Override
    public TorneoDeporte getById(Long aLong) {
        return torneoDeporteRepository.getById(aLong);
    }

    @Override
    public <S extends TorneoDeporte> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TorneoDeporte> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TorneoDeporte> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TorneoDeporte> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TorneoDeporte> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TorneoDeporte> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends TorneoDeporte, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
