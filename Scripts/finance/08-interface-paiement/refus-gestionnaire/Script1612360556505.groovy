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

WebUI.callTestCase(findTestCase('finance/05-rapprochement_bancaire/ct-01-authentification-gestionnaire'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/moderation/a_Factures  Paiement'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/moderation/a_Modration des paiements agents'))

WebUI.clearText(findTestObject('Object Repository/finance/05-interface-paiement/moderation/input_Ple_mat-input-6'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/05-interface-paiement/moderation/div_gestionnaire-tous'))

WebUI.click(findTestObject('finance/05-interface-paiement/moderation/span_Statut de la demande de paiement'))

WebUI.click(findTestObject('finance/05-interface-paiement/moderation/mat-option_Cr'))

WebUI.clickOffset(findTestObject('finance/05-interface-paiement/moderation/i_search'), 100, 100)

not_run: WebUI.setText(findTestObject('finance/05-interface-paiement/moderation/input_Recherche_invoicenumber'), GlobalVariable.NumFacture)

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/moderation/button_Rechercher'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/moderation/span_M O_mat-button-wrapper'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/moderation/span_Validation'))

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('finance/05-interface-paiement/moderation/div_Le document est lisible _mat-radio-oute_055aef'), 
    0)

WebUI.check(findTestObject('finance/05-interface-paiement/refus/div_ non1'))

WebUI.check(findTestObject('finance/05-interface-paiement/refus/div_non2'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/refus/span_Refuser'))

WebUI.waitForElementVisible(findTestObject('Object Repository/finance/05-interface-paiement/refus/span_Confirmer'), 0)

not_run: WebUI.closeBrowser()

