package hibernate.data;

import hibernate.config.ConfigHibernate;
import hibernate.pojo.PriceRange;
import org.hibernate.Session;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class DataPriceRange {

    public static Map<String, int[]> price_ranges = new HashMap<>();

    static {
        price_ranges.put("DƯỚI 3 TRIỆU", new int[]{0, (int) (3 * Math.pow(10, 6) - 1)});
        price_ranges.put("TỪ 3 ĐẾN 5 TRIỆU", new int[]{(int) (3 * Math.pow(10, 6)), (int) (5 * Math.pow(10, 6))});
        price_ranges.put("TỪ 5 ĐẾN 10 TRIỆU", new int[]{(int) (5 * Math.pow(10, 6)), (int) (10 * Math.pow(10, 6))});
        price_ranges.put("TỪ 10 ĐẾN 15 TRIỆU", new int[]{(int) (10 * Math.pow(10, 6)), (int) (15 * Math.pow(10, 6))});
        price_ranges.put("TRÊN 15 TRIỆU", new int[]{(int) (15 * Math.pow(10, 6)), (int) (1000
                * Math.pow(10, 6))});
    }

    public static void addDataToTable_PriceRanges() {

        Session session = ConfigHibernate.getFactory().openSession();

        try {

            session.beginTransaction();
            price_ranges.entrySet().forEach(item -> {


                String key = item.getKey();
                int[] value = item.getValue();

                PriceRange pRange = new PriceRange();
                pRange.setName_price_range(key);
                pRange.setPrice_start(BigDecimal.valueOf(value[0]));
                pRange.setPrice_end(BigDecimal.valueOf(value[1]));

                session.save(pRange);

            });
            session.getTransaction().commit();

        } catch (Exception e) {

            session.getTransaction().rollback();
            System.out.println(e.getMessage());

        } finally {
            if (session != null) session.close();
        }

    }

    public static void main(String[] args) {

        System.out.println((int) 3 * Math.pow(10, 6) - 1);
    }


}
