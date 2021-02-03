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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('finance/05-rapprochement_bancaire/ct-01-authentification-gestionnaire'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/03-fcm/a_factures-paiement'))

WebUI.click(findTestObject('finance/03-fcm/a_facturation-indication-daffaire'))

not_run: WebUI.click(findTestObject('finance/03-fcm/span_slectionner-statut'))

not_run: WebUI.click(findTestObject('finance/03-fcm/span_paye'))

WebUI.click(findTestObject('finance/03-fcm/integration/input_concat-indication-daffaire'))

WebUI.setText(findTestObject('finance/03-fcm/integration/input_concat-indication-daffaire'), '21313')

WebUI.click(findTestObject('finance/03-fcm/span_rechercher'))

WebUI.scrollToElement(findTestObject('finance/03-fcm/integration/div_gestionnaire-burger-ia'), 2)

WebUI.click(findTestObject('finance/03-fcm/integration/div_gestionnaire-burger-ia'))

WebUI.verifyElementText(findTestObject('finance/03-fcm/integration/p_statut-paye'), 'Payée')

WebUI.click(findTestObject('finance/03-fcm/a_facturer'))

WebUI.verifyElementText(findTestObject('finance/03-fcm/td_rgle'), 'Réglée')

montantHT = WebUI.getText(findTestObject('finance/03-fcm/td_montant-ht_registre'))

montantHT1 = montantHT.replace(' ', '')

montantHT2 = montantHT1.replace(',', '.')

montantHT3 = Double.parseDouble(montantHT2)

print(montantHT3)

GlobalVariable.montantHTregistre = montantHT3

not_run: WebUI.delay(350)

WebUI.refresh()

WebUI.click(findTestObject('finance/03-fcm/button_rgle_mat-menu-trigger-mat-icon-butto_2062be'))

WebUI.verifyElementPresent(findTestObject('finance/03-fcm/button_visualiser-fcm'), 0)

WebUI.click(findTestObject('finance/03-fcm/button_visualiser-fcm'))

WebUI.switchToWindowIndex(1)

x = WebUI.getText(findTestObject('finance/03-fcm/label_num-dossier-fcm'))

GlobalVariable.Numdossier = x

WebUI.verifyElementPresent(findTestObject('finance/03-fcm/mat-card_informations-transaction-typ_7216cd'), 0)

WebUI.verifyElementPresent(findTestObject('finance/03-fcm/mat-card_synthsecommission-ht-34100-commis_4019eb'), 0)

WebUI.verifyElementPresent(findTestObject('finance/03-fcm/mat-card_entresortie-daffaire-immobilirecoe_df1a51'), 0)

WebUI.verifyElementPresent(findTestObject('finance/03-fcm/mat-card_apporteur_daffaireintervenantbase_431099'), 0)

WebUI.delay(5)

not_run: WebUI.closeBrowser()

