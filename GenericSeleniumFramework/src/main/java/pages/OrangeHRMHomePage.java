package pages;

import org.openqa.selenium.By;
import enums.WaitStrategy;

public final class OrangeHRMHomePage extends BasePage {

    private final By linkWelcome = By.xpath("//p[@class='oxd-userdropdown-name']");
    private final By linkLogout = By.xpath("//a[text()='Logout']");

    public OrangeHRMHomePage clickWelcome(){
        click(linkWelcome, WaitStrategy.PRESENCE);
        return this;
    }

    public OrangeHRMLoginPage clickLogout(){
        //Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS); //alternative of thread.sleep
        click(linkLogout, WaitStrategy.CLICKABLE);
        return new OrangeHRMLoginPage();
    }



}
