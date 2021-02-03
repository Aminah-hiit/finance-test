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

WebUI.callTestCase(findTestCase('finance/06-fcm/ct-01-visualiser-fcm'), [:], FailureHandling.STOP_ON_FAILURE)




if (WebUI.verifyElementPresent(findTestObject('finance/03-fcm/td_69'), 5, FailureHandling.OPTIONAL)){
    if (WebUI.verifyElementText(findTestObject('finance/03-fcm/td_oui-producteur'), 'Oui')) {
        Pr= WebUI.getText(findTestObject('finance/03-fcm/td_69'))
		Pr1= Pr.replace(' ', '')
		Pr2= Pr1.replace(',', '.')
		Pr3= Pr2.replace('%', '')
		Pr4= Double.parseDouble(Pr3)
		println Pr4
		GlobalVariable.Pr5=Pr4
		} else GlobalVariable.Pr5=0
}else GlobalVariable.Pr5=0
    

if (WebUI.verifyElementPresent(findTestObject('finance/03-fcm/td_7'), 5, FailureHandling.OPTIONAL)){
	
if (WebUI.verifyElementText(findTestObject('finance/03-fcm/td_oui-upline1'), 'Oui')){
	Up= WebUI.getText(findTestObject('finance/03-fcm/td_7'))
	Up1= Up.replace(' ', '')
	Up2= Up1.replace(',', '.')
	Up3= Up2.replace('%', '')
	Up4= Double.parseDouble(Up3)
	println Up4
	GlobalVariable.Up5=Up4
	}else GlobalVariable.Up5=0

}else GlobalVariable.Up5=0

 

if (WebUI.verifyElementPresent(findTestObject('finance/03-fcm/td_3'), 5, FailureHandling.OPTIONAL)){

if (WebUI.verifyElementText(findTestObject('finance/03-fcm/td_oui-upline2'), 'Oui')){
	Upb= WebUI.getText(findTestObject('finance/03-fcm/td_3'))
	Upb1= Upb.replace(' ', '')
	Upb2= Upb1.replace(',', '.')
	Upb3= Upb2.replace('%', '')
	Upb4= Double.parseDouble(Upb3)
	println Upb4
	GlobalVariable.Upb5=Upb4
}else GlobalVariable.Upb5=0
}else GlobalVariable.Upb5=0

if (WebUI.verifyElementPresent(findTestObject('finance/03-fcm/td_15'), 5, FailureHandling.OPTIONAL)){

if (WebUI.verifyElementText(findTestObject('finance/03-fcm/td_oui-upline3'), 'Oui')){
	Upc= WebUI.getText(findTestObject('finance/03-fcm/td_15'))
	Upc1= Upc.replace(' ', '')
	Upc2= Upc1.replace(',', '.')
	Upc3= Upc2.replace('%', '')
	Upc4= Double.parseDouble(Upc3)
	println Upc4
	GlobalVariable.Upc5=Upc4
}else GlobalVariable.Upc5=0
}else GlobalVariable.Upc5=0


if (WebUI.verifyElementPresent(findTestObject('finance/03-fcm/td_050'), 5, FailureHandling.OPTIONAL)){

if (WebUI.verifyElementText(findTestObject('finance/03-fcm/td_oui-upline4'), 'Oui')){
	Upd= WebUI.getText(findTestObject('finance/03-fcm/td_050'))
	Upd1= Upd.replace(' ', '')
	Upd2= Upd1.replace(',', '.')
	Upd3= Upd2.replace('%', '')
	Upd4= Double.parseDouble(Upd3)
	println Upd4
	GlobalVariable.Upd5=Upd4
}else GlobalVariable.Upd5=0
}else GlobalVariable.Upd5=0


if (WebUI.verifyElementPresent(findTestObject('finance/03-fcm/td_020'), 5, FailureHandling.OPTIONAL)){
if (WebUI.verifyElementText(findTestObject('Object Repository/finance/03-fcm/td_oui-upline5'), 'Oui')){
	Upe= WebUI.getText(findTestObject('finance/03-fcm/td_020'))
	Upe1= Upe.replace(' ', '')
	Upe2= Upe1.replace(',', '.')
	Upe3= Upe2.replace('%', '')
	Upe4= Double.parseDouble(Upe3)
	println Upe4
	GlobalVariable.Upe5=Upe4
}else GlobalVariable.Upe5=0
}else GlobalVariable.Upe5=0

Sum =GlobalVariable.Pr5+GlobalVariable.Up5+GlobalVariable.Upb5+GlobalVariable.Upc5+GlobalVariable.Upd5+GlobalVariable.Upe5
println Sum
Marge=100-Sum

println (Marge)

MargeIaD = WebUI.getText(findTestObject('finance/03-fcm/label_19'))
a=MargeIaD.replace(',', '.')
a1=a.replace('%', '')
a2=a1.replace(' ', '')
a3= Double.parseDouble(a2)

if(Marge==a3){
	println ('la marge iad en % est correct')
} else println ('la marge iad en % est incorrect')




