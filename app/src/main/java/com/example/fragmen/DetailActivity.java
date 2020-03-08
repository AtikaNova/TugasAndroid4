package com.example.fragmen;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    ImageView ivHeroImage;
    TextView tvHeroName, tvInfoHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvHeroName = findViewById(R.id.team_title);
        tvInfoHero = findViewById(R.id.team_description);
        ivHeroImage = findViewById(R.id.iv_detail);

        String heroName = getIntent().getStringExtra("title");
        String heroinfo = getIntent().getStringExtra("detail");
        int imageHero = getIntent().getIntExtra("img_url",0);

        tvHeroName.setText(heroName);
        tvInfoHero.setText(heroinfo);
        Glide.with(this)
                .asBitmap()
                .load(imageHero)
                .into(ivHeroImage);

    }
}
