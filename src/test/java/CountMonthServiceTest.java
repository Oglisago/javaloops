import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaloops.services.CountMonthService;

public class CountMonthServiceTest {

    @ParameterizedTest
   @CsvFileSource(files ="src/test/resources/count.csv")
    public void test (int expected, int income, int expenses, int threshold) {
        CountMonthService service = new CountMonthService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
