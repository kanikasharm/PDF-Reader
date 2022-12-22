package com.example.pdf_reader;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.io.File;
import java.nio.file.Files;
import java.util.List;



public class PdfAdapter extends RecyclerView.Adapter<pdfViewHolder> {
    private Context context;
    private List<File> pdfFiles;
    private onPdfFileSelectListener listener;

    public PdfAdapter(Context context, List<File> pdfFiles, onPdfFileSelectListener listener) {
        this.context = context;
        this.pdfFiles = pdfFiles;
        this.listener=listener;
    }

    @NonNull
    @Override
    public pdfViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new pdfViewHolder(LayoutInflater.from(context).inflate(R.layout.element_folder, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull pdfViewHolder holder, int position) {
      holder.tvName.setText(pdfFiles.get(position).getName());
      holder.tvName.setSelected(true);

      holder.container.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              listener.onPdfSelected(pdfFiles.get(position));
          }
      });
    }

    @Override
    public int getItemCount() {
        return pdfFiles.size();
    }
}
