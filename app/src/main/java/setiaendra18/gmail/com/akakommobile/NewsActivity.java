package setiaendra18.gmail.com.akakommobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;


public class NewsActivity extends profil {
    private ImageView newsPhoto;
    private TextView newsTitle;
    private TextView newsDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        newsPhoto= (ImageView) findViewById(R.id.news_info_photo);
        newsTitle= (TextView) findViewById(R.id.news_info_title);
        newsDesc= (TextView) findViewById(R.id.news_info_desc);

        Intent intent=getIntent();

        News item= (News) intent.getSerializableExtra("News");
        newsPhoto.setImageResource(item.getPhotoId());
        newsTitle.setText(item.getTitle());
        newsDesc.setText(item.getDesc());

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
