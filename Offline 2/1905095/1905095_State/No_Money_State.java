public class No_Money_State implements State{
    Vending_Machine vending_machine;

    public No_Money_State(Vending_Machine vending_machine) {
        this.vending_machine = vending_machine;
    }

    @Override
    public boolean insert_Money(int money) {

        this.vending_machine.setCurrent_money(this.vending_machine.getCurrent_money()+money);

        //this.current_money += money;

        if(this.vending_machine.getCurrent_money()<this.vending_machine.getPrice()){
            int less = this.vending_machine.getPrice() - this.vending_machine.getCurrent_money();
            System.out.println("Insert more BDT "+ less + " /= to get the product");

            if(this.vending_machine.getCurrent_money()>0){
                this.vending_machine.setCurrent_State(this.vending_machine.getLess_Money_State());
            }
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
            System.out.println("You haven't inserted any money");
            return false;
    }

    @Override
    public boolean turnProduct() {
            System.out.println("You can't get the product if you don't pay the price");
            return false;
    }

    @Override
    public boolean dispense_Product() {
            System.out.println("You can't get the product if you don't pay the price");
            return false;
    }

    @Override
    public String toString() {
        return "No Money State";
    }
}
