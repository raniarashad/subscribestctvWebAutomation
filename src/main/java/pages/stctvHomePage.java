package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class stctvHomePage extends PageBase{
    public stctvHomePage(WebDriver driver) {
        super(driver);
    }

    public String LightSubscriptionBahrinCurrencyPrice;
    public String BasicSubscriptionBahrinCurrencyPrice;
    public String PremiumSubscriptionBahrinCurrencyPrice;
    public String LightSubscriptionSACurrencyPrice;
    public String BasicSubscriptionSACurrencyPrice;
    public String PremiumSubscriptionSACurrencyPrice;
    public String LightSubscriptionKWCurrencyPrice;
    public String BasicSubscriptionKWCurrencyPrice;
    public String PremiumSubscriptionKWCurrencyPrice;
    @FindBy(id = "country")
    WebElement country;

    @FindBy(id = "bh")
    WebElement bahrinCountry;

    @FindBy(id = "sa")
    WebElement SACountry;

    @FindBy(id = "kw")
    WebElement KwCountry;

    @FindBy(id = "name-لايت")
    public WebElement lightSubscription;

    @FindBy(id = "name-الأساسية")
    public WebElement basicSubscription;

    @FindBy(id = "name-بريميوم")
    public WebElement premiumSubscription;

    @FindBy(id = "currency-لايت")
    WebElement lightCurrency;

    @FindBy(id = "currency-الأساسية")
    WebElement basicCurrency;

    @FindBy(id = "currency-بريميوم")
    WebElement premiumCurrency;

    public void VerifyBahrinCountry()
    {
        ClickButton(country);
        ClickButton(bahrinCountry);
        LightSubscriptionBahrinCurrencyPrice = lightCurrency.getText();
        BasicSubscriptionBahrinCurrencyPrice = basicCurrency.getText();
        PremiumSubscriptionBahrinCurrencyPrice = premiumCurrency.getText();
    }
    public void VerifySACountry()
    {
        ClickButton(country);
        ClickButton(SACountry);
        LightSubscriptionSACurrencyPrice = lightCurrency.getText();
        BasicSubscriptionSACurrencyPrice = basicCurrency.getText();
        PremiumSubscriptionSACurrencyPrice = premiumCurrency.getText();
    }
    public void VerifyKWCountry()
    {
        ClickButton(country);
        ClickButton(KwCountry);
        LightSubscriptionKWCurrencyPrice = lightCurrency.getText();
        BasicSubscriptionKWCurrencyPrice = basicCurrency.getText();
        PremiumSubscriptionKWCurrencyPrice = premiumCurrency.getText();
    }
}
