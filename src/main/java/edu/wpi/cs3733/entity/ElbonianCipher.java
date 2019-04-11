package edu.wpi.cs3733.entity;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {
	private String cipherString = "";
	private CipherConversions converter = new CipherConversions();

	private void setText(String text){
		String finalString = "";
		char[] tempText = text.toCharArray();

		for (char c : tempText)
		{
			finalString = finalString.concat(Integer.toString(converter.getElbonianConversion(c)));
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
