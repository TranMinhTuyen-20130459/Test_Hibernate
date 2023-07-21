package hibernate.data;

import hibernate.config.ConfigHibernate;
import hibernate.pojo.ImageProduct;
import hibernate.pojo.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataImageProduct {

    public static String[] arr_path_img = {
            "https://kingshoes.vn/data/upload/media/dv3854-600-giay-nike-pegasus-40-road-running-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
            , "https://kingshoes.vn/data/upload/media/dv7480-100-giay-chay-bo-nike-pegasus-40-wide-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
            , "https://kingshoes.vn/data/upload/media/dr2698-004-giay-nike-run-swift-3-womens-road-running-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
            , "https://kingshoes.vn/data/upload/media/fd0374-410-giay-nike-air-max-90-se-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
            , "https://kingshoes.vn/data/upload/media/dq5972-100-giay-nike-air-force-1-lv8-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
            , "https://kingshoes.vn/data/upload/media/fj5450-100-giay-nike-air-max-270-se-chinh-hang-gia-tot-den-king-shoes-13.jpeg"
            , "https://kingshoes.vn/data/upload/media/dx9176-102-giay-nike-gamma-force-womens-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
            , "https://kingshoes.vn/data/upload/media/dm2845-100-giay-nike-air-force-1-07-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
            , "https://kingshoes.vn/data/upload/media/SNEAKER-315122-111-AIR-FORCE-1-07-NIKE-KINGSHOES.VN-TPHCM-TANBINH-17-logo-1551924204-.jpg"
            , "https://kingshoes.vn/data/upload/media/dr2698-600-giay-nike-run-swift-3-womens-road-running-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
            , "https://kingshoes.vn/data/upload/media/gx7256-giay-adidas-galaxy-6-w-chinh-hang-gia-tot-den-king-shoes-1.jpg"
            , "https://kingshoes.vn/data/upload/media/gz4900-giay-adidas-znchill-lightmotion-chinh-hang-gia-tot-den-king-shoes-21.jpg"
            , "https://kingshoes.vn/data/upload/media/hp7567-giay-adidas-runfalcon-3-tr-running-chinh-hang-gia-tot-den-king-shoes-1.jpg"
            , "https://kingshoes.vn/data/upload/media/gw8682-giay-adidas-ultraboost-og-chinh-hang-gia-tot-den-king-shoes-1.jpg"
            , "https://kingshoes.vn/data/upload/media/eg0705-giay-adidas-ultraboost-20-chinh-hang-gia-tot-den-king-shoes-1.jpg"
            , "https://kingshoes.vn/data/upload/media/hq6874-giay-forum-low-cl-trang-chinh-hang-gia-tot-den-king-shoes-1.jpg"
            , "https://kingshoes.vn/data/upload/media/hp9732-giay-adidas-ultra-4d-chinh-hang-gia-tot-den-king-shoes-1.jpg"
            , "https://kingshoes.vn/data/upload/media/h02334-giay-adidas-nmd-r1-refined-chinh-hang-den-king-shoes-1.jpg"
            , "https://kingshoes.vn/data/upload/media/hq0949-giay-adidas-ultra-4d-chinh-hang-gia-tot-den-king-shoes-1.jpg"
            , "https://kingshoes.vn/data/upload/media/gz2618-giay-adidas-znchill-lightmotion-chinh-hang-gia-tot-den-king-shoes-1.jpg"
            , "https://kingshoes.vn/data/upload/media/553558-030-giay-nike-air-jordan-1-low-light-smoke-grey-chinh-hang-gia-tot-den-king-shoes-8.jpeg"
            , "https://kingshoes.vn/data/upload/media/do9369-101-giay-nike-air-jordan-1-starfish-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
            , "https://kingshoes.vn/data/upload/media/dz5485-303-giay-nike-air-jordan-1-retro-high-og-gorge-green-chinh-hang-gia-tot-den-king-shoes-13.jpeg"
            , "https://kingshoes.vn/data/upload/media/ct0979-602-giay-nike-air-jordan-1-high-zoom-cmft-canyon-rust-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
            , "https://kingshoes.vn/data/upload/media/554724-091-giay-nike-air-jordan-1-mid-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
            , "https://kingshoes.vn/data/upload/media/554724-122-giay-nike-air-jordan-1-black-white-red-chinh-hang-gia-tot-den-king-shoes-1.jpg"
            , "https://kingshoes.vn/data/upload/media/dr5415-103-giay-nike-sb-x-air-jordan-4-pine-green-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
            , "https://kingshoes.vn/data/upload/media/dz5485-612-giay-nike-air-jordan-1-chicago-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
            , "https://kingshoes.vn/data/upload/media/dn1635-100-giay-nike-air-jordan-1-low-inside-out-chinh-hang-gia-tot-den-king-shoes-15.jpeg"
            , "https://kingshoes.vn/data/upload/media/bq4422-001-giay-nike-air-jordan-1-retro-high-85-black-white-chinh-hang-gia-tot-den-king-shoes-12.jpeg"
    };

    public static List<Long> getListIdProduct() {
        List<Long> listId = new ArrayList<>();
        String string_query = "SELECT id_product FROM Product";
        Session session = ConfigHibernate.getFactory().openSession();
        try {

            Query query = session.createQuery(string_query);
            listId = query.getResultList();

        } catch (Exception e) {
            listId = new ArrayList<>();
            System.out.println(e.getMessage());
        } finally {
            if (session != null) session.close();
        }
        return listId;
    }

    public static void addDataToTable_ImageProducts() {
        List<Long> listIds = DataImageProduct.getListIdProduct();
        Session session = ConfigHibernate.getFactory().openSession();
        try {

            session.beginTransaction();

            Random random = new Random();
            // một product sẽ có 3 image_product
            for (int i = 0; i < 3; i++) {

                listIds.forEach(itemId -> {

                    Product product = new Product();
                    product.setId_product(itemId);

                    ImageProduct imgProduct = new ImageProduct();
                    imgProduct.setProduct(product);

                    int randomIndex = random.nextInt(arr_path_img.length);
                    String path_img = arr_path_img[randomIndex]; // chọn path_image ngẫu nhiên từ arr_path_img
                    imgProduct.setPath(path_img);

                    session.save(imgProduct);
                });

            }
            session.getTransaction().commit();

        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            if (session != null) session.close();
        }
    }

    public static void main(String[] args) {
        System.out.println(DataImageProduct.getListIdProduct());
    }

}
