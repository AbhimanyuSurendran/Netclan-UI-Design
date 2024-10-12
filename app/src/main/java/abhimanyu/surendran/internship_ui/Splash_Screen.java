package abhimanyu.surendran.internship_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.VideoView;
import android.os.Handler;
import android.net.Uri;

public class Splash_Screen extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_LENGTH = 5000; // 4 seconds
    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        videoView = findViewById(R.id.videoView);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro);
        videoView.setVideoURI(videoUri);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Intent mainIntent = new Intent(Splash_Screen.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        });
        videoView.start();

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                if (videoView.isPlaying()) {
                    videoView.pause();
                }
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}