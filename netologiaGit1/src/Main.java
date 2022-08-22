public class Main {
    public static void main(String[] args) {


        int[] sales1 = {200, 300, 400};
        SalesManager Ivanov = new SalesManager(sales1);
        int max1 = Ivanov.max();

        int[] sales2 = {1200, 200, 1};
        SalesManager Petrov = new SalesManager(sales2);
        int max2 = Petrov.max();
        int averange = Petrov.average();

    }

    }
