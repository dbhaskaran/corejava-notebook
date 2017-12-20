package org.dbhaskaran.rest.clinet;

import java.io.IOException;
import java.util.Scanner;

import org.apache.hc.client5.http.impl.sync.CloseableHttpClient;
import org.apache.hc.client5.http.impl.sync.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.sync.HttpClients;
import org.apache.hc.client5.http.sync.methods.HttpGet;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpException;
import org.apache.hc.core5.http.io.entity.EntityUtils;

public class RestApiClient {

	public static void main(String[] args) throws IOException, HttpException {
		
		String city;
		CloseableHttpResponse response1 = null;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name of your city:");
		city = in.nextLine();
		String URL = String.format("http://api.openweathermap.org/data/2.5/weather?q=%s,us&APPID=e38e55e6ca3b3def7001cc57903dfa9b", city);
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(URL);
		try {
			 response1 = httpclient.execute(httpGet);
			 System.out.println(response1.getCode());
			 HttpEntity entity1 = response1.getEntity();
			 System.out.println(EntityUtils.toString(entity1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			response1.close();
			in.close();
		}

	}

}
