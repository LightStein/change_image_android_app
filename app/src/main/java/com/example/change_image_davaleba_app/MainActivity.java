package com.example.change_image_davaleba_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
private static ImageView imgview;
    private static Button changeButton;
    private int current_image;
    int[] images = {R.drawable.interstellar, R.drawable.prism};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonclick();
    }

    public void buttonclick()
    {

            imgview = findViewById(R.id.imageView);
            changeButton = findViewById(R.id.change_button);
            changeButton.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            current_image++;
                            current_image = current_image % images.length;
                            imgview.setImageResource(images[current_image]);
                        }
                    }


            );



    }
}

