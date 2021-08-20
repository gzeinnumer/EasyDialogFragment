package com.gzeinnumer.easydialogfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.gzeinnumer.edf.MyLibDialog;

public class CustomMyLibDialog extends MyLibDialog {

    public CustomMyLibDialog() {
        super(R.style.DialogStyle);
    }

    public static CustomMyLibDialog newInstance() {
        return new CustomMyLibDialog();
    }

    @Override
    public void onStart() {
        super.onStart();

//        getDialog().setCancelable(false);
//        getDialog().setCanceledOnTouchOutside(false);

//        setFullScreen(true);
        setCanvasWidth(0.3);
//        enableBackButton(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout _dialogCanvas = view.findViewById(R.id.dialog_canvas);

        _dialogCanvas.setBackground(requireActivity().getResources().getDrawable(R.drawable.rounded_corner));

        _dialogCanvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog().dismiss();
            }
        });
    }
}
