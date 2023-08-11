/**
 * NIM : 10120014
 * NAMA : NURUL FAJAR
 * KELAS : IF-1
 */
package com.a10120085.dioncahyan.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.a10120085.dioncahyan.R;

public class AboutPage3 extends Fragment {

    public AboutPage3() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_page3, container, false);
    }
}