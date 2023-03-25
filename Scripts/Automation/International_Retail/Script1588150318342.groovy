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
WebUI.waitForElementPresent(findTestObject('Page_Dashboard_Katrina/a_Hotel'), 5, FailureHandling.STOP_ON_FAILURE)

'select tab "Hotel"'
WebUI.click(findTestObject('Page_Dashboard_Katrina/a_Hotel'), FailureHandling.STOP_ON_FAILURE)

'wait for element'
WebUI.waitForElementPresent(findTestObject('Page_Dashboard_Hotel/header/a_Transaction History'), 5, FailureHandling.STOP_ON_FAILURE)

'select dropdown "Customer type: Retail"'
WebUI.selectOptionByLabel(findTestObject('Page_Dashboard_Hotel/body/select_CustomerType'), 'Retail', false)

'verify option select label "Customer type: Retail"'
WebUI.verifyOptionSelectedByLabel(findTestObject('Page_Dashboard_Hotel/body/select_CustomerType'), 'Retail', false, 0)

'find element "Customer type"'
WebUI.scrollToElement(findTestObject('Page_Dashboard_Hotel/body/select_CustomerType'), 0)

'set destination'
WebUI.setText(findTestObject('Page_Dashboard_Hotel/body/input_Your Destination_dropdown-input'), 'Manila')

'select destination'
WebUI.click(findTestObject('Page_Dashboard_Hotel/body/div_Jakarta'), FailureHandling.STOP_ON_FAILURE)

'select datepicker'
WebUI.click(findTestObject('Page_Dashboard_Hotel/body/img_CHECK IN_ui-datepicker-trigger'), FailureHandling.STOP_ON_FAILURE)

'wait for element'
WebUI.waitForElementPresent(findTestObject('Page_Dashboard_Hotel/body/date/a_Next'), 3, FailureHandling.STOP_ON_FAILURE)

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
WebUI.verifyOptionSelectedByLabel(findTestObject('Page_Dashboard_Hotel/body/select_bed_type'), 'Twin', false, 0)

'select dropdwon "Rooms: 2"'
WebUI.selectOptionByLabel(findTestObject('Page_Dashboard_Hotel/body/select_room'), '2', false)

'verify option select label "Rooms: 2"'
WebUI.verifyOptionSelectedByLabel(findTestObject('Page_Dashboard_Hotel/body/select_room'), '2', false, 0)

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

'select book now'
WebUI.click(findTestObject('Page_Search_Result/a_BOOK NOW'))

'switch to windows "Booking Page"'
WebUI.switchToWindowIndex(1)

'delay to wait already exists'
WebUI.delay(5)

'find element "Contact Information"'
WebUI.scrollToElement(findTestObject('Page_Booking/contact_person/h2_Contact Information'), 0)

'select dropdown Title "Index 2 || Mrs" (contact information)'
WebUI.selectOptionByIndex(findTestObject('Page_Booking/contact_person/select_MR                                                                                                          MRS'), 
    '2', FailureHandling.STOP_ON_FAILURE)

'set text first name "Amanda" (contact information)'
WebUI.setText(findTestObject('Page_Booking/contact_person/input_First Name _first name'), 'Amanda')

'set text last name "Rizky" (contact information)'
WebUI.setText(findTestObject('Page_Booking/contact_person/input_Last Name _last name'), 'Rizki')

'set text email address (contact information)'
WebUI.setText(findTestObject('Page_Booking/contact_person/input_Email _email'), 'gea.kusuma@icore.studio')

'set text mobile phone (contact information)'
WebUI.setText(findTestObject('Page_Booking/contact_person/input_Mobile Phone _mobile phone'), '08998131516')

'set text phone number (contact information)'
WebUI.setText(findTestObject('Page_Booking/contact_person/input_Phone _phone'), '0274655271')

'check first guest "same as" contact information || I am the guest'
WebUI.check(findTestObject('Page_Booking/guest_information/input'), FailureHandling.STOP_ON_FAILURE)

'find element next guest || Room 2'
WebUI.scrollToElement(findTestObject('Page_Booking/guest_information/h3_Room 2'), 0)

'select dropdown Title "Index 1 || Mr" (guest room: 2)'
WebUI.selectOptionByIndex(findTestObject('Page_Booking/guest_information/select_MR'), '1', FailureHandling.STOP_ON_FAILURE)

'set text first name "Prasetya" (guest room: 2)'
WebUI.setText(findTestObject('Page_Booking/guest_information/input_First Name_first name'), 'PRASETYA')

'set text last name "Hasan" (guest room: 2)'
WebUI.setText(findTestObject('Page_Booking/guest_information/input_Last Name_last name'), 'HASAN')

//'check special request "High Floor"'
//WebUI.check(findTestObject('Page_Booking/guest_information/input_High Floor_ssr_value'))

'select button confrim'
WebUI.click(findTestObject('Page_Booking/guest_information/button_CONFIRM'), FailureHandling.STOP_ON_FAILURE)

'wait for verify dialog'
WebUI.waitForElementPresent(findTestObject('Page_Booking/Confrim_page/button_Confirm'), 2)

'focus on button confrim (verify dialog)'
WebUI.focus(findTestObject('Page_Booking/Confrim_page/button_Confirm'))

'delay to wait already'
WebUI.delay(3)

'select button confrim (verify dialog)'
WebUI.click(findTestObject('Page_Booking/Confrim_page/button_Confirm'))

