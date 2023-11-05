package DAO.Interface;

import Entities.UsersEntity;

public interface registersUser {

    public boolean Loginuser(UserLogin data);
    public boolean RegisterUser(UsersEntity data);
}

