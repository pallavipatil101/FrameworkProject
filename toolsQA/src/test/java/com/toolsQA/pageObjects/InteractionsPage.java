package com.toolsQA.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractionsPage {
	WebDriver driver;
	
	public InteractionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//SORTABLE
	@FindBy(xpath = "//span[@class='text'][text()= 'Sortable']")
	private WebElement sortable;
	
	@FindBy(xpath = "//*[@class='nav nav-tabs']/a")
	private List<WebElement> tabsListSortable;
	
	@FindBy(xpath = "//*[@id=\"demo-tabpane-list\"]/div/div")
	private List<WebElement> sortableListElements;
	
	@FindBy(xpath = "//*[@id=\"demo-tabpane-grid\"]/div/div/div")
	private List<WebElement> sortableGridElements;
	
	
	//SELECTABLE
	@FindBy(xpath = "//span[@class='text'][text()= 'Selectable']")
	private WebElement selectable;
	
	@FindBy(xpath = "//*[@class = 'nav nav-tabs']/a")
	private List<WebElement> tabsListSelectable;
	
	@FindBy(xpath = "//*[@id=\"verticalListContainer\"]/li")
	private List<WebElement> selectableListElements;
	
	@FindBy(xpath = "//*[@id=\"gridContainer\"]//descendant::li")
	private List<WebElement> selectableGridElements;
	
	
	//RESIZABLE
	@FindBy(xpath = "//span[@class='text'][text()= 'Resizable']")
	private WebElement resizable;
	
	@FindBy(xpath = "//*[@id=\"resizableBoxWithRestriction\"]/span")
	private WebElement resize1;
	
	@FindBy(xpath = "//*[@id=\"resizable\"]/span")
	private WebElement resize2;
	
	
	//DROPPABLE
	@FindBy(xpath = "//span[@class='text'][text()= 'Droppable']")
	private WebElement droppable;
	
	@FindBy(xpath = "//*[@class='nav nav-tabs']/a")
	private List<WebElement> tabsListDroppable;
	
	@FindBy(id = "draggable")
	private WebElement dragSimple;
	
	@FindBy(id = "droppable")
	private WebElement dropCommon;
	
	@FindBy(xpath = "//*[@id=\"droppable\"]/p")
	private WebElement commonDropMsg;
	
	@FindBy(id = "acceptable")
	private WebElement dragAcceptable;
	
	@FindBy(id = "notAcceptable")
	private WebElement dragNotAcceptable;
	
	@FindBy(id = "dragBox")
	private WebElement dragBox;
	
	@FindBy(id = "notGreedyDropBox")
	private WebElement outerDropNotGreedy;
	
	@FindBy(id = "notGreedyInnerDropBox")
	private WebElement innerDropNotGreedy;
	
	@FindBy(id = "greedyDropBox")
	private WebElement outerDropGreedy;
	
	@FindBy(id = "greedyDropBoxInner")
	private WebElement innerDropGreedy;
	
	@FindBy(id = "revertable")
	private WebElement dragRevertabl;
	
	@FindBy(id = "notRevertable")
	private WebElement dragNonRevertabl;
	
	
	//DRAGGABLE
	@FindBy(xpath = "//span[@class='text'][text()= 'Dragabble']")
	private WebElement draggable;
	
	@FindBy(xpath = "//*[@class='nav nav-tabs']/a")
	private List<WebElement> tabsListDraggable;
	
	@FindBy(id = "dragBox")
	private WebElement dragabbleSimple;
	
	@FindBy(id = "restrictedX")
	private WebElement draggableXAxis;
	
	@FindBy(id = "restrictedY")
	private WebElement draggableYAxis;	
	
	@FindBy(xpath = "//*[@id=\"containmentWrapper\"]/div")
	private WebElement draggableBoxContained;
	
	@FindBy(xpath = "//*[@id=\"draggableExample-tabpane-containerRestriction\"]/div[2]/span")
	private WebElement draggablePageContained;
	
	@FindBy(id = "cursorCenter")
	private WebElement draggableCurserCenter;
	
	@FindBy(id = "cursorTopLeft")
	private WebElement draggableCurserTopLeft;
	
	@FindBy(id = "cursorBottom")
	private WebElement draggableCurserBottom;
	
	
	//SORTABLE
	public WebElement sortable() {return sortable;}
	public List<WebElement> tabsListSortable() {return tabsListSortable;}
	public List<WebElement> sortableListElements(){return sortableListElements; }
	public List<WebElement> sortableGridElements(){return sortableGridElements; }
		
	//SELECTABLE
	public WebElement selectable() {return selectable;}
	public List<WebElement> tabsListSelectable() {return tabsListSelectable;}
	public List<WebElement> selectableListElements(){return selectableListElements; }
	public List<WebElement> selectableGridElements(){return selectableGridElements; }
		
	//RESIZABLE
	public WebElement resizable() {return resizable;}
	public WebElement resize1() {return resize1;}
	public WebElement resize2() {return resize2;}
	
	//DROPPABLE
	public WebElement droppable() {return droppable;}
	public List<WebElement> tabsListDroppable() {return tabsListDroppable;}
	public WebElement dragSimple() {return dragSimple;}
	public WebElement dropCommon() {return dropCommon;}
	public WebElement commonDropMsg() {return commonDropMsg;}
	public WebElement dragAcceptable() {return dragAcceptable;}
	public WebElement dragNotAcceptable() {return dragNotAcceptable;}
	public WebElement dragBox() {return dragBox;}
	public WebElement outerDropNotGreedy() {return outerDropNotGreedy;}
	public WebElement innerDropNotGreedy() {return innerDropNotGreedy;}
	public WebElement outerDropGreedy() {return outerDropGreedy;}
	public WebElement innerDropGreedy() {return innerDropGreedy;}
	public WebElement dragRevertabl() {return dragRevertabl;}
	public WebElement dragNonRevertabl() {return dragNonRevertabl;}
	
	//DRAGGABLE
	public WebElement draggable() {return draggable;}
	public List<WebElement> tabsListDraggable() {return tabsListDraggable;}
	public WebElement draggableSimple() {return dragabbleSimple;}
	public WebElement draggableXAxis() {return draggableXAxis;}
	public WebElement draggableYAxis() {return draggableYAxis;}
	public WebElement draggableBoxContained() {return draggableBoxContained;}
	public WebElement draggablePageContained() {return draggablePageContained;}
	public WebElement draggableCurserCenter() {return draggableCurserCenter;}
	public WebElement draggableCurserTopLeft() {return draggableCurserTopLeft;}
	public WebElement draggableCurserBottom() {return draggableCurserBottom;}
}
