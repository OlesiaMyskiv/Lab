public class Main {
    public static void main(String[] args) {
        Exercise exercise = new Exercise("Press", 10, 15);
        Trainer trainer = new Trainer("Oleksander Sybota", 31, "Male");
        Member member = new Member("Zhenya Yanovych", 31, "Male");

        System.out.println("Exercise name: " + exercise.getName());
        System.out.println("Sets: " + exercise.getSets());
        System.out.println("Reps: " + exercise.getReps());

        System.out.println();
        System.out.println("——————————————————————————————");
        System.out.println();

        System.out.println("Trainer name: " + trainer.getName());
        System.out.println("Age: " + trainer.getAge());
        System.out.println("Gender: " + trainer.getGender());

        System.out.println();
        System.out.println("——————————————————————————————");
        System.out.println();

        System.out.println("Member name: " + member.getName());
        System.out.println("Age: " + member.getAge());
        System.out.println("Gender: " + member.getGender());
    }
}