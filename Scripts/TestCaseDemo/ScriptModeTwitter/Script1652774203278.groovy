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
WebUI.navigateToUrl("https://twitter.com/")

//mencari tombol sign in
WebUI.click(findTestObject('Object Repository/ScriptModeTwitter/ScriptModeTwitteer/Page_Twitter. Its whats happening  Twitter/div_Sign in'))

//mengisi user name
WebUI.setText(findTestObject('Object Repository/ScriptModeTwitter/ScriptModeTwitteer/Page_Twitter/input_Phone, email, or username_text'), "darylaa")

//klik tombol next untuk mengisi password
WebUI.click(findTestObject('Object Repository/ScriptModeTwitter/ScriptModeTwitteer/Page_Twitter/div_Next'))

//mengisi password
//encrypt-nya lewat menu -> help -> encrypt test
WebUI.setEncryptedText(findTestObject('Object Repository/ScriptModeTwitter/ScriptModeTwitteer/Page_Twitter/input_Password_password'), "sWRHBiqTjdz2bz8j4SH8ew==")

//click tombol login
WebUI.click(findTestObject('Object Repository/ScriptModeTwitter/ScriptModeTwitteer/Page_Twitter/div_Log in'))

//mencari tombol logout
WebUI.click(findTestObject('Object Repository/ScriptModeTwitter/ScriptModeTwitteer/Page_Home  Twitter/div_Accounts_css-1dbjc4n r-172uzmj r-1pi2ts_155bc8'))

//mencari tombol logout
WebUI.click(findTestObject('Object Repository/ScriptModeTwitter/ScriptModeTwitteer/Page_Home  Twitter/span_Log out Darylaa'))

//klik tomblo logout
WebUI.click(findTestObject('Object Repository/ScriptModeTwitter/ScriptModeTwitteer/Page_Twitter/div_Log out'))

//close browser
WebUI.closeBrowser()

