package classes;

class Trainer {
    public String name;
    public int age;
    public String gender;
    public String skills;
    public int workInAge;

    public Trainer(String name, int age, String gender, String skills ,int workInAge) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.workInAge = workInAge;
    }

   void moreInfo(){
       System.out.println();
       System.out.println("——————————————————————————————");
       System.out.println();

       System.out.println("Trainer name: " + name);
       System.out.println("Age:" + age);
       System.out.println("Gender: " + gender);
       System.out.println("Coaching skills: " + skills);
       System.out.println("Has been working for " + workInAge + " years");

       System.out.println();
       System.out.println("——————————————————————————————");
       System.out.println();
   }

}


