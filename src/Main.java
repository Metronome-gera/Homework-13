import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //    Задание 1
    public static void leapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }
    }
    public static String clientOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear > currentYear) {
            System.out.println(" Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= currentYear) {
            System.out.println(" Установите облегченную верcию приложения для IOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear > currentYear) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= currentYear) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке");
        }
        return "";
    }
    public static int deliveryCard(int deliveryDistance){
        int dase = 1;
        if (deliveryDistance <20){

        }else if (deliveryDistance >=20 && deliveryDistance<60){
            dase = dase + 1;

        }else if (deliveryDistance >= 60 && deliveryDistance <=100){
            dase = dase + 1;

        }else if (deliveryDistance > 100){
            System.out.println(" К сожалению мы не сможем доставить вам карту");
        }
        System.out.println(" На доставку карты понадобится дней : " + dase);
        return (byte) dase;
    }
    public static void main(String[] args) {
        //    Задание 1
        int year = 2021;
        leapYear(year);
        //    Задание 2
        int clientOS = 0;
        int clientDeviceYear = 2015;
        clientOS(clientOS, clientDeviceYear);
        //    Задание 3
        int deliveryDistance = 95;
        deliveryCard(deliveryDistance);

        int dase = deliveryCard(deliveryDistance);
    }
}