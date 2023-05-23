package classes;

class Member {
    private String name;
    private int age;
    private String gender;
    private int weight;
    private int growth;

    public Member(String name, int age, String gender, int weight ,int growth) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.growth = growth;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }


    public double calculateBMI() {
        double heightInMeters = getGrowth() / 100.0; // перетворення з сантиметрів у метри
        return weight / (heightInMeters * heightInMeters);
    }

    void information(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Weight: " + getWeight());
        System.out.println("Growth: " + getGrowth());
        System.out.println("Body mass index: " + calculateBMI());
    }

    void isNeedToLostWight(){
        int need = growth - 100;
        if(weight >= (need +5) && weight >= (need - 5))
        { System.out.println("Your weigth is normal");}
        else { System.out.println("You need to visit gym"); }
    }
}


