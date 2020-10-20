package com.example.foundsites.ui.home;

import android.Manifest;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.foundsites.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapLongClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

public class HomeFragment extends Fragment implements OnMapReadyCallback,View.OnClickListener, OnMapLongClickListener {

    private HomeViewModel homeViewModel;
    private Button bGas;
    private Button bFar;
    private Button bRes;
    private Button bUbi;
    private TextView ttit;
    private GoogleMap mMap;
    SharedPreferences prefs;
    HomeFragment context = this;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.FoundSites);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
    ttit=root.findViewById(R.id.FoundSites);
    bFar=root.findViewById(R.id.Farmacia);
    bGas=root.findViewById(R.id.Gasolina);
    bRes=root.findViewById(R.id.Restaurat);
    bFar.setOnClickListener(this);
    bRes.setOnClickListener(this);
    bGas.setOnClickListener(this);
    bUbi=root.findViewById(R.id.Ubica);
    bUbi.setOnClickListener(this);
    enableMyLocation();
        return root;
    }
    private void enableMyLocation(){
        //if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
        //        !=PackageManager.PERMISSION_GRANTED){
        //ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1000});
}


    @Override
    public void onClick(View view) {

    }

    @Override
    public void onMapLongClick(LatLng latLng) {

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }



}