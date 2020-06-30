package lambda;

public class LambdaExample {
    public static void main(String[] args) {
        // Anonymous Inner classes
        /**
         * Method Name
         * parameter list
         * return type
         * body
         */
        /*Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Thread");
            }
        });
        th.start();
        System.out.println("Inside Main Thread");*/

        // Lambda Approach
        /*Thread th = new Thread(() -> System.out.println("Inside Thread"));

        th.start();
        System.out.println("Inside Main Thread");*/

        // Effectively Final
        // int var = 1;
        int[] var = new int[] {1};
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Thread " + var[0]);
            }
        });

        var[0] = 6;
        //var = new int[] {3};

        th.start();
        System.out.println("Inside Main Thread");
    }
}
