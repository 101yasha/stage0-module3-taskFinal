package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String str = Integer.toString(number);
        StringBuilder newStr = new StringBuilder(str);
        StringBuilder reverseStr = newStr.reverse();
        System.out.println(reverseStr);
    }
}
