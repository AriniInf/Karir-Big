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

'Click Detail'
WebUI.click(findTestObject('Dashboard CEO/a_Detail'))

'Memastikan Nama Applicant'
WebUI.verifyElementText(findTestObject('Dashboard CEO/div_Arini Indah Nur Fuadah'), 'Arini Indah Nur Fuadah')

'Memastikan Email Applicant'
WebUI.verifyElementText(findTestObject('Dashboard CEO/div_arini.infgmail.com'), 'arini.inf@gmail.com')

'Memastikan Phone Number Applicant'
WebUI.verifyElementText(findTestObject('Dashboard CEO/div_08787667887'), '08787667887')

'Memastikan Description Applicant'
WebUI.verifyElementText(findTestObject('Dashboard CEO/div_saya ingin melamar sebagai Quality Assurance'), 'saya ingin melamar sebagai Quality Assurance')

'Memastikan Status Applicant'
WebUI.verifyElementText(findTestObject('Dashboard CEO/div_hrd'), 'hrd')

'Click Dashboard'
WebUI.click(findTestObject('Dashboard CEO/a_Dashboard'))

