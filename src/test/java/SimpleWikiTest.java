import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SimpleWikiTest {
    @Test
    void test01WordWebDriver() {
        open("https://ru.wikipedia.org/wiki/Selenium");
        //sleep(10_000);
        $("body").shouldHave(text("WebDriver"));
    }
    @Test
    void test02WordSelenide() {
        open("https://ru.wikipedia.org/wiki/Selenium");
        //sleep(10_000);
        $("body").shouldHave(text("Selenide"));
    }
}