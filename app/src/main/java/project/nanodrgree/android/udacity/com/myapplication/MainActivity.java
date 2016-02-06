package project.nanodrgree.android.udacity.com.myapplication;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Method to select the button clicked and based on select the text to display
    public void HandleClick(View view) {
        if (view.getId() == R.id.SpotifySteamerButton) {
            // button1 action
            Button buttonObj = (Button) view;
            buttonClickDisplayText(buttonObj, ToastDisplayConstants.SpotifySteamer_Text_Constant);
        }
        if (view.getId() == R.id.ScoreAppButton) {
            //button2 action
            Button buttonObj = (Button) view;
            buttonClickDisplayText(buttonObj, ToastDisplayConstants.Score_Text_Constant);
        }
        if (view.getId() == R.id.LibraryAppButton) {
            //button3 action
            Button buttonObj = (Button) view;
            buttonClickDisplayText(buttonObj, ToastDisplayConstants.Library_Text_Constant);
        }
        if (view.getId() == R.id.BuildItAppButton) {
            //button3 action
            Button buttonObj = (Button) view;
            buttonClickDisplayText(buttonObj, ToastDisplayConstants.BuildIt_Text_Constant);
        }
        if (view.getId() == R.id.XYZReaderAppButton) {
            //button3 action
            Button buttonObj = (Button) view;
            buttonClickDisplayText(buttonObj, ToastDisplayConstants.XYZReader_Text_Constant);
        }
        if (view.getId() == R.id.CapstoneAppButton) {
            //button3 action
            Button buttonObj = (Button) view;
            buttonClickDisplayText(buttonObj, ToastDisplayConstants.Capstone_Text_Constant);
        }
    }

    //Method to display the text for Toast.
    private void buttonClickDisplayText(Button buttonObj, CharSequence displayToast) {
        final CharSequence finalTextToDisplay = displayToast;
        buttonObj.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Context context = getApplicationContext();
                Toast.makeText(context, finalTextToDisplay, Toast.LENGTH_SHORT).show();
            }
        });
    }



}
