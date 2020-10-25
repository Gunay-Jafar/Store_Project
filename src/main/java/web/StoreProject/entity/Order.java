package web.StoreProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "orders")
public class Order {
    public Order() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int product_id;
    private int customer_id;
    private Date date;

    public Order(int id, int product_id, int customer_id, Date date) {
        this.id = id;
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", customer_id=" + customer_id +
                ", date=" + date +
                '}';
    }
}
