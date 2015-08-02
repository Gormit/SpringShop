// select hql request

package by.gormit.shop.Hql;

public enum SelectHql {
    GOODS_UP {
        {
            this.hql = "FROM Good G ORDER BY G.goodName ASC";
        }
    },
    GOODS_DOWN {
        {
            this.hql = "FROM Good G ORDER BY G.goodName DESC";
        }
    };

    String hql;

    public String getHql() {
        return hql;
    }
}
