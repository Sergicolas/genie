package com.genie.userms.Infra.DataBase.MySQL;

import com.genie.userms.Domain.Model.User;
import com.genie.userms.Domain.Repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositorySQLImpl implements UserRepository {


    @Override
    public void createUser(User user) {

    }
}
