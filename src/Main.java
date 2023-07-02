public class Main {
    public static void main(String[] args) {
        int yearLeap = 1764;
        int year = 1763;
        leapYear(year);
        leapYear(yearLeap);
        suggestVersion(0,2014);

    }
    private static void leapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println( year + " Год является високосным");
        }else {
            System.out.println( year + " Год является невисокосным");
        }
    }

    private static void suggestVersion(int clientOS, int clientDeviceYear) {
        //int clientOS = 1;
        int iOs = 0;
        int android = 1;
        //int clientDeviceYear = 2015;
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
    private static void task4() {
        int deliveryDistance = 99;
        int deliveryDay;
        if (deliveryDistance < 100 && deliveryDistance >= 60) {
            deliveryDay = 3;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance < 60 && deliveryDistance >= 20) {
            deliveryDay = 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance < 20) {
            deliveryDay = 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставка не осуществляется");
        }

    }
}