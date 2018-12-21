package com.jt.test.httpClient;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class TestHttpClient {
	
	/**
	 * 娴嬭瘯姝ラ
	 * 	1.闇�瑕佸疄渚嬪寲HttpClient瀵硅薄
	 *  2.缂栬緫缃戝潃
	 *  3.鍒涘缓璇锋眰瀵硅薄
	 *  4.鍙戣捣璇锋眰鑾峰彇鍝嶅簲缁撴灉
	 *  5.鍒ゆ柇缁撴灉鏄惁姝ｇ‘ 鐘舵�佺爜鏄惁涓�200
	 *  6.鑾峰彇鏈嶅姟鍣ㄨ繑鍥炲�兼暟鎹�.
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
//	@Test
//	public void testGet() throws ClientProtocolException, IOException{
//		CloseableHttpClient httpClient = 
//				HttpClients.createDefault();
//		
//		//2.瀹氫箟璁块棶url
//		String url = "https://item.jd.com/28354118289.html";
//		
//		//3.鍒涘缓璇锋眰瀵硅薄
//		HttpGet httpGet = new HttpGet(url);
//		
//		//4.鍙戣捣璇锋眰鑾峰彇缁撴灉
//		CloseableHttpResponse httpResponse 
//		= httpClient.execute(httpGet);
//		
//		//5.鍒ゆ柇杩斿洖鏄惁姝ｇ‘
//		if(httpResponse.getStatusLine().getStatusCode() == 200){
//			
//			//鑾峰彇杩斿洖鍊煎叏閮ㄤ俊鎭�
//			String result = 
//			EntityUtils.toString(httpResponse.getEntity());
//			System.out.println(result);
//		}
	}








