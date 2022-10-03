public enum ListOfFood {
    COFFEE(45),TEA(36),WINE(135),SODA(26);

    private int price;

    ListOfFood(int price){
        this.price = price;
    }

    public int show_price(){
        return price;
    }
}
