package slidenerd.vivz;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getFragmentManager().beginTransaction().replace(android.R.id.content, new MyPreferences(), "pref").commit();
		PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
	}
	static class MyPreferences extends PreferenceFragment
	{
		@Override
		public void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			addPreferencesFromResource(R.xml.preferences);
			
		}
	}

}
