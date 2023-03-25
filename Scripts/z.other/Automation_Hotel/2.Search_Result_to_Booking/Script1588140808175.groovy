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

'delay to wait product'
WebUI.delay(15)

'verify element already exists'
WebUI.verifyElementVisible(findTestObject('Page_Search_Result/lbl100_Search Result'))

'select view room'
WebUI.click(findTestObject('Page_Search_Result/btn_VIEW ROOM'))

'wait for element'
WebUI.waitForElementVisible(findTestObject('Page_Search_Result/btn_VIEW ROOM'), 10)

'select book now'
WebUI.click(findTestObject('Page_Search_Result/a_BOOK NOW'))

'switch to windows "Booking Page"'
WebUI.switchToWindowIndex(1)

WebUI.callTestCase(findTestCase('z.other/Automation_Hotel/4.Booking_Page'), [:], FailureHandling.STOP_ON_FAILURE)

