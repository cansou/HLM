package com.lj.business.member.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.springframework.util.StringUtils;

/**
 * 
 * 
 * 类说明：网络请求工具
 *  
 * 
 * <p>
 * 详细描述：
 *   
 * @Company: 扬恩科技有限公司
 * @author 梅宏博
 *   
 * CreateDate: 2017年11月7日
 */
public class HttpUtil {

	private static final String DEFAULT_CHARSET = "UTF-8";

	private static final String _GET = "GET"; // GET
	private static final String _POST = "POST";// POST
	public static final int DEF_CONN_TIMEOUT = 30000;
	public static final int DEF_READ_TIMEOUT = 30000;

	/**
	 * 
	 *
	 * 方法说明：初始化http请求参数
	 *
	 * @param url
	 * @param method
	 * @param headers
	 * @return
	 * @throws Exception
	 *
	 * @author 梅宏博  CreateDate: 2017年11月7日
	 *
	 */
	private static HttpURLConnection initHttp(String url, String method,
			Map<String, String> headers) throws Exception {
		URL _url = new URL(url);
		HttpURLConnection http = (HttpURLConnection) _url.openConnection();
		// 连接超时
		http.setConnectTimeout(DEF_CONN_TIMEOUT);
		// 读取超时 --服务器响应比较慢，增大时间
		http.setReadTimeout(DEF_READ_TIMEOUT);
		http.setUseCaches(false);
		http.setRequestMethod(method);
		http.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");
		http.setRequestProperty(
				"User-Agent",
				"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.146 Safari/537.36");
		if (null != headers && !headers.isEmpty()) {
			for (Entry<String, String> entry : headers.entrySet()) {
				http.setRequestProperty(entry.getKey(), entry.getValue());
			}
		}
		http.setDoOutput(true);
		http.setDoInput(true);
		http.connect();
		return http;
	}

	/**
	 * 
	 *
	 * 方法说明：初始化http请求参数
	 *
	 * @param url
	 * @param method
	 * @param headers
	 * @return
	 * @throws Exception
	 *
	 * @author 梅宏博  CreateDate: 2017年11月7日
	 *
	 */
	private static HttpsURLConnection initHttps(String url, String method,
			Map<String, String> headers) throws Exception {
		TrustManager[] tm = { new MyX509TrustManager() };
		System.setProperty("https.protocols", "TLSv1");
		SSLContext sslContext = SSLContext.getInstance("TLS");
		sslContext.init(null, tm, new java.security.SecureRandom());
		// 从上述SSLContext对象中得到SSLSocketFactory对象
		SSLSocketFactory ssf = sslContext.getSocketFactory();
		URL _url = new URL(url);
		HttpsURLConnection http = (HttpsURLConnection) _url.openConnection();
		// 设置域名校验
		http.setHostnameVerifier(new HttpUtil().new TrustAnyHostnameVerifier());
		// 连接超时
		http.setConnectTimeout(DEF_CONN_TIMEOUT);
		// 读取超时 --服务器响应比较慢，增大时间
		http.setReadTimeout(DEF_READ_TIMEOUT);
		http.setUseCaches(false);
		http.setRequestMethod(method);
		http.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");
		http.setRequestProperty(
				"User-Agent",
				"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.146 Safari/537.36");
		if (null != headers && !headers.isEmpty()) {
			for (Entry<String, String> entry : headers.entrySet()) {
				http.setRequestProperty(entry.getKey(), entry.getValue());
			}
		}
		http.setSSLSocketFactory(ssf);
		http.setDoOutput(true);
		http.setDoInput(true);
		http.connect();
		return http;
	}

