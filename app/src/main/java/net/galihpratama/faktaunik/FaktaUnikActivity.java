package net.galihpratama.faktaunik;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FaktaUnikActivity extends AppCompatActivity {
    public static final String TAG = FaktaUnikActivity.class.getSimpleName();
    private KumpulanFakta mKumpulanFakta = new KumpulanFakta();
    private AmbilWarna mAmbilWarna = new AmbilWarna();
    // Mendeklarasikan variabel View
    private TextView mFaktaTextView;
    private Button mTampilkanFaktaButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakta_unik);

        // Mengassign View dari file layout ke variabel
        mFaktaTextView = (TextView) findViewById(R.id.faktaTextView);
        mTampilkanFaktaButton = (Button) findViewById(R.id.lihatFaktaButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fakta = mKumpulanFakta.getFakta();
                int warna = mAmbilWarna.getWarna();

                // Update teks fakta dengan fakta yang sudah kita tentukan secara dinamis
                mFaktaTextView.setText(fakta);
                mRelativeLayout.setBackgroundColor(warna);
                mTampilkanFaktaButton.setTextColor(warna);

                // Munculkan toast berhasil
                Log.d(TAG, "Log dari method onClick().");
                // Toast.makeText(FaktaUnikvity.this, "Berhasil mengganti fakta", Toast.LENGTH_LONG).show();


            }
        };
        mTampilkanFaktaButton.setOnClickListener(listener);

        Log.d(TAG, "Log dari method onCreate().");
        //Toast.makeText(FaktaUnikActivity.this, "Berhasil menjalankan activity!", Toast.LENGTH_LONG).show();

    }
}
