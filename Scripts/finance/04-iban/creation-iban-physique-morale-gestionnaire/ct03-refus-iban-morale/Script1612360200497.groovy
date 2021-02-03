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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('finance/04-iban/creation-iban-physique-morale-conseiller/ct02-verifier-creation-iban-morale'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('finance/ct01-authentification'), [('username') : GlobalVariable.UserNameGestionnaire, ('mp') : GlobalVariable.Mdp], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/27-refus-iban/page_iad/a_Backoffice'))

WebUI.click(findTestObject('finance/27-refus-iban/page_iad/a_Annuaire'))

WebUI.setText(findTestObject('finance/27-refus-iban/page_iad/input_France_mat-input-0'), '2020')

WebUI.click(findTestObject('finance/27-refus-iban/page_iad/span_othman-manel_mat-button-wrapper'))

WebUI.click(findTestObject('finance/27-refus-iban/page_iad/button_dition'))

WebUI.click(findTestObject('finance/27-refus-iban/page_iad/a_coordonnes-bancaires'))

WebUI.click(findTestObject('finance/27-refus-iban/page_iad/label_Modrer'))

WebUI.click(findTestObject('finance/27-refus-iban/page_iad/span_prvenir-conseiller'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('finance/27-refus-iban/page_iad/p_Refus'), 0)

WebUI.closeBrowser()

