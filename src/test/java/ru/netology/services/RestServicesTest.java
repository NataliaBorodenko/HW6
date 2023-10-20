package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServicesTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/rest.csv")

    public void TestCase(int income, int expenses, int threshold, int expected) {
        RestServices services = new RestServices();
        int actual = services.calcRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
