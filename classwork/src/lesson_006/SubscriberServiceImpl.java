package lesson_006;

public  class SubscriberServiceImpl implements SubscriberService {

    @Override
    public void cityCalls(Subscriber[] subscribers) {

        int cityLimit = 200;
        int cout =0;
        System.out.println("Сведения об абонентах, у которых время внутригородских разговоров превышает лимит");

        Subscriber[] array = SubscriberGen.genSubArray();
        Subscriber[] subscribers0 = SubscriberGen.genSubArray();

        for (Subscriber s : subscribers) {
                if (s.getCityCallMin() > cityLimit) {
                    System.out.println(s.toString());
                    cout++;
                }
        }
        System.out.println("Всего абонентов с отрицательным балансом " + cout);
    }

    @Override
    public void interCity(Subscriber[] subscribers) {

        int interCityLimit= 50;
        int cout =0;
        System.out.println("Сведения об абонентах, пользовавшихся междугородной связью;");

        Subscriber[] array = SubscriberGen.genSubArray();
        Subscriber[] subscribers0 = SubscriberGen.genSubArray();

        for (Subscriber s : subscribers) {
            if (s.getInterCityCall() < interCityLimit ) {
                System.out.println(s.toString());
                cout++;
            }
        }
        System.out.println("Всего абонентов пользовавшихся междугородней связью " + cout);
    }

    @Override
    public void subscriber(Subscriber[] subscribers, String firstLetter) {

        System.out.println("Абоненты с фамилиями на букву " + firstLetter);
        Subscriber[] array = SubscriberGen.genSubArray();
        Subscriber[] subscribers0 = SubscriberGen.genSubArray();

        for ( Subscriber s : subscribers) {
            if (s.getLastName().startsWith(firstLetter)) {
                System.out.println(s.toString());
            }
        }
    }

    @Override
    public void traffic(Subscriber[] subscribers) {
        Subscriber[] array = SubscriberGen.genSubArray();
        Subscriber[] subscribers0 = SubscriberGen.genSubArray();

        System.out.println("Cуммарное потребление трафика интернета для определенного города");
        int cityGb1 = 0;
        int cityGb2 = 0;
        for (Subscriber s : subscribers) {
            if ((s.getCity() == "Ланниспорт") ) {
                int a  =  s.getTraffic();
                cityGb1 = a + cityGb1;
            }else {
                int b = s.getTraffic();
                cityGb2 = b + cityGb2;
            }
        }
        System.out.println("Потребление трафика интернета для города Ланниспорт " + cityGb1 + " Gb");
        System.out.println("Потребление трафика интернета для города Винтерфелл " + cityGb2 + " Gb");

    }

    @Override
    public void negativeBal(Subscriber[] subscribers) {

        System.out.println("Абоненты с отрицательным балансом");
        System.out.println("Список абонентов с отрицательным балансом");
        Subscriber[] array = SubscriberGen.genSubArray();
        Subscriber[] subscribers0 = SubscriberGen.genSubArray();

        int cout =0;
        for (Subscriber s : subscribers) {
            if (s.getBalanse() < 0 ) {
                System.out.println(s.toString());
                cout++;

            }
        }
        System.out.println("Количество абонентов с отрицательным балансом " + cout);
    }

}
