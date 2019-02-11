package com.example.user.optionmenu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.option,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        if(id==R.id.cam)
        {
            Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);

            startActivity(cameraIntent);
        }
        else if(id==R.id.phn)
        {
            Intent i = new Intent(Intent.ACTION_DIAL);

            startActivity(i);
        }
        else if(id==R.id.wb)
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("http://www.yourURL.com"));
            startActivity(intent);
        }
        else if(id==R.id.sms)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" ));

            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
