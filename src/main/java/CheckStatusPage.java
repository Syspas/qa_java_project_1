import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckStatusPage {
//  статус заказа  "NotFound"
@FindBy(how = How.CLASS_NAME,using = "Track_NotFound__6oaoY")
public SelenideElement popupError;

public boolean isErrorMessageDisplayed(){
    return popupError.isDisplayed();

}



}

