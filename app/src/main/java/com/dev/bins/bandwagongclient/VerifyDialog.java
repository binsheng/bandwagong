package com.dev.bins.bandwagongclient;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by bin on 14/02/2017.
 */

public class VerifyDialog implements View.OnClickListener {

    private Context mContext;
    private EditText mVeryEditText;
    private EditText mKeyEditText;
    private AlertDialog mAlertDialog;

    public VerifyDialog(Context context) {
        mContext = context;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("config")
                .setView(initView());
        mAlertDialog = builder.create();
    }

    private View initView() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.host_dialog, null);
        mVeryEditText = (EditText) view.findViewById(R.id.et_veid);
        mKeyEditText = (EditText) view.findViewById(R.id.et_key);

        Button verifyButton = (Button) view.findViewById(R.id.btn_verify);
        Button cancleButton = (Button) view.findViewById(R.id.btn_cancel);

        verifyButton.setOnClickListener(this);
        cancleButton.setOnClickListener(this);

        return view;
    }

    public void show() {
        mAlertDialog.show();
    }

    public void hide() {
        if (mAlertDialog.isShowing()) {
            mAlertDialog.dismiss();
        }
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_verify) {

        } else {
            mAlertDialog.dismiss();
        }
    }
}
