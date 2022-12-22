package com.example.pdf_reader;

import android.Manifest;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class pdfViewHolder extends RecyclerView.ViewHolder {
         public TextView tvName;
         public CardView container;

    public pdfViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.textView);
        container = itemView.findViewById(R.id.pdf);
    }


}
