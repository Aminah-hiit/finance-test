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

WebUI.callTestCase(findTestCase('finance/ct01-authentification'), [('mp') : GlobalVariable.Mdp, ('username') : GlobalVariable.UserNameConseiller], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('finance/12-creation-projet-achat/page_iad/a_Production'))

WebUI.click(findTestObject('finance/12-creation-projet-achat/page_iad/a_myiad-acqureurs'))

WebUI.delay(3)

WebUI.click(findTestObject('finance/12-creation-projet-achat/page_iad/button_Crer'))

WebUI.delay(4)

WebUI.click(findTestObject('finance/12-creation-projet-achat/page_iad/button_Achat'))

WebUI.click(findTestObject('finance/12-creation-projet-achat/page_iad/button_Habitation'))

WebUI.click(findTestObject('finance/12-creation-projet-achat/page_iad/button_Traditionnel'))

WebUI.click(findTestObject('finance/12-creation-projet-achat/page_iad/button_Maison'))

WebUI.click(findTestObject('finance/12-creation-projet-achat/page_iad/button_nouveau-contact'))

Seq = (Math.random() * (9 - 6))

seq1 = (Seq * 100)

jdProjet = ((seq1) as int)

String jdPr = "$jdProjet"

GlobalVariable.NameContact = jdPr

WebUI.setText(findTestObject('finance/12-creation-projet-achat/page_iad/input_Nom_lastName'), 'Test' + GlobalVariable.NameContact)

WebUI.setText(findTestObject('finance/12-creation-projet-achat/page_iad/input_Prnom_firstName'), 'test')

WebUI.click(findTestObject('finance/12-creation-projet-achat/page_iad/button_enregistrer-contact'))

WebUI.verifyElementPresent(findTestObject('finance/12-creation-projet-achat/page_iad/div_contact-cr-avec-succs'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('finance/12-creation-projet-achat/page_iad/span_tape-suivante'))

WebUI.click(findTestObject('finance/26-page_iad/button_enregistrer-et-quitter'))

