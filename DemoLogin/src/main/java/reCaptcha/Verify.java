package reCaptcha;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import javax.json.*;
import javax.net.ssl.HttpsURLConnection;

public class Verify {
	public static final String SiteKey = "6LczbUAfAAAAACGmUEhvDUkVDimZwrz0VviW4Pc5";
	public static final String SecretKey = "6LczbUAfAAAAACwrP1ccl0h-SXBoPYehG90K3uQN";
	public static final String SiteVerifyURL = "https://www.google.com/recaptcha/api/siteverify";
	
	public static boolean verify(String reCaptchaResp) {
		if(reCaptchaResp == null || reCaptchaResp.length() == 0) 
			return false;
		try {
			URL verifyURL = new URL(SiteVerifyURL);
			
			HttpsURLConnection conn = (HttpsURLConnection) verifyURL.openConnection();
			
			conn.setRequestMethod("post");
			conn.setRequestProperty("User-Agent", "Mozilla/5.0");
			conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
			
			String postParam = "secret=" + SecretKey + "&response=" + reCaptchaResp;
			
			conn.setDoOutput(true);
			
			OutputStream os = conn.getOutputStream();
			os.write(postParam.getBytes());
			
			os.flush();
			os.close();
			
			int respCode = conn.getResponseCode();
			System.out.println("Response Code: " + respCode);
			
			InputStream is = conn.getInputStream();
			
			JsonReader jr = Json.createReader(is);
			JsonObject jo = jr.readObject();
			jr.close();
			
			System.out.println("Respone: " + jo);
			
			boolean success = jo.getBoolean("success");
			return success;	
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
