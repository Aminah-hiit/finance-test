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
import org.stringtemplate.v4.compiler.STParser.option_return

WebUI.openBrowser('')

WebUI.navigateToUrl('https://p13.demo.iadholding.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/button_accder'))

WebUI.setText(findTestObject('finance/04-suivi-de-rem/recc-dashbord/input_identifiant_username'), '29105@iadfrance.fr')

WebUI.setEncryptedText(findTestObject('finance/04-suivi-de-rem/recc-dashbord/input_mot-passe_password'), 'M1qipU8GjAM=')

WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/input_mot-passe_submit'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/button_dmarrer'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/a_facebook_iad-concession'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/a_mon-compte'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/a_suivi-rmunration-iagl'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/mat-card-header_dashboard-de-rmunration'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/div_janvier 2021'))

not_run: WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/button_detailsia'))

not_run: WebUI.click(findTestObject('finance/04-suivi-de-rem/prod-dashbord/button_details2'))

not_run: WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/div_358418-ht'))

not_run: WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/div_240183'))

not_run: WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/div_dcembre-2020'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/button_details-rec'))

WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/button_details-suivi-rem'))

not_run: WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/mat-panel-title_filleul-mathias-pype-fr -bbadd5'))

WebUI.verifyElementPresent(findTestObject('finance/04-suivi-de-rem/recc-dashbord/div_numro-dossier-2021-1438-20922'), 0)

a = WebUI.getText(findTestObject('finance/04-suivi-de-rem/recc-dashbord/div_numro-dossier-2021-1438-20922'))

a1 = a.substring(20)

println(a1)

if (a1 == GlobalVariable.Numdossier) {
    println('le numero dossier est correct')
} else {
    println('le numero dossier est incorrect')
}

//WebUI.verifyEqual(a1, GlobalVariable.Numdossier)
not_run: WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/button_Details-rec'))

c = WebUI.getText(findTestObject('finance/04-suivi-de-rem/recc-dashbord/span_montant-ht'))

c1 = c.replace(',', '.')

c2 = c1.replace(' ', '')

c3 = c2.replace('€', '')

c4 = Double.parseDouble(c3)

println(c4)

if (c4 == GlobalVariable.montantRHT) {
    print('le montant HT est correct')
} else {
    print('le montant HT est incorrect')
}

not_run: WebUI.click(findTestObject('finance/04-suivi-de-rem/recc-dashbord/div_filleul-mathias-pype-fr-2020'))

x = WebUI.getText(findTestObject('finance/04-suivi-de-rem/recc-dashbord/span_monatnt-base-brut'))

x1 = x.replace(',', '.')

x2 = x1.replace(' ', '')

x3 = x2.replace('€', '')

x4 = Double.parseDouble(x3)

println(x4)

y = WebUI.getText(findTestObject('finance/04-suivi-de-rem/recc-dashbord/span_3-repartition'))

y1 = y.replace(',', '.')

y2 = y1.replace(' ', '')

y3 = y2.replace('%', '')

y4 = Double.parseDouble(y3)

println(y4)

if (y4 == 7) {
    //WebUI.verifyEqual(x4, GlobalVariable.comUpline1)
	if ((x4== GlobalVariable.comUpline1)){
		println ('la comission est correct')
	}else println ('la comission est incorrect')
}

 else if (y4 == 3) {
    //WebUI.verifyEqual(x4, GlobalVariable.comUpline2)
	 if ((x4== GlobalVariable.comUpline2)){
		 println ('la comission est correct')
	 }else println ('la comission est incorrect')
} else if (y4 == 1.50) {
    //WebUI.verifyEqual(x4, GlobalVariable.comUpline3)
if ((x4== GlobalVariable.comUpline3)){
	println ('la comission est correct')
}else println ('la comission est incorrect')
} else if (y4 == 0.50) {
    //WebUI.verifyEqual(x4, GlobalVariable.comUpline4)
if ((x4== GlobalVariable.comUpline4)){
	println ('la comission est correct')
}else println ('la comission est incorrect')
} else {
    //WebUI.verifyEqual(x4, GlobalVariable.comUpline5)
if ((x4== GlobalVariable.comUpline5)){
	println ('la comission est correct')
}else println ('la comission est incorrect')
}

