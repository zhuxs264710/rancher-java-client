package io.rancher.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {


	
	    public static String getMD5InHex(String data) {
	        try {
	            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
	            messageDigest.update(data.getBytes());
	            byte[] result = messageDigest.digest();
	            return new BigInteger(1, result).toString(16);
	        } catch (NoSuchAlgorithmException e) {
	            return null;
	        }
	    }

	    public static String getMd5Str(byte[] bytes) throws NoSuchAlgorithmException {
	        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
	        messageDigest.reset();
	        messageDigest.update(bytes);

	        byte[] byteArray = messageDigest.digest();

	        StringBuilder md5StrBuff = new StringBuilder();

	        for (byte aByteArray : byteArray) {
	            if (Integer.toHexString(0xFF & aByteArray).length() == 1) {
	                md5StrBuff.append("0").append(Integer.toHexString(0xFF & aByteArray));
	            } else {
	                md5StrBuff.append(Integer.toHexString(0xFF & aByteArray));
	            }
	        }

	        return md5StrBuff.toString();
	    }

	    public static String md5(byte[] sourceBytes) throws NoSuchAlgorithmException {
	        MessageDigest md = MessageDigest.getInstance("SHA-256");
	        md.update(sourceBytes);
	        byte b[] = md.digest();
	        int i;
	        StringBuffer buf = new StringBuffer("");

	        for (int offset = 0; offset < b.length; offset++) {
	            i = b[offset];
	            if (i < 0) {
	                i += 256;
	            }
	            if (i < 16) {
	                buf.append("0");
	            }
	            buf.append(Integer.toHexString(i));
	        }
	        return buf.toString();
	    }
	}

