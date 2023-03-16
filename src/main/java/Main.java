public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long expected = 150;
        long actual = service.calcBonus(5_000, true);
        System.out.println("1." + expected + "==?==" + actual);

        expected = 30;
        actual = service.calcBonus(1_000, true);
        System.out.println("2." + expected + "==?==" + actual);

        long expectedRegistered = 500;
        long actualRegistered = service.calcBonus(1_000_000, true);
        System.out.println("3." + expectedRegistered + "==?==" + actualRegistered);


    }
}
