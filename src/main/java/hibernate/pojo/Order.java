package hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.Set;

@Entity
@Table(name = "Orders")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_order;
    private String from_name;
    private String from_phone;
    private String from_address;
    private String from_ward_name;
    private String from_district_name;
    private String from_province_name;
    private String from_ward_id;
    private String from_district_id;
    private String from_province_id;
    private String return_name;
    private String return_phone;
    private String return_address;
    private String return_ward_name;
    private String return_district_name;
    private String return_province_name;
    private String return_ward_id;
    private String return_district_id;
    private String return_province_id;
    private String to_name;
    private String to_phone;
    private String to_address;
    private String to_ward_name;
    private String to_district_name;
    private String to_province_name;
    private String to_ward_id;
    private String to_district_id;
    private String to_province_id;
    private String note;
    private BigDecimal ship_price;
    private BigDecimal order_value;
    private BigDecimal total_price;
    private Timestamp time_order;
    private Timestamp time_updated;
    private String email_customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_status_order")
    private StatusOrder status_order;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    private Set<OrderDetail> list_order_details;

    public Long getId_order() {
        return id_order;
    }

    public void setId_order(Long id_order) {
        this.id_order = id_order;
    }

    public String getFrom_name() {
        return from_name;
    }

    public void setFrom_name(String from_name) {
        this.from_name = from_name;
    }

    public String getFrom_phone() {
        return from_phone;
    }

    public void setFrom_phone(String from_phone) {
        this.from_phone = from_phone;
    }

    public String getFrom_address() {
        return from_address;
    }

    public void setFrom_address(String from_address) {
        this.from_address = from_address;
    }

    public String getFrom_ward_name() {
        return from_ward_name;
    }

    public void setFrom_ward_name(String from_ward_name) {
        this.from_ward_name = from_ward_name;
    }

    public String getFrom_district_name() {
        return from_district_name;
    }

    public void setFrom_district_name(String from_district_name) {
        this.from_district_name = from_district_name;
    }

    public String getFrom_province_name() {
        return from_province_name;
    }

    public void setFrom_province_name(String from_province_name) {
        this.from_province_name = from_province_name;
    }

    public String getFrom_ward_id() {
        return from_ward_id;
    }

    public void setFrom_ward_id(String from_ward_id) {
        this.from_ward_id = from_ward_id;
    }

    public String getFrom_district_id() {
        return from_district_id;
    }

    public void setFrom_district_id(String from_district_id) {
        this.from_district_id = from_district_id;
    }

    public String getFrom_province_id() {
        return from_province_id;
    }

    public void setFrom_province_id(String from_province_id) {
        this.from_province_id = from_province_id;
    }

    public String getReturn_name() {
        return return_name;
    }

    public void setReturn_name(String return_name) {
        this.return_name = return_name;
    }

    public String getReturn_phone() {
        return return_phone;
    }

    public void setReturn_phone(String return_phone) {
        this.return_phone = return_phone;
    }

    public String getReturn_address() {
        return return_address;
    }

    public void setReturn_address(String return_address) {
        this.return_address = return_address;
    }

    public String getReturn_ward_name() {
        return return_ward_name;
    }

    public void setReturn_ward_name(String return_ward_name) {
        this.return_ward_name = return_ward_name;
    }

    public String getReturn_district_name() {
        return return_district_name;
    }

    public void setReturn_district_name(String return_district_name) {
        this.return_district_name = return_district_name;
    }

    public String getReturn_province_name() {
        return return_province_name;
    }

    public void setReturn_province_name(String return_province_name) {
        this.return_province_name = return_province_name;
    }

    public String getReturn_ward_id() {
        return return_ward_id;
    }

    public void setReturn_ward_id(String return_ward_id) {
        this.return_ward_id = return_ward_id;
    }

    public String getReturn_district_id() {
        return return_district_id;
    }

    public void setReturn_district_id(String return_district_id) {
        this.return_district_id = return_district_id;
    }

    public String getReturn_province_id() {
        return return_province_id;
    }

    public void setReturn_province_id(String return_province_id) {
        this.return_province_id = return_province_id;
    }

    public String getTo_name() {
        return to_name;
    }

    public void setTo_name(String to_name) {
        this.to_name = to_name;
    }

    public String getTo_phone() {
        return to_phone;
    }

    public void setTo_phone(String to_phone) {
        this.to_phone = to_phone;
    }

    public String getTo_address() {
        return to_address;
    }

    public void setTo_address(String to_address) {
        this.to_address = to_address;
    }

    public String getTo_ward_name() {
        return to_ward_name;
    }

    public void setTo_ward_name(String to_ward_name) {
        this.to_ward_name = to_ward_name;
    }

    public String getTo_district_name() {
        return to_district_name;
    }

    public void setTo_district_name(String to_district_name) {
        this.to_district_name = to_district_name;
    }

    public String getTo_province_name() {
        return to_province_name;
    }

    public void setTo_province_name(String to_province_name) {
        this.to_province_name = to_province_name;
    }

    public String getTo_ward_id() {
        return to_ward_id;
    }

    public void setTo_ward_id(String to_ward_id) {
        this.to_ward_id = to_ward_id;
    }

    public String getTo_district_id() {
        return to_district_id;
    }

    public void setTo_district_id(String to_district_id) {
        this.to_district_id = to_district_id;
    }

    public String getTo_province_id() {
        return to_province_id;
    }

    public void setTo_province_id(String to_province_id) {
        this.to_province_id = to_province_id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BigDecimal getShip_price() {
        return ship_price;
    }

    public void setShip_price(BigDecimal ship_price) {
        this.ship_price = ship_price;
    }

    public BigDecimal getOrder_value() {
        return order_value;
    }

    public void setOrder_value(BigDecimal order_value) {
        this.order_value = order_value;
    }

    public BigDecimal getTotal_price() {
        return total_price;
    }

    public void setTotal_price(BigDecimal total_price) {
        this.total_price = total_price;
    }

    public Timestamp getTime_order() {
        return time_order;
    }

    public void setTime_order(Timestamp time_order) {
        this.time_order = time_order;
    }

    public Timestamp getTime_updated() {
        return time_updated;
    }

    public void setTime_updated(Timestamp time_updated) {
        this.time_updated = time_updated;
    }

    public String getEmail_customer() {
        return email_customer;
    }

    public void setEmail_customer(String email_customer) {
        this.email_customer = email_customer;
    }

    public StatusOrder getStatus_order() {
        return status_order;
    }

    public void setStatus_order(StatusOrder status_order) {
        this.status_order = status_order;
    }

    public Set<OrderDetail> getList_order_details() {
        return list_order_details;
    }

    public void setList_order_details(Set<OrderDetail> list_order_details) {
        this.list_order_details = list_order_details;
    }
}
