import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrNumber.csv")

    public void testPositiveNumbers(int firstNumber, int secondNumber) {
        SQRService service = new SQRService();
        int sqrAmount = service.sqrCalculate(firstNumber, secondNumber);

    }


}
