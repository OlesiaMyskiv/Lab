package classes;

class Member {
    public String name;
    public int age;
    public String gender;
    public int weight;
    public int growth;

    public Member(String name, int age, String gender, int weight ,int growth) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.growth = growth;
    }

    void information(){
        System.out.println("Name: " + name);
        System.out.println("Age :" + age);
        System.out.println("Gender" + gender);
        System.out.println("Weight" + weight);
        System.out.println("Growth" + growth);
    }

    void isNeedToLostWight(){
    int need = growth - 100;
    if(weight >= (need +5) && weight >= (need - 5))
    { System.out.println("Your weigth is normal");}
    else { System.out.println("You need to visit gym"); }
    }
}


