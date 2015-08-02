package by.gormit.shop.pojos;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Gormit on 01.05.2015.
 * Entity - GOOD.
 * Bean class for working with entity-GOOD
 */

@Entity
public class Good implements Serializable {

    private static final long serialVersionUID = -744118100425628163L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long goodId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int count;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "F_categoryId", nullable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "F_manufacturerId", nullable = false)
    private Manufacturer manufacturer;

    public Good() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getGoodId() {
        return goodId;
    }

    public void setGoodId(long goodId) {
        this.goodId = goodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Good good = (Good) o;

        if (goodId != good.goodId) return false;
        if (count != good.count) return false;
        if (price != good.price) return false;
        if (name != null ? !name.equals(good.name) : good.name != null) return false;
        return !(description != null ? !description.equals(good.description) : good.description != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (goodId ^ (goodId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + count;
        result = 31 * result + price;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Good{" +
                "goodId=" + goodId +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
