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

d = WebUI.getText(findTestObject('finance/03-fcm/td_34100'))

d1 = d.replace(',', '.')

d2 = d1.replace(' ', '')

d3 = d2.replace('€', '')

d4 = Double.parseDouble(d3)

println(d4)

k = WebUI.getText(findTestObject('finance/03-fcm/td_700'))

k1 = k.replace(',', '.')

k2 = k1.replace(' ', '')

k3 = k2.replace('%', '')

k4 = Double.parseDouble(k3)

println(k4)

l = WebUI.getText(findTestObject('finance/03-fcm/td_2387'))

l1 = l.replace(',', '.')

l2 = l1.replace(' ', '')

l3 = l2.replace('€', '')

l4 = Double.parseDouble(l3)
l4= GlobalVariable.comUpline1

println(l4)

p = ((d4 * k4) / 100)

println(p)

if (p == l4) {
    println('la comission est correct')
} else {
    println('la comission est incorrect')

    WebUI.delay(5)

    WebUI.closeBrowser()
}

