package DAO.Interface;

import Entities.NhacungcapEntity;
import Entities.SanphamEntity;

import java.util.ArrayList;

public interface supplier {
    public boolean Addnewsupplier(NhacungcapEntity data);
    public ArrayList<NhacungcapEntity> Listsupplier();
}
