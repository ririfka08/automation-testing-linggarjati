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

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI  Login/input_username'), 'Mahasiswi-PKL-2023-Rifka-OPD')

WebUI.setEncryptedText(findTestObject('Object Repository/TC035/Page_LINGGARJATI  Login/input_password'), 'skUWqW1xkazIsTiAEPVIJA==')

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI/a_Perangkat'))

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI/a_Pendaftaran Perangkat'))

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI/a_Tambah Baru'))

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_nama_server'), 'nama server')

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI/span_Pilih No Rekomendasi'))

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_merk'), 'tipenya')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_tgl_pembelian'), '')

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_tgl_pembelian'))

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI/td_13'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC035/Page_LINGGARJATI/select_--Pilih--                           _6dd8fa'), 
    'Redundant', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC035/Page_LINGGARJATI/select_--Pilih--                           _289e69'), 
    'Windows', true)

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_serial_number'), '234567')

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_serial_number'))

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_garansi'), 'garansi')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_dimensi'), '255')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_processor'), '2')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC035/Page_LINGGARJATI/select_--Pilih--                           _fd3fc5'), 
    '', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC035/Page_LINGGARJATI/select_--Pilih--                           _ee24e9'), 
    'Raid 5', true)

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_kebutuhan_power'), '30')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_password'), 'PXLSD1eETK9RfE/ZKJQW4A==')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_slot_hdd'), '4')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_jumlah_hdd'), '2')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_kapasitas_hdd'), '7')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_slot_memory'), '6')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_jumlah_memory'), '4')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_kapasitas_memory'), '7000')

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI/button_Tambah Data Form'))

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_nama_server_virtual'), 'namanya')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC035/Page_LINGGARJATI/select_--Pilih Nama AplikasiLayanan--Sistem_189b96'), 
    '269', true)

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_storage'), '6')

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI/div_Operating System'))

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_memory'), '4999')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_operating_system_virtual'), 'windows')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_username_server_virtual'), 'admin1')

WebUI.setEncryptedText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_password_server_virtual'), 'WI9a5Gh4GhM=')

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI/button_Selanjutnya_1'))

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_pjkegiatan_nama'), 'rifka umdati')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_pjkegiatan_nip'), '12345')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_pjkegiatan_jabatan'), 'pjnya')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_pjkegiatan_telp'), '0898989898')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_pjkegiatan_email'), 'pjnya@mail.com')

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI/button_Selanjutnya_1_2'))

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_pjteknis_nama'), 'rifka umdati')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_pjteknis_nip'), '12345')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_pjteknis_jabatan'), 'ketua')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_pjteknis_telp'), '08888888')

WebUI.setText(findTestObject('Object Repository/TC035/Page_LINGGARJATI/input_pjteknis_email'), 'rifka@mail.com')

WebUI.click(findTestObject('Object Repository/TC035/Page_LINGGARJATI/button_Simpan'))

WebUI.closeBrowser()

