package dev.brian.com.dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener {
    private CardView cardBank,cardIdeas,cardAttachment,cardLinks,cardWifi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cardBank = (CardView)findViewById(R.id.card_banking);
        cardIdeas = (CardView)findViewById(R.id.card_ideas);
        cardAttachment = (CardView) findViewById(R.id.card_attachment);
        cardLinks = (CardView)findViewById(R.id.card_links);
        cardWifi = (CardView) findViewById(R.id.card_wifi);

        //Adding ActionListeners to the Cards.

        cardBank.setOnClickListener(this);
        cardIdeas.setOnClickListener(this);
        cardAttachment.setOnClickListener(this);
        cardLinks.setOnClickListener(this);
        cardWifi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()){
            case R.id.card_banking:
                intent = new Intent(this,Bank.class);
                startActivity(intent);
                break;
            case R.id.card_ideas:
                intent = new Intent(this,Bank.class);
                startActivity(intent);
                break;
            default:
                break;




        }
    }
}
