package Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "chitietThanhToanVao", schema = "dbo", catalog = "BanHang")
public class ChitietThanhToanVaoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "isohdchitiet")
    private int isohdchitiet;
    @Basic
    @Column(name = "idsanpham")
    private Integer idsanpham;
    @Basic
    @Column(name = "isohdchitietVao")
    private Integer isohdchitietVao;
    @Basic
    @Column(name = "fsoluongNhap")
    private Integer fsoluongNhap;
    @Basic
    @Column(name = "Statu")
    private Integer statu;
    @Basic
    @Column(name = "idnhacungcap")
    private Integer idnhacungcap;
    @Basic
    @Column(name = "giaban")
    private Double giaban;

    public int getIsohdchitiet() {
        return isohdchitiet;
    }

    public void setIsohdchitiet(int isohdchitiet) {
        this.isohdchitiet = isohdchitiet;
    }

    public Integer getIdsanpham() {
        return idsanpham;
    }

    public void setIdsanpham(Integer idsanpham) {
        this.idsanpham = idsanpham;
    }

    public Integer getIsohdchitietVao() {
        return isohdchitietVao;
    }

    public void setIsohdchitietVao(Integer isohdchitietVao) {
        this.isohdchitietVao = isohdchitietVao;
    }

    public Integer getFsoluongNhap() {
        return fsoluongNhap;
    }

    public void setFsoluongNhap(Integer fsoluongNhap) {
        this.fsoluongNhap = fsoluongNhap;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
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

        ChitietThanhToanVaoEntity that = (ChitietThanhToanVaoEntity) o;

        if (isohdchitiet != that.isohdchitiet) return false;
        if (idsanpham != null ? !idsanpham.equals(that.idsanpham) : that.idsanpham != null) return false;
        if (isohdchitietVao != null ? !isohdchitietVao.equals(that.isohdchitietVao) : that.isohdchitietVao != null)
            return false;
        if (fsoluongNhap != null ? !fsoluongNhap.equals(that.fsoluongNhap) : that.fsoluongNhap != null) return false;
        if (statu != null ? !statu.equals(that.statu) : that.statu != null) return false;
        if (idnhacungcap != null ? !idnhacungcap.equals(that.idnhacungcap) : that.idnhacungcap != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isohdchitiet;
        result = 31 * result + (idsanpham != null ? idsanpham.hashCode() : 0);
        result = 31 * result + (isohdchitietVao != null ? isohdchitietVao.hashCode() : 0);
        result = 31 * result + (fsoluongNhap != null ? fsoluongNhap.hashCode() : 0);
        result = 31 * result + (statu != null ? statu.hashCode() : 0);
        result = 31 * result + (idnhacungcap != null ? idnhacungcap.hashCode() : 0);
        return result;
    }

    public Double getGiaban() {
        return giaban;
    }

    public void setGiaban(Double giaban) {
        this.giaban = giaban;
    }
}
