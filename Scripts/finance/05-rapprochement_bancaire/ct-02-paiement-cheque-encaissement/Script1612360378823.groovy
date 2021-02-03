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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('finance/05-rapprochement_bancaire/ct-01-authentification-gestionnaire'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/a_factures-paiement'))

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/a_rapprochements-bancaires'))

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/div_date-debut'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/div_numro-facture'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/div_rapproche-nonrapproche'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/div_type-facture'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/input_date_enddate'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/input_libelle_ref'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/input_mode-paiement_label'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/input_numro-dossier_amount'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/input_type-facture_foldernumber'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/mat-card_encaissements'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/mat-card_recherche'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/mat-icon-pencil'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/span_mode-paiement'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/span_rechercher'), 0)

WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/span_rinitialiser-filtres'), 0)

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/span_ajouter'))

WebUI.setText(findTestObject('finance/01-paiement-cheque-encaissement/input_date-rception-chque_transmitter'), 'ymanci')

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/input_metteur_checkdate'))

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/svg_date_du_chque_mat-datepicker_dab978'))

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/div_17'))

WebUI.setText(findTestObject('finance/01-paiement-cheque-encaissement/input_date-chque_bank'), 'cih')

WebUI.setText(findTestObject('finance/01-paiement-cheque-encaissement/input_banque_checknumber'), '85214')

WebUI.setText(findTestObject('finance/01-paiement-cheque-encaissement/input_numro_de_chque_amount'), GlobalVariable.MontantTTCRapp)

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/span_cration'))

WebUI.click(findTestObject('finance/01-paiement-cheque-encaissement/span_confirmer'))

WebUI.delay(5)

WebUI.closeBrowser()

