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

WebUI.click(findTestObject('finance/09-creation-ia/page_iad/div_1474169projet-emelie02042020-achatHabi_9dbb01'))

WebUI.click(findTestObject('finance/09-creation-ia/page_iad/div_Filtres_iad-list-item-title'))

WebUI.click(findTestObject('finance/09-creation-ia/page_iad/i_Parking_iad-nav-item-icon business_indica_151f79'))

WebUI.click(findTestObject('finance/09-creation-ia/page_iad/button_indication-daffaires'))

seqAcq1 = CustomKeywords.'com.keyrn.NumMobileSequence.generateSequence'()

jdAcq = ((seqAcq1) as int)

String jdAcquereur = "$jdAcq"

not_run: WebUI.getText(findTestObject('Etape2/Acquereur/verif-modif/Page_IAD/div_Monsieur'))

GlobalVariable.Nom = ('Acquereur1' + jdAcquereur)

WebUI.setText(findTestObject('finance/07-acquereur/add_acq/name_object'), GlobalVariable.Nom)

GlobalVariable.Prenom = ('Acquereur2' + jdAcquereur)

WebUI.setText(findTestObject('finance/07-acquereur/add_acq/input_Genre_mat-input-2'), GlobalVariable.Prenom)
println(GlobalVariable.Prenom)

