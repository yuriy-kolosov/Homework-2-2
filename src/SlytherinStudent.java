public class SlytherinStudent extends HogwartsStudent {
    // Слизерин - факультет - студент:
    private final int trick;          // хитрость                     1
    private final int decisiveness;   // решительность                2
    private final int ambition;       // амбициозность                3
    private final int ingenuity;      // находчивость                 4
    private final int imperiousness;  // властность (жажда власти)    5

    public SlytherinStudent(String name, String lastName, int magicStrength, int transgressionDistance,
                            int trick, int decisiveness, int ambition, int ingenuity, int imperiousness) {
        super(name, lastName, magicStrength, transgressionDistance);
        if (super.getName().equals("Unknown Name")) {
            this.trick = 0;
            this.decisiveness = 0;
            this.ambition = 0;
            this.ingenuity = 0;
            this.imperiousness = 0;
            return;
        } else if (trick < 0) {
            this.trick = 0;
        } else if (trick > 100) {
            this.trick = 100;
        } else {
            this.trick = trick;
        }
        if (decisiveness < 0) {
            this.decisiveness = 0;
        } else if (decisiveness > 100) {
            this.decisiveness = 100;
        } else {
            this.decisiveness = decisiveness;
        }
        if (ambition < 0) {
            this.ambition = 0;
        } else if (ambition > 100) {
            this.ambition = 100;
        } else {
            this.ambition = ambition;
        }
        if (ingenuity < 0) {
            this.ingenuity = 0;
        } else if (ingenuity > 100) {
            this.ingenuity = 100;
        } else {
            this.ingenuity = ingenuity;
        }
        if (imperiousness < 0) {
            this.imperiousness = 0;
        } else if (imperiousness > 100) {
            this.imperiousness = 100;
        } else {
            this.imperiousness = imperiousness;
        }
    }

    public int getTrick() {
        return trick;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public int getImperiousness() {
        return imperiousness;
    }


    @Override
    void describeHogwartsStudent() {
        System.out.println("Студент школы Hogwarts, " + this.toString());
    }

    void compareSlytherinStudents(SlytherinStudent student) {
        if ((this.trick + this.decisiveness + this.ambition + this.ingenuity + this.imperiousness) >
                (student.trick + student.decisiveness + student.ambition + this.ingenuity + this.imperiousness)) {
            System.out.println(this.getName() +
                    " " + this.getLastName() +
                    " лучший слизеринец, чем " + student.getName() +
                    " " + student.getLastName());
        } else if ((this.trick + this.decisiveness + this.ambition + this.ingenuity + this.imperiousness) <
                (student.trick + student.decisiveness + student.ambition + this.ingenuity + this.imperiousness)) {
            System.out.println(student.getName() +
                    " " + student.getLastName() +
                    " лучший слизеринец, чем " + this.getName() +
                    " " + this.getLastName());
        } else {
            System.out.println("Личные качества слизеринца равны");
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
        return "факультет Slytherin (Слизерин):\n" +
                super.toString() +
                "\nЛичные качества (баллы): хитрость: " + trick +
                ", решительность: " + decisiveness +
                ", амбициозность: " + ambition +
                ", находчивость: " + ingenuity +
                ", властность: " + imperiousness;
    }

}