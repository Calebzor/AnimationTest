package hu.tvarga.animationtest.animationtest;

import android.os.Bundle;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	private AnimatedVectorDrawableCompat drawable;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AppCompatImageView animationView = (AppCompatImageView) findViewById(R.id.animation);
		drawable = AnimatedVectorDrawableCompat.create(this, R.drawable.data);
		animationView.setImageDrawable(drawable);
		drawable.start();
	}

	public void startAnimation(View view) {
		if (drawable != null) {
			drawable.start();
		}
	}
}
