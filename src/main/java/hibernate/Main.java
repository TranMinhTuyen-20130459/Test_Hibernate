package hibernate;

import hibernate.config.ConfigHibernate;
import hibernate.data.DataStatusProduct;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        try {

            DataStatusProduct.addDataToTableStatusProducts();

        } catch (Exception e) {

            System.out.println("Đã có lỗi xảy ra");
            System.out.println(e.getMessage());

        }

    }
}