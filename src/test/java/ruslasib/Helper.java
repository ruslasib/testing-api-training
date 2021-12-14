package ruslasib;

import com.github.javafaker.Faker;

public class Helper {

    private static Faker faker = new Faker();

    public static String GenerateName() {
        return faker.name().firstName();
    }

    public static String GenerateEmail() {
        return faker.name().firstName() + "@" + faker.name().firstName() + ".com";
    }
}
