import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) { System.setProperty("webdriver.chrome.driver", "chromedriver"); }

    @Test(testName = "Search product")
    public static void searchForProduct() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.populateSearchField();
        webForm.clickOnSearchButton();
        Utils.waitForElementToLoad(2);
        SecondPage secondPage = new SecondPage(driver);
        Assert.assertEquals(secondPage.getResultsHeader(), "Rezultate cautare : Telefoane");
    }

    @Test(testName = "Daily offer products")
    public static void clickOnDailyOfferProduct() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        Utils.waitForElementToLoad(3);
        webForm.clickOnFirstProductOfDailyOffer();
    }

    @Test(testName = "Verify top bar functionality")
    public static void verifyTopBarFunctionality() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        Utils.waitForElementToLoad(3);
        webForm.clickOnBrandsButton();
        Utils.waitForElementToLoad(3);
        BrandsPage brandsPage = new BrandsPage(driver);
        Assert.assertEquals(brandsPage.getBrandsHeaderText(), "Branduri disponibile pe Altex");
    }

    @Test(testName = "Click on brand from brandlist")
    public  static void clickOnBrandFromList() {
        driver.get(Utils.BASE_URL);
        navigateToBrandsPage();
        BrandsPage brandsPage = new BrandsPage(driver);
        brandsPage.clickRandomBrandFromList();
    }

    @Test(testName = "Navigate to homepage using icon button")
    public static void returnToHomePage() {
        driver.get(Utils.BASE_URL);
        navigateToBrandsPage();
        BrandsPage brandsPage = new BrandsPage(driver);
        brandsPage.clickOnLogoButton();
        Utils.waitForElementToLoad(2);
        FirstPage webForm = new FirstPage(driver);
        Assert.assertEquals(webForm.getMottoHeader(), "Cel mai mic pret din Romania! Daca gasesti in alta parte mai ieftin primesti de doua ori diferenta.");
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

    /*
    Navigation functions - these functions have the sole purpose of helping us to navigate through the website and reduce code redundancy
     */

    private static void navigateToBrandsPage() {
        FirstPage webForm = new FirstPage(driver);
        Utils.waitForElementToLoad(3);
        webForm.clickOnBrandsButton();
        Utils.waitForElementToLoad(3);
    }

    private static void navigateToSecondPage() {

    }
}
