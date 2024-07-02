public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("19231924", "IPhone 5");
        Phone phone3 = new Phone("939124821", "IPhone X", "0.302 кг");

        System.out.println(phone1.getNumber());
        System.out.println(phone1);

        String[] phoneNumbers = {"+7 912 142-31-23", "+7 951 536-34-17", "+7 912 812-86-15"};
        phone1.sendMessage(phoneNumbers);

        phone2.receiveCall("Дядя Гриша");
        phone3.receiveCall("ПЛЕМЯШ(БОРЬКА)", "+7 912 142-31-23");
    }
}
