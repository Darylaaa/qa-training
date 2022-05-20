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

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('Object Repository/Tugas/Instagram/Page_Masuk  Instagram/input_Nomor Ponsel atau Email_emailOrPhone'), 
    email)

WebUI.setText(findTestObject('Object Repository/Tugas/Instagram/Page_Masuk  Instagram/input_Nama Lengkap_fullName'), name)

WebUI.setText(findTestObject('Object Repository/Tugas/Instagram/Page_Masuk  Instagram/input_Nama pengguna_username'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Tugas/Instagram/Page_Masuk  Instagram/input_Kata Sandi_password'), 
    password)

WebUI.click(findTestObject('Object Repository/Tugas/Instagram/Page_Masuk  Instagram/button_Daftar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Tugas/Instagram/Page_Masuk  Instagram/select_JanuariFebruariMaretAprilMeiJuniJuli_13de9b'), 
    month, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Tugas/Instagram/Page_Masuk  Instagram/select_123456789101112131415161718192021222_d181e2'), 
    days, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Tugas/Instagram/Page_Masuk  Instagram/select_202220212020201920182017201620152014_d959b4'), 
    years, true)

WebUI.click(findTestObject('Object Repository/Tugas/Instagram/Page_Masuk  Instagram/button_Selanjutnya'))

