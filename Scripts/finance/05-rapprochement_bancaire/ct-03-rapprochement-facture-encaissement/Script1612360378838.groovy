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

WebUI.callTestCase(findTestCase('finance/05-rapprochement_bancaire/ct-01-authentification-gestionnaire'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('finance/02-rapprochement-bancaire/a_factures-paiement'))

WebUI.click(findTestObject('finance/02-rapprochement-bancaire/a_rapprochements-bancaires'))

WebUI.refresh()

WebUI.click(findTestObject('finance/02-rapprochement-bancaire/mat-icon-pencil'))

a = WebUI.getText(findTestObject('finance/02-rapprochement-bancaire/mat-cell_montant-ttc'))
a1 = a.replace(' ', '')

a2 = a1.replace(',', '.')

a3 = Double.parseDouble(a2)

println (a3)

n = WebUI.getText(findTestObject('Object Repository/finance/02-rapprochement-bancaire/a_num-facture'))



if (n == GlobalVariable.num_facture) {
    if (a3 == GlobalVariable.MontantTTCRapp) {
        WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/mat-icon_ymanci_mat-icon-notranslate-fal-fa_727574'), 
            0)

        WebUI.click(findTestObject('finance/02-rapprochement-bancaire/mat-icon_ymanci_mat-icon-notranslate-fal-fa_727574'))

        WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/mat-icon_concat-Indication-d-affaire_mat_59da36'), 
            0)

        WebUI.click(findTestObject('finance/02-rapprochement-bancaire/mat-icon_concat-Indication-d-affaire_mat_59da36'))

        WebUI.delay(2)

        WebUI.verifyElementPresent(findTestObject('finance/02-rapprochement-bancaire/button_confirmer'), 0)

        WebUI.verifyElementClickable(findTestObject('finance/02-rapprochement-bancaire/button_confirmer'))

        WebUI.click(findTestObject('finance/02-rapprochement-bancaire/button_confirmer'))
    } else {
        println('la facture à liaisonner est inexistante')
    }
    
    WebUI.delay(5)
} else {
    println('la facture à liaisonner est inexistante')
}

WebUI.delay(5)

not_run: WebUI.closeBrowser()

