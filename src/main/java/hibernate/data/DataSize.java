package hibernate.data;

import hibernate.config.ConfigHibernate;
import hibernate.pojo.Size;
import org.hibernate.Session;

public class DataSize {

    public static String[] arr_sizes = {"37", "38", "39", "40", "41", "42", "43", "44", "45"};

    public static void addDataToTable_Sizes() {

        Session session = ConfigHibernate.getFactory().openSession();

        try {

            session.beginTransaction();
            for (int i = 0; i < arr_sizes.length; i++) {

                Size size = new Size();
                size.setName_size(arr_sizes[i]);
                session.save(size);

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
