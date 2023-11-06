package DAO.Interface;

import Model.SanphamEntity;

import java.util.ArrayList;

public interface Productinterface {

    public boolean AddNewProduct(SanphamEntity data);
    public ArrayList<SanphamEntity> ListProduct();
    public ArrayList<SanphamEntity> FindProduct(String ProductName);
    public boolean UpdateProduct(SanphamEntity data);

    public boolean DeleteProduct(int idpr);
}
