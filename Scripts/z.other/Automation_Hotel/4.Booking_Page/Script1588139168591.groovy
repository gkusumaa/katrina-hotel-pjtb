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

'delay to wait already exists'
WebUI.delay(8)

'find element "Contact Information"'
WebUI.scrollToElement(findTestObject('Page_Booking/contact_person/h2_Contact Information'), 0)

WebUI.delay(3)

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

WebUI.delay(3)

'find element next guest || Room 2'
WebUI.scrollToElement(findTestObject('Page_Booking/guest_information/h3_Room 2'), 5)

WebUI.delay(3)

'select dropdown Title "Index 1 || Mr" (guest room: 2)'
WebUI.selectOptionByIndex(findTestObject('Page_Booking/guest_information/select_MR'), '1', FailureHandling.STOP_ON_FAILURE)

'set text first name "Prasetya" (guest room: 2)'
WebUI.setText(findTestObject('Page_Booking/guest_information/input_First Name_first name'), 'PRASETYA')

'set text last name "Hasan" (guest room: 2)'
WebUI.setText(findTestObject('Page_Booking/guest_information/input_Last Name_last name'), 'HASAN')

WebUI.delay(3)

//'check special request "High Floor"'
//WebUI.check(findTestObject('Page_Booking/guest_information/input_High Floor_ssr_value'))
//'select button confrim'
//WebUI.click(findTestObject('Page_Booking/guest_information/button_CONFIRM'), FailureHandling.STOP_ON_FAILURE)

//'wait for verify dialog'
//WebUI.waitForElementPresent(findTestObject('Page_Booking/Confrim_page/button_Confirm'), 5)

//'focus on button confrim (verify dialog)'
//WebUI.focus(findTestObject('Page_Booking/Confrim_page/button_Confirm'))

//'delay to wait already'
//WebUI.delay(5)

//'select button confrim (verify dialog)'
//WebUI.click(findTestObject('Page_Booking/Confrim_page/button_Confirm'))

