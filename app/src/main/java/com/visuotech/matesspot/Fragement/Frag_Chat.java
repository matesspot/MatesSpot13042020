package com.visuotech.matesspot.Fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.visuotech.matesspot.R;

public class Frag_Chat extends Fragment {

    public  Frag_Chat (){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.frag_chat, container, false);

    }
}
