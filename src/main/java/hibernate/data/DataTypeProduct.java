package hibernate.data;

import hibernate.config.ConfigHibernate;
import hibernate.pojo.TypeProduct;
import org.hibernate.Session;

public class DataTypeProduct {

    public static String[] arr_type_products = {"GIÀY", "DÉP", "PHỤ KIỆN"};

    public static void addDataToTable_TypeProducts() {
        Session session = ConfigHibernate.getFactory().openSession();
        try {
            session.beginTransaction();
            for (int i = 0; i < arr_type_products.length; i++) {

                TypeProduct typeProduct = new TypeProduct();
                typeProduct.setId_type(i);
                typeProduct.setName_type(arr_type_products[i]);

                session.save(typeProduct);
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