WebUI.setText(findTestObject('finance/07-acquereur/add_acq/input_ADRESSE_mat-input-7'), 'FRANCE')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('finance/07-acquereur/add_acq/input_ADRESSE_mat-input-7'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('finance/07-acquereur/add_acq/input_ADRESSE_mat-input-7'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('finance/07-acquereur/add_acq/input_Pays_1589984400648'), 'a')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('finance/07-acquereur/add_acq/input_Pays_1589984400648'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('finance/07-acquereur/add_acq/input_Pays_1589984400648'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

GlobalVariable.Adresse7 = WebUI.getAttribute(findTestObject('finance/07-acquereur/add_acq/input_Pays_1589984400648'), 'value')

println(GlobalVariable.Adresse7)

GlobalVariable.emailAcq = (('Acquereur3' + jdAcquereur) + '@gmail.com')

WebUI.setText(findTestObject('finance/07-acquereur/add_acq/input_informations-complmentaires_mat-input-9'), GlobalVariable.emailAcq)

SeqphoneAcq = (Math.random() * (9 - 6))

ifseq1 = ((SeqphoneAcq) as int)

if (ifseq1 == 0) {
	SeqphoneAcq1 = (SeqphoneAcq * 100000000)
} else {
	SeqphoneAcq1 = (SeqphoneAcq * 10000000)
}

phone6 = ((SeqphoneAcq1) as int)

println(phone6)

GlobalVariable.phone7 = ('01' + jdAcquereur)

WebUI.setText(findTestObject('finance/07-acquereur/verif-modif/page_iad/input_E-mail-invalide_mat-input-10'), GlobalVariable.phone7)

WebUI.click(findTestObject('finance/07-acquereur/add_acq/mat-icon_Test255_bi-avatar-icon mat-icon notranslate fas fa-plus-circle mat-icon-no-color'))

WebUI.click(findTestObject('finance/07-acquereur/verif-modif/page_iad/span_Confirmer'))

WebUI.click(findTestObject('finance/07-acquereur/add_acq/mat-icon_Test255_bi-avatar-icon mat-icon notranslate fas fa-plus-circle mat-icon-no-color'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/span_Genre'))

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/span_Madame'))

GlobalVariable.NomAcq2 = ('Acquadd1' + jdAcquereur)

WebUI.setText(findTestObject('finance/07-acquereur/add_acq/input_Genre_mat-input-2'), GlobalVariable.NomAcq2)

GlobalVariable.PrenomAcq2 = ('Acquadd2' + jdAcquereur)

WebUI.setText(findTestObject('finance/07-acquereur/add_acq/name_object'), GlobalVariable.PrenomAcq2)

not_run: WebUI.setText(findTestObject('finance/07-acquereur/add_acq/input_ADRESSE_mat-input-7'), 'France')

not_run: WebUI.delay(4)

not_run: WebUI.sendKeys(findTestObject('Etape2/Acquereur/add_acq/input_ADRESSE_mat-input-7'), Keys.chord(Keys.ARROW_DOWN))

not_run: WebUI.sendKeys(findTestObject('Etape2/Acquereur/add_acq/input_ADRESSE_mat-input-7'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('finance/07-acquereur/add_acq/input_Pays_1589984400648'), 'a')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('finance/07-acquereur/add_acq/input_Pays_1589984400648'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('finance/07-acquereur/add_acq/input_Pays_1589984400648'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

emailAcq1 = (('Addacqu' + jdAcquereur) + '@gmail.com')

WebUI.setText(findTestObject('finance/07-acquereur/verif-modif/page_iad/input_informations-complimentaires_mat-input-9'), emailAcq1)

WebUI.setText(findTestObject('finance/07-acquereur/verif-modif/page_iad/input_E-mail-invalide_mat-input-10'), '01' + jdAcquereur)

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/button_Suivant'))

not_run: WebUI.click(findTestObject('finance/07-acquereur/add_acq/span_Suivant'))

WebUI.delay(10)

M = (Math.random() * (9 - 6))

M1 = ((M) as int)

if (M1 == 0) {
	M1 = (M1 + 1)

	M2 = (M1 * 1000000)
} else {
	M2 = (M1 * 1000000)
}

String MontantRet = "$M2"

GlobalVariable.MontantRetro = MontantRet

println(GlobalVariable.MontantRetro)

WebUI.setText(findTestObject('finance/19-indication-affaires/page_iad/input_MONTANT DU PRT_mat-input-0'), GlobalVariable.MontantRetro)

WebUI.click(findTestObject('finance/19-indication-affaires/page_iad/span_Suivant'))

WebUI.delay(6)

not_run: WebUI.setText(findTestObject('Etape2/Creation-IA/Page_IAD/Page_IAD/input_Entrer un CP ou une ville_mat-input-12'),
	'@ZIMUT')

WebUI.check(findTestObject('finance/09-creation-ia/page_iad/Page_IAD/div_Entrer un nom_mat-checkbox-inner-container'))

not_run: WebUI.verifyElementText(findTestObject('Etape2/Creation-IA/Page_IAD/Page_IAD/h3_BANK 19089275'), '@ZIMUT')

WebUI.click(findTestObject('finance/09-creation-ia/page_iad/span_Choisir un contact'))

WebUI.click(findTestObject('finance/09-creation-ia/page_iad/span_En Najjary 39851439 Nezha39851439  (Angers France )'))

WebUI.click(findTestObject('finance/09-creation-ia/page_iad/span_Valider'))

WebUI.verifyElementPresent(findTestObject('finance/09-creation-ia/page_iad/span_Confirmer'), 0)

not_run: WebUI.verifyElementClickable(findTestObject('Etape2/Creation-IA/Page_IAD/span_Confirmer'))

WebUI.click(findTestObject('finance/09-creation-ia/page_iad/span_Confirmer'))

WebUI.click(findTestObject('finance/09-creation-ia/page_iad/i_Parking_iad-nav-item-icon business_indica_151f79'))

WebUI.click(findTestObject('finance/09-creation-ia/page_iad/strong_Test106 Nezha - 16888 - 05052020'))

test2 = WebUI.getText(findTestObject('finance/09-creation-ia/page_iad/strong_Test106 Nezha - 16888 - 05052020'))

WebUI.verifyElementText(findTestObject('finance/09-creation-ia/page_iad/Page_IAD/strong_Statut En cours'), 'Statut: En cours')

WebUI.delay(3)

