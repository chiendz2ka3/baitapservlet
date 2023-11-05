package Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "chitietdonhang", schema = "dbo", catalog = "BanHang")
public class ChitietdonhangEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "isohdchitiet")
    private int isohdchitiet;
    @Basic
    @Column(name = "idsanpham")
    private Integer idsanpham;
    @Basic
    @Column(name = "isohd")
    private Integer isohd;
    @Basic
    @Column(name = "fsoluongmua")
    private Integer fsoluongmua;
    @Basic
    @Column(name = "Statuss")
    private Integer statuss;

    public ChitietdonhangEntity() {
    }

    public ChitietdonhangEntity(Integer idsanpham, Integer isohd, Integer fsoluongmua, Integer statuss) {
        this.idsanpham = idsanpham;
        this.isohd = isohd;
        this.fsoluongmua = fsoluongmua;
        this.statuss = statuss;
    }

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

    public Integer getIsohd() {
        return isohd;
    }

    public void setIsohd(Integer isohd) {
        this.isohd = isohd;
    }

    public Integer getFsoluongmua() {
        return fsoluongmua;
    }

    public void setFsoluongmua(Integer fsoluongmua) {
        this.fsoluongmua = fsoluongmua;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChitietdonhangEntity that = (ChitietdonhangEntity) o;

        if (isohdchitiet != that.isohdchitiet) return false;
        if (idsanpham != null ? !idsanpham.equals(that.idsanpham) : that.idsanpham != null) return false;
        if (isohd != null ? !isohd.equals(that.isohd) : that.isohd != null) return false;
        if (fsoluongmua != null ? !fsoluongmua.equals(that.fsoluongmua) : that.fsoluongmua != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isohdchitiet;
        result = 31 * result + (idsanpham != null ? idsanpham.hashCode() : 0);
        result = 31 * result + (isohd != null ? isohd.hashCode() : 0);
        result = 31 * result + (fsoluongmua != null ? fsoluongmua.hashCode() : 0);
        return result;
    }

    public Integer getStatuss() {
        return statuss;
    }

    public void setStatuss(Integer statuss) {
        this.statuss = statuss;
    }
}
