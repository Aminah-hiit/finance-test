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

WebUI.callTestCase(findTestCase('finance/07-suivi-rem/ct-01-authentification-conseiller'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('finance/04-suivi-de-rem/a_mon-compte'), 0)

WebUI.click(findTestObject('finance/04-suivi-de-rem/a_mon-compte'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/a_suivi-de-rmunration-iagl'))

WebUI.verifyElementPresent(findTestObject('finance/04-suivi-de-rem/bloc-commissions-facturables'), 0)

WebUI.click(findTestObject('finance/04-suivi-de-rem/bloc-commissions-facturables'))

WebUI.verifyElementPresent(findTestObject('finance/04-suivi-de-rem/divp_001'), 0)

a = WebUI.getText(findTestObject('finance/04-suivi-de-rem/divp_001'))

a1 = a.replace(',', '.')

a2 = a1.replace('€', '')

a3 = a2.replace(' ', '')

a4 = Double.parseDouble(a3)

println(a4)

WebUI.click(findTestObject('finance/04-suivi-de-rem/span_choisir-montants'))

WebUI.verifyElementPresent(findTestObject('finance/04-suivi-de-rem/bloc-transaction'), 0)

WebUI.verifyElementPresent(findTestObject('finance/04-suivi-de-rem/bloc-gestion-locative'), 0)

WebUI.verifyElementPresent(findTestObject('finance/04-suivi-de-rem/bloc-recommandation'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('04-suivi-de-rem/mat-card_Indication daffaires Total 000 0 0 Slectionn 000 Non slectionn 000 Tout slectionner Choisir les montants'), 
    0)

WebUI.click(findTestObject('finance/04-suivi-de-rem/divp_002'))

b = WebUI.getText(findTestObject('finance/04-suivi-de-rem/divp_002'))

b1 = b.replace(',', '.')

b2 = b1.replace('€', '')

b3 = b2.replace(' ', '')

b4 = Double.parseDouble(b3)

println(b4)

WebUI.click(findTestObject('finance/04-suivi-de-rem/divp_003'))

c = WebUI.getText(findTestObject('finance/04-suivi-de-rem/divp_003'))

c1 = c.replace(',', '.')

c2 = c1.replace('€', '')

c3 = c2.replace(' ', '')

c4 = Double.parseDouble(c3)

println(c4)

WebUI.click(findTestObject('finance/04-suivi-de-rem/divp_004'))

d = WebUI.getText(findTestObject('finance/04-suivi-de-rem/divp_004'))

d1 = d.replace(',', '.')

d2 = d1.replace('€', '')

d3 = d2.replace(' ', '')

d4 = Double.parseDouble(d3)

println(d4)
WebUI.click(findTestObject('Object Repository/finance/04-suivi-de-rem/div_total-ia'))
e= WebUI.getText(findTestObject('Object Repository/finance/04-suivi-de-rem/div_total-ia'))
e1 = e.replace(',', '.')

e2 = e1.replace('€', '')

e3 = e2.replace(' ', '')

e4 = Double.parseDouble(e3)
println e4
total = ((b4 + c4) +(d4+ e4))

println(total)

if (total == a4) {
    println('la comission est correct')
} else {
    println('la comission est incorrect')
}

not_run: WebUI.verifyElementPresent(findTestObject('finance/04-suivi-de-rem/div_total-ia'), 0)

not_run: WebUI.verifyElementClickable(findTestObject('04-suivi-de-rem/div_Valider'), STOP_ON_FAILURE)

WebUI.delay(5)

not_run: WebUI.closeBrowser()

