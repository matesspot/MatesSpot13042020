package com.visuotech.matesspot.Fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.visuotech.matesspot.R;

public class Frag_Profile extends Fragment {

    public Frag_Profile() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.frag_profile, container, false);

    }
}
