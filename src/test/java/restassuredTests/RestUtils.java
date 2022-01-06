package restassuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
    public static String getEmployeeName() {
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("John"+generatedString);
    }

    public static int getRandom(int max){
         return (int) (Math.random()*max);
        }

    public static int getage(int min){
        return (int) (Math.random()*min);
    }

    public static String empSal() {
        String generatedString = RandomStringUtils.randomNumeric(5);
        return (generatedString);
    }

    public static String empAge() {
        String generatedString = RandomStringUtils.randomNumeric(5);
        return (generatedString);
    }


}
