package com.example.change_image_davaleba_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
private static ImageView imgview; // შევქმენით კლასი ImageView-ის ობიექტი
    private static Button changeButton; // შევქმენით Button-ის ობიექტი
    private int current_image; // მიმდინარე სურათის მანიშნებელი
    int[] images = {R.drawable.interstellar, R.drawable.prism};
    // 2-წევრიანი array სადაც წევრები სურათებია

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonclick(); // ეს ვერ გავიგე რა საჭიროა
    }

    public void buttonclick()  // ვქმნით სურათის შეცვლის ფუნქციას
    {

            imgview = findViewById(R.id.imageView); // ობიექტს ვუტოლებთ დიზაინში ჩასმულ imageView-ს
            changeButton = findViewById(R.id.change_button); // ასევე
            changeButton.setOnClickListener(         // რა მოხდება ღილაკზე დაჭერისას
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            current_image++; // მიმდინარე სურათის მნიშვნელობა იმატებს 1-ით
                            current_image = current_image % images.length;
                            // თუ აცდება 1-ს და გახდება 2 ნაშთიანი გაყოფით გადაიქვევა 0-ად
                            imgview.setImageResource(images[current_image]);
                            // ობიექტი imgview-ის წყარო შეიცვლება images array-ის მომდევნო წევრით
                        }
                    }


            );



    }
}

