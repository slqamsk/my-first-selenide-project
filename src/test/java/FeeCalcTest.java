import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FeeCalcTest {
    @Test
    void test01Regina(){
        sleep(5000);
        open("https://slqa.ru/cases/fc/v01/");
        $("input[name=sum]").sendKeys("12312");
        $(By.name("submit")).click();

        sleep(3_000);
        $("input[name=sum]").setValue("748.00");
        $(By.name("submit")).click();

        sleep(3_000);
    }

    @Test
    void test01Roman() {
        open("https://slqa.ru/cases/fc/v01/");
        sleep(5_000);
        $(By.name("sum")).sendKeys("1000");
        $(By.name("submit")).click();
        sleep(5000);
        back();

        sleep(5000);

        $(By.name("sum")).setValue("2000");
        $(By.name("submit")).click();
        sleep(5000);
        back();

        sleep(5000);

        $(By.name("sum")).type("3000");
        $(By.name("submit")).click();
        sleep(5000);
    }
}
