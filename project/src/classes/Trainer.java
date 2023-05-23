package classes;

class Trainer {
    private String name;
    private int age;
    private String gender;
    private String skills;
    private int workInAge;

    public Trainer(String name, int age, String gender, String skills ,int workInAge) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.workInAge = workInAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getWorkInAge() {
        return workInAge;
    }

    public void setWorkInAge(int workInAge) {
        this.workInAge = workInAge;
    }


    private int calculateYearsOfWork() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - workInAge;
    }


    void moreInfo(){
        System.out.println();
        System.out.println("——————————————————————————————");
        System.out.println();

        System.out.println("Trainer name: " + getName());
        System.out.println("Age:" + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Coaching skills: " + getSkills());
        System.out.println("Has been working for " + getWorkInAge() + " years");
        System.out.println("Years of Work: " + calculateYearsOfWork());

        System.out.println();
        System.out.println("——————————————————————————————");
        System.out.println();
    }

}