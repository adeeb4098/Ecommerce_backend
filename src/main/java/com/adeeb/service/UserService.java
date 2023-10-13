package com.adeeb.service;

import com.adeeb.Exception.UserException;
import com.adeeb.model.User;
import jdk.jshell.spi.ExecutionControl;

public interface UserService {

    public User findUserById(Long userId) throws UserException;
    public User findUserProfileByJwt(String jwt) throws UserException;

}
