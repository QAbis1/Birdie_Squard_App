package Birdie_Squard_Script;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class NFT_Detail_Level_Fostering {
	AppiumDriver<MobileElement> driver;

	int short_Sleep_Seconds_1 = 1;
	int normal_Sleep_Seconds_2 = 2;
	int normal_Sleep_Seconds_3 = 3;
	int long_Sleep_Seconds_5 = 5;
	int long_Sleep_Seconds_7 = 7;
	int long_Sleep_Seconds_10 = 10;
	int long_Sleep_Seconds_30 = 30;

	int short_Sleep_Times_500 = 500;
	int short_Sleep_Times_1000 = 1000;
	int normal_Sleep_Times_2000 = 2000;
	int normal_Sleep_Times_3000 = 3000;
	int long_Sleep_Times_5000 = 5000;
	int long_Sleep_Times_7000 = 7000;
	int long_Sleep_Times_10000 = 10000;

	@BeforeClass
	public void SetDriver() throws MalformedURLException {
		// mobileCapabilityType 명 변수 선언
		String app_Package = "appPackage";
		String app_Activity = "appActivity";

		// mobileCapabilityType Value 명 변수 선언
		String platform_Android = "Android";
		String devicename = "emulator-5554";
		String app_Package_Name = "com.kakaovx.birdiesquad.user";
		String app_Activity_Name = "com.kakaovx.birdiesquad.user.MainActivity";

		try {
			System.out.println("SetDriver() - Driver Creating Start");

			DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platform_Android);
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, devicename);

			capabilities.setCapability(app_Package, app_Package_Name);
			capabilities.setCapability(app_Activity, app_Activity_Name);

			capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
			capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);

			System.out.println("SetDriver() - Driver setCapability Success");

			// Appium 드라이버 초기화 및 드라이버 URL / 셋팅 값으로 드라이버 셋팅
			URL appiumServerUrl = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<>(appiumServerUrl, capabilities);

			System.out.println("SetDriver() - Driver Created Success - driver : " + driver);
		} catch (Exception e) {
			System.out.println("SetDriver() - Driver Created Failure - driver : " + driver);
			e.printStackTrace();
		}
	}

	@Test
	public void NFT_Detail_Level_Fostering_Test() {
		String bottom_Nft_Btn_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]";
		String nft_My_Nft_ALL_Card_List_1_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView[3]";
		String nft_My_Nft_ALL_Card_List_2_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.ImageView[3]";
				
		String nft_Detail_Level_Title_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]";
		String nft_Detail_Level_Btn_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/com.horcrux.svg.SvgView/com.horcrux.svg.l/com.horcrux.svg.b";
		String golfer_Advancement_Popup_Completed_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]";
		String golfer_Level_Up_Popup_LevelUp_Btn_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[4]";
		String nft_Detail_Back_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]";
		
		
		
		// 카드 오픈 횟수 변수
		int count = 14;

		System.out.println("NFT_Detail_Level_Fostering_Twst() - Start");

		System.out.println("NFT_Detail_Level_Fostering_Twst() - Home Move Waiting a few 30 seconds.....");
		driver.manage().timeouts().implicitlyWait(long_Sleep_Seconds_30, TimeUnit.SECONDS);

		MobileElement bottom_Nft_Btn = driver.findElementByXPath(bottom_Nft_Btn_Xpath);
		bottom_Nft_Btn.click();

		driver.manage().timeouts().implicitlyWait(long_Sleep_Seconds_30, TimeUnit.SECONDS);

		/*
		MobileElement nft_My_Nft_ALL_Card_List_1 = driver.findElementByXPath(nft_My_Nft_ALL_Card_List_1_Xpath);
		nft_My_Nft_ALL_Card_List_1.click();
		*/
		
		MobileElement nft_My_Nft_ALL_Card_List_2 = driver.findElementByXPath(nft_My_Nft_ALL_Card_List_2_Xpath);
		nft_My_Nft_ALL_Card_List_2.click();

		driver.manage().timeouts().implicitlyWait(long_Sleep_Seconds_30, TimeUnit.SECONDS);

		try {
			System.out.println("NFT_Detail_Level_Fostering_Twst - 승급 상태가 아닐 경우,");

			MobileElement nft_Detail_Level_Title = driver.findElementByXPath(nft_Detail_Level_Title_Xpath);
			String nft_Detail_Level_Title_Text = nft_Detail_Level_Title.getText();

			for (int i = 0; i < count; i++) {
				if (nft_Detail_Level_Title_Text.equals("레벨")) {
					MobileElement nft_Detail_Level_Btn = driver.findElementByXPath(nft_Detail_Level_Btn_Xpath);
					nft_Detail_Level_Btn.click();

					driver.manage().timeouts().implicitlyWait(long_Sleep_Seconds_10, TimeUnit.SECONDS);
					Thread.sleep(normal_Sleep_Times_2000);

					scrollMove(driver, 387, 410, 1557, 1100);
					scrollMove(driver, 387, 400, 1557, 1600);
					scrollMove(driver, 387, 400, 1600, 1630);
					scrollMove(driver, 424, 587, 1262, 1232);
					scrollMove(driver, 430, 720, 1200, 0);
					scrollMove(driver, 587, 758, 1237, 1353);
					scrollMove(driver, 500, 720, 1220, 1340);
					scrollMove(driver, 720, 735, 1340, 1595);
					scrollMove(driver, 735, 720, 1520, 1595);

					Thread.sleep(normal_Sleep_Times_2000);

					MobileElement golfer_Advancement_Popup_Completed = driver
							.findElementByXPath(golfer_Advancement_Popup_Completed_Xpath);
					golfer_Advancement_Popup_Completed.click();

					Thread.sleep(normal_Sleep_Times_2000);

					MobileElement golfer_Level_Up_Popup_LevelUp_Btn = driver
							.findElementByXPath(golfer_Level_Up_Popup_LevelUp_Btn_Xpath);
					golfer_Level_Up_Popup_LevelUp_Btn.click();

					Thread.sleep(long_Sleep_Times_5000);
				}
			}
		
			Thread.sleep(normal_Sleep_Times_2000);
			
			MobileElement nft_Detail_Back = driver.findElementByXPath(nft_Detail_Back_Xpath);
			nft_Detail_Back.click();
			
			Thread.sleep(normal_Sleep_Times_2000);
			
			driver.manage().timeouts().implicitlyWait(long_Sleep_Seconds_10, TimeUnit.SECONDS);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외처리 발생");
		}

	}

	// 스크롤 업 이동 함수
	public static void scrollMove(AppiumDriver<MobileElement> driver, int startX, int endX, int startY, int endY) {
		System.out.println("Tranggle_Method Class > scrollMove - Start");
		System.out.println("scrollMove() - Start ExecuteScript");

		driver.executeScript("mobile:shell", ImmutableMap.of("command", "input swipe", "args", ImmutableList
				.of(String.valueOf(startX), String.valueOf(startY), String.valueOf(endX), String.valueOf(endY))));

		System.out.println("scrollUp() - End() ExecuteScript");
	}

	@AfterClass
	public void EndDriver() {
		if (driver != null) {
			System.out.println("EndDriver() - Driver quit");
			driver.quit();
		}
	}

}
