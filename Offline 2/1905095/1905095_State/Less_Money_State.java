public class Less_Money_State implements State{
    Vending_Machine vending_machine;

    public Less_Money_State(Vending_Machine vending_machine) {
        this.vending_machine = vending_machine;
    }

    @Override
    public boolean insert_Money(int money) {

        this.vending_machine.setCurrent_money(this.vending_machine.getCurrent_money()+money);

        //this.current_money += money;

        if(this.vending_machine.getCurrent_money()<this.vending_machine.getPrice()){
            int less = this.vending_machine.getPrice() - this.vending_machine.getCurrent_money();
            System.out.println("Insert more BDT "+ less + "/= to get the product");
        }
        else if(this.vending_machine.getCurrent_money()>this.vending_machine.getPrice()){
            this.vending_machine.setCurrent_State(this.vending_machine.getExtra_Money_State());
            this.vending_machine.return_Money();
            this.vending_machine.dispense_Product();
        }
        else if(this.vending_machine.getCurrent_money()==this.vending_machine.getPrice()){
            this.vending_machine.setCurrent_State(this.vending_machine.getSold_State());
            this.vending_machine.dispense_Product();
        }
        return true;
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
        return false;
    }
    public String toString() {
        return "Less Money State";
    }
}
