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

WebUI.callTestCase(findTestCase('finance/07-suivi-rem/ct-01-authentification-conseiller'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/a_mon-compte'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/a_suiv-rmunration-iagl'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/mat-card-header_dashboard-de-rmunration'))

not_run: WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/div_1114629-ht'))

not_run: WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/div_1114629'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/div_janvier 2021'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/button_detailsia'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/button_details2'))

not_run: WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/span_1000000'))

not_run: WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/span_690000'))

not_run: WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/div_690000'))

a = WebUI.getText(findTestObject('finance/04-suivi-de-rem/prod-dashbord/div_690000'))

a1 = a.replace(',', '.')

a2 = a1.replace(' ', '')

a3 = a2.replace('€', '')

a4 = Double.parseDouble(a3)

b = WebUI.getText(findTestObject('finance/04-suivi-de-rem/prod-dashbord/span_690000'))

b1 = b.replace(',', '.')

b2 = b1.replace(' ', '')

b3 = b2.replace('€', '')

b4 = Double.parseDouble(b3)

WebUI.verifyEqual(a4, b4)

WebUI.verifyEqual(b4, GlobalVariable.montantP)

c = WebUI.getText(findTestObject('finance/04-suivi-de-rem/prod-dashbord/span_1000000'))

c1 = c.replace(',', '.')

c2 = c1.replace(' ', '')

c3 = c2.replace('€', '')

c4 = Double.parseDouble(c3)

print(c4)

if (c4 == GlobalVariable.montantRHT) {
    println('le montant HT est correct')
} else {
    println('le montant HT est incorrect')
}

d = WebUI.getText(findTestObject('finance/04-suivi-de-rem/prod-dashbord/div_num-dossier-suivi-rem'))

d1 = d.substring(20)

println(d1)

if (WebUI.verifyEqual(d1, GlobalVariable.Numdossier) == true) {
    println('le numero de dossier est correct')
} else {
    println('le numero de dossier est incorrect')
}

