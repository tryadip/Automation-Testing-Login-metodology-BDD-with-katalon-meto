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



class Klik_button_login_tanpa_mengisi_field_username_dan_pass {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User diarah kehalaman Login facebook")
	def DirectToPager() {
		WebUI.openBrowser("facebook.com")
		println ("user berhasil ke halaman login facebook")
	}

	@When("user tidak mengisi semua field")
	def I_check_for_the_value_in_step() {
		println ("user tidak mengisi kredensial data")
	}
	@And("User Klik tombol login")
	def klikbuttonlogin() {
		WebUI.click(findTestObject("Login/Button/button_Log in"))
		println("berhasil mengklik button login")
	}

	@Then("User mendapatkan inline error")
	def verifypage() {
		WebUI.verifyTextPresent("The email address or mobile number you entered isn't connected to an account. Find your account and log in.", false)
		println("user mendapatkan inline error")
	}
}