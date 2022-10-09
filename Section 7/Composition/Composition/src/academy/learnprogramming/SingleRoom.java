package academy.learnprogramming;

public class SingleRoom {

    private Wardrobe wardrobe;
    private Table table;
    private Bed bed;

    public SingleRoom(Wardrobe wardrobe, Table table, Bed bed) {
        this.wardrobe = wardrobe;
        this.table = table;
        this.bed = bed;
    }

    public void myDay() {
        wardrobe.getDressed();
        makeMoney();
        bed.sleep();
    }
    private void makeMoney() {
        table.work();
    }

}
