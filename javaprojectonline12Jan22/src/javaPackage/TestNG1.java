package javaPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

		
		@Test
		public void a1(){
			System.out.println("Enter test Method");
		}
		
		@AfterTest 
		public void b(){
			System.out.println("Enter afterTest Method");
		}
		
		@AfterClass
		public void c() {
			System.out.println("Enter AfterClass Method");
		}
		
		@BeforeMethod
		public void d() {
			System.out.println("Enter BeforeMethod Method");
		}
		
		@BeforeSuite
		public void e() {
			System.out.println("Enter BeforeSuit Method");
		}
		
		@AfterMethod
		public void f() {
			System.out.println("Enter AfterMethod Method");
		}
		@BeforeTest
		public void g() {
			System.out.println("Enetr BeforeTest Method");
		}
		@AfterSuite
		public void h() {
			System.out.println("Enter AfterSuit Method");
		}
		@BeforeClass
		public void i() {
			System.out.println();
		}
		@Test
		public void a2() {
			System.out.println("Enter BeforeClass Method");
		}
		public static void main(String[] args) {
			System.out.println("hello Main Method");
		}
	}

