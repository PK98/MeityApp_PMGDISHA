package com.example.welcome.navigation_bar;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class MODULE1 extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    private static int Module1_TimeOut=(1*97);//11 AS SECOND ACTIVITY starts 11seconds earlier
    //26 is bcoz our videoes is of 26min and 85 is actually 60+9+16(60 is for converting min into second and 16 is because as our video is of 26min and 16 second and 9 is because as our assessment1 comes after delaying of 9 minutes
    public static final String API_KEY="AIzaSyCK7RvonDKipBl43gGhESE0V1RrLXjIDvs";
    public static final String VIDEO_ID="D4Xgh12bRfQ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MODULE1.this,Assessment1.class);
                startActivity(intent);

            }
        },Module1_TimeOut*1000);
        YouTubePlayerView youTubePlayerView=(YouTubePlayerView)findViewById(R.id.utubeplayer);
        youTubePlayerView.initialize(API_KEY,this);
    }
    @Override
    public void onInitializationFailure(Provider provider,YouTubeInitializationResult result)
    {
        Toast.makeText(this,"Failed to initialized!!",Toast.LENGTH_LONG).show();
    }
    @Override
    public void onInitializationSuccess(Provider provider,YouTubePlayer player,boolean wasRestored)
    {
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);

/* buffering start*/
        if(!wasRestored)
        {
            player.cueVideo(VIDEO_ID);
        }
    }

    private PlaybackEventListener playbackEventListener=new PlaybackEventListener() {
        @Override
        public void onPlaying() {

        }

        @Override
        public void onPaused() {

        }

        @Override
        public void onStopped() {

        }

        @Override
        public void onBuffering(boolean b) {

        }

        @Override
        public void onSeekTo(int i) {

        }
    };
    private PlayerStateChangeListener playerStateChangeListener=new PlayerStateChangeListener() {
        @Override
        public void onLoading() {

        }

        @Override
        public void onLoaded(String s) {

        }

        @Override
        public void onAdStarted() {

        }

        @Override
        public void onVideoStarted() {

        }

        @Override
        public void onVideoEnded() {

        }

        @Override
        public void onError(ErrorReason errorReason) {

        }
    };
}




