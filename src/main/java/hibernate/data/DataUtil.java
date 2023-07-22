package hibernate.data;

import hibernate.config.ConfigHibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
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
}
