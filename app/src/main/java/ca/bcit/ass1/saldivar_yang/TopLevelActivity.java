package ca.bcit.ass1.saldivar_yang;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TopLevelActivity extends AppCompatActivity {
    private String TAG = TopLevelActivity.class.getSimpleName();
    private ProgressDialog pDialog;
    private ListView lv;
    // URL to get contacts JSON
    private static String SERVICE_URL = "http://flintstones.zift.ca/api/flintstones/";
    private ArrayList<> CountryList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);





    }
}