	/**
	 * 
	 *
	 * 方法说明：功能描述: get 请求
	 *
	 * @param url
	 * @param params
	 * @param headers
	 * @return
	 * @throws Exception
	 *
	 * @author 梅宏博  CreateDate: 2017年11月7日
	 *
	 */
	public static String get(String url, Map<String, String> params,
			Map<String, String> headers) throws Exception {
		HttpURLConnection http = null;
		if (isHttps(url)) {
			http = initHttps(initParams(url, params), _GET, headers);
		} else {
			http = initHttp(initParams(url, params), _GET, headers);
		}
		InputStream in = http.getInputStream();
		BufferedReader read = new BufferedReader(new InputStreamReader(in,
				DEFAULT_CHARSET));
		String valueString = null;
		StringBuffer bufferRes = new StringBuffer();
		while ((valueString = read.readLine()) != null) {
			bufferRes.append(valueString);
		}
		in.close();
		if (http != null) {
			http.disconnect();// 关闭连接
		}
		return bufferRes.toString();
	}

	public static String get(String url) throws Exception {
		return get(url, null);
	}

	public static String get(String url, Map<String, String> params)
			throws Exception {
		return get(url, params, null);
	}

	public static String post(String url, String params) throws Exception {
		HttpURLConnection http = null;
		if (isHttps(url)) {
			http = initHttps(url, _POST, null);
		} else {
			http = initHttp(url, _POST, null);
		}
		OutputStream out = http.getOutputStream();
		out.write(params.getBytes(DEFAULT_CHARSET));
		out.flush();
		out.close();

		InputStream in = http.getInputStream();
		BufferedReader read = new BufferedReader(new InputStreamReader(in,
				DEFAULT_CHARSET));
		String valueString = null;
		StringBuffer bufferRes = new StringBuffer();
		while ((valueString = read.readLine()) != null) {
			bufferRes.append(valueString);
		}
		in.close();
		if (http != null) {
			http.disconnect();// 关闭连接
		}
		return bufferRes.toString();
	}

	/**
	 * 
	 *
	 * 方法说明：构造请求参数
	 *
	 * @param url
	 * @param params
	 * @return
	 * @throws Exception
	 *
	 * @author 梅宏博  CreateDate: 2017年11月7日
	 *
	 */
	public static String initParams(String url, Map<String, String> params)
			throws Exception {
		if (null == params || params.isEmpty()) {
			return url;
		}
		StringBuilder sb = new StringBuilder(url);
		if (url.indexOf("?") == -1) {
			sb.append("?");
		}
		sb.append(map2Url(params));
		return sb.toString();
	}

	/**
	 * 
	 *
	 * 方法说明：map构造url
	 *
	 * @param paramToMap
	 * @return
	 * @throws Exception
	 *
	 * @author 梅宏博  CreateDate: 2017年11月7日
	 *
	 */
	public static String map2Url(Map<String, String> paramToMap)
			throws Exception {
		if (null == paramToMap || paramToMap.isEmpty()) {
			return null;
		}
		StringBuffer url = new StringBuffer();
		boolean isfist = true;
		for (Entry<String, String> entry : paramToMap.entrySet()) {
			if (isfist) {
				isfist = false;
			} else {
				url.append("&");
			}
			url.append(entry.getKey()).append("=");
			String value = entry.getValue();
			if (!StringUtils.isEmpty(value)) {
				url.append(URLEncoder.encode(value, DEFAULT_CHARSET));
			}
		}
		return url.toString();
	}

	/**
	 * 
	 *
	 * 方法说明：检测是否https
	 *
	 * @param url
	 * @return
	 *
	 * @author 梅宏博  CreateDate: 2017年11月7日
	 *
	 */
	private static boolean isHttps(String url) {
		return url.startsWith("https");
	}

	/**
	 * 
	 * 
	 * 类说明：https 域名校验
	 *  
	 * 
	 * <p>
	 * 详细描述：
	 *   
	 * @Company: 扬恩科技有限公司
	 * @author 梅宏博
	 *   
	 * CreateDate: 2017年11月7日
	 */
	public class TrustAnyHostnameVerifier implements HostnameVerifier {
		public boolean verify(String hostname, SSLSession session) {
			return true;// 直接返回true
		}
	}
}