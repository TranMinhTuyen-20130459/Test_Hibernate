package hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Products")
public abstract class Product implements Serializable {

    @Id
    private Long id_product;
    private String name_product;
    private int star_review;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<HistoryPriceProduct> list_price;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "product")
    private Set<ImageProduct> images;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_status_product")
    private StatusProduct status_product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_brand")
    private Brand brand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_type")
    private TypeProduct type_product;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private Set<SizeProduct> size_products;

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public int getStar_review() {
        return star_review;
    }

    public void setStar_review(int star_review) {
        this.star_review = star_review;
    }

    public List<HistoryPriceProduct> getList_price() {
        return list_price;
    }

    public void setList_price(List<HistoryPriceProduct> list_price) {
        this.list_price = list_price;
    }

    public Set<ImageProduct> getImages() {
        return images;
    }

    public void setImages(Set<ImageProduct> images) {
        this.images = images;
    }

    public StatusProduct getStatus_product() {
        return status_product;
    }

    public void setStatus_product(StatusProduct status_product) {
        this.status_product = status_product;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Set<SizeProduct> getSize_products() {
        return size_products;
    }

    public void setSize_products(Set<SizeProduct> size_products) {
        this.size_products = size_products;
    }
}
