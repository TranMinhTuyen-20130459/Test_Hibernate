package hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "History_Price_Products")
public class HistoryPriceProduct implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_price_product;
    @Column(columnDefinition = "DECIMAL(10,2) CHECK (listed_price >= 0)")
    private BigDecimal listed_price;
    @Column(columnDefinition = "DECIMAL(10,2) CHECK (promotional_price >= 0)")
    private BigDecimal promotional_price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    private Product product;

    private Timestamp time_start;
    private Timestamp time_end;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false)
    private Timestamp created_at;

    public Long getId_price_product() {
        return id_price_product;
    }

    public void setId_price_product(Long id_price_product) {
        this.id_price_product = id_price_product;
    }

    public BigDecimal getListed_price() {
        return listed_price;
    }

    public void setListed_price(BigDecimal listed_price) {
        this.listed_price = listed_price;
    }

    public BigDecimal getPromotional_price() {
        return promotional_price;
    }

    public void setPromotional_price(BigDecimal promotional_price) {
        this.promotional_price = promotional_price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Timestamp getTime_start() {
        return time_start;
    }

    public void setTime_start(Timestamp time_start) {
        this.time_start = time_start;
    }

    public Timestamp getTime_end() {
        return time_end;
    }

    public void setTime_end(Timestamp time_end) {
        this.time_end = time_end;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
}
