package com.Ecommerce.Ecommerce.in.Sevice;


import com.Ecommerce.Ecommerce.in.Entitiy.Cart;
import jakarta.persistence.Id;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@org.springframework.stereotype.Service
public class ServiceImp implements Service {
    public Cart saveDepartment(Cart cart) {
        return cart;
    }

    @Override
    public ThreadLocal<Object> findById(int id) {
        return null;
    }

    @Override
    public void deleteAll(List<Cart> cart) {

    }

    @Override
    public List<Cart> findAll(Cart cart) {
        return null;
    }

    public Cart deleteCart() {
        return null;
    }

    public List<Cart> getCart(){
        return  getCart();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Integer> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Integer> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Integer> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Id> ids) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Integer getOne(Id id) {
        return null;
    }

    @Override
    public Integer getById(Id id) {
        return null;
    }

    @Override
    public Integer getReferenceById(Id id) {
        return null;
    }

    @Override
    public <S extends Integer> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Integer> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Integer> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Integer> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Integer> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Integer> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Integer, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Integer> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Integer> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Integer> findById(Id id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Id id) {
        return false;
    }

    @Override
    public List<Integer> findAll() {
        return null;
    }

    @Override
    public List<Integer> findAllById(Iterable<Id> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Id id) {

    }

    @Override
    public void delete(Integer entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Id> ids) {

    }

    @Override
    public void deleteAll(Iterable<? extends Integer> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Integer> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Integer> findAll(Pageable pageable) {
        return null;
    }
}
