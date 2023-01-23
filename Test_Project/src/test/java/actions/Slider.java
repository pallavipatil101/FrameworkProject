package actions;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.testng.Assert;

import base.Base;
import locators.Slider_locators;

public class Slider extends Base{
	
	Slider_locators sl = new Slider_locators();
	public Point locationBefore;
	public Point locationAfter;
	
	public void slider_location_before_drag() {
		locationBefore = sl.sliderButton().getLocation();
	}
	
	public void dragSlider() {
		action().dragAndDropBy(sl.sliderButton(), 70, 0).build().perform();
	}
	
	public void slider_location_after_drag() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		locationAfter = sl.sliderButton().getLocation();
	}
	
	public void verify_dragdrop_successful() {
		Assert.assertNotEquals(locationBefore, locationAfter);
	}
}
