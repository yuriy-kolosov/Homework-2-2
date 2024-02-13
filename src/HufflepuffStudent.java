public class HufflepuffStudent extends HogwartsStudent {
    // Пуффендуй - факультет - студент:
    private final int diligence;          // трудолюбие       1
    private final int fidelity;           // верность         2
    private final int honesty;            // честность        3

    public HufflepuffStudent(String name, String lastName, int magicStrength, int transgressionDistance,
                             int diligence, int fidelity, int honesty) {
        super(name, lastName, magicStrength, transgressionDistance);
        if (super.getName().equals("Unknown Name")) {
            this.diligence = 0;
            this.fidelity = 0;
            this.honesty = 0;
            return;
        } else if (diligence < 0) {
            this.diligence = 0;
        } else if (diligence > 100) {
            this.diligence = 100;
        } else {
            this.diligence = diligence;
        }
        if (fidelity < 0) {
            this.fidelity = 0;
        } else if (fidelity > 100) {
            this.fidelity = 100;
        } else {
            this.fidelity = fidelity;
        }
        if (honesty < 0) {
            this.honesty = 0;
        } else if (honesty > 100) {
            this.honesty = 100;
        } else {
            this.honesty = honesty;
        }
    }

    public int getDiligence() {
        return diligence;
    }

    public int getFidelity() {
        return fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    void describeHogwartsStudent() {
        System.out.println("Студент школы Hogwarts, " + this.toString());
    }

    void compareHufflepuffStudents(HufflepuffStudent student) {
        if ((this.diligence + this.fidelity + this.honesty) >
                (student.diligence + student.fidelity + student.honesty)) {
            System.out.println(this.getName() +
                    " " + this.getLastName() +
                    " лучший пуффендуец, чем " + student.getName() +
                    " " + student.getLastName());
        } else if ((this.diligence + this.fidelity + this.honesty) <
                (student.diligence + student.fidelity + student.honesty)) {
            System.out.println(student.getName() +
                    " " + student.getLastName() +
                    " лучший пуффендуец, чем " + this.getName() +
                    " " + this.getLastName());
        } else {
            System.out.println("Личные качества пуффендуйца равны");
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
        return "факультет Hufflepuff (Пуффендуй):\n" +
                super.toString() +
                "\nЛичные качества (баллы): трудолюбие: " + diligence +
                ", верность: " + fidelity +
                ", честность: " + honesty;
    }

}