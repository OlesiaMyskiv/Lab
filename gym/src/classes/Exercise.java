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

    void Exercises(){
        System.out.println("The name of the exercise: " + name);
        System.out.println("Sets: " + sets);
        System.out.println("Number of repetitions: " + reps);

    }
}


