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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('finance/29-verification-contacts/page_iad/a_Myiad'))

WebUI.setText(findTestObject('finance/29-verification-contacts/page_iad/input_Afficher_search'), GlobalVariable.PrenomAcq2)

WebUI.verifyElementPresent(findTestObject('finance/29-verification-contacts/page_iad/a_acquadd12449-acquadd22449'), 5, FailureHandling.OPTIONAL)

SearchPrenom = WebUI.getText(findTestObject('finance/29-verification-contacts/page_iad/a_acquadd12449-acquadd22449'))

contacname = ((GlobalVariable.NomAcq2 + ' ') + GlobalVariable.PrenomAcq2)

contactName = "$contacname"

println(contacname)

println(SearchPrenom)

if (contacname == SearchPrenom) {
	println('le contact est bien créé à parrtir de formulaire IA')
} else {
	println('le contact n\'est bien créé -> problème de création d\'un acquereur depuis le formulaire IA')

	WebUI.delay(5)
}

WebUI.setText(findTestObject('finance/29-verification-contacts/page_iad/input_Afficher_search'), GlobalVariable.Prenom)

not_run: WebUI.click(findTestObject('Etape2/Verification-contacts/Page_IAD/div_Filtres_iad-list-item-title'))

WebUI.delay(3)

WebUI.click(findTestObject('finance/29-verification-contacts/page_iad/a_acquadd1638-acquadd2638'))

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/page_iad/input_Prnom_firstName'), 5, FailureHandling.OPTIONAL)) {
	firstname1 = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_Prnom_firstName'), 'value')

	if (firstname1 == GlobalVariable.Prenom) {
		println(('le nom de l\'aquéreur est ' + firstname1) + ' L\'element est bien existe et bien modifié par l IA')
	} else {
		println(('le nom de l\'aquéreur est ' + firstname1) + ' L\'element est bien existe, mais n est pas modifié par l IA')
	}
} else {
	println(' L\'element Nom a été supprimé après la modification depuis l\'IA')
}

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/page_iad/input_Nom_lastName'), 5, FailureHandling.OPTIONAL)) {
	lasname1 = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_Nom_lastName'), 'value')

	if (lasname1 == GlobalVariable.Nom) {
		println(('le Prenom de l\'aquéreur est ' + lasname1) + ' L\'element est bien existe et bien modifié par L IA')
	} else {
		println(('le Prenom de l\'aquéreur est ' + lasname1) + ' L\'element est bien existe mais n est pas  modifié par L IA')
	}
} else {
	println(' L\'element prenom a été supprimé après la modification depuis l\'IA')
}

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/page_iad/input_concat(Nom-usage)_usageName'), 5,
	FailureHandling.OPTIONAL)) {
	usedname1 = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_concat(Nom-usage)_usageName'), 'value')

	if (usedname1 == GlobalVariable.usedname) {
		println(('le nom utilisé de l\'aquéreur est ' + usedname1) + ' L\'element est bien existe et bien modifié par l IA')
	} else {
		println(('le nom utilisé de l\'aquéreur est ' + usedname1) + ' L\'element est bien existe mais n est pas modifié par l IA')
	}
} else {
	println(' L\'element used name a été supprimé après la modification depuis l\'IA')
}

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/page_iad/input_nom-jeune fille_birthName'), 5,
	FailureHandling.OPTIONAL)) {
	jeunefille1 = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_nom-jeune fille_birthName'), 'value')

	if (jeunefille1 == GlobalVariable.jeunefille) {
		println(('le nom jeune fille de l\'aquéreur est ' + jeunefille1) + ' L\'element est bien existe et bien modifié par l IA')
	} else {
		println(('le nom jeune fille de l\'aquéreur est ' + jeunefille1) + ' L\'element est bien existe mais n est pas modifié par l IA')
	}
} else {
	println(' L\'element nom jeune fille a été supprimé après la modification depuis l\'IA')
}

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/page_iad/input_date-naissance_birth_date'), 5, FailureHandling.OPTIONAL)) {
	datebirth1 = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_date-naissance_birth_date'), 'value')

	if (datebirth1 == GlobalVariable.DateNaissance) {
		println(('la date de naissance de l\'aquéreur est ' + datebirth1) + ' L\'element est bien existe et bien modifié par l IA')
	} else {
		println(('la date de naissance de l\'aquéreur est ' + datebirth1) + ' L\'element est bien existe mais n est pas modifié par l IA')
	}
} else {
	println(' L\'element date de naissance a été supprimé après la modification depuis l\'IA')
}

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/page_iad/input_lieu-naissance_birthPlace'), 5,
	FailureHandling.OPTIONAL)) {
	lieuNaiss1 = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_lieu-naissance_birthPlace'), 'value')

	if (lieuNaiss1 == GlobalVariable.lieuBirth) {
		println(('le lieu de naissance de l\'aquéreur est ' + lieuNaiss1) + ' L\'element est bien existe et bien modifié par l IA')
	} else {
		println(('le lieu de naissance de l\'aquéreur est ' + lieuNaiss1) + ' L\'element est bien existe mais n est pas modifié par l IA')
	}
} else {
	println(' L\'element lieu de naissance a été supprimé après la modification depuis l\'IA')
}

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/Span-modif/page_iad/span_FRANCE'), 5, FailureHandling.OPTIONAL)) {
	pays2 = WebUI.getText(findTestObject('finance/13-creation_contact/page_iad/span_FRANCE'))

	if (pays2 == GlobalVariable.pays) {
		println(('le pays de l\'aquéreur est ' + pays2) + ' L\'element est bien existe et bien modifié par l IA')
	} else {
		println(('le pays de l\'aquéreur est ' + pays2) + ' L\'element est bien existe mais nest pas modifié par l IA')
	}
} else {
	println(' L\'element pays a été supprimé après la modification depuis l\'IA')
}

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/page_iad/input_Profession_job'), 5, FailureHandling.OPTIONAL)) {
	profession1 = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_Profession_job'), 'value')

	if (profession1 == GlobalVariable.profession) {
		println(('le profession de l\'aquéreur est ' + profession1) + ' L\'element est bien existe et bien modifié par IA')
	} else {
		println(('le profession de l\'aquéreur est ' + profession1) + ' L\'element est bien existe mais n est pas modifié par l IA')
	}
} else {
	println(' L\'element profession a été supprimé après la modification depuis l\'IA')
}

