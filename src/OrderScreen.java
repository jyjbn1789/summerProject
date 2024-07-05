import java.util.Random;
import java.util.Scanner;

public class OrderScreen {
    private Order order;
    private Scanner scanner;

    public OrderScreen(Order order, Scanner scanner) {
        this.order = order;
        this.scanner = scanner;
    }

    public void showOrderScreen() {
        order.showOrder();
        System.out.println("총 가격: " + order.getTotalPrice() + "원");
        System.out.println("1. 주문");
        System.out.println("2. 메뉴판");
        System.out.print("선택: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("주문이 완료되었습니다!");
            Random random = new Random();
            int min = 1;
            int max = 100;
            int waitingNumber = random.nextInt((max - min) + 1) + min; //랜덤적 출력

            System.out.println("대기번호는 [ " + waitingNumber + " ]  번 입니다.");
            System.out.println("(3초 후 메뉴판으로 돌아갑니다.");
            System.out.println();
            order.clear();
            try {
                Thread.sleep(3000); // 3초 대기
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } else if (choice.equals("2")) {
            // 돌아가기, 그냥 종료해서 메인 화면으로 돌아가게 함
            return;
        } else {
            System.out.println("유효하지 않은 선택입니다."); //8 이상
        }
    }
}
