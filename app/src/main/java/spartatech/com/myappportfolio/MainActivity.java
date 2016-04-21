package spartatech.com.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String BUTTON_MSG_PATTERN = "This button will launch my %s app!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user touches the Popular Movies Button
     */
    public void onPopularMoviesClick(View view) {
        displayButtonToast(R.id.popularMoviesBtn);
    }

    /**
     * Called when the user touches the Stock Hawk Button
     */
    public void onStockHawkClick(View view) {
        displayButtonToast(R.id.stockHawkBtn);
    }

    /**
     * Called when the user touches the Build It Bigger Button
     */
    public void onBuildItBiggerClick(View view) {
        displayButtonToast(R.id.buildBiggerBtn);
    }

    /**
     * Called when the user touches the Make Your App Material Button
     */
    public void onMakeYourAppMaterialClick(View view) {
        displayButtonToast(R.id.makeYourAppBtn);
    }

    /**
     * Called when the user touches the Go Ubiquitous Button
     */
    public void onGoUbiquitousClick(View view) {
        displayButtonToast(R.id.goUbiquitousBtn);
    }

    /**
     * Called when the user touches the Capstone Button
     */
    public void onCapstoneClick(View view) {
        displayButtonToast(R.id.capstoneBtn);
    }

    /**
     * Display a toast message using the given button text
     */
    private void displayButtonToast(int btnId) {
        Button button = (Button) findViewById(btnId);

        final Context context = getApplicationContext();
        final String text = String.format(BUTTON_MSG_PATTERN, button.getText());

        final Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }
}