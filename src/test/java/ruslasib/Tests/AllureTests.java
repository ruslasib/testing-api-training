package ruslasib.Tests;

import io.qameta.allure.Allure;
import org.testng.annotations.Test;

public class AllureTests {

    @Test
    public void AllureTest(){
        Allure.step("Это шаг теста", () -> {
            Step1();
            Step2();
        });
    }

    public void Step1(){
        System.out.println("Выполняется Step1");
    }

    public void Step2(){
        System.out.println("Выполняется Step2");
    }
}
