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

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI  Login/input_username'), 'Mahasiswi-PKL-2023-Rifka-OPD')

WebUI.setEncryptedText(findTestObject('Object Repository/TC016/Page_LINGGARJATI  Login/input_password'), 'skUWqW1xkazIsTiAEPVIJA==')

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/a_Aplikasi'))

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/a_Pendaftaran Aplikasi'))

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/a_Tambah Baru'))

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_nama_aplikasi'), 'Testing')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_alamat_url'), '')

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_alamat_url'))

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_alamat_url'), 'https://testingrifka.com')

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/span_Pilih No Rekomendasi'))

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/li_001'))

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/textarea_deskripsi_aplikasi'), 'Deskripsinya...')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC016/Page_LINGGARJATI/select_--Silahkan Pilih Status Aplikasi--  _fee1a7'), 
    'ON', true)

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_jenis_aplikasi1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC016/Page_LINGGARJATI/select_--Silahkan Pilih Status Pekerjaan-- _d2d55c'), 
    'Baru', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC016/Page_LINGGARJATI/select_--Silahkan Pilih PlatformOS yang dig_ff2048'), 
    'Windows', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC016/Page_LINGGARJATI/select_--Pilih Web Server yang diganakan-- _d35814'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC016/Page_LINGGARJATI/select_--Pilih Web Server yang diganakan-- _e5838a'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC016/Page_LINGGARJATI/select_--Pilih Bahasa Pemrograman yang diga_928580'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_versi_bahasa'), '7.4')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_port'), '8080')

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/div_Database Server                        _41bade'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC016/Page_LINGGARJATI/select_--Silahkan Pilih--                Pu_aab13d'), 
    'Lokal', true)

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_adm_user_aplikasi'), 'admintesting')

WebUI.setEncryptedText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_adm_password_aplikasi'), '8SQVv/p9jVRmH5IEp/bXBg==')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_adm_username_db'), 'inidb')

WebUI.setEncryptedText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_adm_password_db'), '8SQVv/p9jVQogKLy4O/qig==')

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_pjkegiatan_nama'), 'RIfka Umdati')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_pjkegiatan_nip'), '12345')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_pjkegiatan_jabatan'), 'Ketua tim')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_pjkegiatan_telp'), '08989898989')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_pjkegiatan_email'), 'rifka.com')

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/button_Selanjutnya_1'))

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_pjteknis_nama'), 'Rifka Umdati')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_pjteknis_nip'), '12345')

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_pjteknis_jabatan'))

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_pjteknis_jabatan'), 'Ketua tim')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_pjteknis_telp'), '089898989')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_pjteknis_email'), 'rifka.@mail.com')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_vendor_nama'), 'Penyedia')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_vendor_alamat'), 'alamatnya')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_vendor_telp'), '08888888')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_vendor_cp'), '087777777')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_vendor_email'), 'pengembang')

WebUI.setText(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_vendor_cp'), '087777777')

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/input_vendor_cp'))

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/button_Selanjutnya_1_2'))

WebUI.click(findTestObject('Object Repository/TC016/Page_LINGGARJATI/i_fa fa-save'))

WebUI.closeBrowser()

