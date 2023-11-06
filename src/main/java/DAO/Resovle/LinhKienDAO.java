package DAO.Resovle;

import DAO.Interface.Productinterface;
import Model.SanphamEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class LinhKienDAO implements Productinterface {

    private EntityManagerFactory entityManagerFactory;
    EntityTransaction tran;

    public LinhKienDAO() {
        entityManagerFactory = Persistence.createEntityManagerFactory("manager");
    }
    @Override
    public boolean AddNewProduct(SanphamEntity data) {
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
    public ArrayList<SanphamEntity> ListProduct() {
        try {
            ArrayList<SanphamEntity> arrayList = new ArrayList<>();
            EntityManager enty = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = enty.getTransaction();
            entityTransaction.begin();
            for(SanphamEntity data : enty.createQuery("from  SanphamEntity " , SanphamEntity.class).getResultList()){
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
    public ArrayList<SanphamEntity> FindProduct(String ProductName) {
        try {
            List<SanphamEntity> arrayList = new ArrayList<>();
            EntityManager enty = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = enty.getTransaction();
            entityTransaction.begin();
            arrayList = enty.createQuery("select e from  SanphamEntity e where e.tensampham like :ProductName" , SanphamEntity.class)
            .setParameter("ProductName", "%" + ProductName + "%").getResultList();
            System.out.println("count llll "+ arrayList.size());
//            for(Object data : query.getResultList()){
//                arrayList.add((SanphamEntity)data);
//            }
            enty.getTransaction().commit();
            enty.close();
            return (ArrayList<SanphamEntity>) arrayList;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    public SanphamEntity finpr(int id ){
        try {
            EntityManager enty = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = enty.getTransaction();
            entityTransaction.begin();
            SanphamEntity result = enty.find(SanphamEntity.class , id);
            enty.getTransaction().commit();
            enty.close();
            return  result;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    @Override
    public boolean UpdateProduct(SanphamEntity data) {
        return false;
    }

    @Override
    public boolean DeleteProduct(int idpr) {
        return false;
    }
}
