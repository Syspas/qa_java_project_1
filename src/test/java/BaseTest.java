import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Browsers.FIREFOX;
import org.junit.Before;


public class BaseTest {
    @Before
    public void setBrowser()
    {
        //Запускаем тест в браузере FIREFOX
       // Configuration.browser = FIREFOX ;
        Configuration.browserSize = "1920x1080";

    }

}
