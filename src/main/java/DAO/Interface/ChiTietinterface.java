package DAO.Interface;

import Model.ChitietThanhToanVaoEntity;

import java.util.List;

public interface ChiTietinterface {
    public List<ChitietThanhToanVaoEntity> ListDetailWithid(int idnhacungcap);

    public boolean ThanhToan(int idnhacungcap);
}
