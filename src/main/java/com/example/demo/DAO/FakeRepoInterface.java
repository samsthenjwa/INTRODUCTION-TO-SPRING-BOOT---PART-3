package com.example.demo.DAO;

public interface FakeRepoInterface {

    void insertUser(long id, String name, String surname);
    String findUserById(long id);
    void deleteUser(long id);

}
