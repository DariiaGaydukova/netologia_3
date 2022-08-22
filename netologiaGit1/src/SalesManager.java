public class SalesManager {


    protected int[] sales;


    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int average() {
        int maxValue = 0;
        int minValue = sales[0];
        int sum = 0;

        for (int j = 0; j < sales.length; j++) {
            if (sales[j] > maxValue) { maxValue = sales[j];
            }
            if (sales[j] < minValue) { minValue = sales[j];
            }
            sum += sales[j];
        }
int averageM =  (sum - maxValue - minValue ) / (sales.length-2);
        return averageM;
    }

    }


