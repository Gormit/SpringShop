package by.gormit.shop.pojos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Gormit on 05.06.2015.
 * Entity - ROLE.
 * Bean class for working with entity-ROLE
 */

@Entity
public class Role implements Serializable {

    private static final long serialVersionUID = 135010999313368130L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roleId;

    @Column
    private String name;

    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL)
    private Set<User> users;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (roleId != role.roleId) return false;
        return !(name != null ? !name.equals(role.name) : role.name != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
