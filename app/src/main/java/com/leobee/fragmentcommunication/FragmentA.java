package com.leobee.fragmentcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Leondria on 1/19/2015.
 */
public class FragmentA extends Fragment implements View.OnClickListener{

    Button btn;
    int counter =0;
    Communicator comm;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        return inflater.inflate(R.layout.fragment_a,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        comm=(Communicator)getActivity();
        btn=(Button)getActivity().findViewById(R.id.button);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        counter++;
        comm.respond("the button was clicked " +counter+" times");
    }
}
