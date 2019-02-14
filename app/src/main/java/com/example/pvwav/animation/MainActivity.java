package com.example.pvwav.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textview = findViewById(R.id.textview);

        button.setOnClickListener(v -> {
//            ObjectAnimator animator = ObjectAnimator.ofFloat(textview, "alpha", 1f, 0f, 1f, 2f);
//            animator.setDuration(2000);
//            animator.start();

//            ObjectAnimator animator = ObjectAnimator.ofFloat(textview, "rotation", 0f, 360f);
//            animator.setDuration(5000);
//            animator.start();

//            float curTranslationX = textview.getTranslationX();
//            ObjectAnimator animator = ObjectAnimator.ofFloat(textview, "translationX", curTranslationX, -500f, curTranslationX);
//            animator.setDuration(5000);
//            animator.start();
//
//            ObjectAnimator animator = ObjectAnimator.ofFloat(textview, "scaleY", 1f, 3f, 1f);
//            animator.setDuration(5000);
//            animator.start();

//            ObjectAnimator moveIn = ObjectAnimator.ofFloat(textview, "translationX", -500f, 0f);
//            ObjectAnimator rotate = ObjectAnimator.ofFloat(textview, "rotation", 0f, 360f);
//            ObjectAnimator fadeInOut = ObjectAnimator.ofFloat(textview, "alpha", 1f, 0f, 1f);
//            AnimatorSet animSet = new AnimatorSet();
//            animSet.play(rotate).with(fadeInOut).after(moveIn);
//            animSet.setDuration(5000);
//            animSet.start();
//
//            moveIn.addListener(new AnimatorListenerAdapter() {
//                @Override
//                public void onAnimationEnd(Animator animation) {
//                    super.onAnimationEnd(animation);
//                    Log.e("tt", "123");
//                }
//            });


//            Animator animator = AnimatorInflater.loadAnimator(this, R.animator.anim_file);c
//            animator.setTarget(textview);
//            animator.start();

//            Point point1 = new Point(0, 0);
//            Point point2 = new Point(300, 300);
//            ValueAnimator animator = ValueAnimator.ofObject(new PointEvaluator(), point1, point2);
//            animator.setDuration(5000);
//            animator.start();

            textview.animate().rotationY(180).setDuration(3000).setInterpolator(new OvershootInterpolator());
        });
    }
}
