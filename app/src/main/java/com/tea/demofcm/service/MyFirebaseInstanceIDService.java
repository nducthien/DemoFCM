package com.tea.demofcm.service;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class    MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
//         Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.e("TAG", "Refreshed token: " + refreshedToken);

        // cbE7mcjiJxY:APA91bEsf-vjmjc3bwHg8T0A-iG8ERVnp-0mU8O2ZSzPL9PrZl3nzc31We8u3FMZrLbPpAyuSG6MxnZ5hMdtulmsHuHoxmESGC-FFx1Nlu-i4x_innnAAPm9VRgNDPduzLUXkXA4qJK9y1QmkOiM2ufED9AT5g52LQ

    }
}
