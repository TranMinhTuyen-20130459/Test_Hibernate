package hibernate.data;

import hibernate.config.ConfigHibernate;
import hibernate.pojo.Brand;
import hibernate.pojo.Product;
import hibernate.pojo.StatusProduct;
import hibernate.pojo.TypeProduct;
import org.hibernate.Session;

public class DataProduct {

    public static String[] arr_name_products_nike = {"NIKE PEGASUS 40", "NIKE RUN SWIFT 3", "NIKE AIR MAX 90 SE",
            "NIKE AIR FORCE 1 LV8", "NIKE AIR MAX 270 SE", "NIKE GAMMA FORCE",
            "NIKE AIR FORCE 1 '07", "AIR FORCE 1", "NIKE RUN SWIFT 3",
            "NIKE AIR MAX 90", "NIKE REVOLUTION 6 NN", "NIKE PEGASUS 40",
            "NIKE STAR RUNNER 3", "NIKE QUEST 4", "NIKE AIR MAX 97"};

    public static String[] arr_name_products_adidas = {"ADIDAS GALAXY 6 W", "ADIDAS ZNCHILL LIGHTMOTION", "ADIDAS RUN FALCON 3.0",
            "ADIDAS ULTRABOOST OG", "ADIDAS ULTRABOOST 20", "ADIDAS FORUM LOW CL",
            "ADIDAS ULTRA 4D", "ADIDAS NMD R1 REFINED", "ADIDAS ULTRA 4D",
            "ADIDAS ZNCHILL LIGHTMOTION", "ADIDAS ULTRA4D SUN DEVILS", "SN1997 X MARIMEKKO",
            "ADIDAS GRADAS CLOUD WHITE", "ADIDAS PUREMOTION", "ADIDAS GRAND COURT"};

    public static String[] arr_name_products_jordan = {"JORDAN 1 LOW", "JORDAN 1 LOW LIGHT SMOKE GREY", "JORDAN 1 HI OG",
            "AIR JORDAN 1 HI OG", "JORDAN 1 HI ZOOM CMFT", "AIR JORDAN 1 MID",
            "JORDAN 1 BLACK WHITE RED", "NIKE AIR JORDAN 4 PINE GREEN", "AIR JORDAN 1 HI CHICAGO",
            "JORDAN 1 LOW CRAFT", "JORDAN 1 HI RETRO 85", "AIR JORDAN 1 LOW",
            "AIR JORDAN 1 LOW", "AIR JORDAN 1 LOW SE", "AIR JORDAN 1 LOW"};

    public static void addDataToTable_Products() {

        Session session = ConfigHibernate.getFactory().openSession();
        try {

            session.beginTransaction();

            for (int i = 0; i < arr_name_products_nike.length; i++) {

                StatusProduct status = new StatusProduct();

                Brand brand = new Brand();
                brand.setId_brand(0); // 0 là kí hiệu của brand NIKE

                TypeProduct type = new TypeProduct();
                type.setId_type(0); // 0 là kí hiệu của loại sản phẩm GIÀY

                Product product = new Product();
                product.setName_product(arr_name_products_nike[i]);
                product.setStar_review(5);
                product.setBrand(brand);
                product.setType_product(type);

                if (i < 5) status.setId_status(0); // 0 là kí hiệu của trạng thái sản phẩm BÌNH THƯỜNG
                else if (i < 10) status.setId_status(1); // 1 là kí hiệu của trạng thái sản phẩm MỚI
                else status.setId_status(2); // 2 là kí hiệu của trạng thái sản phẩm HOT

                product.setStatus_product(status);

                session.save(product);

            }

            for (int i = 0; i < arr_name_products_adidas.length; i++) {

                StatusProduct status = new StatusProduct();

                Brand brand = new Brand();
                brand.setId_brand(1); // 1 là kí hiệu của brand ADIDAS

                TypeProduct type = new TypeProduct();
                type.setId_type(0); // 0 là kí hiệu của loại sản phẩm GIÀY

                Product product = new Product();
                product.setName_product(arr_name_products_adidas[i]);
                product.setStar_review(5);
                product.setBrand(brand);
                product.setType_product(type);

                if (i < 5) status.setId_status(0); // 0 là kí hiệu của trạng thái sản phẩm BÌNH THƯỜNG
                else if (i < 10) status.setId_status(1); // 1 là kí hiệu của trạng thái sản phẩm MỚI
                else status.setId_status(2); // 2 là kí hiệu của trạng thái sản phẩm HOT

                product.setStatus_product(status);

                session.save(product);

            }

            for (int i = 0; i < arr_name_products_jordan.length; i++) {

                StatusProduct status = new StatusProduct();

                Brand brand = new Brand();
                brand.setId_brand(2); // 2 là kí hiệu của brand JORDAN

                TypeProduct type = new TypeProduct();
                type.setId_type(0); // 0 là kí hiệu của loại sản phẩm GIÀY

                Product product = new Product();
                product.setName_product(arr_name_products_jordan[i]);
                product.setStar_review(5);
                product.setBrand(brand);
                product.setType_product(type);

                if (i < 5) status.setId_status(0); // 0 là kí hiệu của trạng thái sản phẩm BÌNH THƯỜNG
                else if (i < 10) status.setId_status(1); // 1 là kí hiệu của trạng thái sản phẩm MỚI
                else status.setId_status(2); // 2 là kí hiệu của trạng thái sản phẩm HOT

                product.setStatus_product(status);

                session.save(product);

            }

            session.getTransaction().commit();

        } catch (Exception e) {

            session.getTransaction().rollback();
            System.out.println(e.getMessage());

        } finally {
            if (session != null) session.close();
        }

    }


}
