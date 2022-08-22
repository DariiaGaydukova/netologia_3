public class Main {
    public static void main(String[] args) {


        long[] sales1 = {200, 300, 400};
        SalesManager Ivanov = new SalesManager(sales1);
        long max1 = Ivanov.max();


        long[] sales2 = {1200, 200, 100};
        SalesManager Petrov = new SalesManager(sales2);
        long max2 = Petrov.max();
        long average = Petrov.average();


    }

    }
