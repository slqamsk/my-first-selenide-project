import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class InsertTextTest {
    @Test
    void test01() {
        open("https://www.saucedemo.com/");
        sleep(5_000);
        $(By.id("user-name")).sendKeys("Сергей");
        sleep(20_000);
    }
}

