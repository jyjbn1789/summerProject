import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("싸이버거(단품)", 4600, "닭다리살 패티, 피클, 양파, 양상추");
        Product product2 = new Product("싸이버거(세트)", 6900, "싸이버거 + 케이준양념감자(중) + 콜라");
        Product product3 = new Product("케이준양념감자(중)", 2000, "감자튀김");
        Product product4 = new Product("콜라", 1600, "콜라!");

        ArrayList<Product> menu = new ArrayList<>();
        menu.add(product1);
        menu.add(product2);
        menu.add(product3);
        menu.add(product4);

        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        MainScreen mainScreen = new MainScreen(menu, order, scanner);

        mainScreen.showMainScreen();

        scanner.close();
    }
}
