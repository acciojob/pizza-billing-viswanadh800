package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int finalExtraCheesePrice;
    private int finalExtraToppingsPrice;
    private int bagPrice;
    private boolean isBag;
    private boolean isCheese;
    private boolean isToppings;
    protected boolean isDelux;
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
        finalExtraCheesePrice=0;
        finalExtraToppingsPrice=0;
        isBag=false;
        isCheese=false;
        isToppings=false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        finalExtraCheesePrice+=extraCheesePrice;
        price+=extraToppingsPrice;
        isCheese=true;
    }

    public void addExtraToppings(){
        finalExtraToppingsPrice+=extraToppingsPrice;
        price+=extraToppingsPrice;
        isToppings=true;
    }

    public void addTakeaway(){
        if(!isBag){
            isBag=true;
            price+=bagPrice;
        }
    }

    public String getBill(){
        StringBuilder sb=new StringBuilder();

        sb.append("Base Price Of The Pizza: ");
        sb.append(basePrice);
        sb.append('\n');

        if(isCheese){
            sb.append("Extra Cheese Added: ");
            sb.append(finalExtraCheesePrice);
            sb.append('\n');
        }
        if(isToppings){
            sb.append("Extra Toppings Added: ");
            sb.append(finalExtraToppingsPrice);
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
