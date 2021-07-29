import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplyURL)

WebUI.setText(findTestObject('Apply/input_Name_name'), '')

WebUI.setText(findTestObject('Apply/input_Email address_email'), '')

WebUI.setText(findTestObject('Apply/input_Phone number_phone'), '')

WebUI.setText(findTestObject('Apply/textarea_Description_description'), '')

WebUI.click(findTestObject('Apply/button_Apply'))

WebUI.verifyElementText(findTestObject('Apply/span_The name field is required'), 'The name field is required.')

WebUI.verifyElementText(findTestObject('Apply/span_The email field is required'), 'The email field is required.')

WebUI.verifyElementText(findTestObject('Apply/span_The phone field is required'), 'The phone field is required.')

WebUI.verifyElementText(findTestObject('Apply/span_The description field is required'), 'The description field is required.')

