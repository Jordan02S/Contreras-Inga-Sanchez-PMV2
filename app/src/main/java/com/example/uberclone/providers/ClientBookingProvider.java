package com.example.uberclone.providers;

import com.example.uberclone.models.ClientBooking;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ClientBookingProvider {

    private DatabaseReference mDatabase;

    public ClientBookingProvider() {
        mDatabase = FirebaseDatabase.getInstance().getReference().child("ClientBooking");
    }

    public Task<Void> create(ClientBooking clientBooking) {
        return mDatabase.child(clientBooking.getIdClient()).setValue(clientBooking);
    }

}
