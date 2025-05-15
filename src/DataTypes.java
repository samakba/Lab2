import java.util.List;

public class DataTypes {
    //  TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static long sum(List<Integer> numbers) {
        long s = 0L;
        if (numbers == null) {
            return  0L;
        }
        // below is a "foreach" loop which iterates through numbers
        for (Integer x : numbers) {
            if (x != null) {
                s += x;
            }
        }
        return s;
    }
}
