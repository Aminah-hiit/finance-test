package com.keyrn
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

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


class NumMobileSequence {
	/**
	 * Refresh browser
	 */
	@Keyword
	def generateSequence() {
		double nameP
		double rondteest = (Math.random() * (9 - 6))
		println(rondteest)
		double seqtest = rondteest * 10000000
		int seqtest1 = (int)(seqtest)
		println(seqtest1)
		String seqtest2 = "$seqtest1"

		println(seqtest2.length())
		if (seqtest2.length() == 8) {
			nameP = seqtest
		}
		if(seqtest2.length() == 7){
			nameP = (rondteest * 100000000)
		}
		if(seqtest2.length() == 6){
			nameP = (rondteest * 1000000000)
		}
		if (seqtest2.length() == 5) {
			nameP = (rondteest * 10000000000)
		}
		if(seqtest2.length() == 4){
			nameP = (rondteest * 100000000000)
		}
		if(seqtest2.length() == 3){
			nameP = (rondteest * 1000000000000)
		}
		if(seqtest2.length() == 2){
			nameP = (rondteest * 10000000000000)
		}
		if(seqtest2.length() == 1){
			nameP = (rondteest * 100000000000000)
		}
		println nameP
		return nameP
	}
}