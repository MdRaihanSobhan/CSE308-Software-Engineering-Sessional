public class Sold_State implements State{
    Vending_Machine vending_machine;

    public Sold_State(Vending_Machine vending_machine) {
        this.vending_machine = vending_machine;
    }

    @Override
    public boolean insert_Money(int money) {
        System.out.println("Please wait, We're already giving you the product");
        return false;
    }

    @Override
    public boolean return_Money() {
        System.out.println("We're giving you the product , no money to return");
        return false;
    }

    @Override
    public boolean turnProduct() {
        return false;
    }

    @Override
    public boolean dispense_Product() {
        System.out.println("The product comes rolling out the slot");
        this.vending_machine.setProduct_Count(this.vending_machine.getProduct_Count()-1);
        if(this.vending_machine.getProduct_Count()==0){
            System.out.println("The machine is running out of product");
            this.vending_machine.setCurrent_State(this.vending_machine.getSold_Out_State());
        }
        else{
            this.vending_machine.setCurrent_State(this.vending_machine.getNo_Money_State());
        }
        this.vending_machine.setCurrent_money(this.vending_machine.getCurrent_money()-this.vending_machine.getPrice());
        return true;
    }
    public String toString() {
        return "Sold State";
    }
}
