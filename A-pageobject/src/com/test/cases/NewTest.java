package com.test.cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.page.HomePage;
import com.test.page.SearchResults;

public class NewTest {
  @Test
  public void testSearch() {
	  HomePage homepage = new HomePage();
	  homepage.load();
	 
	  SearchResults searchResult = homepage.search().searchResult("山西官场");
	  
	  Assert.assertEquals(44, searchResult.getItems().size());
	  Assert.assertTrue(searchResult.getItems().contains("山西官场地震"));
	  sleep(2);
	  homepage.close();
  }
  
  public static void sleep(int second) {
	  try {
		Thread.sleep(1000*second);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
  }
}
