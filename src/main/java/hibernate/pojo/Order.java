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

}
