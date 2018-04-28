package com.dialogs.multiplecustomdialog;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dialoglib.MultiDialogs;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button dialog_btn_1,dialog_btn_2,dialog_btn_3,dialog_btn_4,dialog_btn_5,dialog_btn_6,dialog_btn_7,dialog_btn_8;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        context=this;

        dialog_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MultiDialogs.makeDialog(context, "simple", "here write your message which you want to show", 1, new MultiDialogs.onDialogUtilsOkClick() {
                    @Override
                    public void onOKClick() {
                     //here write code when click OK
                    }
                }, new MultiDialogs.onDialogUtilsCancelClick() {
                    @Override
                    public void onCancelClick() {
                        //here write code when click Cancel
                    }
                });
            }
        });

        dialog_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MultiDialogs.makeDialog(context, "simple", "here write your message which you want to show","ok","cancel", 2, new MultiDialogs.onDialogUtilsOkClick() {
                    @Override
                    public void onOKClick() {
                        //here write code when click OK
                    }
                }, new MultiDialogs.onDialogUtilsCancelClick() {
                    @Override
                    public void onCancelClick() {
                        //here write code when click Cancel
                    }
                });

            }
        });
        dialog_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MultiDialogs.makeDialog(context, "simple", "here write your message which you want to show", "ok", 1, true, new MultiDialogs.onDialogUtilsButtonOneClick() {
                    @Override
                    public void onButtonOneClick() {
                        //here single buton code
                    }
                });
            }
        });

        dialog_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MultiDialogs.makeInputDialog(context, "input", "enter email", "ok", "cancel", 1, 20, new MultiDialogs.onDialogUtilsInputOkClick() {
                    @Override
                    public void onInputOKClick(String input) {

                    }
                }, new MultiDialogs.onDialogUtilsCancelClick() {
                    @Override
                    public void onCancelClick() {

                    }
                });
            }
        });

        dialog_btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MultiDialogs.makeInputDialog(context, "input", "enter email",  1, 20, new MultiDialogs.onDialogUtilsInputOkClick() {
                    @Override
                    public void onInputOKClick(String input) {

                    }
                }, new MultiDialogs.onDialogUtilsCancelClick() {
                    @Override
                    public void onCancelClick() {

                    }
                });
            }
        });

        dialog_btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> list=new ArrayList<>();
                list.add("1");
                list.add("2");
                list.add("3");
                MultiDialogs.makeListDialog(context, "List", "Show List", 1, list, new MultiDialogs.onDialogUtilsListItemClick() {
                    @Override
                    public void onListItemClick(int position, String str) {
                        //here get position and string
                    }
                });
            }
        });
        dialog_btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> list=new ArrayList<>();
                list.add("1");
                list.add("2");
                list.add("3");
                MultiDialogs.makeListDialog(context, "List", "cancel", "Show List", list, new MultiDialogs.onDialogUtilsListItemClick() {
                    @Override
                    public void onListItemClick(int position, String str) {
                        //here get position and string
                    }
                }, new MultiDialogs.onDialogUtilsButtonOneClick() {
                    @Override
                    public void onButtonOneClick() {
                        //here code when click item
                    }
                });

            }
        });

        dialog_btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> list=new ArrayList<>();
                list.add("1");
                list.add("2");
                list.add("3");
                MultiDialogs.makeListDialog(context, "List", "ok", "cancel", "Show List", 1, list, new MultiDialogs.onDialogUtilsListItemClick() {
                    @Override
                    public void onListItemClick(int position, String str) {
                        //here get position and string
                    }
                }, new MultiDialogs.onDialogUtilsButtonOneClick() {
                    @Override
                    public void onButtonOneClick() {
                        //here code when click on button
                    }
                }, new MultiDialogs.onDialogUtilsButtonTwoClick() {
                    @Override
                    public void onButtonTwoClick() {
                        //here code when click another click
                    }
                });

            }
        });
    }
    public void init(){
        dialog_btn_1=findViewById(R.id.diaog_1);
        dialog_btn_2=findViewById(R.id.diaog_2);
        dialog_btn_3=findViewById(R.id.diaog_3);
        dialog_btn_4=findViewById(R.id.diaog_4);
        dialog_btn_5=findViewById(R.id.diaog_5);
        dialog_btn_6=findViewById(R.id.diaog_6);
        dialog_btn_7=findViewById(R.id.diaog_7);
        dialog_btn_8=findViewById(R.id.diaog_8);
    }
}
