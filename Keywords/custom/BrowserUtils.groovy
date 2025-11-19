package custom

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

class BrowserUtils {

	@Keyword
	def openAndMaximize() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()

		println ">>> Navigating to: ${GlobalVariable.baseURL}"

		WebUI.navigateToUrl(GlobalVariable.baseURL)
	}

	@Keyword
	def closeBrowser() {
		WebUI.closeBrowser()
	}
}
