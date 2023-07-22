package hibernate.data;

import hibernate.config.ConfigHibernate;
import hibernate.pojo.Product;
import hibernate.pojo.Size;
import hibernate.pojo.SizeProduct;
import org.hibernate.Session;

import java.util.List;
import java.util.Random;

public class DataSizeProduct {
    public static void addDataToTable_SizeProducts() {
        List<Long> listId = DataUtil.getListIdProduct();
        List<String> listSize = DataUtil.getListSize();
        Session session = ConfigHibernate.getFactory().openSession();

        Random random = new Random();
        try {
            session.beginTransaction();
            // một product sẽ có nhiều size
            for (Long itemId : listId) {
                Product product = new Product();
                product.setId_product(itemId);

                for (String itemSize : listSize) {

                    Size size = new Size();
                    size.setName_size(itemSize);

                    SizeProduct sizeProduct = new SizeProduct();
                    sizeProduct.setProduct(product);
                    sizeProduct.setSize(size);
                    sizeProduct.setQuantity_available(random.nextInt(100, 2000));

                    session.save(sizeProduct);
                }
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
