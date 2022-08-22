public class SalesManager {


    protected long[] sales;


    public SalesManager(long[] sales) {

        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long average() {
        long maxValue = 0;
        long minValue = sales[0];
        long sum = 0;

        for (int j = 0; j < sales.length; j++) {
            if (sales[j] > maxValue) { maxValue = sales[j];
            }
            if (sales[j] < minValue) { minValue = sales[j];
            }
            sum += sales[j];
        }
long averageM =  (sum - maxValue - minValue ) / (sales.length-2);
        return averageM;
    }

    }


