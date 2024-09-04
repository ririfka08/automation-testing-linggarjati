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

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI  Login/input_username'), 'Mahasiswi-PKL-2023-Rifka-OPD')

WebUI.setEncryptedText(findTestObject('Object Repository/TC031/Page_LINGGARJATI  Login/input_password'), 'skUWqW1xkazIsTiAEPVIJA==')

WebUI.click(findTestObject('Object Repository/TC031/Page_LINGGARJATI  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/TC031/Page_LINGGARJATI/a_Perangkat'))

WebUI.click(findTestObject('Object Repository/TC031/Page_LINGGARJATI/a_Rekomendasi Pengadaan Perangkat'))

WebUI.click(findTestObject('Object Repository/TC031/Page_LINGGARJATI/a_Permohonan Baru'))

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/input_pjkegiatan_nama'), 'Rifka Umdati')

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/input_pjkegiatan_nip'), '12345')

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/input_pjkegiatan_jabatan'), 'Ketua tim')

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/input_pjkegiatan_telp'), '0898998989')

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/input_pjkegiatan_email'), 'rifka@mail.com')

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/input_nama_kegiatan_infra'), 'Testing')

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/input_nama_pekerjaan_infra'), '')

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/input_tahun_anggaran_infra'), '2023')

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/textarea_latar_belakang_infra'), 'Latar belakangnya')

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/textarea_dasar_hukum_infra'), 'Dasar hukumnya....')

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/textarea_tujuan_sasaran_infra'), 'Tujuannya..')

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/textarea_kriteria_ukuran_infra'), 'kriterianya...')

WebUI.click(findTestObject('Object Repository/TC031/Page_LINGGARJATI/span_select2-selection select2-selection--multiple'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC031/Page_LINGGARJATI/select_--Pilih Jenis Perangkat--           _999c64'), 
    'Server', true)

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/textarea_kebutuhan_sdm_infra'), 'Sumbernya,,,')

WebUI.click(findTestObject('Object Repository/TC031/Page_LINGGARJATI/div_Anggaran'))

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/input_anggaran_infra'), '600000')

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/textarea_spesifikasi_minimal_infra'), 'minimal...')

WebUI.setText(findTestObject('Object Repository/TC031/Page_LINGGARJATI/input_tgl_mulai_infra'), '')

WebUI.click(findTestObject('Object Repository/TC031/Page_LINGGARJATI/input_tgl_mulai_infra'))

WebUI.click(findTestObject('Object Repository/TC031/Page_LINGGARJATI/td_1'))

WebUI.click(findTestObject('Object Repository/TC031/Page_LINGGARJATI/input_tgl_akhir_infra'))

WebUI.click(findTestObject('Object Repository/TC031/Page_LINGGARJATI/td_6'))

WebUI.click(findTestObject('Object Repository/TC031/Page_LINGGARJATI/button_Simpan'))

WebUI.closeBrowser()

