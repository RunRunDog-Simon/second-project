package org.example.model;

public class Asset {
    protected String name;

    public Asset(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("資產名稱：" + name);
    }

    public double calculateReturn() {
        return 0.0; // 預設無報酬
    }
}