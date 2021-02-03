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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('finance/04-iban/creation-iban-physique-morale-conseiller/ct02-verifier-creation-iban-morale'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('finance/ct01-authentification'), [('username') : GlobalVariable.UserNameGestionnaire, ('mp') : GlobalVariable.Mdp], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/24-moderation_iban/page_iad/a_Backoffice'))

WebUI.click(findTestObject('finance/24-moderation_iban/page_iad/a_Annuaire'))

WebUI.setText(findTestObject('finance/24-moderation_iban/page_iad/input_France_mat-input-0'), '2020')

WebUI.sendKeys(findTestObject('finance/24-moderation_iban/page_iad/input_France_mat-input-0'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('finance/24-moderation_iban/page_iad/button_othman-manel_mat-menu-trigger-mat-ic_1387e6'))

WebUI.click(findTestObject('finance/24-moderation_iban/page_iad/button_dition'))

WebUI.click(findTestObject('finance/24-moderation_iban/page_iad/a_coordonnes-bancaires'))

WebUI.click(findTestObject('finance/24-moderation_iban/page_iad/p_en-attente'))

WebUI.delay(5)

WebUI.click(findTestObject('finance/23-moderation-iban-morale/page_iad/label_Modrer'))

WebUI.click(findTestObject('finance/23-moderation-iban-morale/page_iad/div_Le-compte-indiqu-correspond-au-conseill_83e567'))

WebUI.click(findTestObject('finance/23-moderation-iban-morale/page_iad/div_Le n IBAN est prsent_mat-slide-toggle-b_6ed508'))

WebUI.click(findTestObject('finance/23-moderation-iban-morale/page_iad/div_Le document fourni est lisible dans sa _e35bd3'))

WebUI.click(findTestObject('finance/23-moderation-iban-morale/page_iad/div_bic-ou-swift-est-prsent_mat-slide-to_118632'))

WebUI.click(findTestObject('finance/23-moderation-iban-morale/page_iad/div_Le document fourni est un RIB_mat-slide_070dad'))

WebUI.click(findTestObject('finance/23-moderation-iban-morale/page_iad/span_Valider'))

not_run: WebUI.click(findTestObject('finance/23-moderation-iban-morale/page_iad/span_Confirmer'))

WebUI.closeBrowser()

