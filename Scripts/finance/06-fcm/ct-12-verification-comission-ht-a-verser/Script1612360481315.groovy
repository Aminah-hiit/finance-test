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

WebUI.callTestCase(findTestCase('finance/06-fcm/ct-01-visualiser-fcm'), [:], FailureHandling.STOP_ON_FAILURE)

t = WebUI.getText(findTestObject('finance/03-fcm/label_6478'))

t1 = t.replace(',', '.')

t2 = t1.replace(' ', '')

t3 = t2.replace('€', '')

t4 = Double.parseDouble(t3)

println(t4)

x = WebUI.getText(findTestObject('finance/03-fcm/label_34100'))

x1 = x.replace(',', '.')

x2 = x1.replace(' ', '')

x3 = x2.replace('€', '')

x4 = Double.parseDouble(x3)

println(x4)

m = (x4 - t4)

println(m)

s = WebUI.getText(findTestObject('finance/03-fcm/label_18749'))

s1 = s.replace(',', '.')

s2 = s1.replace(' ', '')

s3 = s2.replace('€', '')

s4 = Double.parseDouble(s3)

println(s4)

if (m == s4) {
    println('le montant HT à verser est correct')
} else {
    println('le montant HT à verser est incorrect')

    WebUI.delay(5)

    WebUI.closeBrowser()
}

