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

WebUI.setText(findTestObject('Object Repository/TC028/Page_LINGGARJATI  Login/input_username'), 'Mahasiswi-PKL-2023-Rifka-OPD')

WebUI.setEncryptedText(findTestObject('Object Repository/TC028/Page_LINGGARJATI  Login/input_password'), 'skUWqW1xkazIsTiAEPVIJA==')

WebUI.click(findTestObject('Object Repository/TC028/Page_LINGGARJATI  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/TC028/Page_LINGGARJATI/span_Aplikasi'))

WebUI.click(findTestObject('Object Repository/TC028/Page_LINGGARJATI/a_Permohonan Layanan IP Public dan Subdomain'))

WebUI.click(findTestObject('Object Repository/TC028/Page_LINGGARJATI/a_Permohonan Baru'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC028/Page_LINGGARJATI/select_--Pilih Nama AplikasiLayanan--      _99f2ba'), 
    '270', true)

WebUI.setText(findTestObject('Object Repository/TC028/Page_LINGGARJATI/input_nama_subdomain'), 'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC028/Page_LINGGARJATI/select_Dinas Komunikasi dan Informatika'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/TC028/Page_LINGGARJATI/input_pjkegiatan_nama'), 'Rifka Umdati')

WebUI.setText(findTestObject('Object Repository/TC028/Page_LINGGARJATI/input_pjkegiatan_nip'), '12345')

WebUI.setText(findTestObject('Object Repository/TC028/Page_LINGGARJATI/input_pjkegiatan_jabatan'), 'Ketua tim')

WebUI.setText(findTestObject('Object Repository/TC028/Page_LINGGARJATI/input_pjkegiatan_telp'), '089898989')

WebUI.setText(findTestObject('Object Repository/TC028/Page_LINGGARJATI/input_pjkegiatan_email'), 'rifka')

WebUI.setText(findTestObject('Object Repository/TC028/Page_LINGGARJATI/input_ipnama_pj'), 'Rifka Umdati')

WebUI.setText(findTestObject('Object Repository/TC028/Page_LINGGARJATI/input_ipnip_pj'), '12345')

WebUI.setText(findTestObject('Object Repository/TC028/Page_LINGGARJATI/input_ipjabatan_pj'), 'ketua tim')

WebUI.setText(findTestObject('Object Repository/TC028/Page_LINGGARJATI/input_iptelp_pj'), '089999999999')

WebUI.setText(findTestObject('Object Repository/TC028/Page_LINGGARJATI/input_ipemail_pj'), 'rifka@mail.com')

WebUI.click(findTestObject('Object Repository/TC028/Page_LINGGARJATI/button_Simpan'))

WebUI.acceptAlert()

WebUI.closeBrowser()

