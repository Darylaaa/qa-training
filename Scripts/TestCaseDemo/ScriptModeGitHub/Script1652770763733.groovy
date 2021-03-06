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
WebUI.openBrowser("")

//menuju link web
WebUI.navigateToUrl("https://github.com/")

//klik tombol navigate url
WebUI.click(findTestObject('Object Repository/Manual Mode Github/Page_GitHub Where the world builds software  GitHub/a_Sign in'))

//mengisi user name
WebUI.setText(findTestObject('Object Repository/Manual Mode Github/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), "daryladriantoo@gmail.com")

//mengisi password
//encrypt-nya lewat menu -> help -> encrypt test
WebUI.setEncryptedText(findTestObject('Object Repository/Manual Mode Github/Page_Sign in to GitHub  GitHub/input_Password_password'), "RmmOQXUAVA7eMylY5IoiCQ==")

//click tombol login
WebUI.click(findTestObject('Object Repository/Manual Mode Github/Page_Sign in to GitHub  GitHub/input_Password_commit'))

//mencari button logout
WebUI.click(findTestObject('Manual Mode Github/Page_GitHub/summary_New project_Header-link'))

//logout
WebUI.click(findTestObject('Manual Mode Github/Page_GitHub/button_Sign out'))

//close the browser
WebUI.closeBrowser()