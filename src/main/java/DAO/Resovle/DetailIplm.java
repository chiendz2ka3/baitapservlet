package DAO.Resovle;

import DAO.Interface.ChiTietinterface;
import Entities.ChitietThanhToanVaoEntity;
import Entities.ChitietdonhangEntity;
import Entities.DonhangEntity;
import Entities.NhacungcapEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class DetailIplm implements ChiTietinterface {

    private EntityManagerFactory entityManagerFactory;
    EntityTransaction tran;

    public DetailIplm() {
        entityManagerFactory = Persistence.createEntityManagerFactory("manager");
    }

    @Override
    public List<ChitietThanhToanVaoEntity> ListDetailWithid(int idnhacungcap) {
        EntityManager entity = entityManagerFactory.createEntityManager();
        try {
            List<ChitietThanhToanVaoEntity> list = new ArrayList<>();
            entity = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = entity.getTransaction();
            list= entity.createQuery("select ct from  ChitietThanhToanVaoEntity ct where ct.idnhacungcap = :idnahcungcap and ct.statu=0" , ChitietThanhToanVaoEntity.class)
                    .setParameter("idnahcungcap" , idnhacungcap)
                    .getResultList();
            return list;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean ThanhToan(int idnhacungcap) {
        EntityManager entity = entityManagerFactory.createEntityManager();
        try {
            List<ChitietThanhToanVaoEntity> list = new ArrayList<>();
            entity = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = entity.getTransaction();
            entityTransaction.begin();
            entity.createQuery("update ChitietThanhToanVaoEntity ct set ct.statu =1 where ct.idnhacungcap = :idnhacungcap " , ChitietThanhToanVaoEntity.class).setParameter("idnhacungcap" , idnhacungcap);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
