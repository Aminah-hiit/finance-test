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

WebUI.click(findTestObject('finance/04-suivi-de-rem/comissions-facturables/a_mon-compte'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/comissions-facturables/a_suivi-rmunration-iagl'))

k = WebUI.getText(findTestObject('finance/04-suivi-de-rem/comissions-facturables/div_1045273ht'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/bloc-commissions-facturables'))

k1 = k.replace(',', '.')

k2 = k1.replace('€', '')

k3 = k2.replace(' ', '')

k4 = k3.replace('(HT)', '')

k5 = Double.parseDouble(k4)

println(k4)

a = WebUI.getText(findTestObject('finance/04-suivi-de-rem/comissions-facturables/div-prod_000'))

a1 = a.replace(',', '.')

a2 = a1.replace('€', '')

a3 = a2.replace(' ', '')

a4 = Double.parseDouble(a3)

println(a4)

b = WebUI.getText(findTestObject('finance/04-suivi-de-rem/comissions-facturables/divreccurence_000'))

b1 = b.replace(',', '.')

b2 = b1.replace('€', '')

b3 = b2.replace(' ', '')

b4 = Double.parseDouble(b3)

println(b4)

total_comission_facturables = (a4 + b4)

println(total_comission_facturables)

if (total_comission_facturables == k4) {
    println('la comission facturable est correcte')
} else {
    println('la comission facturable est incorrecte')
}

WebUI.delay(5)

WebUI.closeBrowser()

