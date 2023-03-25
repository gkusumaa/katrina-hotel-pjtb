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

//FYI,
//Terdapat 3 proses yang masing-masing punya test case tersendiri
//test case 1: Login - Dashboard General - Dashboard Hotel - Search Result to Booking - Booking page - END
//test case 2: Login - Dashboard General - Dashboard Hotel - Search Result to Hotel Detail - Hotel Detail - END (tdk ada proses booking)
//test case 3: Login - Dashboard General - Dashboard Hotel - Search Result to Hotel Detail - Hotel Detail to Booking page - END
//pd test case ke-1 di khususkan untuk melakukan proses booking dg view room di halaman search result
//pd test case ke-2 di khususkan untuk proses view description dan hotel facilities
//pd test case ke-3 di khususkan untuk proses booking dengan melewati halaman search result
//sesuaikan test case yang diinginkan dengan cukup mengganti pada baris CALL TEST CASE
'open browser'
WebUI.openBrowser('')

'resize window'
WebUI.maximizeWindow()

'set url'
WebUI.navigateToUrl('http://test-katrina.icore.studio')

WebUI.delay(5)

'set username'
WebUI.setText(findTestObject('Page_Login/input_MEMBER LOGIN_user_name'), 'katrina_system@icore.studio')

'set password'
WebUI.setText(findTestObject('Page_Login/input_MEMBER LOGIN_user_password'), 'rahasia123')

'select button "Sign in"'
WebUI.submit(findTestObject('Page_Login/button_Sign In'))

WebUI.delay(5)

WebUI.callTestCase(findTestCase('z.other/Automation_Katrina/2.Dashboard_General'), [:], FailureHandling.STOP_ON_FAILURE)

