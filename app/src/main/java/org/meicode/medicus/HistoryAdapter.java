package org.meicode.medicus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.MyViewHolder> {

    Context c;
    String doctorName[];
    String hospital[];

    public HistoryAdapter(Context context, String name[], String h[]){

        c = context;
        doctorName = name;
        hospital = h;
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
        holder.date.setText();
        holder.lblDoctor.setText("Appointment With:");
        holder.doctorName.setText(doctorName[position]);
        holder.lblHospital.setText("Appointment At:");
        holder.hospital.setText(hospital[position]);
    }

    @Override
    public int getItemCount() {
        return doctorName.length;
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
