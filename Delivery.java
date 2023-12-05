import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

public class Delivery {
    private static final String DB_URL = "jdbc:mysql://localhost:3308/baemin";
    private static final String USER = "gahyun";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            System.out.println("Database connection established.");

            while (true) {
                printMenu();
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        orderFood(connection);
                        break;
                    case 2:
                        searchRestaurant(connection);
                        break;
                    case 3:
                        checkOrderHistory(connection);
                        break;
                    case 4:
                        checkDeliveryStatus(connection);
                        break;
                    case 5:
                        leaveReview(connection);
                        break;
                    case 6:
                        updateUserInfo(connection);
                        break;
                    case 7:
                        System.out.println("Exiting the program. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printMenu() {
        System.out.println("------------------------------------------------------------");
        System.out.println("1. 음식 주문하기");
        System.out.println("2. 가게 검색");
        System.out.println("3. 주문 내역 확인");
        System.out.println("4. 배달 상태 조회");
        System.out.println("5. 리뷰 남기기");
        System.out.println("6. 사용자 정보 업데이트");
        System.out.println("7. 종료");
        System.out.println("------------------------------------------------------------");
        System.out.print("Enter your choice: ");
    }

    private static void orderFood(Connection connection) {
        // 구현할 부분: 음식 주문하기
        System.out.println("Ordering food... (Not implemented)");
    }

    private static void searchRestaurant(Connection connection) {
        // 구현할 부분: 가게 검색
        System.out.println("Searching for restaurants... (Not implemented)");
    }

    private static void checkOrderHistory(Connection connection) {
        // 구현할 부분: 주문 내역 확인
        System.out.println("Checking order history... (Not implemented)");
    }

    private static void checkDeliveryStatus(Connection connection) {
        // 구현할 부분: 배달 상태 조회
        System.out.println("Checking delivery status... (Not implemented)");
    }

    private static void leaveReview(Connection connection) {
        // 구현할 부분: 리뷰 남기기
        System.out.println("Leaving a review... (Not implemented)");
    }

    private static void updateUserInfo(Connection connection) {
        // 구현할 부분: 사용자 정보 업데이트
        System.out.println("Updating user information... (Not implemented)");
    }
}
