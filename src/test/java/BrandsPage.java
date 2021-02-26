import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrandsPage extends PageObject {

    @FindBy(xpath = "/html/body/div/div[3]/main/div[2]/h1")
    private WebElement brandsPageHeader;
    @FindBy(css = ".flex-wrap > div:first-of-type > button:nth-child(5)")
    private WebElement randomBrandFromList;
    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[2]/div[2]/a")
    private WebElement siteLogoButton;

    public BrandsPage(WebDriver driver) { super(driver); }
    public String getBrandsHeaderText() { return this.brandsPageHeader.getText();}
    public void clickRandomBrandFromList() { this.randomBrandFromList.click();}
    public void clickOnLogoButton() { this.siteLogoButton.click();}
}
