package Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "sanpham", schema = "dbo", catalog = "BanHang")
public class SanphamEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idsanpham")
    private int idsanpham;
    @Basic
    @Column(name = "tensampham")
    private String tensampham;
    @Basic
    @Column(name = "giahang")
    private Double giahang;
    @Basic
    @Column(name = "soluong")
    private Double soluong;
    @Basic
    @Column(name = "thumb")
    private String thumb;
    @Basic
    @Column(name = "idnhacungcap")
    private Integer idnhacungcap;

    public SanphamEntity(String tensampham, Double giahang, Double soluong, String thumb, Integer idnhacungcap) {
        this.tensampham = tensampham;
        this.giahang = giahang;
        this.soluong = soluong;
        this.thumb = thumb;
        this.idnhacungcap = idnhacungcap;
    }

    public SanphamEntity() {
    }

    public int getIdsanpham() {
        return idsanpham;
    }

    public void setIdsanpham(int idsanpham) {
        this.idsanpham = idsanpham;
    }

    public String getTensampham() {
        return tensampham;
    }

    public void setTensampham(String tensampham) {
        this.tensampham = tensampham;
    }

    public Double getGiahang() {
        return giahang;
    }

    public void setGiahang(Double giahang) {
        this.giahang = giahang;
    }

    public Double getSoluong() {
        return soluong;
    }

    public void setSoluong(Double soluong) {
        this.soluong = soluong;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
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

        SanphamEntity that = (SanphamEntity) o;

        if (idsanpham != that.idsanpham) return false;
        if (tensampham != null ? !tensampham.equals(that.tensampham) : that.tensampham != null) return false;
        if (giahang != null ? !giahang.equals(that.giahang) : that.giahang != null) return false;
        if (soluong != null ? !soluong.equals(that.soluong) : that.soluong != null) return false;
        if (thumb != null ? !thumb.equals(that.thumb) : that.thumb != null) return false;
        if (idnhacungcap != null ? !idnhacungcap.equals(that.idnhacungcap) : that.idnhacungcap != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idsanpham;
        result = 31 * result + (tensampham != null ? tensampham.hashCode() : 0);
        result = 31 * result + (giahang != null ? giahang.hashCode() : 0);
        result = 31 * result + (soluong != null ? soluong.hashCode() : 0);
        result = 31 * result + (thumb != null ? thumb.hashCode() : 0);
        result = 31 * result + (idnhacungcap != null ? idnhacungcap.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SanphamEntity{" +
                "idsanpham=" + idsanpham +
                ", tensampham='" + tensampham + '\'' +
                ", giahang=" + giahang +
                ", soluong=" + soluong +
                ", thumb='" + thumb + '\'' +
                ", idnhacungcap=" + idnhacungcap +
                '}';
    }
}
