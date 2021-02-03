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

x = WebUI.getText(findTestObject('finance/03-fcm/label_34100'))

println(x)

x1 = x.replace(',', '.')

x2 = x1.replace(' ', '')

x3 = x2.replace('€', '')

println(x3)

x4 = Double.parseDouble(x3)

y = WebUI.getText(findTestObject('finance/03-fcm/label_1900'))

println(y)

y1 = y.replace(',', '.')

y2 = y1.replace(' ', '')

y3 = y2.replace('%', '')

println(y3)

y4 = Double.parseDouble(y3)

w = ((x4 * y4) / 100)

println(w)

z = WebUI.getText(findTestObject('finance/03-fcm/label_6478'))

z1 = z.replace(',', '.')

z2 = z1.replace(' ', '')

z3 = z2.replace('€', '')

println(z3)

z4 = Double.parseDouble(z3)

if (w == z4) {
    println('la marge iad est correct')
} else {
    println('la marge iad est incorrect')

    WebUI.delay(5)

    WebUI.closeBrowser()
}

