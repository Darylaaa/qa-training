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

// GROOVY
// membuka halaman web
WebUI.openBrowser('')

//menuju link web
WebUI.navigateToUrl("https://www.instagram.com/")

//mengisi user name
WebUI.setText(findTestObject('Object Repository/Intagram/Page_Instagram/input_Phone number, username, or email_username'), "drylaaa")

//mengisi password
//encrypt-nya lewat menu -> help -> encrypt test
WebUI.setEncryptedText(findTestObject('Object Repository/Intagram/Page_Instagram/input_Password_password'), "Ad7guFF+3OVJEQgfrK9NIg==")

//click tombol login
WebUI.click(findTestObject('Object Repository/Intagram/Page_Instagram/div_Log In'))

//klik notnow
WebUI.click(findTestObject('Object Repository/Intagram/Page_Instagram/button_Not Now'))

//klik not now
WebUI.click(findTestObject('Object Repository/Intagram/Page_Instagram/button_Not Now_1'))

//mencari tombol logout
WebUI.click(findTestObject('Intagram/Page_Instagram/img_Now you can create and share posts dire_539f07'))

//klik logout
WebUI.click(findTestObject('Intagram/Page_Instagram/div_Log Out'))

//close browser
WebUI.closeBrowser()

