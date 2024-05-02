public class Main {
    public static void main(String[] args) {

        int balance = 222;
        int pay = 1050;
        int bonus;

        if (pay > 1000) {
            bonus = (pay / 100);
        } else {
            bonus = 0;
        }

        int newBalance = (balance + pay + bonus);

        System.out.println("Клиент пополнил счёт на " + pay + " рублей — бонус равен " + bonus + " рублям, итоговая сумма на счету клиента — " + newBalance + " рублей");
    }
}
