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

WebUI.callTestCase(findTestCase('finance/07-suivi-rem/ct-01-authentification-conseiller'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/04-suivi-de-rem/reccurence/a_mon-compte'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/comissions-facturables/a_suivi-rmunration-iagl'))

not_run: WebUI.verifyElementPresent(findTestObject('04-suivi-de-rem/reccurence/mat-card_Commissions facturables 355273 (HT)'), 
    0)

WebUI.click(findTestObject('finance/04-suivi-de-rem/bloc-commissions-facturables'))

WebUI.verifyElementPresent(findTestObject('finance/04-suivi-de-rem/reccurence/mat-card-title_rcurrences'), 0)

WebUI.click(findTestObject('finance/04-suivi-de-rem/reccurence/mat-card-title_rcurrences'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/reccurence/div_000'))

a = WebUI.getText(findTestObject('finance/04-suivi-de-rem/reccurence/div_000'))

a1 = a.replace(',', '.')

a2 = a1.replace('€', '')

a3 = a2.replace(' ', '')

a4 = Double.parseDouble(a3)

println(a4)

WebUI.verifyElementClickable(findTestObject('finance/04-suivi-de-rem/reccurence/span_choisir les montants'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/reccurence/span_choisir les montants'))

not_run: WebUI.verifyElementPresent(findTestObject('04-suivi-de-rem/reccurence/mat-card_Transaction Total 000 0 0 Slectionn 000 Non slectionn 000 Tout slectionner'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('04-suivi-de-rem/reccurence/mat-card_Gestion locative Total 000 0 0 Slectionn 000 Non slectionn 000 Tout slectionner'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('04-suivi-de-rem/reccurence/mat-card_Indication daffaires Total 000 0 0 Slectionn 000 Non slectionn 000 Tout slectionner'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('04-suivi-de-rem/reccurence/mat-card_Prime Exceptionnel Total 000 0 0 Slectionn 000 Non slectionn 000 Tout slectionner'), 
    0)

b = WebUI.getText(findTestObject('finance/04-suivi-de-rem/div_001'))

b1 = b.replace(',', '.')

b2 = b1.replace('€', '')

b3 = b2.replace(' ', '')

b4 = Double.parseDouble(b3)

println(b4)

c = WebUI.getText(findTestObject('finance/04-suivi-de-rem/div_002'))

c1 = c.replace(',', '.')

c2 = c1.replace('€', '')

c3 = c2.replace(' ', '')

c4 = Double.parseDouble(c3)

println(c4)

d = WebUI.getText(findTestObject('finance/04-suivi-de-rem/div_003'))

d1 = d.replace(',', '.')

d2 = d1.replace('€', '')

d3 = d2.replace(' ', '')

d4 = Double.parseDouble(d3)

println(d4)

f = WebUI.getText(findTestObject('finance/04-suivi-de-rem/div_004'))

f1 = f.replace(',', '.')

f2 = f1.replace('€', '')

f3 = f2.replace(' ', '')

f4 = Double.parseDouble(f3)

println(f4)

total = (((b4 + c4) + d4) + f4)

println(total)

if (total == a4) {
    println('la comission est correct')
} else {
    println('la comission est incorrect')

    WebUI.delay(5)

    WebUI.closeBrowser()
}

