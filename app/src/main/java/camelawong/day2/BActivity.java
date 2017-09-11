package camelawong.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");

        TextView showEmail = (TextView) findViewById(R.id.show_email);
        TextView showPassword = (TextView) findViewById(R.id.show_password);

        showEmail.setText("Email: " + email);
        showPassword.setText("Password: " + password);
    }
}
