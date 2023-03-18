public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int bagPackPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isTakeAwayOpted=false;
    
    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    /*
    public void getPizzaPrice(){
        System.out.println(this.price);
    }
    */

    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price += extraCheesePrice;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded=true;
        this.price += extraToppingsPrice;
    }
    public void takeAway(){
        isTakeAwayOpted=true;
        this.price += bagPackPrice;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra Cheese added: "+extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra toppings added: "+extraToppingsPrice+"\n";
        }
        if(isTakeAwayOpted){
            bill += "Take away opted: "+bagPackPrice+"\n";
        }
        bill += "Bill: "+this.price+ "\n";
        System.out.println(bill);
    }
}
/*pizza(Base)=veg(299)and non veg(399) 
 * addons = add extra cheese(100)
 * extra-topping(100)
 * take-away(20rs for bag)
*/

/*Delux-Pizza =veg(399)
 * non -veg(499)
 */
