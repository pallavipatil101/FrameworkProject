package actions;

import java.time.Duration;
import base.Base;
import locators.ProgressBar_locators;

public class ProgressBar extends Base{
	ProgressBar_locators ps = new ProgressBar_locators();
	public String progressBefore;
	
	public void track_progress_before() {
		progressBefore = ps.trackProgress().getAttribute("aria-valuenow");
	}
	
	public void start() {
		scroll_to_element(ps.trackProgress());
		action().moveToElement(ps.startStopBtn()).click().build().perform();
	}
	
	public void stop() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		action().moveToElement(ps.startStopBtn()).click().build().perform();
	}
	
	public void compare_progress() {
		String progressAfter = ps.trackProgress().getAttribute("aria-valuenow");
		stringsNotEqual(progressBefore, progressAfter);
		System.out.println(progressBefore+"---"+progressAfter);
	}
}
