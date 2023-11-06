package DAO.Interface;

import Model.UsersEntity;

public interface registersUser {

    public boolean Loginuser(UserLogin data);
    public boolean RegisterUser(UsersEntity data);
}

