package ctec.stateproject.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class DisplayActivity extends Activity
{
	private TextView displayView;
	private Button homeButton;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
		
		displayView = (TextView) findViewById(R.id.resultsView);
		homeButton = (Button) findViewById(R.id.homeButton);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		homeButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent returnIntent = new Intent();
				setResult(RESULT_OK, returnIntent);
				finish();	
			}
		});
	}
}
