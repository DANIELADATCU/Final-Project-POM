import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends PageObject{

    private final String SEARCH_EMAIL = "danielatodireanu@yahoo.com";
    private final String SEARCH_PASSWORD = "Daniela_27";
    private final String PRODUCT = "smartwatch";


    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[2]/div[3]/div[1]/a/div[3]/span")
    private WebElement LoginButton;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/form/input[1]")
    private WebElement EmailField;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/form/input[2]")
    private WebElement PasswordField;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/form/div[3]/span/button/div/div/div")
    private WebElement AuthenticationButton;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[2]/div[4]/form/div/div[1]/input")
    private WebElement SearchField;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div[2]/div[4]/form/div/div[2]/button/div/div/div")
    private WebElement SearchButton;

    public LoginPage(WebDriver driver) { super(driver);}

    public void searchLoginButton(){ this.LoginButton.click();}

    public void populateSearchEmail() { this.EmailField.sendKeys(SEARCH_EMAIL);}

    public void populateSearchPassword() { this.PasswordField.sendKeys(SEARCH_PASSWORD);}

    public void searchAuthenticationButton(){ this.AuthenticationButton.click();}

    public void SearchSearchField(){ this.SearchField.click();}

    public void PopulateSearchField1(){ this.SearchField.sendKeys(PRODUCT);}

    public void SearchSearchButton() { this.SearchButton.click();}


}

