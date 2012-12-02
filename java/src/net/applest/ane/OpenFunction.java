package net.applest.ane;

import android.content.Intent;
import android.net.Uri;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;

public class OpenFunction implements FREFunction {

	public FREObject call(FREContext arg0, FREObject[] arg1) {
		String uriString = "";

		if (arg1.length > 0) {
			try {
				uriString = arg1[0].getAsString();
			} catch (IllegalStateException e) {
				//message = e.getMessage();
			} catch (FRETypeMismatchException e) {
				//message = e.getMessage();
			} catch (FREInvalidObjectException e) {
				//message = e.getMessage();
			} catch (FREWrongThreadException e) {
				//message = e.getMessage();
			}
		}

		if (!uriString.equals("")) {
			Uri uri = Uri.parse(uriString);
			Intent i = new Intent(Intent.ACTION_VIEW,uri);
			arg0.getActivity().startActivity(i);
		}

		return null;
	}

}
