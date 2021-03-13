package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view){
        //получаем сообщение из поля message
        EditText messageView = (EditText) findViewById(R.id.message);
        //привращаем сообщение в строку
        String  messageText = messageView.getText().toString();
        //в активнности this запускаем активность ReceiveMessageActiviyty
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        //вкладывем сообщение messageText  под ключем message  в интент
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);

//        //отправка интента в приложение по выбору, которое могут обрабатывать сообщения
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("text/plain");
//        intent.putExtra(Intent.EXTRA_TEXT, messageText);
//
//        String chooserTitle = getString(R.string.chooser);
//        Intent chooserIntent = Intent.createChooser(intent, chooserTitle);
//        startActivity(chooserIntent);

        startActivity(intent);
    }
}