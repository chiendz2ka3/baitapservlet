package DAO.Interface;

import Entities.ChitietdonhangEntity;
import Entities.DonhangEntity;

import java.util.List;

public interface Billinter {
    public List<ChitietdonhangEntity> getDetaillbill(int idhd);
    public boolean AddNewHD(DonhangEntity data);
    public void AddnewDetailhd(ChitietdonhangEntity data);
}
