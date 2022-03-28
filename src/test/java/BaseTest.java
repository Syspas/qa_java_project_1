import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {
    @BeforeEach
    public  void startUP(){
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        Configuration.browser = "firefox";
       //WebDriverManager.firefoxdriver().setup();
       //Configuration.browser = FIREFOX;
    }
}
