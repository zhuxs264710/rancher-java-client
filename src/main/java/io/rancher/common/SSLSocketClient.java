package io.rancher.common;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class SSLSocketClient {
	
	public static SSLSocketFactory getSSLSocketFactory(){
		try {
			SSLContext sslContext = SSLContext.getInstance("SSL");
			sslContext.init(null, getTrustManager(), new SecureRandom());
			return sslContext.getSocketFactory();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return null;
	}

	private static TrustManager[] getTrustManager() {
		TrustManager[] trustAllCerts = new TrustManager[]{
				new X509TrustManager() {
					
					@Override
					public X509Certificate[] getAcceptedIssuers() {
						// TODO Auto-generated method stub
						return new X509Certificate[]{};
					}
					
					@Override
					public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
//						return new x509cer
					}
				}
		};
		return trustAllCerts;
	}

}
