package pl.sant.util;


public class Tools {

    public static String generateRandomEmail() {
        int min1 = 10;
        int max1 = 50;
        int min2 = 60;
        int max2 = 100;

        int random_int1 = (int)(Math.random() * (max1 - min1 + 1) + min1);
        int random_int2 = (int)(Math.random() * (max2 - min2 + 1) + min2);

        return "user_" + String.valueOf(random_int1) + "test_" + String.valueOf(random_int2) + "@gmail.com";

    }

}
