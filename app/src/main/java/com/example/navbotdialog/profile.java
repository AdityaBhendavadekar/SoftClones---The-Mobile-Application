package com.example.navbotdialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link profile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class profile extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public profile() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment team.
     */
    // TODO: Rename and change types and number of parameters
    public static profile newInstance(String param1, String param2) {
        profile fragment = new profile();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    FloatingActionButton floatingActionButton;
    TextView userName,instituteName;
    Button saveAndDone;
    EditText  currentYear,mobileNumber,emailId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        saveAndDone = view.findViewById(R.id.save);
        floatingActionButton = view.findViewById(R.id.floatingActionButton2);


        userName = view.findViewById(R.id.userName);
        instituteName = view.findViewById(R.id.instituteNameP);
        currentYear = view.findViewById(R.id.learningYearP);
        mobileNumber = view.findViewById(R.id.mobileNumberP);
        emailId = view.findViewById(R.id.emailId);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enableAllFields();
            }
        });
        return view;
    }

    private void enableAllFields() {
        instituteName.setEnabled(true);
        currentYear.setEnabled(true);
        mobileNumber.setEnabled(true);
        emailId.setEnabled(true);
        saveAndDone.setVisibility(View.VISIBLE);
    }

    private void disableAllFields() {
        instituteName.setEnabled(false);
        currentYear.setEnabled(false);
        mobileNumber.setEnabled(false);
        emailId.setEnabled(false);
    }
}