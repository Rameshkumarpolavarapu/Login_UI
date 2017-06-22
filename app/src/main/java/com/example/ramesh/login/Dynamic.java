package com.example.ramesh.login;

import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.text.InputType;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by J.yugandhar on 21-06-2017.
 */

public class Dynamic extends Activity {
    float heightHolo,heightMaterial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(root());
    }

    private View root() {
        final RelativeLayout layout   =   new RelativeLayout(this);
        layout.setId(R.id.root);
        int[] textSizeAttr = new int[] { android.R.attr.actionBarSize, R.attr.actionBarSize };
        TypedArray ab = obtainStyledAttributes(new TypedValue().data, textSizeAttr);
        heightHolo = ab.getDimension(0, -1);
        heightMaterial = ab.getDimension(1, -1);
        ab.recycle();
        Log.d("DEBUG", "Height android.R.attr.: " + heightHolo + "");
        Log.d("DEBUG", "Height R.attr.: " + heightMaterial + "");
        layout.setBackgroundResource(R.drawable.gradiant_background);
        layout.setLayoutParams(getRparams());


        RelativeLayout.LayoutParams Rparams =   new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        Rparams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        Rparams.setMargins(0,50,0,0);


        TextView    logo    =   new TextView(this);
        logo.setId(R.id.logo);
        logo.setLayoutParams(Rparams);
        logo.setShadowLayer(10.5f, -3, 10, Color.LTGRAY);
        logo.setText(getText(R.string.focus));
        logo.setTextSize(TypedValue.COMPLEX_UNIT_SP,35);
        logo.setTypeface(Typeface.DEFAULT_BOLD);
        logo.setTextColor(Color.BLACK);

        ImageView img_View  = new ImageView(this);
        img_View.setId(R.id.imageView);
        img_View.setImageResource(R.drawable.ic_eyeclr);
        RelativeLayout.LayoutParams params   =   new RelativeLayout.LayoutParams(150,150);
        params.addRule(RelativeLayout.RIGHT_OF,R.id.logo);
        params.setMargins(20,50,0,0);
        img_View.setLayoutParams(params);


        RelativeLayout clLogoRelative=new RelativeLayout(this);
        clLogoRelative.setId(R.id.logo_part);
        RelativeLayout.LayoutParams layoutParams    =   new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.ABOVE,R.id.cardRoot);
        layoutParams.setMargins(0,0,70,400);
        clLogoRelative.setLayoutParams(layoutParams);

        clLogoRelative.addView(logo);
        clLogoRelative.addView(img_View);




        CardView card_root =   new CardView(this);
        card_root.setId(R.id.cardRoot);
        RelativeLayout.LayoutParams cardParams   =   new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        cardParams.setMargins(40,0,40,0);
        cardParams.addRule(RelativeLayout.ABOVE,R.id.subRoot1 );
        card_root.setLayoutParams(cardParams);

        LinearLayout cardHolder =   new LinearLayout(this);
            cardHolder.setOrientation(LinearLayout.VERTICAL);
            cardHolder.setId(R.id.cardHolder);

            TextView lblUserName    =  new  TextView(this);
            lblUserName.setText(getText(R.string.username));
            lblUserName.setId(R.id.labelUserName);
            LinearLayout.LayoutParams a=    getLparams();
            a.setMargins(30,20,30,10);
            lblUserName.setLayoutParams(a);
            lblUserName.setTextSize(15.0f);
            lblUserName.setAllCaps(true);
            lblUserName.setTextColor(ContextCompat.getColor(this,R.color.c2));

            EditText    userNameEditText    =   new EditText(this);
            userNameEditText.setMaxLines(1);
            userNameEditText.setMaxEms(20);
            LinearLayout.LayoutParams b=    getLparams();
            b.setMargins(30,0,30,20);
            userNameEditText.setId(R.id.usernameEdiText);
            userNameEditText.setLayoutParams(b);

            TextView lablePassword    =  new  TextView(this);
            lablePassword.setText(getText(R.string.password));
            lablePassword.setId(R.id.labelPassword);
            LinearLayout.LayoutParams c=    getLparams();
            c.setMargins(30,20,30,10);
            lablePassword.setLayoutParams(c);
            lablePassword.setTextSize(15.0f);
            lablePassword.setAllCaps(true);
            lablePassword.setTextColor(ContextCompat.getColor(this,R.color.c2));

            EditText    passwordEditText    =   new EditText(this);
            passwordEditText.setMaxLines(1);
            passwordEditText.setMaxEms(20);
            passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            LinearLayout.LayoutParams d=    getLparams();
            d.setMargins(30,0,30,0);
            passwordEditText.setId(R.id.passwordEdiText);
            passwordEditText.setLayoutParams(d);

            Button button   =   new Button(this);
            button.setTextSize(17.0f);
            button.setAllCaps(false);
            button.setText(getText(R.string.get_started));
            button.setBackgroundResource(R.drawable.btn_clr);
            Toast.makeText(this, ""+heightHolo, Toast.LENGTH_SHORT).show();
            LinearLayout.LayoutParams params1   =   new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, Math.round(heightHolo));
            params1.setMargins(0,30,0,0);
            button.setLayoutParams(params1);
            cardHolder.addView(lblUserName);
            cardHolder.addView(userNameEditText);
            cardHolder.addView(lablePassword);
            cardHolder.addView(passwordEditText);
            cardHolder.addView(button);
            card_root.addView(cardHolder);
            LinearLayout subRoot1   =   new LinearLayout(this);
            subRoot1.setOrientation(LinearLayout.HORIZONTAL);
            subRoot1.setId(R.id.subRoot1);
            subRoot1.setGravity(Gravity.CENTER);
            RelativeLayout.LayoutParams e   =  getRparams();
            e.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            e.height    =   Math.round(heightHolo);
            subRoot1.setLayoutParams(e);

        TextView t1 =   new TextView(this);
        t1.setText(getText(R.string.create_account));
        LinearLayout.LayoutParams f   =   getLparams();
        f.weight    =   1.0f ;
        t1.setGravity(Gravity.START);
        t1.setLayoutParams(f);
        t1.setPadding(20,0,0,0);

        TextView t2 =   new TextView(this);
        t2.setText(getText(R.string.need_help));
        LinearLayout.LayoutParams f1   =   getLparams();
        f1.weight    =   1.0f ;
        t2.setGravity(Gravity.END);
        t2.setLayoutParams(f1);
        t2.setPadding(0,0,20,0);

        layout.addView(clLogoRelative);
        subRoot1.addView(t1);
        subRoot1.addView(t2);
        layout.addView(card_root);
        layout.addView(subRoot1);

        return layout;
    }

   private RelativeLayout.LayoutParams getRparams(){
       RelativeLayout.LayoutParams Rparams   =   new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
       return Rparams;
    }
    private ViewGroup.LayoutParams getParams(){
        return new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    }
    private LinearLayout.LayoutParams getLparams(){
        return new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
    }

}