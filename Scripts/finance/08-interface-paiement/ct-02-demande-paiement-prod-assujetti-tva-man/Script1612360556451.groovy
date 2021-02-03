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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://p13.demo.iadholding.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/button_Accder'))

WebUI.setText(findTestObject('Object Repository/finance/05-interface-paiement/production/input_Identifiant_username'), '2020@iadfrance.fr')

WebUI.setEncryptedText(findTestObject('Object Repository/finance/05-interface-paiement/production/input_Mot de passe_password'), 
    'M1qipU8GjAM=')

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/input_Mot de passe_submit'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/button_Dmarrer'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/a_Facebook_iad-concession'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/a_Mon compte'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/a_Suivi de rmunration IAGL'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/div_44952,73  (HT)'))

WebUI.click(findTestObject('finance/05-interface-paiement/production/span_choisir-montant-prod'))

WebUI.scrollToElement(findTestObject('finance/05-interface-paiement/production/span_choisir-montant-ia'), 0)

WebUI.click(findTestObject('finance/05-interface-paiement/production/span_choisir-montant-ia'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/div_Tout slectionner_mat-checkbox-inner-con_178ecc'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/span_Valider la slection'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/a_Valider'))
 
Seq = (Math.random() * (9 - 6))
seq1 = (Seq * 100)
jdFacture = ((seq1) as int)
String jdPr = "$jdFacture"
GlobalVariable.NumFacture = jdPr

WebUI.setText(findTestObject('Object Repository/finance/05-interface-paiement/production/input_Facturation_mat-input-0'), 
    'Prodman'+ GlobalVariable.NumFacture)

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



not_run: WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/div_Net  payer TTC_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/input_concat(Je n, , ai pas encore ma factu_57520b'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/svg_Choisissez une date_mat-datepicker-togg_569503'))

not_run: WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/svg_Choisissez une date_mat-datepicker-togg_569503_1'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/div_22'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/div_Brouillon de factureMathias PYPE22 Alle_1bb4fe'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/div_Choisissez une date'))

WebUI.setText(findTestObject('Object Repository/finance/05-interface-paiement/production/textarea_Choisissez une date_mat-input-1'), 
    'test automatisation')

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/span_Valider'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/div_JANVIER 2021_cdk-overlay-backdrop cdk-o_c8cf1c'))

not_run: WebUI.rightClick(findTestObject('Object Repository/finance/05-interface-paiement/production/div_Brouillon de factureMathias PYPE22 Alle_1bb4fe_1'))

WebUI.click(findTestObject('Object Repository/finance/05-interface-paiement/production/span_Valider'))

WebUI.waitForElementPresent(findTestObject('Object Repository/finance/05-interface-paiement/production/mat-dialog-container_Vous tes sur le point _52dafb'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/finance/05-interface-paiement/production/button_Oui'), 0)

WebUI.closeBrowser()

