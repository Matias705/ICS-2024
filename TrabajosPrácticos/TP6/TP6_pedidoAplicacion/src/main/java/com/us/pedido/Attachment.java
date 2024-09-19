package com.us.pedido;

public class Attachment {
    private final byte[] data;
    private final String name;

    public Attachment(byte[] data, String name) {
        this.data = data;
        this.name = name;
    }

    public byte[] getData() {
        return data;
    }

    public String getName() {
        return name;
    }
}