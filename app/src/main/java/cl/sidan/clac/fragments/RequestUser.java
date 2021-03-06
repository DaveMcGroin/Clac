package cl.sidan.clac.fragments;

import cl.sidan.clac.access.interfaces.User;

public class RequestUser implements User {
    private String signature = "";

    public RequestUser(String signature) {
        if( signature.startsWith("#") ) {
            this.signature = signature;
        } else {
            this.signature = "#" + signature;
        }
    }

    @Override
    public String getSignature() {
        return signature;
    }
}
