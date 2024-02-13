public class GryffindorStudent extends HogwartsStudent {
    // Гриффиндор - факультет - студент:
    private final int nobility;       // благородство     1
    private final int honour;         // честь            2
    private final int bravery;        // храбрость        3

    public GryffindorStudent(String name, String lastName, int magicStrength, int transgressionDistance,
                             int nobility, int honour, int bravery) {
        super(name, lastName, magicStrength, transgressionDistance);
        if (super.getName().equals("Unknown Name")) {
            this.nobility = 0;
            this.honour = 0;
            this.bravery = 0;
            return;
        } else if (nobility < 0) {
            this.nobility = 0;
        } else if (nobility > 100) {
            this.nobility = 100;
        } else {
            this.nobility = nobility;
        }
        if (honour < 0) {
            this.honour = 0;
        } else if (honour > 100) {
            this.honour = 100;
        } else {
            this.honour = honour;
        }
        if (bravery < 0) {
            this.bravery = 0;
        } else if (bravery > 100) {
            this.bravery = 100;
        } else {
            this.bravery = bravery;
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    void describeHogwartsStudent() {
        System.out.println("Студент школы Hogwarts, " + this.toString());
    }

    void compareGryffindorStudents(GryffindorStudent student) {
        if ((this.nobility + this.honour + this.bravery) >
                (student.nobility + student.honour + student.bravery)) {
            System.out.println(this.getName() +
                    " " + this.getLastName() +
                    " лучший гриффендорец, чем " + student.getName() +
                    " " + student.getLastName());
        } else if ((this.nobility + this.honour + this.bravery) <
                (student.nobility + student.honour + student.bravery)) {
            System.out.println(student.getName() +
                    " " + student.getLastName() +
                    " лучший гриффендорец, чем " + this.getName() +
                    " " + this.getLastName());
        } else {
            System.out.println("Личные качества гриффендорца равны");
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
        return "факультет Gryffendor (Гриффиндор):\n" +
                super.toString() +
                "\nЛичные качества (баллы): благородство: " + nobility +
                ", честь: " + honour +
                ", храбрость: " + bravery;
    }

}