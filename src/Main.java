public class Main {
    public static void main(String[] args) {

        int eaters = 30; // сколько людей будут есть

        int water = 3; // миллилитров воды
        int potatoes = 10; // картофелин
        int chicken = 10; // куриных бёдер
        int spices = 15; // ложек специй

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println((water / eaters) + " миллилитров воды");
        System.out.println((potatoes / eaters) + " картофелин(а)");
        System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
        System.out.println((spices / eaters) + " ложек(ка) специй");

    }
}
