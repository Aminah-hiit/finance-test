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

a = WebUI.getText(findTestObject('finance/03-fcm/integration/label01_1000000'))

a1 = a.replace(',', '.')

a2 = a1.replace(' ', '')

a3 = a2.replace('€', '')

a4 = Double.parseDouble(a3)

println(a4)

b = WebUI.getText(findTestObject('finance/03-fcm/integration/label_0'))

b1 = b.replace(',', '.')

b2 = b1.replace(' ', '')

b3 = b2.replace('%', '')

b4 = Double.parseDouble(b3)

println(b4)

c = WebUI.getText(findTestObject('finance/03-fcm/integration/label02_1000000'))

c1 = c.replace(',', '.')

c2 = c1.replace(' ', '')

c3 = c2.replace('€', '')

c4 = Double.parseDouble(c3)

println(c4)

if (b4 == 0) {
    if (c4 == a4) {
        println('le CA est correct')
    } else {
        'le CA est incorrect'
    }
} else {
    c4 = ((a4 * b4) / 100)
}

println(c4)

WebUI.delay(5)

WebUI.closeBrowser()

