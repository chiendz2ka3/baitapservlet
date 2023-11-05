package DAO.Resovle;

import DAO.Interface.UserLogin;
import DAO.Interface.registersUser;
import Entities.UsersEntity;
import jakarta.persistence.*;

public class loginipl implements registersUser {

    private EntityManagerFactory entityManagerFactory;
    EntityTransaction tran;

    public loginipl() {
        entityManagerFactory = Persistence.createEntityManagerFactory("manager");
    }

    @Override
    public boolean Loginuser(UserLogin data) {
        EntityManager entity = entityManagerFactory.createEntityManager();
        try {
            entity = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = entity.getTransaction();
            System.out.println("da log duoc vao ben trong ham");
            //UsersEntity customer = entity.find(UsersEntity.class , data.UserName);
            Query query = entity.createQuery("SELECT ad FROM UsersEntity ad WHERE ad.username =:usernam");
            query.setParameter("usernam", data.UserName);
            UsersEntity customer = (UsersEntity) query.getSingleResult();
            System.out.println(customer.toString());
            if(customer!=null && customer.getPassWords().equals(data.passworld)) return true;
            else return false;
        }catch (Exception e){

            System.out.println(e.getMessage());
            return false;
        }finally {
            entity.close();
        }
    }

    @Override
    public boolean RegisterUser(UsersEntity data) {
        try {
            EntityManager enty = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = enty.getTransaction();
            enty.getTransaction().begin();
            enty.persist(data);
            enty.getTransaction().commit();
            enty.close();
            return true;
        }catch (Exception E){

        }
        return false;
    }
}
