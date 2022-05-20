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

WebUI.click(findTestObject('Object Repository/Tugas/Twitter/Page_Twitter. Its whats happening  Twitter/span_Sign up with phone or email'))

WebUI.setText(findTestObject('Object Repository/Tugas/Twitter/Page_Sign up for Twitter  Twitter/input_Name_name'), name)

WebUI.click(findTestObject('Object Repository/Tugas/Twitter/Page_Sign up for Twitter  Twitter/span_Use email instead'))

WebUI.setText(findTestObject('Object Repository/Tugas/Twitter/Page_Sign up for Twitter  Twitter/input_Email_email'), email)

WebUI.selectOptionByValue(findTestObject('Object Repository/Tugas/Twitter/Page_Sign up for Twitter  Twitter/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    days, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Tugas/Twitter/Page_Sign up for Twitter  Twitter/select_123456789101112131415161718192021222_566da4'), 
    month, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Tugas/Twitter/Page_Sign up for Twitter  Twitter/select_202220212020201920182017201620152014_d959b4'), 
    years, true)

WebUI.click(findTestObject('Object Repository/Tugas/Twitter/Page_Sign up for Twitter  Twitter/div_Next'))

WebUI.click(findTestObject('Object Repository/Tugas/Twitter/Page_Twitter. Its whats happening  Twitter/div_Next'))

WebUI.click(findTestObject('Object Repository/Tugas/Twitter/Page_Twitter. Its whats happening  Twitter/div_Sign up'))

