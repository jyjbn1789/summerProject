import java.util.ArrayList;
import java.util.Scanner;

public class MainScreen {
    private ArrayList<Product> menu;
    private Order order;
    private Scanner scanner;

    public MainScreen(ArrayList<Product> menu, Order order, Scanner scanner) {
        this.menu = menu;
        this.order = order;
        this.scanner = scanner;
    }

    public void showMainScreen() {
        while (true) {
            System.out.println("맘스터지에 오신 걸 환영합니다~!");
            System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
            System.out.println();
            System.out.println("[Mom's Touch Menu]");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i));
            }
            System.out.println();
            System.out.println("[ORDER MENU]");
            System.out.println("5. Order(주문)");
            System.out.println("6. Cancel(주문 취소)");
            System.out.println("7. Exit(종료)");
            System.out.print("선택: ");
            String choice = scanner.nextLine();

            // 먼저 choice가 명령어인지 확인
            if (choice.equals("5") || choice.equalsIgnoreCase("Order")) { //5 아니면 order 입력 시
                OrderScreen orderScreen = new OrderScreen(order, scanner);
                orderScreen.showOrderScreen();
            } else if (choice.equals("6") || choice.equalsIgnoreCase("Cancel")) {
                System.out.println("주문을 취소하시겠습니까?");
                System.out.println("1. 확인");
                System.out.println("2. 취소");
                System.out.print("선택: ");
                String confirm = scanner.nextLine();
                if (confirm.equals("1")) {
                    order.cancelOrder();
                    System.out.println("주문이 취소되었습니다.");
                } else {
                    System.out.println("주문 취소하는 게 취소되었습니다.");
                }
            } else if (choice.equals("7") || choice.equalsIgnoreCase("Exit")) {
                break;
            } else {
                // 명령어가 아닌 경우 숫자로 처리
                try {
                    int productNumber = Integer.parseInt(choice);
                    if (productNumber > 0 && productNumber <= menu.size()) {
                        order.addProduct(menu.get(productNumber - 1));
                        System.out.println(menu.get(productNumber - 1).name + "이(가) 장바구니에 추가되었습니다.");
                    } else {
                        System.out.println("유효하지 않은 번호입니다.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("유효하지 않은 선택입니다.");
                }
            }

            System.out.println();
        }
    }
}


