package net.applest.ane;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
import com.adobe.fre.FREFunction;

public class UriIntenter implements FREExtension {

	public FREContext createContext(String arg0) {
		FREContext context = new FREContext() {

			@Override
			public void dispose() {
				// TODO 自動生成されたメソッド・スタブ
			}

			@Override
			public Map<String, FREFunction> getFunctions() {
				HashMap<String, FREFunction> result = new HashMap<String, FREFunction>();
				result.put("open", new OpenFunction());
				return result;
			}

		};
		return context;
	}

	public void dispose() {
		// TODO 自動生成されたメソッド・スタブ

	}

	public void initialize() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
