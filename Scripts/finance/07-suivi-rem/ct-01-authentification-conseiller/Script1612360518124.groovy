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

WebUI.navigateToUrl('https://p13.demo.iadholding.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('finance/04-suivi-de-rem/button_accder'))

WebUI.setText(findTestObject('finance/04-suivi-de-rem/input_identifiant_username'), GlobalVariable.conseillerrem)

WebUI.setEncryptedText(findTestObject('finance/04-suivi-de-rem/input_mot-de-passe_password'), GlobalVariable.Mdp)

WebUI.click(findTestObject('finance/04-suivi-de-rem/input_Mot-de-passe_submit'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/button_dmarrer'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/a_facebook_iad-concession'))

WebUI.delay(5)

