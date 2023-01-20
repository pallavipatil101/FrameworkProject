package actions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.WebElement;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import base.Base;
import locators.BrokenLinks_locators;

public class BrokenLinks extends Base{
	
	BrokenLinks_locators bll = new BrokenLinks_locators();
	String url = "";
	HttpURLConnection httpcon = null;
	int respCode;
	String respMsg = "";
	
	public void findBrokenLink() {
		for(WebElement link : bll.linksList())
		{
			url = link.getAttribute("href");
			if(url == null || url.isEmpty())
			{
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			
			try 
			{
				httpcon = (HttpURLConnection)(new URL(url).openConnection());
				httpcon.connect();
				respMsg = httpcon.getResponseMessage();
				respCode = httpcon.getResponseCode();

				if(respCode >= 400)
				{
					System.out.println(url+"--"+respCode+"--"+respMsg+"--is a broken link.");
				}
				else
				{
					System.out.println(url+"--"+respCode+"--"+respMsg+"--is a NOT a broken link.");
				}
			} 
			catch (IOException e) 
			{				
				e.printStackTrace();
			} 
		}
	}
	
	public void findBrokenImages() {
		for(WebElement img : bll.images())
		{	
			System.out.println("SIZE>>>>>>"+img.getSize());
			String src = img.getAttribute("src");
			try 
			{
				httpcon = (HttpURLConnection)(new URL(src).openConnection());
				httpcon.connect();
				respMsg = httpcon.getResponseMessage();
				respCode = httpcon.getResponseCode();

				if(respCode != 200)
				{
					System.out.println(src+"--"+respCode+"--"+respMsg+"--is a broken Image.");
				}
				else
				{
					System.out.println(src+"--"+respCode+"--"+respMsg+"--is a NOT a broken Image.");
				}
			} 
			catch (IOException e) 
			{				
				e.printStackTrace();
			} 
			
		}
	}
}
