package com.example.atividade5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int hour = new Date().getHours();
        int count;

        //so pra teste
        hour = 23;

        Log.i("Hour:", String.valueOf(hour));

        LinearLayout ll = (LinearLayout)findViewById(R.id.linearLayout);

        EditText et = new EditText(ll.getContext());
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        /**
         * O horário entre 00:00 e 9:00 fica indisponível
         * **/
        if (hour < 9 && hour >= 0){
            TextView nothing = new TextView(ll.getContext());
            nothing.setText("Fora do horário de lançamento.");
            nothing.setAllCaps(true);
            nothing.setTextSize(18);
            nothing.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            ll.addView(nothing);
        }

        /**
         * Switch para tratamento do horário de entrada do usuário no sistema
         **/
        switch (hour){
            case 9:
                et = new EditText(this);
                et.setLayoutParams(p);
                et.setHint("Atividade realizada das " + (hour-1) + " as " + hour);
                ll.addView(et);
                break;

            case 10:
                for (int i = 2; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i == hour - 1){
                        et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                        ll.addView(et);
                    }
                    else {
                        et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour-1));
                        ll.addView(et);
                    }
                }
                break;

            case 11:
                for (int i = 3; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i == hour - 1){
                        et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                        ll.addView(et);
                    }
                    else {
                        et.setHint("Atividade realizada das " + (hour-i) + " as " + ((hour-i)+1));
                        ll.addView(et);
                    }
                }
                break;

            case (12):
                for (int i = 4; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i == hour - 1){
                        et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                        ll.addView(et);
                    }
                    else {
                        et.setHint("Atividade realizada das " + (hour-i) + " as " + ((hour-i)+1));
                        ll.addView(et);
                    }
                }
                break;

            /**
             * O horário correspondente a 12:00 as 13:00, é considerado como horário de almoço
             * Com isso, não é aeberto local para informar atividade
             **/
            case 13:
                for (int i = 5; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i != 12){
                        if (hour - i == hour - 1){
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                            ll.addView(et);
                        }
                        else {
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + ((hour-i)+1));
                            ll.addView(et);
                        }
                    }
                }
                break;

            case 14:
                for (int i = 6; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i != 12){
                        if (hour - i == hour - 1){
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                            ll.addView(et);
                        }
                        else {
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + ((hour-i)+1));
                            ll.addView(et);
                        }
                    }
                }
                break;

            case 15:
                for (int i = 7; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i != 12){
                        if (hour - i == hour - 1){
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                            ll.addView(et);
                        }
                        else {
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + ((hour-i)+1));
                            ll.addView(et);
                        }
                    }
                }
                break;

            case 16:
                for (int i = 8; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i != 12){
                        if (hour - i == hour - 1){
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                            ll.addView(et);
                        }
                        else {
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + ((hour-i)+1));
                            ll.addView(et);
                        }
                    }
                }
                break;



            case 17:
                for (int i = 9; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i != 12){
                        if (hour - i == hour - 1){
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                            ll.addView(et);
                        }
                        else {
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + ((hour-i)+1));
                            ll.addView(et);
                        }
                    }

                }
                break;

            /**
             * Após as 18:00 e antes das 00:00, ficam abertos 8 campos para preenchimento
             **/
            case (18):
                count = 0;
                for (int i = 10; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i != 12){
                        if (hour - i == hour - 1){
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                            ll.addView(et);
                            count++;
                        }
                        else {
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + ((hour-i)+1));
                            ll.addView(et);
                            count++;
                        }
                        if (count == 8){
                            break;
                        }
                    }

                }
                break;


            case (19):
                count = 0;
                for (int i = 11; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i != 12){
                        if (hour - i == hour - 1){
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                            ll.addView(et);
                            count++;
                        }
                        else {
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + ((hour-i)+1));
                            ll.addView(et);
                            count++;
                        }
                        if (count==8){
                            break;
                        }
                    }
                }
                break;

            case (20):
                count = 0;
                for (int i = 12; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i != 12){
                        if (hour - i == hour - 1){
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                            ll.addView(et);
                            count++;
                        }
                        else {
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + ((hour-i)+1));
                            ll.addView(et);
                            count++;
                        }
                        if (count == 8){
                            break;
                        }
                    }

                }
                break;

            case (21):
                count = 0;
                for (int i = 13; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i != 12){
                        if (hour - i == hour - 1){
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                            ll.addView(et);
                            count++;
                        }
                        else {
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + ((hour-i)+1));
                            ll.addView(et);
                            count++;
                        }
                        if (count == 8){
                            break;
                        }
                    }

                }
                break;

            case (22):
                count = 0;
                for (int i = 14; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i != 12){
                        if (hour - i == hour - 1){
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                            ll.addView(et);
                            count++;
                        }
                        else {
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + ((hour-i)+1));
                            ll.addView(et);
                            count++;
                        }
                        if (count == 8){
                            break;
                        }
                    }

                }
                break;

            case (23):
                count = 0;
                for (int i = 15; i > 0; i--){
                    et = new EditText(this);
                    et.setLayoutParams(p);
                    if (hour - i != 12){
                        if (hour - i == hour - 1){
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + (hour));
                            ll.addView(et);
                            count++;
                        }
                        else {
                            et.setHint("Atividade realizada das " + (hour-i) + " as " + ((hour-i)+1));
                            ll.addView(et);
                            count++;
                        }
                        if (count == 8){
                            break;
                        }
                    }

                }
                break;

        }

        /**
         * Função que cria um toast para "envio" dos dados
         **/
        ImageButton send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Sending data...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}