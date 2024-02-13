public class RavenclawStudent extends HogwartsStudent {
    // Когтевран - факультет - студент:
    private final int intellect;  // ум                               1
    private final int wisdom;     // мудрость                         2
    private final int wit;        // остроумие                        3
    private final int creativity; // креативность (полон творчества)  4

    public RavenclawStudent(String name, String lastName, int magicStrength, int transgressionDistance,
                            int intellect, int wisdom, int wit, int creativity) {
        super(name, lastName, magicStrength, transgressionDistance);
        if (super.getName().equals("Unknown Name")) {
            this.intellect = 0;
            this.wisdom = 0;
            this.wit = 0;
            this.creativity = 0;
            return;
        } else if (intellect < 0) {
            this.intellect = 0;
        } else if (intellect > 100) {
            this.intellect = 100;
        } else {
            this.intellect = intellect;
        }
        if (wisdom < 0) {
            this.wisdom = 0;
        } else if (wisdom > 100) {
            this.wisdom = 100;
        } else {
            this.wisdom = wisdom;
        }
        if (wit < 0) {
            this.wit = 0;
        } else if (wit > 100) {
            this.wit = 100;
        } else {
            this.wit = wit;
        }
        if (creativity < 0) {
            this.creativity = 0;
        } else if (creativity > 100) {
            this.creativity = 100;
        } else {
            this.creativity = creativity;
        }
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    void describeHogwartsStudent() {
        System.out.println("Студент школы Hogwarts, " + this.toString());
    }

    void compareRavenclawStudents(RavenclawStudent student) {
        if ((this.intellect + this.wisdom + this.wit + this.creativity) >
                (student.intellect + student.wisdom + student.wit + this.creativity)) {
            System.out.println(this.getName() +
                    " " + this.getLastName() +
                    " лучший когтевранец, чем " + student.getName() +
                    " " + student.getLastName());
        } else if ((this.intellect + this.wisdom + this.wit + this.creativity) <
                (student.intellect + student.wisdom + student.wit + this.creativity)) {
            System.out.println(student.getName() +
                    " " + student.getLastName() +
                    " лучший когтевранец, чем " + this.getName() +
                    " " + this.getLastName());
        } else {
            System.out.println("Личные качества когтевранца равны");
        }
    }

    @Override
    void compareHogwartsStudentsMagicStrength(HogwartsStudent student) {
        if (this.transgressionDistance() > student.transgressionDistance()) {
            System.out.println(this.getName() +
                    " " + this.getLastName() +
                    " обладает большей силой магии, чем " + student.getName() +
                    " " + student.getLastName());
        } else if (this.transgressionDistance() < student.transgressionDistance()) {
            System.out.println(student.getName() +
                    " " + student.getLastName() +
                    " обладает большей силой магии, чем " + this.getName() +
                    " " + this.getLastName());
        } else {
            System.out.println("Силы магии ученика школы Hogwarts равны");
        }
    }

    @Override
    void compareHogwartsStudentsTransgressionDistance(HogwartsStudent student) {
        if (this.transgressionDistance() > student.transgressionDistance()) {
            System.out.println(this.getName() +
                    " " + this.getLastName() +
                    " обладает большей дистанцией трансгрессии, чем " + student.getName() +
                    " " + student.getLastName());
        } else if (this.transgressionDistance() < student.transgressionDistance()) {
            System.out.println(student.getName() +
                    " " + student.getLastName() +
                    " обладает большей дистанцией трансгрессии, чем " + this.getName() +
                    " " + this.getLastName());
        } else {
            System.out.println("Дистанции трансгрессии ученика школы Hogwarts равны");
        }
    }

    @Override
    public String toString() {
        return "факультет Ravenclaw (Когтевран):\n" +
                super.toString() +
                "\nЛичные качества (баллы): ум: " + intellect +
                ", мудрость: " + wisdom +
                ", остроумие: " + wit +
                ", креативность: " + creativity;
    }

}