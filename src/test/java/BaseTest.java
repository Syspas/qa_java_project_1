import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Browsers.FIREFOX;

import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;


public class BaseTest {
    @Before
    public void setBrowser()
    {
        //Загружаем веб драйвер из GIT
        WebDriverManager.firefoxdriver().setup();


        //Запускаем тест в браузере FIREFOX
       Configuration.browser ="firefox" ;
       Configuration.browserSize = "1920x1080";
        //Для быстрого ввода текста в поля
        Configuration.fastSetValue = true;
        //Запускать скрытый браузер
        Configuration.headless=true;


    }

}
