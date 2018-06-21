package com.gateway.payments.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class AES {
	
    private final String characterEncoding = "UTF-8";
	private final String cipherTransformation = "AES/CBC/PKCS5Padding";
	private final String aesEncryptionAlgorithm = "AES";

    /**
     * Constructor.
     */
    public AES() {
    	//...
    }
    	
	public byte[] decrypt(byte[] cipherText, byte[] key, byte [] initialVector) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		Cipher cipher = Cipher.getInstance(cipherTransformation);
		SecretKeySpec secretKeySpecy = new SecretKeySpec(key, aesEncryptionAlgorithm);
		IvParameterSpec ivParameterSpec = new IvParameterSpec(initialVector);
		cipher.init(Cipher.DECRYPT_MODE, secretKeySpecy, ivParameterSpec);
		cipherText = cipher.doFinal(cipherText);
		return cipherText;
	}

	public byte[] encrypt(byte[] plainText, byte[] key, byte [] initialVector) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		Cipher cipher = Cipher.getInstance(cipherTransformation);
		SecretKeySpec secretKeySpec = new SecretKeySpec(key, aesEncryptionAlgorithm);
		IvParameterSpec ivParameterSpec = new IvParameterSpec(initialVector);
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
		plainText = cipher.doFinal(plainText);
		return plainText;
	}
	
	private byte[] getKeyBytes(String key) throws UnsupportedEncodingException{
		byte[] keyBytes= new byte[16];
		byte[] parameterKeyBytes= key.getBytes(characterEncoding);
		System.arraycopy(parameterKeyBytes, 0, keyBytes, 0, Math.min(parameterKeyBytes.length, keyBytes.length));
		return keyBytes;
	}
	
	public String encrypt(String plainText, String key) throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException{
		byte[] plainTextbytes = plainText.getBytes(characterEncoding);
		byte[] keyBytes = getKeyBytes(key);
		byte[] encodedBytes = Base64.encodeBase64(encrypt(plainTextbytes,keyBytes, keyBytes)) ;		
		return new String(encodedBytes);
	}
	
	public String decrypt(String encryptedText, String key) throws KeyException, GeneralSecurityException, GeneralSecurityException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, IOException{
		byte[] cipheredBytes = Base64.decodeBase64(encryptedText);
		byte[] keyBytes = getKeyBytes(key);		
		return new String(decrypt(cipheredBytes, keyBytes, keyBytes), characterEncoding);
	}   
	public static void main(String[] args)throws Exception {
		AES aes=new AES();
//		String encrypt=aes.encrypt("790889506", "123456");
//		System.out.println("Valor Encrypt: "+encrypt);
//		String descrypt=aes.decrypt(encrypt, "123456");
//		System.out.println("Valor Descrypt: "+descrypt);
		
		String salt = "8JNJr579UI3637516Cr6";
		JSONObject encryptedData = new JSONObject();

	    try {
			
	    	System.out.println("result =  " + aes.encrypt("1111", salt));
//	    	System.out.println("fecha " + aes.encrypt("1219", salt));
//	    	System.out.println("cvv " + aes.encrypt("783", salt));
//			
//	    	System.out.println("*******************");
//	    	
//	    	System.out.println("tarjeta " + aes.encrypt("5401393013913440", salt));
//	    	System.out.println("fecha "+ aes.encrypt("0319", salt));
	    	
	    	
	    	//System.out.println("encrypt = " + aes.encrypt("10.0", "A1b2c3d4f5G6f"));
	    	//System.out.println("encrypt = " + aes.decrypt("hmPjezf0goz4aXAn3IjU2A==", "A1b2c3d4f5G6f"));
	    	System.out.println("encrypt = " + aes.decrypt("qxiNBqciHIOIvXVCkscnug==", "fFs8i8fDcWGaOf6K"));
	    		
	    	//System.out.println("decrypt = " + aes.decrypt("+OTLCkqubDxpIGDvDJKU8kBHvtbH7tj3vlhScb01c3c=", "8JNJr579UI3637516Cr6"));
			
//			encryptedData.put("nameOnCard", aes.encrypt("Adrian Real", salt));
//			encryptedData.put("expDate", aes.encrypt("1219", salt));
//			encryptedData.put("amount", aes.encrypt("0.01", salt));
//			encryptedData.put("zip", aes.encrypt("33131", salt));
//			encryptedData.put("street", aes.encrypt("1000 Brickell Ave. Suite 900", salt));
//			encryptedData.put("cvNum", aes.encrypt("781", salt));
//			encryptedData.put("accountNumber", aes.encrypt("690312939", salt));
//			encryptedData.put("aplicationID", "At01bMi0aXhr6ktmTaox");
//			encryptedData.put("pcrftransaID", aes.encrypt("11111", salt));			
			
			//System.out.println(encryptedData.toString());		
		
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    }
}