import java.util.List;

public class Statistics<T extends Number> {

    public static <T extends Number> double average(List<T> list) {
        double sum = 0;
        for (T e: list) {
            sum += e.doubleValue();
        }
        return sum / list.size();
    }

    public static <T extends Number & Comparable<? super T>> T min(List<T> list) {
        T minValue = null;
        for (T e: list) {
            if (minValue == null) minValue = e;
            if (minValue.compareTo(e) > 0) {
                minValue = e;
            }
        }
        return minValue;
    }

    public static <T extends Number & Comparable<? super T>> T max(List<T> list) {
        T minValue = null;
        for (T e: list) {
            if (minValue == null) minValue = e;
            if (minValue.compareTo(e) < 0) {
                minValue = e;
            }
        }
        return minValue;
    }
}
