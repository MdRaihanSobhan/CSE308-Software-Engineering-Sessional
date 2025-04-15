public class Vending_Machine {

    State sold_Out_State;
    State extra_Money_State;
    State less_Money_State;
    State no_Money_State;
    State sold_State;

    State current_State;

    private int product_Count;
    private int current_money;
    private int price;

    public State getSold_Out_State() {
        return sold_Out_State;
    }

    public void setSold_Out_State(State sold_Out_State) {
        this.sold_Out_State = sold_Out_State;
    }

    public State getExtra_Money_State() {
        return extra_Money_State;
    }

    public void setExtra_Money_State(State extra_Money_State) {
        this.extra_Money_State = extra_Money_State;
    }

    public State getLess_Money_State() {
        return less_Money_State;
    }

    public void setLess_Money_State(State less_Money_State) {
        this.less_Money_State = less_Money_State;
    }

    public State getNo_Money_State() {
        return no_Money_State;
    }

    public void setNo_Money_State(State no_Money_State) {
        this.no_Money_State = no_Money_State;
    }

    public State getSold_State() {
        return sold_State;
    }

    public void setSold_State(State sold_State) {
        this.sold_State = sold_State;
    }



    public State getCurrent_State() {
        return current_State;
    }

    public void setCurrent_State(State current_State) {
        this.current_State = current_State;
    }

    public int getProduct_Count() {
        return product_Count;
    }

    public void setProduct_Count(int product_Count) {
        this.product_Count = product_Count;
    }

    public int getCurrent_money() {
        return current_money;
    }

    public void setCurrent_money(int current_money) {
        this.current_money = current_money;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Vending_Machine(int product_Count, int price) {
        this.product_Count = product_Count;
        this.price = price;
        this.current_money= 0;

        sold_Out_State= new Sold_Out_State(this);
        extra_Money_State= new Extra_Money_State(this);
        less_Money_State = new Less_Money_State(this);
        sold_State= new Sold_State(this);
        no_Money_State = new No_Money_State(this);

        if(product_Count>0){
            this.current_State = no_Money_State;
        }

    }

    public boolean insert_Money(int money){
        return this.current_State.insert_Money(money);
    }

    public boolean return_Money(){
       return this.current_State.return_Money();
    }

    public boolean dispense_Product(){
        return this.current_State.dispense_Product();
    }

    @Override
    public String toString() {
        return "Vending_Machine{" +
                "current_State=" + current_State +
                ", product_Count=" + product_Count +
                ", current_money=" + current_money +
                ", price=" + price +
                '}';
    }
}
