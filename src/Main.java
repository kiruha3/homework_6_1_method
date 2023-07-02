public class Main {
    public static void main(String[] args) {
        int yearLeap = 1764;
        int year = 1763;
        checkLeapYear(year);
        checkLeapYear(yearLeap);
        suggestVersion(0, 2014);
        getCountDay(86);
    }

    private static void checkLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год является невисокосным");
        }
    }

    private static void suggestVersion(int clientOS, int clientDeviceYear) {
        int iOs = 0;
        int android = 1;
        int yearCheck = 2015;
        if (clientDeviceYear < yearCheck) {
            if (clientOS == iOs) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == android) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Указанная ОС не поддерживается");
            }
        } else {
            if (clientOS == iOs) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == android) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Указанная ОС не поддерживается");
            }
        }
    }

    private static int getDeliveryDays(int deliveryDistance) {
        //int deliveryDistance = 99;
        int deliveryDay;
        if (deliveryDistance < 100 && deliveryDistance >= 60) {
            return 3;
        } else if (deliveryDistance < 60 && deliveryDistance >= 20) {
            return 2;
        } else if (deliveryDistance < 20) {
            return 1;
        } else {
            return -1;
        }
    }

    private static void getCountDay(int deliveryDay) {
        int deliveryDays = getDeliveryDays(deliveryDay);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}