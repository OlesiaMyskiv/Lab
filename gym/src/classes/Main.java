package classes;

public class Main {
    public static void main(String[] args) {
        Exercise exercise = new Exercise("Press", 10, 15);
        Trainer trainer = new Trainer("Oleksander Sybota", 31, "Male", "can work in a group", 5);
        Member member = new Member("Zhenya Yanovych", 31, "Male", 88, 189);

        exercise.Exercises();
        trainer.moreInfo();
        member.information();
        member.isNeedToLostWight();
    }
}
