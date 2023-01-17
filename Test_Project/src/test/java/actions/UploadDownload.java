package actions;

import base.Base;
import locators.UploadDownload_locators;

public class UploadDownload extends Base{
	UploadDownload_locators upl = new UploadDownload_locators();
	
	public void upload() {
		send(upl.upload(), System.getProperty("user.dir")+"/src/test/resources/UploadFile.txt");
	}
	
	public void download() {
		upl.download().click();
	}
}
