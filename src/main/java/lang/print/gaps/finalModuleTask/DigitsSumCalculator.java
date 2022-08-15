package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        String str = Integer.toString(number);
        //преобразовываем строку в массив
        char[] myArray = str.toCharArray();
        //перебираем все элементы массива
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            int c = myArray[i];
            int b = Character.digit(c, 10);
            sum = sum + b;
        }
        number = sum;
        System.out.println(number);
        }

    }
