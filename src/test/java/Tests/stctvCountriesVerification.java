package Tests;

import Helper.DataReaderExcelSheet;
import Helper.ScreenRecorder;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.stctvHomePage;

import java.io.IOException;

public class stctvCountriesVerification extends TestBase{

    stctvHomePage object;

//    @DataProvider(name = "ExcelData")
//    public Object[][] LoginData() throws IOException {
//        // get data from ExcelReader Class
//        DataReaderExcelSheet Reader = new DataReaderExcelSheet();
//        return Reader.getExcelData(0);
//    }

    @Test(priority = 1)
    public void BahrinCurrencyVerification() throws Exception {
        ScreenRecorder.startRecording("Verify Bahrin currency and subscription sections are displayed correctly");
        object = new stctvHomePage(driver);
        object.VerifyBahrinCountry();
        Assert.assertTrue(object.lightSubscription.isDisplayed());
        Assert.assertTrue(object.basicSubscription.isDisplayed());
        Assert.assertTrue(object.premiumSubscription.isDisplayed());
        Assert.assertTrue(object.LightSubscriptionBahrinCurrencyPrice.contains("دينار بحريني"));
        Assert.assertTrue(object.BasicSubscriptionBahrinCurrencyPrice.contains("دينار بحريني"));
        Assert.assertTrue(object.PremiumSubscriptionBahrinCurrencyPrice.contains("دينار بحريني"));
        ScreenRecorder.stopRecording();

    }
    @Test(priority = 2)
    public void SACurrencyVerification() throws Exception {
        ScreenRecorder.startRecording("Verify SA currency and subscription sections are displayed correctly");
        object = new stctvHomePage(driver);
        object.VerifySACountry();
        Assert.assertTrue(object.lightSubscription.isDisplayed());
        Assert.assertTrue(object.basicSubscription.isDisplayed());
        Assert.assertTrue(object.premiumSubscription.isDisplayed());
        Assert.assertTrue(object.LightSubscriptionSACurrencyPrice.contains("ريال سعودي"));
        Assert.assertTrue(object.BasicSubscriptionSACurrencyPrice.contains("ريال سعودي"));
        Assert.assertTrue(object.PremiumSubscriptionSACurrencyPrice.contains("ريال سعودي"));
        ScreenRecorder.stopRecording();
    }
    @Test(priority = 3)
    public void KWCurrencyVerification() throws Exception {
        ScreenRecorder.startRecording("Verify KW currency and subscription sections are displayed correctly");
        object = new stctvHomePage(driver);
        object.VerifyKWCountry();
        Assert.assertTrue(object.lightSubscription.isDisplayed());
        Assert.assertTrue(object.basicSubscription.isDisplayed());
        Assert.assertTrue(object.premiumSubscription.isDisplayed());
        Assert.assertTrue(object.LightSubscriptionKWCurrencyPrice.contains("دينار كويتي"));
        Assert.assertTrue(object.BasicSubscriptionKWCurrencyPrice.contains("دينار كويتي"));
        Assert.assertTrue(object.PremiumSubscriptionKWCurrencyPrice.contains("دينار كويتي"));
        ScreenRecorder.stopRecording();
    }
}
