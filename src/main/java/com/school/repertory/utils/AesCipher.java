package com.school.repertory.utils;

import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AesCipher {
	private String cipherKeyStr;
	
	private String cipherIvStr;
	
	private SecretKey cipherKey;
	
	private IvParameterSpec cipherIv;
	
	private final static Charset CHARSET = Charset.forName("UTF-8");
	
	private static final String KEY_ALGORITHM = "AES";
	
    private static final String DEFAULT_CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
	
	public AesCipher(String key, String iv) {
		this.cipherKeyStr = key;
		this.cipherIvStr = iv;
		
		MessageDigest md5Digest;
		try {
			md5Digest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("非法的签名算法", e);
		}
		
		byte[] keyMd5 = md5Digest.digest(key.getBytes(CHARSET));
		byte[] ivMd5 = md5Digest.digest(iv.getBytes(CHARSET));
		
		this.cipherKey = new SecretKeySpec(keyMd5, KEY_ALGORITHM);
		this.cipherIv = new IvParameterSpec(ivMd5);
	}
	
	public CipherEntity encrypt(String text) {
		Cipher cipher;
		try {
			cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
		} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
			throw new RuntimeException("加密算法名称错误", e);
		}
		try {
			cipher.init(Cipher.ENCRYPT_MODE, cipherKey, cipherIv);
		} catch (InvalidKeyException | InvalidAlgorithmParameterException e) {
			throw new RuntimeException("加密器初始化错误", e);
		}
		
		byte[] encryptedText;
		try {
			encryptedText = cipher.doFinal(text.getBytes(CHARSET));
		} catch (IllegalBlockSizeException | BadPaddingException e) {
			throw new RuntimeException("加密错误", e);
		}
		
		return CipherEntity.fromBytes(encryptedText);
	}
	
	public String decrypt(CipherEntity entity) {
		Cipher cipher;
		try {
			cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
		} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
			throw new RuntimeException("解密算法名称错误", e);
		}
		try {
			cipher.init(Cipher.DECRYPT_MODE, cipherKey, cipherIv);
		} catch (InvalidKeyException | InvalidAlgorithmParameterException e) {
			throw new RuntimeException("解密器初始化错误", e);
		}
		
		byte[] decryptedText;
		try {
			decryptedText = cipher.doFinal(entity.toBytes());
		} catch (IllegalBlockSizeException | BadPaddingException e) {
			return null;
		}
		
		return new String(decryptedText, CHARSET);
	}

	public String getCipherKeyStr() {
		return cipherKeyStr;
	}

	public String getCipherIvStr() {
		return cipherIvStr;
	}
}
