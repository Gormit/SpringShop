package by.gormit.shop.pojos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Gormit on 05.06.2015.
 * Entity - Manufacturer.
 * Bean class for working with entity-Manufacturer
 */

@Entity
public class Manufacturer implements Serializable {

    private static final long serialVersionUID = -3970854993020787677L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int manufacturerId;

    @Column(nullable = false)
    private String manufacturerName;

    @OneToMany(mappedBy = "manufacturer", fetch = FetchType.EAGER)
    private Set<Good> goods;

    public Manufacturer() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Set<Good> getGoods() {
        return goods;
    }

    public void setGoods(Set<Good> goods) {
        this.goods = goods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Manufacturer that = (Manufacturer) o;

        if (manufacturerId != that.manufacturerId) return false;
        return !(manufacturerName != null ? !manufacturerName.equals(that.manufacturerName) : that.manufacturerName != null);

    }

    @Override
    public int hashCode() {
        int result = manufacturerId;
        result = 31 * result + (manufacturerName != null ? manufacturerName.hashCode() : 0);
        return result;
    }
}
