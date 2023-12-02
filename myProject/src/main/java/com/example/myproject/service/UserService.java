package com.example.myproject.service;

public interface UserService {
    public int getUserAccount(String mailbox);
    public String getUserPassword(String mailbox);
    public int insertUser(String mailbox,String password);
}
