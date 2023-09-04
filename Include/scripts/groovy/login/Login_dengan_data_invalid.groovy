package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login_dengan_data_invalid {
	@Given("User diarahkan kehalaman invalid password")
	def NavigateToLoginPage() {
		WebUI.openBrowser("facebook.com")
		println("\n masuk kehamalan login")
	}
	@When("User mengisi field (.*) dan (.*) tidak valid")
	def InputCredetial(String email, String password) {
		println("\n input username dan password credetial")
		println("\n email:"+email)
		println("\n pass:"+password)
		WebUI.setText(findTestObject('Login/Field/email'), email)
		WebUI.setText(findTestObject('Login/Field/pass'), password)
	}
	@And("Klik button Login")
	def KlikLogin() {
		println("\n button terklik")
		WebUI.click(findTestObject('Login/Button/button_Log in'))
	}
	@Then("User diarahkkan kehalaman invalid credential")
	def verifyPage() {
		println("\berhasil di halaman invalid credential")
		WebUI.verifyTextPresent("We'll send you a code to your email address", true)
	}
}