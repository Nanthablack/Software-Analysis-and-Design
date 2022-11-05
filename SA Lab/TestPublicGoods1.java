class Goods{
    private String name;
    private int amount;
    private double cost;
    public void setName(String n) {
        name = n;
    }
    public void setAmount(int a) {
        amount = a;
    }
    public void setCost(double c){
        cost = c;
    }
    public void printGoods(){
        System.out.println(name+",amount ="+amount+",cost per unit  ="+cost);
    }
}

class TestPublicGoods1{
    public static void main(String[] args){
        Goods g1 = new Goods();
        Goods g2 = new Goods();

        g1.name = "PC";
        g1.amount = 5;
        g1.cost = 32100.50;
        g1.printGoods();

        g2.name = "NoteBook";
        g2.amount =4;
        g2.cost =64200.25;
        g2.printGoods();
    }
}