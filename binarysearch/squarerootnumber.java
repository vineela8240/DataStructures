package binarysearch;

public class squarerootnumber {
    public static double findSquareRoot(int number, double precision) {


        double left = 0;
        double right = number;
        double mid = 0;

        while ((right - left) > precision) {
            mid = left + (right - left) / 2;
            double midSquared = mid * mid;

            if (midSquared == number) {
                return mid;
            } else if (midSquared < number) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return (left + right) / 2;
    }

    public static void main(String[] args) {
        int number = 50;
        double precision = 0.00001;
        double sqrt = findSquareRoot(number, precision);
        System.out.println("The square root of " + number + " is approximately: " + sqrt);
    }

}
