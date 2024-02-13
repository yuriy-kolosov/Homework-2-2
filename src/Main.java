public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 2-2. ООП, часть 1. Инкапсуляция и наследование");
        System.out.println();
        System.out.println("                             Задача \"Ученики школы Хогвартс\"");
        System.out.println();

        System.out.println("                                         Факультет Гриффиндор");
        System.out.println();

        GryffindorStudent garryPotter = new GryffindorStudent("Garry", "Potter", 97, 99,
                100, 100, 100);
        GryffindorStudent hermioneGranger = new GryffindorStudent("Hermione", "Granger", 87, 63,
                98, 100, 77);
        GryffindorStudent ronWeasley = new GryffindorStudent("Ron", "Weasley", 23, 16,
                55, 81, 21);

        garryPotter.describeHogwartsStudent();
        System.out.println();
        hermioneGranger.describeHogwartsStudent();
        System.out.println();
        ronWeasley.describeHogwartsStudent();
        System.out.println();

        garryPotter.compareGryffindorStudents(hermioneGranger);
        System.out.println();
        garryPotter.compareGryffindorStudents(ronWeasley);
        System.out.println();
        hermioneGranger.compareGryffindorStudents(ronWeasley);
        System.out.println();


        System.out.println("                                         Факультет Пуффендуй");
        System.out.println();

        HufflepuffStudent zechariahSmith = new HufflepuffStudent("Zechariah", "Smith", 5, 9,
                42, 36, 19);
        HufflepuffStudent cedricDiggory = new HufflepuffStudent("Cedric", "Diggory", 11, 13,
                51, 20, 47);
        HufflepuffStudent justinFinchFletchley = new HufflepuffStudent("Justin", "Finch-Fletchley", 65, 77,
                12, 68, 3);

        zechariahSmith.describeHogwartsStudent();
        System.out.println();
        cedricDiggory.describeHogwartsStudent();
        System.out.println();
        justinFinchFletchley.describeHogwartsStudent();
        System.out.println();

        zechariahSmith.compareHufflepuffStudents(cedricDiggory);
        System.out.println();
        cedricDiggory.compareHufflepuffStudents(justinFinchFletchley);
        System.out.println();
        justinFinchFletchley.compareHufflepuffStudents(zechariahSmith);
        System.out.println();

        System.out.println("                                         Факультет Когтевран");
        System.out.println();

        RavenclawStudent zhouChang = new RavenclawStudent("Zhou", "Chang", 89, 73,
                41, 12, 56, 22);
        RavenclawStudent padmaPatil = new RavenclawStudent("Padma", "Patil", 39, 45,
                27, 8, 14, 46);
        RavenclawStudent marcusBelbi = new RavenclawStudent("Marcus", "Belbi", 14, 18,
                62, 43, 35, 77);

        zhouChang.describeHogwartsStudent();
        System.out.println();
        padmaPatil.describeHogwartsStudent();
        System.out.println();
        marcusBelbi.describeHogwartsStudent();
        System.out.println();

        zhouChang.compareRavenclawStudents(marcusBelbi);
        System.out.println();
        padmaPatil.compareRavenclawStudents(zhouChang);
        System.out.println();
        marcusBelbi.compareRavenclawStudents(padmaPatil);
        System.out.println();

        System.out.println("                                         Факультет Слизерин");
        System.out.println();

        SlytherinStudent dracoMalfoy = new SlytherinStudent("Draco", "Malfoy", 91, 93,
                88, 86, 99, 72, 100);
        SlytherinStudent grahamMontague = new SlytherinStudent("Graham", "Montague", 33, 26,
                9, 4, 47, 22, 31);
        SlytherinStudent gregoryGoyle = new SlytherinStudent("Gregory", "Goyle", 47, 29,
                44, 38, 55, 40, 60);

        dracoMalfoy.describeHogwartsStudent();
        System.out.println();
        grahamMontague.describeHogwartsStudent();
        System.out.println();
        gregoryGoyle.describeHogwartsStudent();
        System.out.println();

        dracoMalfoy.compareSlytherinStudents(grahamMontague);
        System.out.println();
        dracoMalfoy.compareSlytherinStudents(gregoryGoyle);
        System.out.println();
        grahamMontague.compareSlytherinStudents(gregoryGoyle);
        System.out.println();

        System.out.println("                                         Магическая сила учеников разных факультетов");
        System.out.println();


        garryPotter.compareHogwartsStudentsMagicStrength(hermioneGranger);
        System.out.println();
        garryPotter.compareHogwartsStudentsMagicStrength(justinFinchFletchley);
        System.out.println();
        garryPotter.compareHogwartsStudentsMagicStrength(dracoMalfoy);
        System.out.println();
        dracoMalfoy.compareHogwartsStudentsMagicStrength(hermioneGranger);
        System.out.println();
        dracoMalfoy.compareHogwartsStudentsMagicStrength(zhouChang);
        System.out.println();
        zhouChang.compareHogwartsStudentsMagicStrength(cedricDiggory);
        System.out.println();

        System.out.println("                                       Сила трансгрессии учеников разных факультетов");
        System.out.println();

        garryPotter.compareHogwartsStudentsTransgressionDistance(hermioneGranger);
        System.out.println();
        garryPotter.compareHogwartsStudentsTransgressionDistance(ronWeasley);
        System.out.println();
        garryPotter.compareHogwartsStudentsTransgressionDistance(dracoMalfoy);
        System.out.println();
        dracoMalfoy.compareHogwartsStudentsTransgressionDistance(zechariahSmith);
        System.out.println();
        marcusBelbi.compareHogwartsStudentsTransgressionDistance(grahamMontague);
        System.out.println();
        marcusBelbi.compareHogwartsStudentsTransgressionDistance(cedricDiggory);
        System.out.println();

    }

}