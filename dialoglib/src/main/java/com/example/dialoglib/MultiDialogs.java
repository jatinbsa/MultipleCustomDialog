package com.example.dialoglib;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.InputFilter;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by overtatech-4 on 21/3/17.
 */
public class MultiDialogs {


    int val;
    public static void makeDialog(Context context, String title,String message,
                                  int style,
                                  final onDialogUtilsOkClick okClick,
                                  final onDialogUtilsCancelClick cancelClick){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
        if(style==1)
        dialog.setContentView(R.layout.app_utils_dialog_3);
        else if (style==2)
        {
            dialog.setContentView(R.layout.app_utils_dialog_new_style_3);
        }
        TextView ok= (TextView) dialog.findViewById(R.id.ok);
        TextView cancel= (TextView) dialog.findViewById(R.id.cancel);
        TextView textTitle= (TextView) dialog.findViewById(R.id.title);
        TextView textMessage= (TextView) dialog.findViewById(R.id.message);
        textTitle.setText(title);
        textMessage.setText(message);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (okClick!=null)
                okClick.onOKClick();
            }
        });cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (cancelClick!=null)
                cancelClick.onCancelClick();
            }
        });
        dialog.show();
    }
    public static void makeDialog(Context context, String title,String message, String positiveButton,String negativeButton,int style,
                                  final onDialogUtilsOkClick okClick,
                                  final onDialogUtilsCancelClick cancelClick){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
        if (style==1)
        dialog.setContentView(R.layout.app_utils_dialog_3);
        else if(style==2){
            dialog.setContentView(R.layout.app_utils_dialog_new_style_3);
        }
        TextView ok= (TextView) dialog.findViewById(R.id.ok);
        ok.setText(positiveButton);
        TextView cancel= (TextView) dialog.findViewById(R.id.cancel);
        cancel.setText(negativeButton);
        TextView textTitle= (TextView) dialog.findViewById(R.id.title);
        TextView textMessage= (TextView) dialog.findViewById(R.id.message);
        textTitle.setText(title);
        textMessage.setText(message);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (okClick!=null)
                okClick.onOKClick();
            }
        });cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (cancelClick!=null)
                cancelClick.onCancelClick();
            }
        });
        dialog.show();
    }
    public static void makeDialog(Context context, String title,String message, String positiveButton,String negativeButton,int style,boolean val,
                                  final onDialogUtilsOkClick okClick,
                                  final onDialogUtilsCancelClick cancelClick){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
        if (style==1)
            dialog.setContentView(R.layout.app_utils_dialog_3);
        else if(style==2){
            dialog.setContentView(R.layout.app_utils_dialog_new_style_3);
        }
        TextView ok= (TextView) dialog.findViewById(R.id.ok);
        ok.setText(positiveButton);
        TextView cancel= (TextView) dialog.findViewById(R.id.cancel);
        cancel.setText(negativeButton);
        TextView textTitle= (TextView) dialog.findViewById(R.id.title);
        TextView textMessage= (TextView) dialog.findViewById(R.id.message);
        textTitle.setText(title);
        textMessage.setText(message);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (okClick!=null)
                    okClick.onOKClick();
            }
        });cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (cancelClick!=null)
                    cancelClick.onCancelClick();
            }
        });
        if (val==true){
            dialog.setCancelable(false);
            cancel.setVisibility(View.GONE);
        }
        else {
            dialog.setCancelable(false);
        }
        dialog.show();
    }
    public static void makeDialog(Context context, String title,String message, String oneButton,int style,boolean value,
                                  final onDialogUtilsButtonOneClick oneClick
                                  ){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
        if (style==1)
        dialog.setContentView(R.layout.app_utils_dialog_5);
        else if (style==2){
            dialog.setContentView(R.layout.app_utils_dialog_new_style_5);
        }
        TextView ok= (TextView) dialog.findViewById(R.id.ok);
        ok.setText(oneButton);
        TextView textTitle= (TextView) dialog.findViewById(R.id.title);
        TextView textMessage= (TextView) dialog.findViewById(R.id.message);
        textTitle.setText(title);
        textMessage.setText(message);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (oneClick!=null)
                    oneClick.onButtonOneClick();
            }
        });
        if (value){
            dialog.setCancelable(false);
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialog) {

                }
            });
        }
        else{

        }
        dialog.show();
    }
    public static void makeDialog(Context context, String title,String message, String oneButton,int style,boolean value,
                                  final onDialogUtilsButtonOneClick oneClick,final onDialogCancelable onDialogCancelable
    ){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
        if (style==1)
            dialog.setContentView(R.layout.app_utils_dialog_5);
        else if (style==2){
            dialog.setContentView(R.layout.app_utils_dialog_new_style_with_icon_5);
        }
        TextView ok= (TextView) dialog.findViewById(R.id.ok);
        ok.setText(oneButton);
        TextView textTitle= (TextView) dialog.findViewById(R.id.title);
        TextView textMessage= (TextView) dialog.findViewById(R.id.message);
        textTitle.setText(title);
        textMessage.setText(message);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (oneClick!=null)
                    oneClick.onButtonOneClick();
            }
        });
       /* if (value){*/
           // dialog.setCancelable(false);
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialog) {
                     onDialogCancelable.onDialogCancel();
                }
            });
       /* }
        else{

        }*/
        dialog.show();
    }
