package com.streak.test1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Email extends Activity implements View.OnClickListener {

	EditText personsEmail, intro, personsName, stupidThings, hatefulAction,
			outro;
	String emailAdd, beginning, name, stupidAction, hatefulAct, out;
	Button sendEmail;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.email);
		initializeVars();
		sendEmail.setOnClickListener(this);
	}

	private void initializeVars() {
		// TODO Auto-generated method stub
		personsEmail = (EditText) findViewById(R.id.etEmails);

		personsName = (EditText) findViewById(R.id.etName);
		stupidThings = (EditText) findViewById(R.id.etThings);
		hatefulAction = (EditText) findViewById(R.id.etAction);
		outro = (EditText) findViewById(R.id.etOutro);
		sendEmail = (Button) findViewById(R.id.bSentEmail);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub

		convertEditText();
		String emailaddress[] = { emailAdd };
		String message = "Well hello "
				+ name
				+ " I just wanted to say "
				
				+ ".  Not only that but I hate when you "
				+ stupidAction
				+ ", that just really makes me crazy.  I just want to make you "
				+ hatefulAct
				+ ".  Welp, thats all I wanted to chit-chatter about, oh and"
				+ out
				+ ".  Oh also if you get bored you should check out ME"
				+ '\n' + "PS. I think I love you...   :( ";

		Intent email = new Intent(android.content.Intent.ACTION_SEND);
		email.putExtra(android.content.Intent.EXTRA_EMAIL, emailAdd);
		email.putExtra(android.content.Intent.EXTRA_SUBJECT, "I love you");
		//email.putExtra(android.content.Intent.extra, value)
		email.setType("plane/text");
		email.putExtra(android.content.Intent.EXTRA_TEXT, message);
		startActivity(email);
	}

	private void convertEditText() {
		// TODO Auto-generated method stub
		emailAdd = personsEmail.getText().toString();
		
		name = personsName.getText().toString();
		stupidAction = stupidThings.getText().toString();
		hatefulAct = hatefulAction.getText().toString();
		out = outro.getText().toString();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}