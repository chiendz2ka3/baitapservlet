package DAO.Resovle;

import DAO.Interface.supplier;
import Model.NhacungcapEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.ArrayList;

public class SupplieimpDao implements supplier {

    private EntityManagerFactory entityManagerFactory;
    EntityTransaction tran;

    public SupplieimpDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("manager");
    }
    @Override
    public boolean Addnewsupplier(NhacungcapEntity data) {
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

    @Override
    public ArrayList<NhacungcapEntity> Listsupplier() {

        try {
            ArrayList<NhacungcapEntity> arrayList = new ArrayList<>();
            EntityManager enty = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = enty.getTransaction();
            entityTransaction.begin();
            for(NhacungcapEntity data : enty.createQuery("from  NhacungcapEntity " , NhacungcapEntity.class).getResultList()){
                arrayList.add(data);
            }
            enty.getTransaction().commit();
            enty.close();
            return arrayList;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public NhacungcapEntity nhacc(int id) {
        try {
            EntityManager enty = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = enty.getTransaction();
            entityTransaction.begin();
            NhacungcapEntity result = enty.find(NhacungcapEntity.class , id);
            enty.getTransaction().commit();
            enty.close();
            return result;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
