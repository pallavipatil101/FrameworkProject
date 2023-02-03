package actions;

import org.testng.Assert;
import base.Base;
import locators.Slider_locators;

public class Slider extends Base{
	
	Slider_locators sl = new Slider_locators();
	public String locationBefore;
	public String locationAfter;
	
	public void slider_location_before_drag() {
		locationBefore = sl.sliderValue().getAttribute("value");
	}
	
	public void dragSlider() {
		action().dragAndDropBy(sl.sliderButton(), 70, 0).build().perform();
	}
	
	public void slider_location_after_drag() {
		waitImplicitly();
		locationAfter = sl.sliderValue().getAttribute("value");
	}
	
	public void verify_dragdrop_successful() {
		Assert.assertNotEquals(locationBefore, locationAfter);
	}
}
