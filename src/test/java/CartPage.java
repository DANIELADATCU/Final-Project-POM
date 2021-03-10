import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {
    @FindBy(xpath = "/html/body/div/div[2]/main/div[3]/div/section/div/div[2]/button")
    private WebElement emptyCart;
    @FindBy(xpath = "/html/body/div/div[2]/main/div[3]/div/section/div/div/div/h3")
    private WebElement cartHeader;

    public CartPage(WebDriver driver) { super(driver); }

    public void clickEmptyCart() { this.emptyCart.click(); }
    public String getCartHeader() { return this.cartHeader.getText(); }
}
