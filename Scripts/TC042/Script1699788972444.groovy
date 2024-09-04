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

WebUI.navigateToUrl('https://linggarjati.kuningankab.go.id/')

WebUI.setText(findTestObject('Object Repository/TC042/Page_LINGGARJATI  Login/input_username'), 'Mahasiswi-PKL-2023-Rifka-OPD')

WebUI.setEncryptedText(findTestObject('Object Repository/TC042/Page_LINGGARJATI  Login/input_password'), 'skUWqW1xkazIsTiAEPVIJA==')

WebUI.sendKeys(findTestObject('Object Repository/TC042/Page_LINGGARJATI  Login/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TC042/Page_LINGGARJATI/a_Perangkat'))

WebUI.click(findTestObject('Object Repository/TC042/Page_LINGGARJATI/a_Permohonan Co-location Server'))

WebUI.click(findTestObject('Object Repository/TC042/Page_LINGGARJATI/a_Permohonan Baru'))

WebUI.setText(findTestObject('Object Repository/TC042/Page_LINGGARJATI/input_jml_server_virtual'), '')

WebUI.setText(findTestObject('Object Repository/TC042/Page_LINGGARJATI/input_pjkegiatan_nama'), 'rifka umdati')

WebUI.setText(findTestObject('Object Repository/TC042/Page_LINGGARJATI/input_pjkegiatan_nip'), '')

WebUI.setText(findTestObject('Object Repository/TC042/Page_LINGGARJATI/input_pjkegiatan_jabatan'), 'ketua')

WebUI.setText(findTestObject('Object Repository/TC042/Page_LINGGARJATI/input_pjkegiatan_telp'), '089898989')

WebUI.setText(findTestObject('Object Repository/TC042/Page_LINGGARJATI/input_pjkegiatan_email'), 'rifka@mail.com')

WebUI.setText(findTestObject('Object Repository/TC042/Page_LINGGARJATI/input_cnama_pj'), 'rifka')

WebUI.setText(findTestObject('Object Repository/TC042/Page_LINGGARJATI/input_cnip_pj'), '123456')

WebUI.setText(findTestObject('Object Repository/TC042/Page_LINGGARJATI/input_cjabatan_pj'), 'pjnya')

WebUI.setText(findTestObject('Object Repository/TC042/Page_LINGGARJATI/input_ctelp_pj'), '08989898989')

WebUI.setText(findTestObject('Object Repository/TC042/Page_LINGGARJATI/input_cemail_pj'), 'pjnya@mail.com')

WebUI.click(findTestObject('Object Repository/TC042/Page_LINGGARJATI/button_Simpan'))

WebUI.click(findTestObject('Object Repository/TC042/Page_LINGGARJATI/label_This field is required'))

WebUI.click(findTestObject('Object Repository/TC042/Page_LINGGARJATI/label_Please enter a valid number'))

WebUI.closeBrowser()

