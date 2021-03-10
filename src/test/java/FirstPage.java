import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends PageObject {
    private final String SEARCH_STRING_NAME = "Telefoane";
    private final String SEARCH_STRING_INVALID = "dsadasdsa";

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
    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[2]/div[3]/div[2]/div/div[2]/p")
    private WebElement emptyCartPopUp;
    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[2]/div[3]/div[2]/a")
    private WebElement cartButton;

    public FirstPage(WebDriver driver) {
        super(driver);
    }
    public void populateSearchField() { this.searchField.sendKeys(SEARCH_STRING_NAME); }
    public void populateSearchFieldWithInvalidProduct() { this.searchField.sendKeys(SEARCH_STRING_INVALID);}
    public void clickOnSearchButton() { this.searchButton.click(); }
    public void clickOnBrandsButton() {this.promotionsButton.click();}
    public void clickOnCart() {this.cartButton.click();}
    public String getMottoHeader() { return this.mottoHeader.getText(); }
    public String getEmptyCartPopUp() { return this.emptyCartPopUp.getText(); }
    public void clickOnFirstProductOfDailyOffer() {
        Utils.scrollToElement(driver, this.firstProductDailyOffers);
        this.firstProductDailyOffers.click();
    }
}
