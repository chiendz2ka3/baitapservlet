package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "nhanvien", schema = "dbo", catalog = "BanHang")
public class NhanvienEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idnhanvien")
    private int idnhanvien;
    @Basic
    @Column(name = "tennhanvien")
    private String tennhanvien;
    @Basic
    @Column(name = "DiaChi")
    private String diaChi;
    @Basic
    @Column(name = "sdt")
    private String sdt;

    public int getIdnhanvien() {
        return idnhanvien;
    }

    public void setIdnhanvien(int idnhanvien) {
        this.idnhanvien = idnhanvien;
    }

    public String getTennhanvien() {
        return tennhanvien;
    }

    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NhanvienEntity that = (NhanvienEntity) o;

        if (idnhanvien != that.idnhanvien) return false;
        if (tennhanvien != null ? !tennhanvien.equals(that.tennhanvien) : that.tennhanvien != null) return false;
        if (diaChi != null ? !diaChi.equals(that.diaChi) : that.diaChi != null) return false;
        if (sdt != null ? !sdt.equals(that.sdt) : that.sdt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idnhanvien;
        result = 31 * result + (tennhanvien != null ? tennhanvien.hashCode() : 0);
        result = 31 * result + (diaChi != null ? diaChi.hashCode() : 0);
        result = 31 * result + (sdt != null ? sdt.hashCode() : 0);
        return result;
    }
}
