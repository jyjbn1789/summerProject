import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void cancelOrder() {
        products.clear();
    }

    public void showOrder() {
        if (products.isEmpty()) {
            System.out.println("현재 주문 내역이 없습니다.");
        } else {
            System.out.println("주문 내역:");
            for (int i = 0; i < products.size(); i++) {
                System.out.println(products.get(i));
            }
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).price;
        }

        return total;
    }

    public void clear() {
        products.clear();
    }
}
