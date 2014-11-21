package ctec.stateproject.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class InputActivity extends Activity
{
	private EditText ageField, nameField, phraseField, blatherField;
	private Button transferButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_input);
		
		ageField = (EditText) findViewById(R.id.ageTextField);
		nameField = (EditText) findViewById(R.id.nameTextField);
		phraseField = (EditText) findViewById(R.id.phraseTextField);
		blatherField = (EditText) findViewById(R.id.blatherTextField);
		transferButton = (Button) findViewById(R.id.transferButton);
		
		setupListeners();
				
	}
	
	private void setupListeners()
	{
		transferButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				Intent transferIntent = new Intent(currentView.getContext(), DisplayActivity.class);
				startActivityForResult(transferIntent, 0);
				
			}
		});
	}
}
