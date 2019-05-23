package com.lizhiboxue.location.service.impl;

import com.lizhiboxue.location.repo.UserRepo;
import com.lizhiboxue.location.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepo userRepo;
}
