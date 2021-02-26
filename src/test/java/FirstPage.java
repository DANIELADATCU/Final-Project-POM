import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends PageObject {
    private final String SEARCH_STRING_NAME = "Telefoane";

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[2]/div[4]/form/div/div[1]/input")
    private WebElement searchField;
    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[2]/div[4]/form/div/div[2]/button")
    private WebElement searchButton;
    @FindBy(css = "#oferte-zilnice .flex-wrap > div:first-of-type")
    private WebElement firstProductDailyOffers;
    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div[2]/ul/li[3]/a")
    private WebElement promotionsButton;
    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[1]/div")
    private WebElement mottoHeader;


    public FirstPage(WebDriver driver) {
        super(driver);
    }
    public void populateSearchField() {
        this.searchField.sendKeys(SEARCH_STRING_NAME);
    }
    public void clickOnSearchButton() {
        this.searchButton.click();
    }
    public void clickOnBrandsButton() {this.promotionsButton.click();}
    public String getMottoHeader() { return this.mottoHeader.getText(); }
    public void clickOnFirstProductOfDailyOffer() {
        Utils.waitForElement(driver, this.firstProductDailyOffers);
        this.firstProductDailyOffers.click();
    }
}
