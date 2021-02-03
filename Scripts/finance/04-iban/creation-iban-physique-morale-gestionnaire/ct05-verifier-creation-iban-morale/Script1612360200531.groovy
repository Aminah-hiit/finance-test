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

WebUI.callTestCase(findTestCase('finance/ct01-authentification'), [('username') : GlobalVariable.UserNameGestionnaire, ('mp') : GlobalVariable.Mdp], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/11-creation-iban-morale/page_iad/a_Backoffice'))

WebUI.click(findTestObject('finance/11-creation-iban-morale/page_iad/a_Annuaire'))

WebUI.setText(findTestObject('finance/11-creation-iban-morale/page_iad/input_France_mat-input-0'), '2020')

WebUI.click(findTestObject('finance/11-creation-iban-morale/page_iad/span_othman-manel_mat-button-wrapper'))

WebUI.click(findTestObject('finance/11-creation-iban-morale/page_iad/button_dition'))

WebUI.click(findTestObject('finance/11-creation-iban-morale/page_iad/a_coordonnes-bancaires'))

WebUI.click(findTestObject('finance/11-creation-iban-morale/page_iad/span_ajouter-un-compte'))

WebUI.click(findTestObject('finance/11-creation-iban-morale/page_iad/div_ personne-morale'))

WebUI.setText(findTestObject('finance/11-creation-iban-morale/page_iad/input_Personne morale_mat-input-32'), 'TEST')

WebUI.setText(findTestObject('finance/11-creation-iban-morale/page_iad/input_Titulaire du compte_mat-input-33'), 'FKYF-KGLH-MHHL-LLLL-LLLK-LJHG-LGLL-LLLL-LL')

WebUI.setText(findTestObject('finance/11-creation-iban-morale/page_iad/input_iban(27caractres-sans-caractres-spc_db25bd'), 
    'BIC')

WebUI.setText(findTestObject('finance/11-creation-iban-morale/page_iad/input_bic-ou-swift_mat-input-35'), 'TEST')

CustomKeywords.'com.keywords.katalon.UploadPdfFile.uploadPDF'(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/p_faites-glisser-un-fichier-ici-en-format-p_e10fcc'))

WebUI.click(findTestObject('finance/11-creation-iban-morale/page_iad/span_Enregistrer'))

WebUI.click(findTestObject('finance/11-creation-iban-morale/page_iad/span_Confirmer'))

WebUI.click(findTestObject('finance/11-creation-iban-morale/page_iad/span_Confirmer'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('finance/11-creation-iban-morale/page_iad/p_ValidER'), 0)

WebUI.closeBrowser()

