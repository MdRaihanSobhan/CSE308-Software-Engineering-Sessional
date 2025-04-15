public class Extra_Money_State implements State{
    Vending_Machine vending_machine;

    public Extra_Money_State(Vending_Machine vending_machine) {
        this.vending_machine = vending_machine;
    }

    @Override
    public boolean insert_Money(int money) {
        System.out.println("No money is received , already you have inserted extra money, wait for your product and change");
        return false;
    }

    @Override
    public boolean return_Money() {
        int to_return = this.vending_machine.getCurrent_money()-this.vending_machine.getPrice();
        this.vending_machine.setCurrent_money(this.vending_machine.getCurrent_money()-to_return);
        System.out.println("BDT "+ to_return+ "/= returned to the customer");
        this.vending_machine.setCurrent_State(vending_machine.getSold_State());
        return true;
    }

    @Override
    public boolean turnProduct() {
        return false;
    }

    @Override
    public boolean dispense_Product() {
        System.out.println("Error! No product dispensed");
        return false;
    }
    public String toString() {
        return "Extra Money State";
    }
}
