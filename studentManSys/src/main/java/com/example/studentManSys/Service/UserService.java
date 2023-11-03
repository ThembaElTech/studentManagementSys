package com.example.studentManSys.Service;

import com.example.studentManSys.Model.UserDtls;

public interface UserService {

    public UserDtls createUser(UserDtls user);

    public boolean checkEmail(String email);
}
