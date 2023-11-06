package DAO.Interface;

import Model.NhacungcapEntity;

import java.util.ArrayList;

public interface supplier {
    public boolean Addnewsupplier(NhacungcapEntity data);
    public ArrayList<NhacungcapEntity> Listsupplier();

    public NhacungcapEntity nhacc(int id);
}
