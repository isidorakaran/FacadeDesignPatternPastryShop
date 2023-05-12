public class Employee {
    private PastryShop cheesecake;
    private PastryShop muffin;
    private PastryShop pudding;
    public Employee() {
        cheesecake=new Cheesecake();
        muffin=new Muffin();
        pudding=new Pudding();
    }

    public void cheesecakeSale(){
        cheesecake.name();
        cheesecake.price();
    }

    public void muffinSale(){
        muffin.name();
        muffin.price();
    }

    public void puddingSale(){
        pudding.name();
        pudding.price();
    }

}
