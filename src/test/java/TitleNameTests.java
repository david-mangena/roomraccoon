import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TitleNameTests extends BaseTest{
    @Test
    public void addTitleSuccessfulTest(){
        homePage.clickAddBtn();
        homePage.enterTitle();
        homePage.enterDescription();
        homePage.clickSubmitBtn();
        assertTrue(homePage.addedTitleTxt().contains("In God we trust"));
    }

    @Test
    public void viewAddedTitle(){
        homePage.clickView();
        Assert.assertEquals(homePage.viewTitleTxt(),"");
    }
}
