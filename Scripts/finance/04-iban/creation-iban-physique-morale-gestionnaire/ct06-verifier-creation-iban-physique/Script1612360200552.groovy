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

WebUI.click(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/a_Backoffice'))

WebUI.click(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/a_Annuaire'))

WebUI.click(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/mat-icon_adouani-pauline_mat-icon-notransla_0f5801'))

WebUI.click(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/button_dition'))

WebUI.click(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/a_coordonnes-bancaires'))

WebUI.click(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/span_ajouter-un-compte'))

WebUI.setText(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/input_personne-morale_mat-input-33'), 
    'test')

WebUI.setText(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/input_titulaire-du-compte_mat-input-34'), 
    'JFGH-JMSJ-GGHL-KGKF-KSQJ-FDKF-KNFD-FDSK-LL')

WebUI.setText(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/input_iban(27caractres-sans-caractres-spc_df33ee'), 
    'BIC')

WebUI.setText(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/input_bic-ou-swift_mat-input-36'), 'test')

CustomKeywords.'com.keywords.katalon.UploadPdfFile.uploadPDF'(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/p_faites-glisser-un-fichier-ici-en-format-p_e10fcc'))

WebUI.delay(5)

WebUI.click(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/span_Enregistrer'))

WebUI.click(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/span_Confirmer'))

WebUI.verifyElementPresent(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/p_Valid'), 0)

WebUI.verifyElementPresent(findTestObject('finance/11-creation-iban-morale/page_iad/p_Archiv'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('finance/10-creation-iban-gestionnaire/page_iad/button_Confirmer'))

