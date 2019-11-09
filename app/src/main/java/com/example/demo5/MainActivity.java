package com.example.demo5;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      String s1="radar";
      String s2;
      char ch2[]=new char[s1.length()];
      char ch[]=s1.toCharArray();
      int j=ch.length;
      for (int i=0;i<ch.length;i++){
          ch2[i]=(ch[j-1]);
          j--;
    }
      s2=new String(ch2);
      System.out.println(s2);
      if (s1.equals(s2)){
          System.out.println("yes pilondrome");
      }else{
          System.out.println("not");
      }
    }
    }


