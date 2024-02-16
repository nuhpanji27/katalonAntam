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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cms-uat.apps.lembah.antam.com/login')

WebUI.setText(findTestObject('Object Repository/Portal/Page_ANTAM Logam Mulia - Portal/Page_ANTAM Logam Mulia - Portal/input_Username_input-24'), 
    'adminportal4')

WebUI.setEncryptedText(findTestObject('Object Repository/Portal/Page_ANTAM Logam Mulia - Portal/Page_ANTAM Logam Mulia - Portal/input_Password_input-27'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Portal/Page_ANTAM Logam Mulia - Portal/Page_ANTAM Logam Mulia - Portal/span_Login'))

WebUI.click(findTestObject('Object Repository/Portal/Page_ANTAM Logam Mulia - Portal/Page_ANTAM Logam Mulia - Portal/button_Login Terakhir 10 Okt 2023, 13.56.09_868296'))

WebUI.click(findTestObject('Portal/Page_ANTAM Logam Mulia - Portal/Page_ANTAM Logam Mulia - Portal/Page_ANTAM Logam Mulia - Portal/div_Logout'))

