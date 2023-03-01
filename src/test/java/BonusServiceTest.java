import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateFor0RegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 5_000;
        boolean registered = true;
        long expected = 150;

        // вызываем целевой метод:
        long actual = service.calcBonus(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):

        Assertions.assertEquals(expected, actual);
    }

    // подготавливаем данные:
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calcBonus(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calcBonus(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 5_000;
        boolean registered = false;
        long expected = 150;

        // вызываем целевой метод:
        long actual = service.calcBonus(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):

        Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAnd0nderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = false;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calcBonus(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):

        Assertions.assertEquals(expected, actual);
    }
}
