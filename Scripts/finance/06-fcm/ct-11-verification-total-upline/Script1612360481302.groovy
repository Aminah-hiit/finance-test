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

d = WebUI.getText(findTestObject('finance/03-fcm/td_2387'))

d1 = d.replace(',', '.')

d2 = d1.replace(' ', '')

d3 = d2.replace('€', '')

d4 = Double.parseDouble(d3)

println(d4)

t = WebUI.getText(findTestObject('finance/03-fcm/td_1023'))

t1 = t.replace(',', '.')

t2 = t1.replace(' ', '')

t3 = t2.replace('€', '')

t4 = Double.parseDouble(t3)

println(t4)

s = WebUI.getText(findTestObject('finance/03-fcm/td_512'))

s1 = s.replace(',', '.')

s2 = s1.replace(' ', '')

s3 = s2.replace('€', '')

s4 = Double.parseDouble(s3)

println(s4)

v = WebUI.getText(findTestObject('finance/03-fcm/td_171'))

v1 = v.replace(',', '.')

v2 = v1.replace(' ', '')

v3 = v2.replace('€', '')

v4 = Double.parseDouble(v3)

println(v4)

m = (((d4 + t4) + s4) + v4)

println(m)

x = WebUI.getText(findTestObject('finance/03-fcm/td_2816'))

x1 = x.replace(',', '.')

x2 = x1.replace(' ', '')

x3 = x2.replace('€', '')

x4 = Double.parseDouble(x3)

println(x4)

if (m == x4) {
    println('le montant total est correct')
} else {
    println('le montant total est incorrect')

    WebUI.delay(5)

    WebUI.closeBrowser()
}

