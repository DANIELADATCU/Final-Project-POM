import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {

    @FindBy(xpath = "/html/body/div/div[3]/main/div/div[2]/div[1]/div[2]/div[2]/div/div/div[4]/div/div[1]/div[1]/div/div/button")
    private WebElement addToCart;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/h2")
    private WebElement addToCartHeader;

    @FindBy(xpath = "/html/body/div[2]/div[2]/i")
    private WebElement closePopUpButton;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[2]/div[3]/div[2]/a")
    private WebElement clickOnCart;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/a/div/div/div")
    private WebElement clickOnViewCart;


    public ProductPage (WebDriver driver) { super(driver);}

    public void addProductToCart() {
        Utils.scrollToElement(driver, this.addToCart);
        this.addToCart.click();
    }
    public String getAddToCartHeader() { return this.addToCartHeader.getText(); }
    public void clickOnPopUpButton() { this.closePopUpButton.click();}
    public void clickOnCart() {
        Utils.scrollToElement(driver, this.clickOnViewCart);
        this.clickOnCart.click(); }
    public void clickClickOnViewCart() { this.clickOnViewCart.click();}

}
