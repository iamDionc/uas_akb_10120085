/**
 * NIM : 10120014
 * NAMA : NURUL FAJAR
 * KELAS : IF-1
 */
package com.a10120085.dioncahyan.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.a10120085.dioncahyan.R;
import com.a10120085.dioncahyan.auth.LoginActivity;
import com.a10120085.dioncahyan.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;
    private Button bLogout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentProfileBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Add logout action
        bLogout = root.findViewById(R.id.btn_logout);
        bLogout.setOnClickListener(v -> {
            // Logout
            FirebaseAuth.getInstance().signOut();

            // Back to login page
            Toast.makeText(getActivity(), "Already logged out",
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(getActivity(), LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            getActivity().startActivity(intent);
            getActivity().finish();
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}