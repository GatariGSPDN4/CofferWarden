package com.example.cofferwarden

public class Bill(var purchaseList: ArrayList<Purchase>) {

    public fun addPurchase(name : String, cost : Double, tag : String) {
        purchaseList.add(Purchase(name, cost, tag))
    }
}