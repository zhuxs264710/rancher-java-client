package io.rancher;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.rancher.client.BasicAuthInterceptor;
import io.rancher.common.SSLSocketClient;
import io.rancher.utils.MD5Util;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.JacksonConverterFactory;
import retrofit2.Retrofit;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.SSLSocketFactory;

/**
 * The type Rancher.
 */
public class RancherClient {

    private final Retrofit retrofit;
    
    private String url;

    /**
     * Instantiates a new Rancher.
     *
     * @param config the config
     */
    public RancherClient(final Config config) {
    	url = config.getUrl().toString();
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .addInterceptor(
                        BasicAuthInterceptor.auth(config.getAccessKey(), config.getSecretKey())
                )
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Interceptor.Chain chain) throws IOException {
                        Request request = chain.request().newBuilder().addHeader("Accept", "application/json").build();
                        return chain.proceed(request);
                    }
                }).sslSocketFactory(SSLSocketClient.getSSLSocketFactory());

        this.retrofit = new Retrofit.Builder()
                .baseUrl(config.getUrl().toString())
                .client(builder.build())
                .addConverterFactory(JacksonConverterFactory.create(configureObjectMapper()))
                .build();

    }

    private ObjectMapper configureObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }
    
    public String getUrl(){
    	return url;
    }

    /**
     * Type t.
     *
     * @param <T>     the type parameter
     * @param service the service
     * @return the t
     */
    public <T> T type(Class<T> service) {
        return retrofit.create(service);
    }

    /**
     * The type Config.
     */
    public static class Config {

        private URL url;
        private String accessKey;
        private String secretKey;

        /**
         * Instantiates a new Config.
         *
         * @param url       the url
         * @param accessKey the access key
         * @param secretKey the secret key
         */
        public Config(URL url, String accessKey, String secretKey) {
            this.url = url;
            this.accessKey = accessKey;
            this.secretKey = secretKey;
        }

        /**
         * Gets url.
         *
         * @return the url
         */
        public URL getUrl() {
            return url;
        }

        /**
         * Sets url.
         *
         * @param url the url
         */
        public void setUrl(URL url) {
            this.url = url;
        }

        /**
         * Gets access key.
         *
         * @return the access key
         */
        public String getAccessKey() {
            return accessKey;
        }

        /**
         * Sets access key.
         *
         * @param accessKey the access key
         */
        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        /**
         * Gets secret key.
         *
         * @return the secret key
         */
        public String getSecretKey() {
            return secretKey;
        }

        /**
         * Sets secret key.
         *
         * @param secretKey the secret key
         */
        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }
        
        public String md5Key(){
        	String key = url.toString()+accessKey+secretKey;
        	return MD5Util.getMD5InHex(key);
        }
        
        public boolean verify(){
        	
        	if(null!=url){
        		if(null!=accessKey&&!"".equals(accessKey)){
        			if(null!=secretKey&&!"".equals(secretKey))
        				return true;
        		}
        	}
        	return false;
        }
    }
}
