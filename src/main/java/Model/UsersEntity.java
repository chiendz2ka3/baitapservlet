package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "users", schema = "dbo", catalog = "BanHang")
public class UsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "iduser")
    private int iduser;
    @Basic
    @Column(name = "Username")
    private String username;
    @Basic
    @Column(name = "PassWords")
    private String passWords;
    @Basic
    @Column(name = "sdt")
    private String sdt;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "TypeUser")
    private Integer typeUser;

    public UsersEntity(String username, String passWords, String sdt, String email) {
        this.username = username;
        this.passWords = passWords;
        this.sdt = sdt;
        this.email = email;
    }

    public UsersEntity() {
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassWords() {
        return passWords;
    }

    public void setPassWords(String passWords) {
        this.passWords = passWords;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(Integer typeUser) {
        this.typeUser = typeUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (iduser != that.iduser) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (passWords != null ? !passWords.equals(that.passWords) : that.passWords != null) return false;
        if (sdt != null ? !sdt.equals(that.sdt) : that.sdt != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (typeUser != null ? !typeUser.equals(that.typeUser) : that.typeUser != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "UsersEntity{" +
                "iduser=" + iduser +
                ", username='" + username + '\'' +
                ", passWords='" + passWords + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", typeUser=" + typeUser +
                '}';
    }

    @Override
    public int hashCode() {
        int result = iduser;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (passWords != null ? passWords.hashCode() : 0);
        result = 31 * result + (sdt != null ? sdt.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (typeUser != null ? typeUser.hashCode() : 0);
        return result;
    }
}
