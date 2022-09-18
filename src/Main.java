import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        printIsLeap(2022);
        printInstallationMessage(1, 2022);
        printCalculateDeliveryDays(100);
    }

// Задание 1
    private static void printIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println("Високосный год");
        }   else {
            System.out.println("Не високосный год");
        }
    }

// Задание 2
    private static void printInstallationMessage(int os, int productionYear) {
        if (!(os == 0 || os == 1)) {
            throw new RuntimeException("Устройство поддерживается устройство соответсвует требованиям");
        }
        var currentYear = LocalDate.now().getYear();
        String versionMessage = productionYear < currentYear ? "lite" : "обычную";
        String osMessage = os ==0 ? "iOS" : "Android";
        System.out.printf("Установите %s версию приложения для %s", versionMessage, osMessage);
    }
// Задание 3
    private static void printCalculateDeliveryDays (int distance) {
        int start = 20;
        int step = 40;
        int result;
        if (distance < start) {
            result = 1;
        } else {
            result = (Math.abs((distance - start) / step) + 2);
        }
        System.out.println("Потребуется для доставки дней: " + result);
    }
}