public class People {
    public static void main(String[] args){
        System.out.println("Населення України станом на 1 січня 2021 року: 43 528 136 осіб");

        Country nar = new Country();
        Country sm = new Country();

        nar.People = 271984;
        sm.People = 714263;

        double People = nar.People - sm.People;

        System.out.println("Приріст населення у 2021 році:"+People);
    }
}
