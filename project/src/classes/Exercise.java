package classes;
class Exercise {
    private String name;
    private int sets;
    private int reps;

    public Exercise(String name, int sets, int reps) {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int calculateTotalReps() {
        return sets * reps;
    }

    public void Exercises() {
        System.out.println("——————————————————————————————");
        System.out.println("The name of the exercise: " + getName());
        System.out.println("Sets: " + getSets());
        System.out.println("Number of repetitions: " + getReps());
        System.out.println("The total number of repetitions for the exercise: " + calculateTotalReps());
        System.out.println("——————————————————————————————");
    }
}

class WeightliftingExercise extends Exercise { //права з підняттям ваги
    private double weight;

    public WeightliftingExercise(String name, int sets, int reps, double weight) {
        super(name, sets, reps);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void Exercises() {
        System.out.println("Weightlifting exercise: " + getName());
        System.out.println("Sets: " + getSets());
        System.out.println("Number of repetitions: " + getReps());
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("The total weight lifted for the exercise: " + calculateTotalReps() / getWeight() + " kg");
    }
}

class CardioExercise extends Exercise {
    private int duration;

    public CardioExercise(String name, int sets, int reps, int duration) {
        super(name, sets, reps);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void Exercises() {
        System.out.println("——————————————————————————————");
        System.out.println("Cardio exercise: " + getName());
        System.out.println("Duration: " + getDuration() + " minutes");
    }
}
