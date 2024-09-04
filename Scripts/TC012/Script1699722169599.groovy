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

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI  Login/input_username'), 'Mahasiswi-PKL-2023-Rifka-OPD')

WebUI.setEncryptedText(findTestObject('Object Repository/TC012/Page_LINGGARJATI  Login/input_password'), 'skUWqW1xkazIsTiAEPVIJA==')

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI/a_Aplikasi'))

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI/a_Rekomendasi Pembangunan Aplikasi'))

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI/a_Permohonan Baru'))

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_pjkegiatan_jabatan'))

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_pjkegiatan_jabatan'), 'Ketua')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_pjkegiatan_nama'), 'Rifka Umdati')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_pjkegiatan_nip'), '')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_pjkegiatan_telp'), '08989898989')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_pjkegiatan_email'), 'rifka@mail.com')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_nama_kegiatan_apk'), 'Testing website')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_nama_pekerjaan_apk'), 'Mahasiswa')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_tahun_anggaran'), '2023')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/textarea_latar_belakang'), 'Latarbelakangnya...')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/textarea_dasar_hukum'), 'Dasar hukumnya...')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/textarea_tujuan_sasaran'), 'Tujuan dan sasarannya...')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/textarea_kriteria_ukuran'), 'Kriterinya...')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/textarea_proses_bisnis'), 'Alurnya....')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC012/Page_LINGGARJATI/select_Baru                  Pengembangan  _55895e'), 
    'Baru', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC012/Page_LINGGARJATI/select_Baru                  Pengembangan  _55895e'), 
    'Pengembangan', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC012/Page_LINGGARJATI/select_Baru                  Pengembangan  _55895e'), 
    'Baru', true)

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI/div_Jenis Aplikasi                  Web Bas_3f6862'))

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_jenis_aplikasi1'))

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/textarea_modul'), 'Modul dari aplikasi...')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_anggaran'), '5000000')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/textarea_kebutuhan_sdm'), '2 orang')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC012/Page_LINGGARJATI/select_Milik Sendiri                Milik D_0502fd'), 
    'Milik Sendiri', true)

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_aktor'), 'aktor...')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_input'), 'inputnya...')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_output'), 'outputnya...')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC012/Page_LINGGARJATI/select_Tidak Ada            Ada'), 'Tidak Ada', 
    true)

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_pd_terkait'), 'pdnya...')

WebUI.setText(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_tgl_mulai'), '')

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_tgl_mulai'))

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI/td_1'))

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI/input_tgl_akhir'))

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI/td_16'))

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI/button_Simpan'))

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI/label_Please enter a valid number'))

WebUI.click(findTestObject('Object Repository/TC012/Page_LINGGARJATI/div_NIP                  Please enter a val_1809d9'))

WebUI.closeBrowser()

