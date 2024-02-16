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

WebUI.navigateToUrl('https://ecommerce-uat.apps.lembah.antam.com/dashboard')

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/span_KONTAK KAMI'))

WebUI.setText(findTestObject('Object Repository/Page_PT ANTAM Tbk/input__input-274'), 'Nuh Panji Alyansyah')

WebUI.setText(findTestObject('Object Repository/Page_PT ANTAM Tbk/input__input-276'), 'nuhpanjialyansyah@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_PT ANTAM Tbk/textarea__input-278'), 'test satu dua tiga')

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/img_Click verify once there are none left._rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/img_Click verify once there are none left._rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/img_Click verify once there are none left._rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/div_Click verify once there are none left.__16f7c9'))

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/img_Click verify once there are none left.__688bf0'))

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/img_Click verify once there are none left.__688bf0'))

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/img_Click verify once there are none left.__688bf0'))

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/div_Click verify once there are none left.__16f7c9_1'))

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/div_Click verify once there are none left.__16f7c9_1'))

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/span_Kirim Pesan'))

WebUI.setText(findTestObject('Object Repository/Page_PT ANTAM Tbk/input__input-274'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_PT ANTAM Tbk/input__input-276'), 'nuhpanjialyansyah@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_PT ANTAM Tbk/textarea__input-278'), 'test satu dua 3')

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/span_Kirim Pesan'))

WebUI.click(findTestObject('Object Repository/Page_PT ANTAM Tbk/div_reCAPTCHA_recaptcha-checkbox-border'))

