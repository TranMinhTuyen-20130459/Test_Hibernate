package hibernate.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Image_Products")
public class ImageProduct {

    @Id
    private Long id_image;
    private String path;

}
