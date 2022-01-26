package org.meicode.medicus;

import java.io.Serializable;

public class Form implements Serializable {

    private String namaDokter;
    private String rumahSakit;
    private String tanggal;

    public Form(String namaDokter, String rumahSakit, String tanggal) {
        this.namaDokter = namaDokter;
        this.rumahSakit = rumahSakit;
        this.tanggal = tanggal;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getRumahSakit() {
        return rumahSakit;
    }

    public void setRumahSakit(String rumahSakit) {
        this.rumahSakit = rumahSakit;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
