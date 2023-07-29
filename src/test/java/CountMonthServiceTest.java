import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaloops.services.CountMonthService;

public class CountMonthServiceTest {

    @Test
    public void test1 () {
        CountMonthService service = new CountMonthService();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2 () {
        CountMonthService service = new CountMonthService();

        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }

}
