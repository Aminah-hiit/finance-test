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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.delay(3)

WebUI.click(findTestObject('finance/14-creation_projet/page_iad(1)/a_myiad-acqureurs'))

WebUI.click(findTestObject('finance/14-creation_projet/page_iad(1)/span_Crer'))

WebUI.click(findTestObject('finance/14-creation_projet/page_iad(1)/button_Achat'))

WebUI.click(findTestObject('finance/14-creation_projet/page_iad(1)/button_Habitation'))

WebUI.click(findTestObject('finance/14-creation_projet/page_iad(1)/button_Traditionnel'))

WebUI.click(findTestObject('finance/14-creation_projet/page_iad(1)/button_Maison'))

WebUI.setText(findTestObject('finance/14-creation_projet/page_welcome-page/page_iad/input_Lier-un-contact_search'), GlobalVariable.lastname)

WebUI.delay(3)

WebUI.click(findTestObject('finance/14-creation_projet/page_welcome-page/page_iad/a_Chabanne-afgoun-dammarie-les-lys'))

WebUI.delay(6)

WebUI.click(findTestObject('finance/14-creation_projet/page_iad(1)/span_tape-suivante'))

WebUI.click(findTestObject('finance/14-creation_projet/page_iad(1)/button_enregistrer-quitter'))

not_run: WebUI.verifyElementPresent(findTestObject('finance/14-creation_projet/page_iad/div_projet-cr-avec-succs'), 0)

