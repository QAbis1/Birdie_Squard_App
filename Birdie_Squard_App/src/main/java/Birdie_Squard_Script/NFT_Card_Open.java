package Birdie_Squard_Script;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class NFT_Card_Open {
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
	public void NFT_Card_Open_Test() throws Exception {
		// Xpath 변수
		// 2024.09.17 Baek ilsung - 홈 화면 > 하단 NFT 버튼 Xpath 값 변경
		String bottom_Nft_Btn_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]";
				// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]";
		// 2024.09.17 Baek ilsung - NFT 화면 > NFT 카드 1 Xpath 값 변경
		String nft_My_Nft_ALL_NFT_Cart_1_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView";
				//"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView";
		String nft_Card_Open_Guide_Popup_Confirm_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView";
		
		// 2024.09.18 Baek ilsung - NFT 카드 오픈 결과 화면 > 확인 버튼 Xpath 변경
		String nft_Open_Result_Confirm_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"; 
				//"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup";
		
		// 2024.09.18 Baek ilsung - NFT 상세화면 > 뒤로가기 버튼 Xpath 변경
		String nft_Detail_Back_Btn_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView"; 
				//"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.l";
		String choice_Card_Pro_Choice_Popup_List_1_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup";
		String choice_Card_Pro_Choice_Popup_Confirm_Xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]";

		// 카드 오픈 횟수 변수
		int card_Open_Count = 300;

		System.out.println("NFT_Card_Open_Test() - Start");

		System.out.println("NFT_Card_Open_Test() - Home Move Waiting a few 30 seconds.....");
		driver.manage().timeouts().implicitlyWait(long_Sleep_Seconds_30, TimeUnit.SECONDS);

		MobileElement bottom_Nft_Btn = driver.findElementByXPath(bottom_Nft_Btn_Xpath);
		bottom_Nft_Btn.click();

		driver.manage().timeouts().implicitlyWait(long_Sleep_Seconds_30, TimeUnit.SECONDS);

		for (int i = 0; i < card_Open_Count; i++) {
			System.out.println("NFT_Card_Open_Test() - Card Open Count : " + i);
			
			MobileElement nft_My_Nft_ALL_NFT_Cart_1 = driver.findElementByXPath(nft_My_Nft_ALL_NFT_Cart_1_Xpath);
			nft_My_Nft_ALL_NFT_Cart_1.click();

			driver.manage().timeouts().implicitlyWait(long_Sleep_Seconds_7, TimeUnit.SECONDS);
			Thread.sleep(short_Sleep_Times_1000);

			MobileElement nft_Card_Open_Guide_Popup_Confirm = driver
					.findElementByXPath(nft_Card_Open_Guide_Popup_Confirm_Xpath);
			nft_Card_Open_Guide_Popup_Confirm.click();

			Thread.sleep(normal_Sleep_Times_2000);

			try {
				System.out.println("NFT_Card_Open_Test() - 초이스 럭키드로우 카드인 경우,");
				MobileElement choice_Card_Pro_Choice_Popup_List_1 = driver
						.findElementByXPath(choice_Card_Pro_Choice_Popup_List_1_Xpath);
				choice_Card_Pro_Choice_Popup_List_1.click();

				Thread.sleep(short_Sleep_Times_1000);

				MobileElement choice_Card_Pro_Choice_Popup_Confirm = driver
						.findElementByXPath(choice_Card_Pro_Choice_Popup_Confirm_Xpath);
				choice_Card_Pro_Choice_Popup_Confirm.click();

				Thread.sleep(short_Sleep_Times_1000);

				clickOnCoodinates(driver, 538, 989);

				Thread.sleep(short_Sleep_Times_1000);

				MobileElement nft_Open_Result_Confirm = driver.findElementByXPath(nft_Open_Result_Confirm_Xpath);
				nft_Open_Result_Confirm.click();

				driver.manage().timeouts().implicitlyWait(long_Sleep_Seconds_7, TimeUnit.SECONDS);
				Thread.sleep(short_Sleep_Times_1000);

				MobileElement nft_Detail_Back_Btn = driver.findElementByXPath(nft_Detail_Back_Btn_Xpath);
				nft_Detail_Back_Btn.click();

				System.out.println("초이스 카드 오픈 완료");
				
				driver.manage().timeouts().implicitlyWait(long_Sleep_Seconds_7, TimeUnit.SECONDS);
				Thread.sleep(short_Sleep_Times_1000);

			} catch (Exception e) {	
				System.out.println("NFT_Card_Open_Test() - 노멀 럭키드로우, 프리미엄 럭키드로우 카드인 경우,");
				
				//clickOnCoodinates(driver, 538, 989);

				//Thread.sleep(short_Sleep_Times_1000);

				MobileElement nft_Open_Result_Confirm = driver.findElementByXPath(nft_Open_Result_Confirm_Xpath);
				nft_Open_Result_Confirm.click();

				driver.manage().timeouts().implicitlyWait(long_Sleep_Seconds_7, TimeUnit.SECONDS);
				Thread.sleep(short_Sleep_Times_1000);

				MobileElement nft_Detail_Back_Btn = driver.findElementByXPath(nft_Detail_Back_Btn_Xpath);
				nft_Detail_Back_Btn.click();

				System.out.println("노멀 or 프리미엄 카드 오픈 완료");
				
				driver.manage().timeouts().implicitlyWait(long_Sleep_Seconds_7, TimeUnit.SECONDS);
				Thread.sleep(short_Sleep_Times_1000);
				// TODO: handle exception
			}

		}

	}

	public static void clickOnCoodinates(AppiumDriver<MobileElement> driver, int x, int y) {
		// 좌표를 클릭하기 위해 TouchAction을 사용

		TouchAction touchAction = new TouchAction(driver);

		System.out.println("clickOnCoodinates() - Start");

		// 특정 위치에 좌표 값에 위치를 클릭
		touchAction.tap(PointOption.point(x, y)).perform();

		System.out.println("clickOnCoodinates() - End");
	}

	@AfterClass
	public void EndDriver() {
		if (driver != null) {
			System.out.println("EndDriver() - Driver quit");
			driver.quit();
		}
	}
}
