public class Main {
    public static void main(String[] args) {
        int tobalance = 2950;
        int bonus = 0;

        if (tobalance > 1000) {
            bonus = tobalance / 100;
        }
        System.out.println(bonus);
    }
}