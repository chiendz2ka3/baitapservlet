package DAO.Interface;

import Entities.ChitietThanhToanVaoEntity;
import Entities.ChitietdonhangEntity;

import java.util.List;

public interface ChiTietinterface {
    public List<ChitietThanhToanVaoEntity> ListDetailWithid(int idnhacungcap);

    public boolean ThanhToan(int idnhacungcap);
}
