package DAO.Interface;

public class UserLogin {
    public String UserName;
    public String passworld;

    public UserLogin(String userName, String passworld) {
        UserName = userName;
        this.passworld = passworld;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "UserName='" + UserName + '\'' +
                ", passworld='" + passworld + '\'' +
                '}';
    }
}
