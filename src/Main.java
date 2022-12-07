public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {

        System.out.println("\nЗадача_1");
        byte clientOS = 0;
        if (clientOS == 1){
            System.out.println("«Установите версию приложения для Android по ссылке».");
        }
        if (clientOS == 0){
            System.out.println("«Установите версию приложения для iOS по ссылке»");

        }
    }

    public static void task2() {

        System.out.println("\nЗадача_2");
        int clientDeviceYear = 2014;
        int clientOS = 0;
        if (clientOS == 1) {
           if (clientDeviceYear < 2015){
               System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
           } else {
               System.out.println("«Установите версию приложения для Android по ссылке».");
           }
        }
    else if (clientDeviceYear < 2015){
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        }
    else{
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }

    }

    public static void task3() {

        System.out.println("\nЗадача_3");

        int year = 1800;

        boolean year4 = year%4 == 0 && year%100 != 0 || year%400 == 0  ;

        if (year4){
            System.out.println(" Год: " +year + " - высокосный !!");

    }else {
            System.out.println(" Год: " +year + " - не высокосный !!");
        }}

    public static void task4() {

        System.out.println("\nЗадача_4");
        int deliveryDistance = 22;
        int deliveryDay = 1;

        if (deliveryDistance > 0 && deliveryDistance < 20) {
            System.out.println("доставка дней: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryDay++;
            System.out.println("доставка дней: " + deliveryDay);

        } else if (deliveryDistance > 60 && deliveryDistance <100 ) {
            deliveryDay = deliveryDay +2;
            System.out.println("доставка дней: " + deliveryDay);
        }else {
            System.out.println(" не доставляем ");
        }
    }


    public static void task5() {

        System.out.println("\nЗадача_5");
        int mounthNumber = 15;
        switch (mounthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("\nЗима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("\nВесна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("\nЛето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("\nОсень");
                break;
            default:
                System.out.println("Некорректный месяц "  + mounthNumber);
        }


    }

    public static void task6() {

        System.out.println("\nЗадача_6");
    }

    public static void task7() {

        System.out.println("\nЗадача_7");
        int deliveryDistase = 101;
        int deliveryDay = 1;
        if (deliveryDistase > 20) {
            deliveryDay++;
            if (deliveryDistase > 60)
                deliveryDay++;
            if (deliveryDistase > 100)


                System.out.println("количество дней : " + deliveryDay);


        }
    }
}