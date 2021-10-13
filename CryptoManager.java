public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		boolean flag = true;
		
		for (int count = 0; count < plainText.length(); count++) {
			if (plainText.charAt(count) < LOWER_BOUND || plainText.charAt(count) > UPPER_BOUND) flag = false;
			
		}
		
		return flag;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */

	public static String encryptCaesar(String plainText, int key) {
		
		int firstCharUnicode = plainText.codePointAt(0) + key;
		
		char myChar = (char)firstCharUnicode;
		
		String myString = Character.toString(myChar);
		
		String encryptCaesar = myString;
		
		for (int count = 1; count < plainText.length(); count++) {
			
			int offset = plainText.codePointAt(count) + key;
			
			char myChar2 = (char)offset;
			
			String myString2 = Character.toString(myChar2);
			
			encryptCaesar += myString2;
			
		}
		
		return encryptCaesar;
		
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
public static String encryptBellaso(String plainText, String bellasoStr) {
	
	int upperCount = 0;
	
	while(bellasoStr.length() < plainText.length()) {
		
		char myChar = bellasoStr.charAt(upperCount);
		
		bellasoStr += myChar;
		
		upperCount++;
		
	}
		
		int firstCharUnicode = plainText.codePointAt(0) + bellasoStr.codePointAt(0);
		
		while (firstCharUnicode > 95) {
			
			firstCharUnicode -= 64;
		}
		
		char myChar = (char)firstCharUnicode;
		
		String myString = Character.toString(myChar);
		
		String encryptBellaso = myString;
		
		for (int count = 1; count < plainText.length(); count++) {
			int offset = plainText.codePointAt(count) + bellasoStr.codePointAt(count);
			
			while (offset > 95) {
				
				offset -= 64;
			}
			char myChar2 = (char)offset;
			
			encryptBellaso += myChar2;
			
		}
		
		return encryptBellaso;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
public static String decryptCaesar(String encryptedText, int key) {
		
		int firstCharUnicode = encryptedText.codePointAt(0) - key;
		
		if (firstCharUnicode < 32) firstCharUnicode += 64;
		
		char myChar = (char)firstCharUnicode;
		
		String myString = Character.toString(myChar);
		
		String decryptCaesar = myString;
		
		for(int count = 1; count < encryptedText.length(); count++) {
			
			int offset = encryptedText.codePointAt(count) - key;
			
			if (offset < 32) offset += 64;
			
			char myChar2 = (char)offset;
			
			String myString2 = Character.toString(myChar2);
			
			decryptCaesar += myString2;
			
		}
		
		return decryptCaesar;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */	
public static String decryptBellaso(String encryptedText, String bellasoStr) {
	
int upperCount = 0;
	
	while(bellasoStr.length() < encryptedText.length()) {
		
		char myChar = bellasoStr.charAt(upperCount);
		
		bellasoStr += myChar;
		
		upperCount++;
		
	}
		
		int firstCharUnicode = (encryptedText.codePointAt(0) + 64) - bellasoStr.codePointAt(0);
		
		if (Math.abs(64 - encryptedText.codePointAt(0)) > 31 || firstCharUnicode < 32) {
			firstCharUnicode += 64;
		}
		
		char myChar = (char)firstCharUnicode;
		
		String myString = Character.toString(myChar);
		
		String decryptBellaso = myString;
		
		for (int count = 1; count < encryptedText.length(); count++) {
			int offset = (encryptedText.codePointAt(count) + 64) - bellasoStr.codePointAt(count);
			
			if ((Math.abs(64 - encryptedText.codePointAt(count)) > 31) || offset < 32) {
				
				offset+= 64;
				
			}
			
			char myChar2 = (char)offset;
			String myString2 = Character.toString(myChar2);
			
			decryptBellaso += myString2;
		}
		
		return decryptBellaso;
		
	}
}