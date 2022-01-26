package org.meicode.medicus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Vector;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.MyViewHolder> {

    Context c;
    Vector<Form> bookingData;

    public HistoryAdapter(Context context, Vector<Form> data){
        this.bookingData = data;
        this.c = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(c);
        View v = inflater.inflate(R.layout.booking_history_row, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryAdapter.MyViewHolder holder, int position) {
        //String test = position + "";
        holder.date.setText(bookingData.get(position).getTanggal());
        //holder.date.setText(test);
        holder.lblDoctor.setText("Appointment With:");
        holder.doctorName.setText(bookingData.get(position).getNamaDokter());
        holder.lblHospital.setText("Appointment At:");
        holder.hospital.setText(bookingData.get(position).getRumahSakit());
    }

    @Override
    public int getItemCount() {
        return bookingData.size()-1;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView date, lblDoctor, doctorName, lblHospital, hospital;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.lblDate);
            lblDoctor = itemView.findViewById(R.id.lblDoctorName);
            doctorName = itemView.findViewById(R.id.insDoctorName);
            lblHospital = itemView.findViewById(R.id.lblHospital);
            hospital = itemView.findViewById(R.id.insHospital);
        }
    }
}
