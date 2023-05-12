package com.example.manage_shops.service;

import com.example.manage_shops.entity.Account;
import com.example.manage_shops.entity.User;

import java.util.Map;

public interface SecurityService {
     Map<String , String> errorCheckAccountMap(Account account);

     void registerUser(User user, Account account);
}
