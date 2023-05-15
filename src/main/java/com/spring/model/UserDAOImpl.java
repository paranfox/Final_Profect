package com.spring.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SqlSessionTemplate sqlSession;



    @Override
    public void save(UserDTO user) {

    }

    @Override
    public UserDTO findByUsername(String username) {
        return null;
    }

    @Override
    public UserDTO findByUserId(String userid){
        return this.sqlSession.selectOne("contOne", userid);
    }
    @Override
    public UserDTO findByEmail(String email) {
        return null;
    }

    @Override
    public UserDTO findByConfirmationToken(String confirmationToken) {
        return null;
    }

    @Override
    public void update(UserDTO user) {

    }

    @Override
    public void delete(UserDAO user) {

    }

    @Override
    public void deleteByUsername(String username) {

    }

    @Override
    public void deleteByEmail(String email) {

    }

    @Override
    public void deleteByConfirmationToken(String confirmationToken) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public boolean existsByUsername(String username) {
        return false;
    }

    @Override
    public boolean existsByEmail(String email) {
        return false;
    }

    @Override
    public boolean existsByConfirmationToken(String confirmationToken) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }
}