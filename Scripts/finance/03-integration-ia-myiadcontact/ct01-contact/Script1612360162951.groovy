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
import com.sun.media.sound.SoftReverb.Delay as Delay
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('finance/ct01-authentification'), [('username') : GlobalVariable.UserNameConseiller, ('mp') : GlobalVariable.Mdp], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/12-creation-projet-achat/page_iad/a_Production'))

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/a_myiad-contacts'))

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/button_Crer'))

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/div_nouveau-contact_myiad-avatar'))

seq55 = CustomKeywords.'com.keyrn.NumMobileSequence.generateSequence'()

jdcontact = ((seq55) as int)

String jdcont = "$jdcontact"

GlobalVariable.firstname = ('test' + jdcont)

println(GlobalVariable.firstname)

WebUI.setText(findTestObject('finance/13-creation_contact/page_iad/input_Prnom_firstName'), GlobalVariable.firstname)

GlobalVariable.lastname = ('test1' + jdcont)

println(GlobalVariable.lastname)

WebUI.setText(findTestObject('finance/13-creation_contact/page_iad/input_Nom_lastName'), GlobalVariable.lastname)

GlobalVariable.usedname = ('Test3' + jdcont)

println(GlobalVariable.usedname)

WebUI.setText(findTestObject('finance/13-creation_contact/page_iad/input_concat(Nom-usage)_usageName'), GlobalVariable.usedname)

GlobalVariable.jeunefille = ('Test4' + jdcont)

println(GlobalVariable.jeunefille)

WebUI.setText(findTestObject('finance/13-creation_contact/page_iad/input_nom-jeune fille_birthName'), GlobalVariable.jeunefille)

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/input_date-naissance_birth_date'))

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/span_13'))

datebirth = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_date-naissance_birth_date'), 
    'value')

GlobalVariable.DateNaissance = datebirth

println(GlobalVariable.DateNaissance)

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/span_Lieu-naissance_btn-btn-default form_bf2c5d'))

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/span_02'))

GlobalVariable.lieuBirth = ('test5' + jdcont)

println(GlobalVariable.lieuBirth)

WebUI.setText(findTestObject('finance/13-creation_contact/page_iad/input_lieu-naissance_birthPlace'), GlobalVariable.lieuBirth)

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/span_Choisir'))

WebUI.setText(findTestObject('finance/13-creation_contact/page_iad/input_choisir_form-control-ui-select-search_780576'), 
    'France')

pays1 = WebUI.getText(findTestObject('finance/13-creation_contact/page_iad/span_FRANCE'))

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/span_FRANCE'))

GlobalVariable.pays = pays1

println(GlobalVariable.pays)

GlobalVariable.profession = ('test8' + jdcont)

WebUI.setText(findTestObject('finance/13-creation_contact/page_iad/input_Profession_job'), GlobalVariable.profession)

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/div_contact-adresse'))

GlobalVariable.phone1 = ('06' + jdcont)

println(GlobalVariable.phone1)

WebUI.setText(findTestObject('finance/13-creation_contact/page_iad/input_Tlphone_phone2'), GlobalVariable.phone1)

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/span_Ajouter un tlphone_fa fa-plus'))

GlobalVariable.phone2 = ('01' + jdcont)

println(GlobalVariable.phone2)

WebUI.setText(findTestObject('finance/13-creation_contact/page_iad/input_Tlphone_phone4'), GlobalVariable.phone2)

GlobalVariable.email1 = (('test6.' + jdcont) + '@gmail.com')

println(GlobalVariable.email1)

WebUI.setText(findTestObject('finance/13-creation_contact/page_iad/input_e-mail-personnel_emailpersonal-3'), GlobalVariable.email1)

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/button_ajouter-email_btn btn-primary btn-add'))

GlobalVariable.email2 = (('test7.' + jdcont) + '@gmail.com')

println(GlobalVariable.email2)

WebUI.setText(findTestObject('finance/13-creation_contact/page_iad/input_E-mail personnel_emailPersonal-5'), GlobalVariable.email2)

WebUI.click(findTestObject('finance/26-page_iad/span_france-test'))

WebUI.setText(findTestObject('finance/13-creation_contact/page_iad/input_france_form-control-ui-select-search _8034ae'), 
    'France')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('finance/13-creation_contact/page_iad/input_france_form-control-ui-select-search _8034ae'), 
    Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('finance/13-creation_contact/page_iad/input_france_form-control-ui-select-search _8034ae'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(6)

WebUI.setText(findTestObject('finance/13-creation_contact/page_iad/input_Adresse_address1'), 'a')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('finance/13-creation_contact/page_iad/input_Adresse_address1'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Etape2/CreationContact/Page_IAD/input_Adresse_address1'), Keys.chord(Keys.INSERT))

WebUI.delay(6)

adressContac = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_Adresse_address1'), 'value')

GlobalVariable.adressContact = adressContac

println(GlobalVariable.adressContact)

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/span_enregistrer-contact'))

WebUI.delay(8)

