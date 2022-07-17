public class SQRService {
    public int sqrCalculate(int firstNumber, int secondNumber) {
        int sqrAmount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= firstNumber & i * i <= secondNumber) {
                sqrAmount++;
            }

        }
        return (sqrAmount);
    }
}
