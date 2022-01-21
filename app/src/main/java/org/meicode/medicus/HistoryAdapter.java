package org.meicode.medicus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.MyViewHolder> {

    Context c;
    ArrayList<String> doctorName = new ArrayList<String>();
    ArrayList<String> hospital = new ArrayList<String>();
    ArrayList<String> date = new ArrayList<String>();

    public HistoryAdapter(Context context, String name, String h, String d){
        c = context;
        doctorName.add(name);
        hospital.add(h);
        date.add(d);
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
        holder.date.setText(date.get(position));
        holder.lblDoctor.setText("Appointment With:");
        holder.doctorName.setText(doctorName.get(position));
        holder.lblHospital.setText("Appointment At:");
        holder.hospital.setText(hospital.get(position));
    }

    @Override
    public int getItemCount() {
        return doctorName.size()-1;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView date, lblDoctor, doctorName, lblHospital, hospital;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.lblDate);
            lblDoctor = itemView.findViewById(R.id.lblDoctorName);
            doctorName = itemView.findViewById(R.id.insDoctorName);
            lblHospital = itemView.findViewById(R.id.insDoctorName);
            hospital = itemView.findViewById(R.id.insHospital);
        }
    }
}
