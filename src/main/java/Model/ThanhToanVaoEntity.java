package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "ThanhToanVao", schema = "dbo", catalog = "BanHang")
public class ThanhToanVaoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "isohdchitiet")
    private int isohdchitiet;
    @Basic
    @Column(name = "idnhacungcap")
    private Integer idnhacungcap;

    public int getIsohdchitiet() {
        return isohdchitiet;
    }

    public void setIsohdchitiet(int isohdchitiet) {
        this.isohdchitiet = isohdchitiet;
    }

    public Integer getIdnhacungcap() {
        return idnhacungcap;
    }

    public void setIdnhacungcap(Integer idnhacungcap) {
        this.idnhacungcap = idnhacungcap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThanhToanVaoEntity that = (ThanhToanVaoEntity) o;

        if (isohdchitiet != that.isohdchitiet) return false;
        if (idnhacungcap != null ? !idnhacungcap.equals(that.idnhacungcap) : that.idnhacungcap != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isohdchitiet;
        result = 31 * result + (idnhacungcap != null ? idnhacungcap.hashCode() : 0);
        return result;
    }
}
