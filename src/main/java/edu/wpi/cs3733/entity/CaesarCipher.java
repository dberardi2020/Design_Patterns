package edu.wpi.cs3733.entity;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {
	private String cipherString = "";
	private CipherConversions converter = new CipherConversions();

	private void setText(String text){
		String finalString = "";
		char[] tempText = text.toCharArray();

		for (char c : tempText)
		{
			if (converter.isCaeserConversionChar(c))
			{

				finalString = finalString.concat(String.valueOf(converter.getCaeserConversion(Character.isUpperCase(c), c)));
			}
			else
			{
				finalString = finalString.concat(String.valueOf(c));
			}
		}

		cipherString = finalString;
	}

	public String getText(){
		return cipherString;
	}

	@Override
	public void notify(Object object){
		setText((String) object);
	}
}
