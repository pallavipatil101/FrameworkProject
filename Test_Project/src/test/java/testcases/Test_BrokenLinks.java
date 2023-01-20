package testcases;

import org.testng.annotations.Test;

import actions.BrokenLinks;
import actions.HomePage;
import base.Base;

public class Test_BrokenLinks extends Base{
	BrokenLinks bl = new BrokenLinks();
	
	@Test(priority = 0)
	public void navigate_to_BrokenLinks() {
		HomePage hp = new HomePage();	
		hp.navigate_to_Elements().navigate_to_broken_links();
	}
	
	@Test(priority = 1)
	public void findBrokenLink() {
		bl.findBrokenLink();
	}
	
	@Test(priority = 2)
	public void findBrokenImages() {
		bl.findBrokenImages();
	}
	
}
