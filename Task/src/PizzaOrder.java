public class PizzaOrder {

    private String pizzaName;
    private PizzaSizes pizzaSize;
    private boolean sauce;
    private String adress;
    private boolean isAccepted;

    public PizzaOrder(String pizzaName, PizzaSizes pizzaSize, boolean sauce, String adress) {
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.sauce = sauce;
        this.adress = adress;
    }

    public void order() {
        if (!isAccepted) {
            System.out.println("Заказ принят. " + pizzaSize + " \"" + pizzaName + "\" " +
                    (sauce ? "с соусом " : "без соуса ") + "на адрес " + adress);
            isAccepted = true;
        }
        else {
            System.out.println("Заказ уже принят");
        }
    }

    public void cancel() {
        System.out.println(isAccepted ? "Заказ отменен" : "Заказ не был принят");
        isAccepted = false;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public PizzaSizes getPizzaSize() {
        return pizzaSize;
    }

    public boolean getSauce() {
        return sauce;
    }

    public String getAdress() {
        return adress;
    }

    public boolean getAccepted() {
        return isAccepted;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public void setPizzaSize(PizzaSizes pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return (isAccepted ? "Заказ принят" : "Заказ не был принят. ") + pizzaSize + " \"" + pizzaName + "\" " +
                (sauce ? "с соусом " : "без соуса ") + "на адрес " + adress;
    }
}
