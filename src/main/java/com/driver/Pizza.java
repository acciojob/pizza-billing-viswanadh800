package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private int extraCheesePrice;
    private int extraToppingsPrice;
  //  private int finalExtraCheesePrice;
   // private int finalExtraToppingsPrice;
    protected boolean isDelux;
    private int bagPrice;
    private boolean isBag;
    private boolean isCheese;
    private boolean isToppings;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        extraCheesePrice=80;
        bagPrice=20;
        if(isVeg){
            basePrice=300;
            extraToppingsPrice=70;
        }
        else{
            basePrice=400;
            extraToppingsPrice=120;
        }
        price=basePrice;
      //  finalExtraCheesePrice=0;
       // finalExtraToppingsPrice=0;
        isBag=false;
        isCheese=false;
        isToppings=false;
        isDelux=false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheese){
        //    finalExtraCheesePrice+=extraCheesePrice;
            price+=extraToppingsPrice;
            isCheese=true;
        }
    }

    public void addExtraToppings(){
      //  System.out.println("Added Extra Toppings");
        if(!isToppings){
        //    finalExtraToppingsPrice+=extraToppingsPrice;
            price+=extraToppingsPrice;
            isToppings=true;
        }
    }

    public void addTakeaway(){
        if(!isBag){
            isBag=true;
            price+=bagPrice;
        }
    }

    public String getBill(){
        StringBuilder sb=new StringBuilder();

        if(isDelux){
            sb.append("Base Price Of The Pizza: ");
            sb.append(basePrice+extraToppingsPrice+extraCheesePrice);
            sb.append('\n');
            if(isBag){
                sb.append("Paperbag Added: ");
                sb.append(bagPrice);
                sb.append('\n');
            }
            sb.append("Total Price: ");
            sb.append(price);
            sb.append('\n');
            return sb.toString();
        }

        sb.append("Base Price Of The Pizza: ");
        sb.append(basePrice);
        sb.append('\n');

        if(isCheese){
            sb.append("Extra Cheese Added: ");
            sb.append(extraCheesePrice);
            sb.append('\n');
        }
        if(isToppings){
            sb.append("Extra Toppings Added: ");
            sb.append(extraToppingsPrice);
            sb.append('\n');
        }
        if(isBag){
            sb.append("Paperbag Added: ");
            sb.append(bagPrice);
            sb.append('\n');
        }

        sb.append("Total Price: ");
        sb.append(price);
        sb.append('\n');

        return sb.toString();
    }
}
