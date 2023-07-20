package hibernate.data;

import hibernate.config.ConfigHibernate;
import hibernate.pojo.Brand;
import org.hibernate.Session;

public class DataBrand {

    public static String[] arr_brands = {"NIKE", "ADIDAS", "JORDAN"};

    public static void addDataToTable_Brands() {

        Session session = ConfigHibernate.getFactory().openSession();

        try {

            session.beginTransaction();
            for (int i = 0; i < arr_brands.length; i++) {

                Brand brand = new Brand();
                brand.setId_brand(i);
                brand.setName(arr_brands[i]);
                session.save(brand);

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
