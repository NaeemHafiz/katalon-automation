import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import pages.LoginPage as LoginPage

// Use CustomKeywords correctly
CustomKeywords.'custom.BrowserUtils.openAndMaximize'()



LoginPage login = new LoginPage()
login.login('John Doe', 'ThisIsNotAPassword')
// ----- ASSERTION -----
//WebUI.verifyElementPresent(findTestObject('Dashboard/lbl_Appointment'), 10)

// Close browser using keyword
CustomKeywords.'custom.BrowserUtils.closeBrowser'()
