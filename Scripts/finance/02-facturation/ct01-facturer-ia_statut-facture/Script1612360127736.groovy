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

WebUI.callTestCase(findTestCase('finance/01-projet-indication-daffaire/ct02-creation-ia-conseiller'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('finance/ct01-authentification'), [('username') : GlobalVariable.UserNameGestionnaire, ('mp') : GlobalVariable.Mdp], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/16-facturation/page_iad/a_factures-paiement'))

WebUI.click(findTestObject('finance/16-facturation/page_iad/a_facturation-indication-daffaire'))

println(GlobalVariable.p)

WebUI.delay(5)

WebUI.click(findTestObject('finance/16-facturation/page_iad/input_concat(n-indication-affaire)_binumber'))

WebUI.setText(findTestObject('finance/16-facturation/page_iad/input_concat(n-indication-affaire)_binumber'), GlobalVariable.p)

WebUI.delay(3)

WebUI.click(findTestObject('finance/16-facturation/page_iad/span_Rechercher'))

WebUI.verifyElementText(findTestObject('finance/16-facturation/page_iad/p_en-cours'), 'En cours')

WebUI.delay(4)

WebUI.click(findTestObject('finance/16-facturation/page_iad/div_gestionnaire-tanneux-johanna (15547)_myiad-burger-useful-width dropdown-toggle'))

WebUI.click(findTestObject('finance/16-facturation/page_iad/a_Facturer'))

WebUI.delay(6)

GlobalVariable.Montant1 = WebUI.getAttribute(findTestObject('finance/16-facturation/ia1/page_iad/input__form-control-ng-pristine-ng-not-empty ng-valid ng-valid-required ng-touched'), 
    'value')

WebUI.click(findTestObject('finance/16-facturation/ia1/page_iad/button_Confirmer'))

WebUI.delay(6)

not_run: WebUI.verifyElementText(findTestObject('Etape2/Facturation/IA1/Page_IAD Intranet/div_Angers France'), GlobalVariable.adressValue)

Date1IA = GlobalVariable.dateIA

Date2IA = Date1IA.split(' :')

Date3IA = (Date2IA[0])

println(Date3IA)

WebUI.verifyElementText(findTestObject('finance/16-facturation/ia1/page_iad-intranet/div_lieusaintle05052020'), 'Lieusaint,le ' + 
    Date3IA)

trbalise = WebUI.getText(findTestObject('finance/16-facturation/ia1/page_iad-intranet/tr'))

println(trbalise)

trb = trbalise.split('affaire ')

println(trb)

trba = (trb[1])

trbal = trba.split('%')

println(trbal)

trbal1 = (trbal[0])

trbal11 = trbal1.split('€')

println(trbal11)

trbal2 = (trbal[1])

trbal22 = trbal2.split('€')

println(trbal22)

montantFactureIAHT = (trbal11[0])

println(montantFactureIAHT)

montantFactureIAHT1 = montantFactureIAHT.replaceAll(' ', '')

montantFactureIAHT2 = montantFactureIAHT1.replaceAll(',00', '')

println(montantFactureIAHT2)

Double montantFactureIAHT3 = Double.parseDouble(montantFactureIAHT2)

println(montantFactureIAHT3)

WebUI.verifyEqual(GlobalVariable.Montant1, montantFactureIAHT3)

prcntgTVA = (trbal11[1])

prcntgTVA1 = prcntgTVA.replaceAll(' ', '')

prcntgTVA2 = prcntgTVA1.replaceAll(',00', '')

Double prcntgTVA3 = Double.parseDouble(prcntgTVA2)

println(prcntgTVA3)

montantTVAC = ((prcntgTVA3 * montantFactureIAHT3) / 100)

montantTVA = (trbal22[0])

montantTVA1 = montantTVA.replaceAll(' ', '')

montantTVA2 = montantTVA1.replaceAll(',00', '')

Double montantTVA3 = Double.parseDouble(montantTVA2)

println(montantTVA3)

WebUI.verifyEqual(montantTVAC, montantTVA3)

montantTTC = (trbal22[1])

montantTTC1 = montantTTC.replaceAll(' ', '')

montantTTC2 = montantTTC1.replaceAll(',00', '')

Double montantTTC3 = Double.parseDouble(montantTTC2)

println(montantTTC3)

MontantTTCF = (montantTVA3 + montantFactureIAHT3)

println(MontantTTCF)

GlobalVariable.MontantTTCRapp = montantTTC1

WebUI.verifyEqual(MontantTTCF, montantTTC3)

WebUI.check(findTestObject('finance/16-facturation/ia1/page_iad-intranet/div_carr-hausmannIII-cs10476_mat-checkbox-inner-container'))

WebUI.verifyElementPresent(findTestObject('finance/16-facturation/Page_IAD Intranet/div_iban'), 0)

WebUI.verifyElementPresent(findTestObject('finance/16-facturation/Page_IAD Intranet/div_bic'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('finance/16-facturation/ia1/page_iad-intranet/button_emettre-facture'))

WebUI.delay(5)

WebUI.click(findTestObject('finance/16-facturation/page_iad/input_concat(n-indication-affaire)_binumber'))

WebUI.setText(findTestObject('finance/16-facturation/page_iad/input_concat(n-indication-affaire)_binumber'), GlobalVariable.p)

WebUI.delay(3)

WebUI.click(findTestObject('finance/16-facturation/page_iad/span_Rechercher'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('finance/16-facturation/page_iad/p_Facture'), 'Facturée')

not_run: WebUI.click(findTestObject('IA1/Page_IAD/i_Partenaire_fa fa-times fa-2x iad-cb-modal-close'))

WebUI.closeBrowser()

