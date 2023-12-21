package lesson_006;

import java.util.Scanner;

public class RunSubscriber {

    public static void main(String[] args) {

        System.out.println("Информация об абонентах");

        while (true) {

            System.out.println();
            System.out.println("Выберете вариант из списка: ");
            System.out.println("01. Сведения об абонентах, у которых время внутригородских разговоров превышает заданное;");
            System.out.println("02. Сведения об абонентах, которые пользовались междугородной связью;");
            System.out.println("03. Полные сведения об абоненте");
            System.out.println("04. Суммарное потребление трафика интернета для определенного города");
            System.out.println("05. Количество абонентов с отрицательным балансом ");
            System.out.println("06. Завершить работу");

            Scanner scan = new Scanner(System.in);
            int choice = 0;
            while (true) {
                if (scan.hasNextInt()) {
                    choice = scan.nextInt();
                    scan.nextLine();
                    if (choice >= 1 && choice <= 6) {
                        break;
                    } else {
                        System.out.println("Выберите вариант из списка пожалуйста!");
                    }
                } else {
                    System.out.println("Только цифры пожалуйста!");
                    scan.nextLine();
                }
            }

            switch (choice) {

                case 1:
                    Subscriber[] subscribers0 = SubscriberGen.genSubArray();
                    SubscriberService subService0 = new SubscriberServiceImpl();
                    subService0.cityCalls(subscribers0);
                    break;

                case 2:
                    Subscriber[] subscribers1 = SubscriberGen.genSubArray();
                    SubscriberService subService1 = new SubscriberServiceImpl();
                    subService1.interCity(subscribers1);
                    break;

                case 3:
                    Subscriber[] subscribers2 = SubscriberGen.genSubArray();
                    SubscriberService subService2 = new SubscriberServiceImpl();
                    subService2.subscriber(subscribers2, "С");
                    break;

                case 4:
                    Subscriber[] subscribers3 = SubscriberGen.genSubArray();
                    SubscriberService subService3 = new SubscriberServiceImpl();
                    subService3.traffic(subscribers3 ,"Ланниспорт");
                    break;

                case 5:
                    Subscriber[] subscribers4 = SubscriberGen.genSubArray();
                    SubscriberService subService4 = new SubscriberServiceImpl();
                    subService4.negativeBal(subscribers4);
                    break;

                case 6:
                    return;

                default:
                    System.out.println("JAVе так спокойнее");
                    continue;



            }
        }
    }
}