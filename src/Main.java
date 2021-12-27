public class Main {
    public static void main(String[] args) {
        int clientAccount = 500; //клиентский счет
        int add = 2000; //сумма пополнения

        int bonus;
        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }

        int total = clientAccount + add + bonus;

        System.out.println("Итоговый счет: " + total + " руб."); System.out.println("Сумма бонуса: " + bonus + " руб.");
    }
}
