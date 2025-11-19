package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.annotation.Keyword

class LoginPage {

	String usernameField = 'Login/txt_Username'
	String passwordField = 'Login/txt_Password'
	String loginButton   = 'Login/btn_Login'

	@Keyword
	def enterUsername(String username) {
		WebUI.setText(findTestObject(usernameField), username)
	}

	@Keyword
	def enterPassword(String password) {
		WebUI.setText(findTestObject(passwordField), password)
	}

	@Keyword
	def clickLogin() {
		WebUI.click(findTestObject(loginButton))
	}

	@Keyword
	def login(String user, String pass) {
		enterUsername(user)
		enterPassword(pass)
		clickLogin()
	}
}
