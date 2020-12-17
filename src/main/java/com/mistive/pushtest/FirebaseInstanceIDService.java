package com.mistive.pushtest;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override //각 핸드폰 기기에서 받을 수 있는 난수 값. 해당 토큰을 가지고 있는 기기에 메시지 전송 가능
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.e(TAG, token);

        sendRegistrationToServer(token);
    }

    private void sendRegistrationToServer(String token) {

    }
}