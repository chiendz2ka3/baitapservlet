package Model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "donhang", schema = "dbo", catalog = "BanHang")
public class DonhangEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "isohd")
    private int isohd;
    @Basic
    @Column(name = "idnhanvien")
    private Integer idnhanvien;
    @Basic
    @Column(name = "iduser")
    private Integer iduser;
    @Basic
    @Column(name = "fmucgiamgia")
    private Double fmucgiamgia;
    @Basic
    @Column(name = "ngaydathang")
    private Date ngaydathang;
    @Basic
    @Column(name = "idnhacungcap")
    private Integer idnhacungcap;

    public int getIsohd() {
        return isohd;
    }

    public void setIsohd(int isohd) {
        this.isohd = isohd;
    }

    public Integer getIdnhanvien() {
        return idnhanvien;
    }

    public void setIdnhanvien(Integer idnhanvien) {
        this.idnhanvien = idnhanvien;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public Double getFmucgiamgia() {
        return fmucgiamgia;
    }

    public void setFmucgiamgia(Double fmucgiamgia) {
        this.fmucgiamgia = fmucgiamgia;
    }

    public Date getNgaydathang() {
        return ngaydathang;
    }

    public void setNgaydathang(Date ngaydathang) {
        this.ngaydathang = ngaydathang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonhangEntity that = (DonhangEntity) o;

        if (isohd != that.isohd) return false;
        if (idnhanvien != null ? !idnhanvien.equals(that.idnhanvien) : that.idnhanvien != null) return false;
        if (iduser != null ? !iduser.equals(that.iduser) : that.iduser != null) return false;
        if (fmucgiamgia != null ? !fmucgiamgia.equals(that.fmucgiamgia) : that.fmucgiamgia != null) return false;
        if (ngaydathang != null ? !ngaydathang.equals(that.ngaydathang) : that.ngaydathang != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isohd;
        result = 31 * result + (idnhanvien != null ? idnhanvien.hashCode() : 0);
        result = 31 * result + (iduser != null ? iduser.hashCode() : 0);
        result = 31 * result + (fmucgiamgia != null ? fmucgiamgia.hashCode() : 0);
        result = 31 * result + (ngaydathang != null ? ngaydathang.hashCode() : 0);
        return result;
    }

    public Integer getIdnhacungcap() {
        return idnhacungcap;
    }

    public void setIdnhacungcap(Integer idnhacungcap) {
        this.idnhacungcap = idnhacungcap;
    }
}
