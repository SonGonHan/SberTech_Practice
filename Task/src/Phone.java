public class Phone {

    private String number, model, weight;

    Phone() {
        number = "Номер неизвестен";
        model = "Модель неизвестна";
        weight = "Вес неизвестен";
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        weight = "Вес неизвестен";
    }

    public Phone(String number, String model, String weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ": " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String[] phoneNumbers) {
        System.out.println("Номера телефонов: ");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    @Override
    public String toString() {
        return "Номер: " + number +
                "\nМодель: " + model +
                "\nВес: " + model;
    }

}
