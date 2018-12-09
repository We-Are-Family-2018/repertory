package com.school.repertory.utils;

import java.util.Arrays;

import javax.xml.bind.DatatypeConverter;

import org.springframework.util.Base64Utils;

public class CipherEntity {
	
	private byte[] ciphertext;
	
	private CipherEntity(byte[] ciphertext) {
		super();
		this.ciphertext = ciphertext;
	}

	public static CipherEntity fromBytes(byte[] bs) {
		return new CipherEntity(bs);
	}

	public static CipherEntity fromBase64Str(String base64) {
		byte[] bs = Base64Utils.decodeFromString(base64);
		return new CipherEntity(bs);
	}
	
	public byte[] toBytes() {
		return Arrays.copyOf(ciphertext, ciphertext.length);
	}
	
	public String toLowerHexStr() {
		return DatatypeConverter.printHexBinary(this.ciphertext).toLowerCase();
	}
	
	public String toUpperHexStr() {
		return DatatypeConverter.printHexBinary(this.ciphertext).toUpperCase();
	}
	
	public String toBase64Str() {
		return Base64Utils.encodeToString(this.ciphertext);
	}
}
