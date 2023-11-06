package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "nhacungcap", schema = "dbo", catalog = "BanHang")
public class NhacungcapEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idnhacungcap")
    private int idnhacungcap;
    @Basic
    @Column(name = "TenNhaCungCap")
    private String tenNhaCungCap;
    @Basic
    @Column(name = "DiaChi")
    private String diaChi;
    @Basic
    @Column(name = "sdt")
    private String sdt;

    public NhacungcapEntity(String tenNhaCungCap, String diaChi, String sdt) {
        this.tenNhaCungCap = tenNhaCungCap;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public NhacungcapEntity() {
    }

    @Override
    public String toString() {
        return "NhacungcapEntity{" +
                "idnhacungcap=" + idnhacungcap +
                ", tenNhaCungCap='" + tenNhaCungCap + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }

    public int getIdnhacungcap() {
        return idnhacungcap;
    }

    public void setIdnhacungcap(int idnhacungcap) {
        this.idnhacungcap = idnhacungcap;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
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

        NhacungcapEntity that = (NhacungcapEntity) o;

        if (idnhacungcap != that.idnhacungcap) return false;
        if (tenNhaCungCap != null ? !tenNhaCungCap.equals(that.tenNhaCungCap) : that.tenNhaCungCap != null)
            return false;
        if (diaChi != null ? !diaChi.equals(that.diaChi) : that.diaChi != null) return false;
        if (sdt != null ? !sdt.equals(that.sdt) : that.sdt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idnhacungcap;
        result = 31 * result + (tenNhaCungCap != null ? tenNhaCungCap.hashCode() : 0);
        result = 31 * result + (diaChi != null ? diaChi.hashCode() : 0);
        result = 31 * result + (sdt != null ? sdt.hashCode() : 0);
        return result;
    }
}
