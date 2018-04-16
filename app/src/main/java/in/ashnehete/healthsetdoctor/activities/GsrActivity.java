package in.ashnehete.healthsetdoctor.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.ashnehete.healthsetdoctor.R;

import static in.ashnehete.healthsetdoctor.AppConstants.RECORD_VALUE;

public class GsrActivity extends AppCompatActivity {

    @BindView(R.id.tv_gsr)
    TextView tvGsr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gsr);
        ButterKnife.bind(this);

        Bundle bundle = getIntent().getExtras();
        String value = bundle.getString(RECORD_VALUE, null);

        tvGsr.setText(value);
    }
}
