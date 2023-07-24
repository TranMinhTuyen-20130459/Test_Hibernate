package hibernate.util;

import hibernate.data.DataUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunctionUtil {

    public static <T> List<Integer> getListIndexRandom(List<T> list, int quantityIndex) {
        List<Integer> result = new ArrayList<>();
        // Kiểm tra nếu quantityIndex vượt quá số lượng phần tử trong danh sách, thì chỉ lấy số phần tử tối đa có thể
        int maxQuantity = Math.min(quantityIndex, list.size());

        // Tạo một danh sách các chỉ số từ 0 đến (số phần tử trong danh sách - 1)
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            indices.add(i);
        }

        // Trộn danh sách các chỉ số ngẫu nhiên
        Collections.shuffle(indices);

        // Lấy 'quantityIndex' phần tử từ danh sách đã trộn và thêm vào kết quả
        for (int i = 0; i < maxQuantity; i++) {
            result.add(indices.get(i));
        }

        return result;
    }


    public static <T> List<T> getListElementRandom(List<T> list, int quantity) {
        List<T> result = new ArrayList<>();

        // Kiểm tra nếu quantity vượt quá số lượng phần tử trong danh sách, thì chỉ lấy số phần tử tối đa có thể
        int maxQuantity = Math.min(quantity, list.size());

        // Trộn danh sách gốc để lấy các phần tử ngẫu nhiên
        List<T> shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);

        // Lấy 'quantity' phần tử từ danh sách đã trộn và thêm vào kết quả
        for (int i = 0; i < maxQuantity; i++) {
            result.add(shuffledList.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(DataUtil.getListIdProduct().size());
        System.out.println(FunctionUtil.getListIndexRandom(DataUtil.getListIdProduct(), 3));
        System.out.println(FunctionUtil.getListElementRandom(DataUtil.getListIdProduct(),3));
    }
}
