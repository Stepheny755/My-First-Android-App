package test.testapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
//import TranslateFunctions.TranslateFunctions.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sb = spongeButton;
        var ob = owoButton;
        var inputText = "";

        sb.setOnClickListener{
            inputText = editInputText.text.toString();
            textView.text = TranslateFunctions.translatemock(inputText);
        }
        ob.setOnClickListener{
            inputText = editInputText.text.toString();
            textView.text = TranslateFunctions.translateowo(inputText);
        }
    }
}

