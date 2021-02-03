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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('finance/08-interface-paiement/authentification'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/04-suivi-de-rem/reccurence/a_mon-compte'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/comissions-facturables/a_suivi-rmunration-iagl'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/bloc-commissions-facturables'))

WebUI.verifyElementPresent(findTestObject('finance/04-suivi-de-rem/reccurence/mat-card-title_rcurrences'), 0)

WebUI.click(findTestObject('finance/04-suivi-de-rem/reccurence/mat-card-title_rcurrences'))

WebUI.verifyElementClickable(findTestObject('finance/04-suivi-de-rem/reccurence/span_choisir les montants'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/reccurence/span_choisir les montants'))

WebUI.scrollToElement(findTestObject('finance/05-interface-paiement/span_tout-slectionner-ia'), 0)

WebUI.click(findTestObject('finance/05-interface-paiement/span_tout-slectionner-ia'))

WebUI.verifyElementPresent(findTestObject('finance/05-interface-paiement/a_valider-ia'), 0)

WebUI.verifyElementClickable(findTestObject('finance/05-interface-paiement/a_valider-ia'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/05-interface-paiement/a_valider-ia'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('finance/05-interface-paiement/mat-card-header_facturation'), 0)

WebUI.verifyElementPresent(findTestObject('finance/05-interface-paiement/input_facturation_mat-input-0'), 0)

Seq = (Math.random() * (9 - 6))
seq1 = (Seq * 100)
jdFacture = ((seq1) as int)
String jdPr = "$jdFacture"
GlobalVariable.NumFacture = jdPr


WebUI.setText(findTestObject('finance/05-interface-paiement/input_facturation_mat-input-0'), 'Recman'+ GlobalVariable.NumFacture)
if (WebUI.verifyElementPresent(findTestObject('finance/05-interface-paiement/mat-icon_creation-facture_iad-cursor-pointer-mat-icon-notranslate-fal fa-sliders-h mat-icon-no-color'),5 , FailureHandling.OPTIONAL))
 
	
    { 

           WebUI.click(findTestObject('finance/05-interface-paiement/mat-icon_creation-facture_iad-cursor-pointer-mat-icon-notranslate-fal fa-sliders-h mat-icon-no-color'))

           WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/div_manuelles'))
		   
           WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/mat-chip_valider'))
} else {

         WebUI.verifyElementPresent(findTestObject('finance/05-interface-paiement/button_manuelle'), 0)

         WebUI.click(findTestObject('finance/05-interface-paiement/button_manuelle'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/button_creation-facture'))

