package classes;
public class Main {
    public static void main(String[] args) {
        Exercise exercise = new Exercise("Press", 10, 15);
        Trainer trainer = new Trainer("Oleg", 31, "Male", "can work in a group", 5);
        Member member = new Member("Nina", 25, "Female", 65, 165);

        PremiumMember premium = new PremiumMember("Nina", 25, "Female", 65, 165, 100);

        Exercise exercise1 = new Exercise("Squats", 3, 10);
        WeightliftingExercise exercise2 = new WeightliftingExercise("Bench Press", 3, 8, 65);
        CardioExercise exercise3 = new CardioExercise("Running", 1, 1, 30);



        exercise.Exercises();
        exercise1.Exercises();
        exercise2.Exercises();
        exercise3.Exercises();
        trainer.moreInfo();
        member.information();
        member.isNeedToLostWight();
        premium.redeemPoints();
    }
}