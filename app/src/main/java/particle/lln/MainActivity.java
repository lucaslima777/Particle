package particle.lln;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Particle mPaperShredderView, mPaperShredderView2;
    int i = 1;
    int j = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPaperShredderView = (Particle) findViewById(R.id.ps_delete);
        mPaperShredderView.setShrededType(Particle.SHREDEDTYPE.Piece);

        mPaperShredderView2 = (Particle) findViewById(R.id.ps_delete2);

        mPaperShredderView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 1)
                    mPaperShredderView.startAnim(1000);
                else
                    mPaperShredderView.stopAnim();
                i = i * -1;
            }
        });

        mPaperShredderView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j == 1)
                    mPaperShredderView2.startAnim(1000);
                else
                    mPaperShredderView2.stopAnim();
                j = j * -1;
            }
        });

    }
}
