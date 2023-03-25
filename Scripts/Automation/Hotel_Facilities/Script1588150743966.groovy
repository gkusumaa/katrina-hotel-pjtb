import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'open browser'
WebUI.openBrowser('')

'resize window'
WebUI.maximizeWindow()

'set url'
WebUI.navigateToUrl('http://test-katrina.icore.studio')

'set username'
WebUI.setText(findTestObject('Page_Login/input_MEMBER LOGIN_user_name'), 'katrina_system@icore.studio')

'set password'
WebUI.setText(findTestObject('Page_Login/input_MEMBER LOGIN_user_password'), 'rahasia123')

'select button "Sign in"'
WebUI.submit(findTestObject('Page_Login/button_Sign In'))

'wait for element'
WebUI.waitForElementPresent(findTestObject('Page_Dashboard_Katrina/a_Hotel'), 10, FailureHandling.CONTINUE_ON_FAILURE)

'select tab "Hotel"'
WebUI.click(findTestObject('Page_Dashboard_Katrina/a_Hotel'), FailureHandling.STOP_ON_FAILURE)

'wait for element'
WebUI.waitForElementPresent(findTestObject('Page_Dashboard_Hotel/header/a_Transaction History'), 8, FailureHandling.STOP_ON_FAILURE)

//if select RETAIL
'select dropdown "Customer type: Retail", if select corporate please read SCRIPT'
WebUI.selectOptionByLabel(findTestObject('Page_Dashboard_Hotel/body/select_CustomerType'), 'Retail', false)

'verify option select label "Customer type: Retail"'
WebUI.verifyOptionSelectedByLabel(findTestObject('Page_Dashboard_Hotel/body/select_CustomerType'), 'Retail', false, 5)

'find element "Customer type"'
WebUI.scrollToElement(findTestObject('Page_Dashboard_Hotel/body/select_CustomerType'), 5)

//if select corporate, activate this line, but non-activate line RETAIL
//'select dropdown "Customer type: Corporate"'
//WebUI.selectOptionByLabel(findTestObject('Page_Dashboard_Hotel/body/select_CustomerType'), 'Corporate', false)
//'verify option select label "Customer type: Corporate"'
//WebUI.verifyOptionSelectedByLabel(findTestObject('Page_Dashboard_Hotel/body/select_CustomerType'), 'Corporate', false, 0)
//'click button "Select Corporate"'
//WebUI.click(findTestObject('Page_Dashboard_Hotel/body/cusType_corporate/button_Select Corporate'))
//'select corporate'
//WebUI.click(findTestObject('Page_Dashboard_Hotel/body/cusType_corporate/a_ICTPanorama'))
//
'set destination'
WebUI.setText(findTestObject('Page_Dashboard_Hotel/body/input_Your Destination_dropdown-input'), 'Jakarta')

'select destination'
WebUI.click(findTestObject('Page_Dashboard_Hotel/body/div_Jakarta'), FailureHandling.STOP_ON_FAILURE)

'select datepicker'
WebUI.click(findTestObject('Page_Dashboard_Hotel/body/img_CHECK IN_ui-datepicker-trigger'), FailureHandling.STOP_ON_FAILURE)

'wait for element'
WebUI.waitForElementPresent(findTestObject('Page_Dashboard_Hotel/body/date/a_Next'), 5, FailureHandling.STOP_ON_FAILURE)

//'next element'
//WebUI.click(findTestObject('Page_Dashboard_Hotel/body/date/a_Next'))
//'next element'
//WebUI.click(findTestObject('Page_Dashboard_Hotel/body/date/a_Next'))
'select date'
WebUI.click(findTestObject('Page_Dashboard_Hotel/body/date/a_28'))

'select dropdown nationality'
WebUI.setText(findTestObject('Page_Dashboard_Hotel/body/input_Nationality_dropdown-input'), 'Indonesia')

'select nationality'
WebUI.click(findTestObject('Page_Dashboard_Hotel/body/nationality/div_ID - Indonesia'), FailureHandling.STOP_ON_FAILURE)

'select dropdwon "Bed Type : Twin"'
WebUI.selectOptionByLabel(findTestObject('Page_Dashboard_Hotel/body/select_bed_type'), 'Twin', false)

'verify option select label "Bed Type: Twin"'
WebUI.verifyOptionSelectedByLabel(findTestObject('Page_Dashboard_Hotel/body/select_bed_type'), 'Twin', false, 5)

'select dropdwon "Rooms: 2"'
WebUI.selectOptionByLabel(findTestObject('Page_Dashboard_Hotel/body/select_room'), '2', false)

'verify option select label "Rooms: 2"'
WebUI.verifyOptionSelectedByLabel(findTestObject('Page_Dashboard_Hotel/body/select_room'), '2', false, 5)

'select button "Search"'
WebUI.click(findTestObject('Page_Dashboard_Hotel/body/button_SEARCH'))

'delay to wait product'
WebUI.delay(10)

'verify element already exists'
WebUI.verifyElementVisible(findTestObject('Page_Search_Result/lbl100_Search Result'))

'wait for element'
WebUI.waitForElementVisible(findTestObject('Page_Search_Result/btn_VIEW ROOM'), 0)

'select view room'
WebUI.click(findTestObject('Page_Search_Result/btn_VIEW ROOM'))

'select action'
WebUI.click(findTestObject('Page_Search_Result/btn_SELECT'))

'switch to windows "Hotel Detail"'
WebUI.switchToWindowIndex(1)

'Scroll to element'
WebUI.scrollToElement(findTestObject('Page_Hotel_Detail/div_'), 0)

'Only to action: Read description or facilities'
WebUI.click(findTestObject('Page_Hotel_Detail/a_Facilities'))

'Delay to page'
WebUI.delay(3)

'Scroll to element'
WebUI.scrollToElement(findTestObject('Page_Hotel_Detail/a_Facilities'), 0)

WebUI.verifyElementVisible(findTestObject('Page_Search_Result/div_Facilitites'), FailureHandling.STOP_ON_FAILURE)

'End process'
WebUI.delay(10)

