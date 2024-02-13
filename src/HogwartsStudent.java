abstract class HogwartsStudent {
    // Хогвардс - студент:
    private String name = "";
    private String lastName = "";

    private int magicStrength;          // обладает магической силой        1
    private int transgressionDistance;  // на расстоянии трансгрессирования 2

    public HogwartsStudent(String name, String lastName, int magicStrength, int transgressionDistance) {
        if (magicStrength < 0 || magicStrength > 100 || transgressionDistance < 0 || transgressionDistance > 100) {
            this.name = "Unknown Name";
            this.lastName = "Unknown Lastname";
            this.magicStrength = 0;
            this.transgressionDistance = 0;
        } else {
            this.name = name;
            this.lastName = lastName;
            this.magicStrength = magicStrength;
            this.transgressionDistance = transgressionDistance;
        }
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int transgressionDistance() {
        return magicStrength;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    abstract void describeHogwartsStudent();

    abstract void compareHogwartsStudentsMagicStrength(HogwartsStudent student);

    abstract void compareHogwartsStudentsTransgressionDistance(HogwartsStudent student);

    @Override
    public String toString() {
        return "Имя и фамилия: " + name +
                " " + lastName +
                "\nВолшебные свойства (баллы): магическая сила: " + magicStrength +
                ", расстояние трансгрессии: " + transgressionDistance;
    }

}