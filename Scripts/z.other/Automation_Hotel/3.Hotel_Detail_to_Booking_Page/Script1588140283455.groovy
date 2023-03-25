import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'THIS TEST CASE FOR ACTION CHOOSE ROOM AND BOOKING'
WebUI.delay(10)

'Scroll to element'
WebUI.scrollToElement(findTestObject('Page_Hotel_Detail/div_'), 0)

'Only to action: room price and booking'
WebUI.click(findTestObject('Page_Hotel_Detail/a_Room Price'))

'Delay to page'
WebUI.delay(3)

'Scroll to element'
WebUI.scrollToElement(findTestObject('Page_Hotel_Detail/a_Room Price'), 0)

'Select button BOOK NOW'
WebUI.click(findTestObject('Page_Hotel_Detail/button_BOOK NOW'))

WebUI.callTestCase(findTestCase('z.other/Automation_Hotel/4.Booking_Page'), [:], FailureHandling.STOP_ON_FAILURE)

