public class Sold_Out_State implements State{
    Vending_Machine vending_machine;

    public Sold_Out_State(Vending_Machine vending_machine) {
        this.vending_machine = vending_machine;
    }

    @Override
    public boolean insert_Money(int money) {
        System.out.println("The product is sold out , no money can be received");
        return false;
    }

    @Override
    public boolean return_Money() {
        return false;
    }

    @Override
    public boolean turnProduct() {
        return false;
    }

    @Override
    public boolean dispense_Product() {
        System.out.println("Error! Sold out. No product dispensed");
        return false;
    }
    public String toString() {
        return "Sold Out State";
    }
}
