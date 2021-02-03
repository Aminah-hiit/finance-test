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

WebUI.callTestCase(findTestCase('finance/01-projet-indication-daffaire/ct01-creation-projet-achat'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/i_filtres-house'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/i_Maison_iad-nav-item-icon business_indicat_d23f64'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/button_indication-daffaires'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/mat-icon_test74_bi-avatar-icon-mat-icon-not_acb3df'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/span_Genre'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/span_Madame'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/div_prnom-acqureur'))

WebUI.setText(findTestObject('finance/19-indication-affaires/page_iad/input_Genre_mat-input-2'), 'test')

WebUI.setText(findTestObject('finance/19-indication-affaires/page_iad/input_concat(prnom-acqureur)_mat-input-3'), 
    'test')

WebUI.setText(findTestObject('finance/19-indication-affaires/page_iad/input_Pays_1606819044652'), 'test')

WebUI.setText(findTestObject('finance/19-indication-affaires/page_iad/input_informations-complimentaires_mat-input-9'), 
    'test@gmail.com')

WebUI.setText(findTestObject('finance/19-indication-affaires/page_iad/input-mail_mat-input-10'), '01 23 45 67 89')

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/button_Suivant'))

M = (Math.random() * (9 - 6))

M1 = ((M) as int)

if (M1 == 0) {
    M1 = (M1 + 1)

    M2 = (M1 * 1000000)
} else {
    M2 = (M1 * 1000000)
}

String MontantRet = "$M2"

GlobalVariable.MontantRetro = MontantRet

println(GlobalVariable.MontantRetro)

WebUI.setText(findTestObject('finance/19-indication-affaires/page_iad/input_MONTANT DU PRT_mat-input-0'), GlobalVariable.MontantRetro)

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/div_montant-apport'))

WebUI.setText(findTestObject('finance/19-indication-affaires/page_iad/input_montant-du-prt-demand-en_mat-input-1'), 
    '1000')

WebUI.delay(10)

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/span_Suivant'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/div_concat(empruntis-agence)_mat-check_735334'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/span_Valider'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/div_choisir-un-contact_mat-select-arrow-wrapper'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/span_albertini-christian(rue-chanois-bonerandi,bastia,france20200)'))

WebUI.setText(findTestObject('finance/19-indication-affaires/page_iad/textarea_ajouter-contact_mat-input-13'), 
    'test')

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/span_Valider'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/span_Confirmer'))

WebUI.delay(10)

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/i_Maison_iad-nav-item-icon business_indicat_d23f64'))

WebUI.verifyElementText(findTestObject('finance/19-indication-affaires/page_iad/strong_statut-en-cours'), 'Statut: En cours')

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/span_diter'))

WebUI.delay(10)

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/button_Suivant'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/span_Suivant'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/div_ Accepter'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/button_Valider'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/i_Maison_iad-nav-item-icon business_indicat_d23f64'))

t= WebUI.getText(findTestObject('finance/09-creation-ia/page_iad/strong_Test245 Test - 20931 - 14122020'))
res = t.split(" - ")
GlobalVariable.p=res[1]
println(GlobalVariable.p)
GlobalVariable.dateIA = res[2]



