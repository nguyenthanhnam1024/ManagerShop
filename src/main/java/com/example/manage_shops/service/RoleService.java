package com.example.manage_shops.service;

import com.example.manage_shops.entity.Role;
import com.example.manage_shops.exception.MyValidateException;
import com.example.manage_shops.request.RequestRole;
import com.example.manage_shops.response.ResponseLogin;

import java.util.List;

public interface RoleService {
    List<Role> getAllRole(ResponseLogin responseLogin) throws MyValidateException;

    List<String> getListRoleName(ResponseLogin responseLogin) throws MyValidateException;

    void saveRole(RequestRole requestRole) throws MyValidateException;
}
