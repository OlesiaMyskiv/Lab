public class Finances {
    public static void main(String[] args){

        Country zarp = new Country();
        Country day = new Country();
        Country robdn = new Country();

        zarp.Finances = 14313;
        day.Finances = 22;
        robdn.Finances = 13;

        double Finances = zarp.Finances/robdn.Finances * day.Finances;

        System.out.println("Розрахунок середньоденної зарплати в 2021 році:"+Finances);
    }
}
