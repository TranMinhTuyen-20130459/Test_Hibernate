package hibernate.data;

import hibernate.config.ConfigHibernate;
import hibernate.pojo.HistoryPriceProduct;
import hibernate.pojo.Product;
import org.hibernate.Session;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class DataHistoryPriceProduct {

    public static void addDataToTable_HistoryPriceProducts() {
        long executionTime = 0;// Tính thời gian thực thi
        long startTime = System.currentTimeMillis(); // Lưu thời gian bắt đầu thực thi

        List<Long> listId = DataUtil.getListIdProduct();
        Session session = ConfigHibernate.getFactory().openSession();
        Random random = new Random();
        try {
            session.beginTransaction();
            listId.forEach(itemId -> {

                Product product = new Product();
                product.setId_product(itemId);

                // một product sẽ có lịch sử giá ít nhất là 3 giá
                for (int i = 0; i < 3; i++) {

                    HistoryPriceProduct htrPrice = new HistoryPriceProduct();
                    // Giá niêm yết của sản phẩm từ 500 ngàn đến 5 triệu đồng
                    htrPrice.setListed_price(BigDecimal.valueOf(random.nextInt((int) (5 * Math.pow(10, 5)), (int) (5 * Math.pow(10, 6)))));
                    // Giá khuyến mãi của sản phẩm từ 500 ngàn đến 5 triệu đồng
                    htrPrice.setPromotional_price(BigDecimal.valueOf(random.nextInt((int) (5 * Math.pow(10, 5)), (int) (5 * Math.pow(10, 6)))));
                    htrPrice.setProduct(product);
                    session.save(htrPrice);

                }
            });
            session.getTransaction().commit();

            long endTime = System.currentTimeMillis(); // Lưu thời gian kết thúc thực thi
            executionTime = endTime - startTime;

        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
            System.out.println("Thời gian thực thi: " + (double) executionTime / (60 * 1000) + " minute");
        }
    }
}
