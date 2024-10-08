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

try
{
	WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/profile.php#login')
	CustomKeywords.'com.katalon.extent.report.ExtentReport.attachLog'("URL launched successfully.")
	
	WebUI.maximizeWindow()
	
	WebUI.setText(findTestObject('Object Repository/Make Appoinment/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')
	CustomKeywords.'com.katalon.extent.report.ExtentReport.attachLog'("Enter Username successfully.")
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Make Appoinment/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
	CustomKeywords.'com.katalon.extent.report.ExtentReport.attachLog'("Enter Password successfully.")
	
	WebUI.click(findTestObject('Object Repository/Make Appoinment/Page_CURA Healthcare Service/button_Login'))
	CustomKeywords.'com.katalon.extent.report.ExtentReport.attachLog'("Click on Login button successfully.")
	
	WebUI.click(findTestObject('Object Repository/Make Appoinment/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))
	CustomKeywords.'com.katalon.extent.report.ExtentReport.attachLog'("Visit Date selected successfully.")
	
	WebUI.click(findTestObject('Object Repository/Make Appoinment/Page_CURA Healthcare Service/td_8'))
	
	WebUI.setText(findTestObject('Object Repository/Make Appoinment/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Test appointment booked for today')
	CustomKeywords.'com.katalon.extent.report.ExtentReport.attachLog'("Enter comment successfully.")
	
	WebUI.click(findTestObject('Object Repository/Make Appoinment/Page_CURA Healthcare Service/button_Book Appointment'))
	CustomKeywords.'com.katalon.extent.report.ExtentReport.attachLog'("Click on Book Appointment button successfully.")
	
	WebUI.verifyElementText(findTestObject('Object Repository/Make Appoinment/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 'Appointment Confirmation')
	CustomKeywords.'com.katalon.extent.report.ExtentReport.attachLog'("Appointment Booked successfully.")
	
	WebUI.closeBrowser()
	CustomKeywords.'com.katalon.extent.report.ExtentReport.attachLog'("Browser closed successfully.")
}
catch (Exception ex)
{
	CustomKeywords.'com.katalon.extent.report.ExtentReport.addScreenshot'()
	WebUI.closeBrowser()
}

