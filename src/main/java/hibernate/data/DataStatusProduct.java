package hibernate.data;

import hibernate.config.ConfigHibernate;
import hibernate.pojo.StatusProduct;
import org.hibernate.Session;

public class DataStatusProduct {
    public static String[] arr_status_products = {"BÌNH THƯỜNG", "MỚI", "HOT", "KHUYẾN MÃI", "TẠM HẾT HÀNG", "HẾT HÀNG", "CẤM BÁN"};

    public static void addDataToTable_StatusProducts() {

        Session session = ConfigHibernate.getFactory().openSession();
        try {

            session.beginTransaction();
            for (int i = 0; i < arr_status_products.length; i++) {

                StatusProduct sttProduct = new StatusProduct();
                sttProduct.setId_status(i);
                sttProduct.setName(arr_status_products[i]);

                session.save(sttProduct);

            }
            session.getTransaction().commit();

        } catch (Exception e) {

            session.getTransaction().rollback();
            System.out.println(e.getMessage());

        } finally {
            session.close();
        }

    }


}
