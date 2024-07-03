public class Main {
    public static void main(String[] args) {
        PizzaOrder order1 = new PizzaOrder("Аль-Капчоне", PizzaSizes.BIG, true, "Ярославская 101");
        order1.cancel();
        order1.order();
        order1.cancel();
        System.out.println(order1);
        order1.setAdress("Ленинградская 93");
        order1.setPizzaName("Пепперони");
        order1.setPizzaSize(PizzaSizes.SMALL);
        order1.setSauce(false);
        System.out.println(order1.getAccepted());
        System.out.println(order1.getAdress());
        System.out.println(order1.getPizzaName());
        System.out.println(order1.getPizzaSize());
        System.out.println(order1.getSauce());
    }
}
