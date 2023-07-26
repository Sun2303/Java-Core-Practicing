package baymax.project;

import org.apache.commons.lang3.RandomStringUtils;

public class LearnTs {

    public static void main(String[] args) {
        String emailAddress = "suncd." + RandomStringUtils.randomNumeric(3) + "@mailinator.com";
        String randomString = RandomStringUtils.randomAlphabetic(5);
        String randomStringNumber = RandomStringUtils.randomAlphanumeric(5);
        System.out.println(emailAddress);
        System.out.println(randomString);
        System.out.println(RandomStringUtils.randomAlphabetic(5));
    }
}
