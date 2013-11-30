package com.olivergoldbart.selectcars;

import org.json.JSONException;
import org.json.JSONObject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void pullValues( View view ) {
		
		//RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.radioGroup1);
		//RadioButton radioButtonSelected = (RadioButton)findViewById(radioGroup1.getCheckedRadioButtonId() );
		
		int[][] idsList = {	{ R.id.radioGroup0, R.id.radio0, R.id.radio1, R.id.radio2 },
							{ R.id.radioGroup1, R.id.radio3, R.id.radio4, R.id.radio5 },
							{ R.id.radioGroup2, R.id.radio6, R.id.radio7, R.id.radio8 },
							{ R.id.radioGroup3, R.id.radio9, R.id.radio10, R.id.radio11 },
							{ R.id.radioGroup4, R.id.radio12, R.id.radio13, R.id.radio14 },
							{ R.id.radioGroup5, R.id.radio15, R.id.radio16, R.id.radio17 },
							{ R.id.radioGroup6, R.id.radio18, R.id.radio19, R.id.radio20 },
							{ R.id.radioGroup7, R.id.radio21, R.id.radio22, R.id.radio23 },
							{ R.id.radioGroup8, R.id.radio24, R.id.radio25, R.id.radio26 },
							{ R.id.radioGroup9, R.id.radio27, R.id.radio28, R.id.radio29 },
							
							{ R.id.radioGroup10, R.id.radio30, R.id.radio31, R.id.radio32 },
							{ R.id.radioGroup11, R.id.radio33, R.id.radio34, R.id.radio35 },
							{ R.id.radioGroup12, R.id.radio36, R.id.radio37, R.id.radio38 },
							{ R.id.radioGroup13, R.id.radio39, R.id.radio40, R.id.radio41 },
							{ R.id.radioGroup14, R.id.radio42, R.id.radio43, R.id.radio44 },
							{ R.id.radioGroup15, R.id.radio45, R.id.radio46, R.id.radio47 },
							{ R.id.radioGroup16, R.id.radio48, R.id.radio49, R.id.radio50 },
							{ R.id.radioGroup17, R.id.radio51, R.id.radio52, R.id.radio53 },
							{ R.id.radioGroup18, R.id.radio54, R.id.radio55, R.id.radio56 },
							{ R.id.radioGroup19, R.id.radio57, R.id.radio58, R.id.radio59 },
							
							//new section
							
							{ R.id.radioGroup20, R.id.radio60, R.id.radio61, R.id.radio62 },
							
							{ R.id.radioGroup21, R.id.radio63, R.id.radio64, R.id.radio65 },
							{ R.id.radioGroup22, R.id.radio66, R.id.radio67, R.id.radio68 },
							{ R.id.radioGroup23, R.id.radio69, R.id.radio70, R.id.radio71 },
							{ R.id.radioGroup24, R.id.radio72, R.id.radio73, R.id.radio74 },
							{ R.id.radioGroup25, R.id.radio75, R.id.radio76, R.id.radio77 },
							{ R.id.radioGroup26, R.id.radio78, R.id.radio79, R.id.radio80 },
							{ R.id.radioGroup27, R.id.radio81, R.id.radio82, R.id.radio83 },
							{ R.id.radioGroup28, R.id.radio84, R.id.radio85, R.id.radio86 },
							{ R.id.radioGroup29, R.id.radio87, R.id.radio88, R.id.radio89 }};
		
		int[] answersList = new int[idsList.length];
		
		RadioGroup currentRadioGroup;
		RadioButton currentRadioButtonSelected;
		
		for ( int i = 0; i < idsList.length; i++ ) {
			currentRadioGroup = (RadioGroup)findViewById(idsList[i][0]);
			currentRadioButtonSelected = (RadioButton)findViewById((currentRadioGroup).getCheckedRadioButtonId() );
			
			if ( currentRadioButtonSelected.getId() == ( (RadioButton)findViewById(idsList[i][1]) ).getId() ){
				answersList[i] = 0;
			} else if ( currentRadioButtonSelected.getId() == ( (RadioButton)findViewById(idsList[i][2]) ).getId() ){
				answersList[i] = 1;
			} else if ( currentRadioButtonSelected.getId() == ( (RadioButton)findViewById(idsList[i][3]) ).getId() ){
				answersList[i] = 2;
			}
			
		}
		
		Log.v("testcat", "testcat " + answersList[0] + answersList[1] + answersList[2] + answersList[3]+ answersList[4] + answersList[5] + answersList[6] + answersList[7]);
	
	
	}
	
}
