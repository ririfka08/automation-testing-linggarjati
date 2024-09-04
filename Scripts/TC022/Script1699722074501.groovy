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

WebUI.setText(findTestObject('Object Repository/TC022/Page_LINGGARJATI  Login/input_username'), 'Mahasiswi-PKL-2023-Rifka-OPD')

WebUI.setEncryptedText(findTestObject('Object Repository/TC022/Page_LINGGARJATI  Login/input_password'), 'skUWqW1xkazIsTiAEPVIJA==')

WebUI.click(findTestObject('Object Repository/TC022/Page_LINGGARJATI  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/TC022/Page_LINGGARJATI/a_Aplikasi'))

WebUI.click(findTestObject('Object Repository/TC022/Page_LINGGARJATI/a_Permohonan Vulnerability Assessment'))

WebUI.click(findTestObject('Object Repository/TC022/Page_LINGGARJATI/a_Permohonan Baru'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC022/Page_LINGGARJATI/select_--Pilih Nama AplikasiLayanan--      _99f2ba'), 
    '269', true)

WebUI.setText(findTestObject('Object Repository/TC022/Page_LINGGARJATI/input_alamat_aplikasi'), 'https://testingrika.com')

WebUI.setText(findTestObject('Object Repository/TC022/Page_LINGGARJATI/input_username_login'), '')

WebUI.doubleClick(findTestObject('Object Repository/TC022/Page_LINGGARJATI/input_username_login'))

WebUI.setText(findTestObject('Object Repository/TC022/Page_LINGGARJATI/input_username_login'), 'admin1')

WebUI.setEncryptedText(findTestObject('Object Repository/TC022/Page_LINGGARJATI/input_password_login'), 'WI9a5Gh4GhM=')

WebUI.setText(findTestObject('Object Repository/TC022/Page_LINGGARJATI/input_pjkegiatan_nama'), '')

WebUI.setText(findTestObject('Object Repository/TC022/Page_LINGGARJATI/input_pjkegiatan_nip'), '')

WebUI.click(findTestObject('Object Repository/TC022/Page_LINGGARJATI/input_pjkegiatan_nama'))

WebUI.setText(findTestObject('Object Repository/TC022/Page_LINGGARJATI/input_pjkegiatan_nama'), 'Rifka Umdati')

WebUI.setText(findTestObject('Object Repository/TC022/Page_LINGGARJATI/input_nama_pjteknis_pentest'), 'Rifka Umdati')

WebUI.setText(findTestObject('Object Repository/TC022/Page_LINGGARJATI/input_jabatan_pjteknis_pentest'), 'Ketua tim')

WebUI.setText(findTestObject('Object Repository/TC022/Page_LINGGARJATI/input_telp_pjteknis_pentest'), '089898989')

WebUI.setText(findTestObject('Object Repository/TC022/Page_LINGGARJATI/input_email_pjteknis_pentest'), '')

WebUI.click(findTestObject('Object Repository/TC022/Page_LINGGARJATI/button_Simpan'))

WebUI.click(findTestObject('Object Repository/TC022/Page_LINGGARJATI/div_NIP                  Please enter a val_1809d9'))

WebUI.click(findTestObject('Object Repository/TC022/Page_LINGGARJATI/label_Please enter a valid number'))

WebUI.click(findTestObject('Object Repository/TC022/Page_LINGGARJATI/div_Email                  This field is required'))

WebUI.click(findTestObject('Object Repository/TC022/Page_LINGGARJATI/label_This field is required'))

WebUI.closeBrowser()

