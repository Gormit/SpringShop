package by.gormit.shop.pojos;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Gormit on 05.06.2015.
 * Bean class for working with UserDetail one-to-one User.
 *
 */
@Entity
public class UserDetail implements Serializable {

    private static final long serialVersionUID = -9075671365559512854L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userDetailId;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String city;

    @Column
    private String street;

    @Column
    private String phone;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "F_userId", nullable = false)
    private User user;

    public UserDetail() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getUserDetailId() {
        return userDetailId;
    }

    public void setUserDetailId(long userDetailId) {
        this.userDetailId = userDetailId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDetail that = (UserDetail) o;

        if (userDetailId != that.userDetailId) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        return !(user != null ? !user.equals(that.user) : that.user != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (userDetailId ^ (userDetailId >>> 32));
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
