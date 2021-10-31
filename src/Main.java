public class Main {
    public static void main(String[] args){
        int startBalance = 100;
        int income = 1_200;
        int newBalance = startBalance+income;
        int bonus;
        if (income >= 1_000) {
            bonus = income / 100 * 1;
        } else {
            bonus = 0;
        }
        System.out.println("Баланс");
        System.out.println(newBalance);
        System.out.println("Начислено бонусов");
        System.out.println(bonus);
    }
}