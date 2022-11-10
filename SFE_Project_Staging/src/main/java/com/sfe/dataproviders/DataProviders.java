package com.sfe.dataproviders;

import org.testng.annotations.DataProvider;

import com.sfe.utility.NewExcelLibrary;

public class DataProviders {

	NewExcelLibrary obj = new NewExcelLibrary();

	@DataProvider(name = "Email")
	public Object[][] getEmailCredentials() {

		int rows = obj.getRowCount("Email");
		int columns = obj.getColumnCount("Email");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][columns];
		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < columns; j++) {
				data[i][j] = obj.getCellData("Email", j, i + 2);
			}
		}
		return data;
	}

	@DataProvider(name = "Google")
	public Object[][] getGoogleCredentials() {

		int rows = obj.getRowCount("Google");
		int columns = obj.getColumnCount("Google");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][columns];
		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < columns; j++) {
				data[i][j] = obj.getCellData("Google", j, i + 2);
			}
		}
		return data;
	}

	@DataProvider(name = "Facebook")
	public Object[][] FacebookCredentials() {
		int rows = obj.getRowCount("Facebook");
		int columns = obj.getColumnCount("Facebook");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][columns];
		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < columns; j++) {
				data[i][j] = obj.getCellData("Facebook", j, i + 2);
			}
		}
		return data;
	}

	@DataProvider(name = "WhatsApp")
	public Object[][] WhatsApp() {
		int rows = obj.getRowCount("WhatsApp");
		int columns = obj.getColumnCount("WhatsApp");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][columns];
		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < columns; j++) {
				data[i][j] = obj.getCellData("WhatsApp", j, i + 2);
			}
		}
		return data;
	}

	@DataProvider(name="MobileNo")
	public Object[][] mobilNo() {
		int rows = obj.getRowCount("MobileNo");
		int columns = obj.getColumnCount("MobileNo");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][columns];
		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < columns; j++) {
				data[i][j] = obj.getCellData("MobileNo", j, i + 2);
			}
		}
		return data;
	}
	
	@DataProvider(name="ForgotPassword")
	public Object[][] forgotPassword() {
		int rows=obj.getRowCount("ForgotPassword");
		int columns=obj.getColumnCount("ForgotPassword");
		int actRows=rows-1;
		Object[][] data=new Object[actRows][columns];
		for(int i=0;i<actRows;i++) {
			for(int j=0;j<columns;j++) {
				data[i][j]=obj.getCellData("ForgotPassword", j, i + 2);
			}
		}
		return data;
	}

	@DataProvider(name="SignUpNo")
	public Object[][] signUPNumber() {
		int rows=obj.getRowCount("SignUpNo");
		int columns=obj.getColumnCount("SignUpNo");
		int actRows=rows-1;
		Object[][] data = new Object[actRows][columns];
		for(int i=0;i<actRows;i++) {
			for(int j=0;j<columns;j++) {
				data[i][j]=obj.getCellData("SignUpNo", j, i + 2);
			}
		}
		return data;
	}
	
	@DataProvider(name="SignUpEmail")
	public Object[][] emailSignUP() {
		int rows=obj.getRowCount("SignUpEmail");
		int columns=obj.getColumnCount("SignUpEmail");
		int actRows=rows-1;
		Object[][] data = new Object[actRows][columns];
		for(int i=0;i<actRows;i++) {
			for(int j=0;j<columns;j++) {
				data[i][j]=obj.getCellData("SignUpEmail", j, i + 2);
			}
		}
		return data;
	}
	
	
	@DataProvider(name = "ProfilePage")
	public Object[][] ProfilePage() {
		int rows = obj.getRowCount("ProfilePage");
		int columns = obj.getColumnCount("ProfilePage");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][columns];
		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < columns; j++) {
				data[i][j] = obj.getCellData("ProfilePage", j, i + 2);
			}
		}
		return data;
	}
	
	@DataProvider(name = "PaymentPage")
	public Object[][] PaymentPage() {
		int rows = obj.getRowCount("PaymentPage");
		int columns = obj.getColumnCount("PaymentPage");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][columns];
		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < columns; j++) {
				data[i][j] = obj.getCellData("PaymentPage", j, i + 2);
			}
		}
		return data;
	}

	@DataProvider(name = "StripePayment")
	public Object[][] StripePayment() {
		int rows = obj.getRowCount("StripePayment");
		int columns = obj.getColumnCount("StripePayment");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][columns];
		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < columns; j++) {
				data[i][j] = obj.getCellData("StripePayment", j, i + 2);
			}
		}
		return data;
	}
	
	@DataProvider(name = "PayPalPayment")
	public Object[][] PayPalPayment() {
		int rows = obj.getRowCount("PayPalPayment");
		int columns = obj.getColumnCount("PayPalPayment");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][columns];
		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < columns; j++) {
				data[i][j] = obj.getCellData("PayPalPayment", j, i + 2);
			}
		}
		return data;
	}
	
	@DataProvider(name = "loginpage")
	public Object[][] loginpage() {
		int rows = obj.getRowCount("loginpage");
		int columns = obj.getColumnCount("loginpage");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][columns];
		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < columns; j++) {
				data[i][j] = obj.getCellData("loginpage", j, i + 2);
			}
		}
		return data;
	}
}