WebUI.click(findTestObject('finance/13-creation_contact/page_iad/div_contact-adresse'))

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/page_iad/input_Tlphone_phone2'), 5, FailureHandling.OPTIONAL)) {
	phone11 = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_Tlphone_phone2'), 'value')

	if (phone11 == GlobalVariable.phone7) {
		println(('le nom phone 1 de l\'aquéreur est ' + phone11) + ' L\'element est bien existe et bien modifié par l IA')
	} else {
		println(('le nom phone 1 de l\'aquéreur est ' + phone11) + ' L\'element est bien existe mais n est pas modifié par l IA')
	}
} else {
	println(' L\'element phone 1 a été supprimé après la modification depuis l\'IA')
}

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/page_iad/input_Tlphone_phone4'), 5, FailureHandling.OPTIONAL)) {
	phone22 = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_Tlphone_phone4'), 'value')

	if (phone22 == GlobalVariable.phone2) {
		println(('le nom phone 2 de l\'aquéreur est ' + phone22) + ' L\'element est bien existe et bien modifié par l IA')
	} else {
		println(('le nom phone 2 de l\'aquéreur est ' + phone22) + ' L\'element est bien existe mais n est pas modifié par l IA')
	}
} else {
	println(' L\'element phone 2 a été supprimé après la modification depuis l\'IA')
}

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/page_iad/input_e-mail-personnel_emailpersonal-3'),
	5, FailureHandling.OPTIONAL)) {
	email11 = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_e-mail-personnel_emailpersonal-3'), 'value')

	if (email11 == GlobalVariable.emailAcq) {
		println(('le nom email 1 de l\'aquéreur est ' + email11) + ' L\'element est bien existe et bien modifié par l IA')
	} else {
		println(('le nom email 1 de l\'aquéreur est ' + email11) + ' L\'element est bien existe mais n est pas modifié par l IA')
	}
} else {
	println(' L\'element email 1 a été supprimé après la modification depuis l\'IA')
}

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/page_iad/input_E-mail personnel_emailPersonal-5'),
	5, FailureHandling.OPTIONAL)) {
	email22 = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_E-mail personnel_emailPersonal-5'), 'value')

	if (email22 == GlobalVariable.email2) {
		println(('le nom email 2 de l\'aquéreur est ' + email22) + ' L\'element est bien existe et bien modifié par l IA')
	} else {
		println(('le nom email 2 de l\'aquéreur est ' + email22) + ' L\'element est bien existe mais n est pas modifié par l IA')
	}
} else {
	println(' L\'element email 2 a été supprimé après la modification depuis l\'IA')
}

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/page_iad/input_france_form-control-ui-select-search _8034ae'),
	5, FailureHandling.OPTIONAL)) {
	pays3 = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_france_form-control-ui-select-search _8034ae'),
		'value')

	if (pays3 == GlobalVariable.pays) {
		println(('le pays 2 de l\'aquéreur est ' + pays3) + ' L\'element est bien existe et bien modifié par l IA')
	} else {
		println(('le pays 2 de l\'aquéreur est ' + pays3) + ' L\'element est bien existe et bien modifié par l IA')
	}
} else {
	println(' L\'element pays 2 a été supprimé après la modification depuis l\'IA')
}

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('finance/13-creation_contact/page_iad/input_Adresse_address1'), 5, FailureHandling.OPTIONAL)) {
	adresse1 = WebUI.getAttribute(findTestObject('finance/13-creation_contact/page_iad/input_Adresse_address1'), 'value')

	if (adresse1 == GlobalVariable.Adresse7) {
		println(('l\'adresse 2 de l\'aquéreur est ' + adresse1) + ' L\'element est bien existe et bien modifié par l IA')
	} else {
		println(('l\'adresse 2 de l\'aquéreur est ' + adresse1) + ' L\'element est bien existe mais n est pas modifié par l IA')
	}
} else {
	println(' L\'element l\'adresse a été supprimé après la modification depuis l\'IA')
}

