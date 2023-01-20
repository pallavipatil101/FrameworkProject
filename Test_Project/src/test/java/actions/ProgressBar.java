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
		scroll_to_element(ps.startStopBtn());
		ps.startStopBtn().click();
	}
	
	public void stop() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		ps.startStopBtn().click();
	}
	
	public void compare_progress() {
		String progressAfter = ps.trackProgress().getAttribute("aria-valuenow");
		stringsNotEqual(progressBefore, progressAfter);
	}
}
