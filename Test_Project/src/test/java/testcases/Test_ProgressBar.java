package testcases;

import org.testng.annotations.Test;

import actions.HomePage;
import actions.ProgressBar;
import base.Base;

public class Test_ProgressBar extends Base{
	ProgressBar pb = new ProgressBar();
	
	@Test(priority = 0)
	public void navigate_to_progressbar() {
		HomePage hp = new HomePage();
		hp.navigate_to_widgets().navigate_to_progressbar();
	}
	
	@Test(priority = 1)
	public void track_progress_before_start() {
		pb.track_progress_before();
		pb.start();
		pb.stop();
		pb.compare_progress();
	}
}
