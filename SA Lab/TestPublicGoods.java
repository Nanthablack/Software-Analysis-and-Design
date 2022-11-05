class Goods{
    public String name;
    public int amount;
    public double cost;
    public void printGoods(){
        System.out.println(name+",amount ="+amount+",cost per unit  ="+cost);
    }
}

class TestPublicGoods{
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