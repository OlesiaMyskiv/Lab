package classes;

class PremiumMember extends Member {
    private int points;

    public PremiumMember(String name, int age, String gender, int weight, int growth, int points) {
        super(name, age, gender, weight, growth);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void redeemPoints() {
        System.out.println(getName() + " accumulates " + points + " points.");
    }
}