public static void makeThreeButtonDialog(Context context, String title,String message, String textButtonOne,
                                         String textButtonTwo, String textButtonThree,int style,
                                  final onDialogUtilsButtonOneClick oneClick,
                                  final onDialogUtilsButtonTwoClick twoClick,
                                         final onDialogUtilsButtonThreeClick threeClick){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
    if (style==1)
        dialog.setContentView(R.layout.app_utils_dialog_4);
    else if (style==2){
        dialog.setContentView(R.layout.app_utils_dialog_new_style_4);
    }
        TextView buttonOne= (TextView) dialog.findViewById(R.id.button_one);
        buttonOne.setText(textButtonOne);
        TextView buttonTwo= (TextView) dialog.findViewById(R.id.button_two);
        buttonTwo.setText(textButtonTwo);
        TextView buttonThree= (TextView) dialog.findViewById(R.id.button_three);
        buttonThree.setText(textButtonThree);
        TextView textTitle= (TextView) dialog.findViewById(R.id.title);
        TextView textMessage= (TextView) dialog.findViewById(R.id.message);
        textTitle.setText(title);
        textMessage.setText(message);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (oneClick!=null)
                oneClick.onButtonOneClick();
            }
        });buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (twoClick!=null)
                    twoClick.onButtonTwoClick();
            }
        });buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (threeClick!=null)
                threeClick.onButtonThreeClick();
            }
        });
        dialog.show();
    }

    public static void makeInputDialog(Context context, String title,String hint,int style,int maxLength,
                                       final onDialogUtilsInputOkClick okClick,
                                       final onDialogUtilsCancelClick cancelClick){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
        if(style==1)
        dialog.setContentView(R.layout.app_utils_dialog_2);
        else if(style==2)
        {
            dialog.setContentView(R.layout.app_utils_dialog_new_style_2);
        }
        TextView textTitle= (TextView) dialog.findViewById(R.id.title);
        textTitle.setText(title);
        TextView ok= (TextView) dialog.findViewById(R.id.ok);
        TextView cancel= (TextView) dialog.findViewById(R.id.cancel);
        final EditText editText= (EditText) dialog.findViewById(R.id.edit_text);
        editText.setTextColor(Color.BLACK);
        InputFilter[] fArray = new InputFilter[1];
        fArray[0] = new InputFilter.LengthFilter(maxLength);
        editText.setFilters(fArray);
        editText.setHint(hint);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (okClick!=null)
                    okClick.onInputOKClick(editText.getText().toString().trim());
            }
        });cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (cancelClick!=null)
                    cancelClick.onCancelClick();
            }
        });
        dialog.show();
    }
    public static void makeInputDialog(Context context, String title,String hint,String positiveButton,String negetiveBUtton,int style,int maxLength,
                                       final onDialogUtilsInputOkClick okClick,
                                       final onDialogUtilsCancelClick cancelClick){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
        if(style==1)
            dialog.setContentView(R.layout.app_utils_dialog_2);
        else if(style==2)
        {
            dialog.setContentView(R.layout.app_utils_dialog_new_style_2);
        }
        TextView textTitle= (TextView) dialog.findViewById(R.id.title);
        textTitle.setText(title);
        TextView ok= (TextView) dialog.findViewById(R.id.ok);
        ok.setText(positiveButton);
        TextView cancel= (TextView) dialog.findViewById(R.id.cancel);
        cancel.setText(negetiveBUtton);
        final EditText editText= (EditText) dialog.findViewById(R.id.edit_text);
        editText.setTextColor(Color.BLACK);
        InputFilter[] fArray = new InputFilter[1];
        fArray[0] = new InputFilter.LengthFilter(maxLength);
        editText.setFilters(fArray);
        editText.setHint(hint);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (okClick!=null)
                    okClick.onInputOKClick(editText.getText().toString().trim());
            }
        });cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (cancelClick!=null)
                    cancelClick.onCancelClick();
            }
        });
        dialog.show();
    }
    public static void makeInputDialog(Context context, String title, String hint, int style, int maxLength, String message, final int val,
                                       final onDialogUtilsInputOkClick okClick,
                                       final onDialogUtilsCancelClick cancelClick){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
        if(style==1)
            dialog.setContentView(R.layout.app_utils_dialog_2);
        else if(style==2)
        {
            dialog.setContentView(R.layout.app_utils_dialog_new_input_style);
        }
        TextView textTitle= (TextView) dialog.findViewById(R.id.title);
        textTitle.setText(title);
        TextView textMessage= (TextView) dialog.findViewById(R.id.message);
        textMessage.setText(message);
        TextView ok= (TextView) dialog.findViewById(R.id.ok);
        TextView cancel= (TextView) dialog.findViewById(R.id.cancel);
        final EditText editText= (EditText) dialog.findViewById(R.id.edit_text);
        editText.setTextColor(Color.BLACK);
        InputFilter[] fArray = new InputFilter[1];
        fArray[0] = new InputFilter.LengthFilter(maxLength);
        editText.setFilters(fArray);
        editText.setHint(hint);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText.getText().toString().equals(String.valueOf(val))) {
                    dialog.dismiss();
                    dialog.setCancelable(true);
                }
                else{
                    dialog.setCancelable(false);
                }
                editText.setText("");
                if (okClick!=null)
                    okClick.onInputOKClick(editText.getText().toString().trim());
            }
        });cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (cancelClick!=null)
                    cancelClick.onCancelClick();
            }
        });
        dialog.show();
    }
    public static void makeInputDialog(Context context, String title,String hint,String showOnEdit,int style,int maxLength,
                                       final onDialogUtilsInputOkClick okClick,
                                       final onDialogUtilsCancelClick cancelClick){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
        if(style==1)
            dialog.setContentView(R.layout.app_utils_dialog_2);
        else if(style==2)
        {
            dialog.setContentView(R.layout.app_utils_dialog_new_style_2);
        }
        TextView textTitle= (TextView) dialog.findViewById(R.id.title);
        textTitle.setText(title);
        TextView ok= (TextView) dialog.findViewById(R.id.ok);
        TextView cancel= (TextView) dialog.findViewById(R.id.cancel);
        final EditText editText= (EditText) dialog.findViewById(R.id.edit_text);
        editText.setText(showOnEdit);
        editText.setTextColor(Color.BLACK);
        editText.setHint(hint);
        InputFilter[] fArray = new InputFilter[1];
        fArray[0] = new InputFilter.LengthFilter(maxLength);
        editText.setFilters(fArray);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (okClick!=null)
                    okClick.onInputOKClick(editText.getText().toString().trim());
            }
        });cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (cancelClick!=null)
                    cancelClick.onCancelClick();
            }
        });
        dialog.show();
    }
    public static void makeListDialog(Context context, String title,String emptyMessage,ArrayList<String> list,
                                       final onDialogUtilsListItemClick itemClick,
                                       final onDialogUtilsCreateNewClick createNew){

        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setLayout(100,WindowManager.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
        dialog.setContentView(R.layout.app_utils_dialog_1);
        final ListView listView= (ListView) dialog.findViewById(R.id.list);
        ImageButton createList= (ImageButton) dialog.findViewById(R.id.create_playlist);
        TextView text_empty= (TextView) dialog.findViewById(R.id.text_empty);
        text_empty.setText(emptyMessage);
        TextView titleText= (TextView) dialog.findViewById(R.id.title);
        titleText.setText(title);
        if (list.size()==0){
            text_empty.setVisibility(View.VISIBLE);
            listView.setVisibility(View.GONE);
        }else {
            listView.setAdapter(new ArrayAdapter<>(context,android.R.layout.simple_list_item_1, list));
        }
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dialog.dismiss();
                if (itemClick!=null) {
                    String str = listView.getItemAtPosition(position).toString();
                    itemClick.onListItemClick(position,str);
                }
            }
        });
        createList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (createNew!=null)
                createNew.onCreateNewClick();
            }
        });
        dialog.show();
    }
    public static void makeListDialog(Context context, String title,String emptyMessage,int style,ArrayList<String> list,
                                      final onDialogUtilsListItemClick itemClick){

        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setLayout(100,WindowManager.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
        if(style==1)
        dialog.setContentView(R.layout.app_utils_dialog_6);
        else if(style==2)
        {
            dialog.setContentView(R.layout.app_utils_dialog_new_style_6);
        }
        final ListView listView= (ListView) dialog.findViewById(R.id.list);
        TextView text_empty= (TextView) dialog.findViewById(R.id.text_empty);
        text_empty.setText(emptyMessage);
        TextView titleText= (TextView) dialog.findViewById(R.id.title);
        titleText.setText(title);
        if (list.size()==0){
            text_empty.setVisibility(View.VISIBLE);
            listView.setVisibility(View.GONE);
        }else {
            listView.setAdapter(new ArrayAdapter<>(context,R.layout.simple_list_text, list));
        }
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dialog.dismiss();
                if (itemClick!=null) {
                    String str = listView.getItemAtPosition(position).toString();
                    itemClick.onListItemClick(position,str);
                }
            }
        });

        dialog.show();
    }

    public static void makeListDialog(Context context, String title,String oneButton,String emptyMessage,ArrayList<String> list,
                                      final onDialogUtilsListItemClick itemClick,final onDialogUtilsButtonOneClick buttonOneClick){

        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setLayout(100,WindowManager.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;

        dialog.setContentView(R.layout.app_utils_dialog_7);
        final ListView listView= (ListView) dialog.findViewById(R.id.list);
        TextView text_empty= (TextView) dialog.findViewById(R.id.text_empty);
        text_empty.setText(emptyMessage);
        TextView titleText= (TextView) dialog.findViewById(R.id.title);
        titleText.setText(title);
        TextView oneButtonText= (TextView) dialog.findViewById(R.id.button_one);
        oneButtonText.setText(oneButton);
        if (list.size()==0){
            text_empty.setVisibility(View.VISIBLE);
            listView.setVisibility(View.GONE);
        }else {
            listView.setAdapter(new ArrayAdapter<>(context,android.R.layout.simple_list_item_1, list));
        }
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dialog.dismiss();
                if (itemClick!=null) {
                    String str = listView.getItemAtPosition(position).toString();
                    itemClick.onListItemClick(position,str);
                }
            }
        });
        oneButtonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if(buttonOneClick!=null)
                    buttonOneClick.onButtonOneClick();
            }
        });

        dialog.show();
    }

    public static void makeListDialog(Context context, String title,String oneButton,String twoButton,String emptyMessage,int style,ArrayList<String> list,
                                      final onDialogUtilsListItemClick itemClick,final onDialogUtilsButtonOneClick buttonOneClick,final onDialogUtilsButtonTwoClick buttonTwoClick){

        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setLayout(100,WindowManager.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
        if(style==1)
        dialog.setContentView(R.layout.app_utils_dialog_8);
        else if (style==2){
            dialog.setContentView(R.layout.app_utils_dialog_new_style_8);
        }
        final ListView listView= (ListView) dialog.findViewById(R.id.list);
        TextView text_empty= (TextView) dialog.findViewById(R.id.text_empty);
        text_empty.setText(emptyMessage);
        TextView titleText= (TextView) dialog.findViewById(R.id.title);
        titleText.setText(title);
        TextView oneButtonText= (TextView) dialog.findViewById(R.id.button_one);
        oneButtonText.setText(oneButton);
        TextView twoButtonText= (TextView) dialog.findViewById(R.id.button_two);
        twoButtonText.setText(twoButton);
        if (list.size()==0){
            text_empty.setVisibility(View.VISIBLE);
            listView.setVisibility(View.GONE);
        }else {
            listView.setAdapter(new ArrayAdapter<>(context,android.R.layout.simple_list_item_1, list));
        }
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dialog.dismiss();
                if (itemClick!=null) {
                    String str = listView.getItemAtPosition(position).toString();
                    itemClick.onListItemClick(position,str);
                }
            }
        });
        oneButtonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if(buttonOneClick!=null)
                    buttonOneClick.onButtonOneClick();
            }
        });
        twoButtonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if(buttonTwoClick!=null)
                    buttonTwoClick.onButtonTwoClick();
            }
        });

        dialog.show();
    }
    public static void makeListDialog(Context context, String title,String oneButton,String twoButton,String threeButton,String emptyMessage,int style,ArrayList<String> list,
                                      final onDialogUtilsListItemClick itemClick,final onDialogUtilsButtonOneClick buttonOneClick,final onDialogUtilsButtonTwoClick buttonTwoClick,final onDialogUtilsButtonThreeClick buttonThreeClick){


        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setLayout(100,WindowManager.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogThemeMain;
        if (style==1)
        dialog.setContentView(R.layout.app_utils_dialog_9);
        else if(style==2)
        {
            dialog.setContentView(R.layout.app_utils_dialog_new_style_9);
        }
        final ListView listView= (ListView) dialog.findViewById(R.id.list);
        TextView text_empty= (TextView) dialog.findViewById(R.id.text_empty);
        text_empty.setText(emptyMessage);
        TextView titleText= (TextView) dialog.findViewById(R.id.title);
        titleText.setText(title);
        TextView oneButtonText= (TextView) dialog.findViewById(R.id.button_one);
        oneButtonText.setText(oneButton);
        TextView twoButtonText= (TextView) dialog.findViewById(R.id.button_two);
        twoButtonText.setText(twoButton);
        TextView threeButtonText= (TextView) dialog.findViewById(R.id.button_three);
        threeButtonText.setText(threeButton);
        if (list.size()==0){
            text_empty.setVisibility(View.VISIBLE);
            listView.setVisibility(View.GONE);
        }else {
            listView.setAdapter(new ArrayAdapter<>(context,android.R.layout.simple_list_item_1, list));
        }
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dialog.dismiss();
                if (itemClick!=null) {
                    String str = listView.getItemAtPosition(position).toString();
                    itemClick.onListItemClick(position,str);
                }
            }
        });
        oneButtonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if(buttonOneClick!=null)
                    buttonOneClick.onButtonOneClick();
            }
        });
        twoButtonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if(buttonTwoClick!=null)
                    buttonTwoClick.onButtonTwoClick();
            }
        });
        threeButtonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if(buttonThreeClick!=null)
                    buttonThreeClick.onButtonThreeClick();
            }
        });

        dialog.show();
    }


    public interface onDialogUtilsOkClick{
        void onOKClick();
    }
    public interface onDialogCancelable{
        void onDialogCancel();
    }

    public interface onDialogUtilsCancelClick{
        void onCancelClick();
    }
    public interface onDialogUtilsInputOkClick{
        void onInputOKClick(String input);
    }
    public interface onDialogUtilsListItemClick{
        void onListItemClick(int position,String str);
    }
    public interface onDialogUtilsCreateNewClick{
            void onCreateNewClick();
    }
public interface onDialogUtilsButtonOneClick{
            void onButtonOneClick();
    }
public interface onDialogUtilsButtonTwoClick{
            void onButtonTwoClick();
    }
public interface onDialogUtilsButtonThreeClick{
            void onButtonThreeClick();
    }

}
