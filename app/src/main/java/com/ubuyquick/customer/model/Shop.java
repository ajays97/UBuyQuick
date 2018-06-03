package com.ubuyquick.customer.model;

public class Shop {

    private String status;
    private String pincode;
    private String shop_id;
    private String shop_name;
    private String shop_timings;
    private String shop_image_url;
    private String shop_address;

    public Shop(String status, String pincode, String shop_id, String shop_name, String shop_timings, String shop_image_url, String shop_address) {
        this.status = status;
        this.pincode = pincode;
        this.shop_id = shop_id;
        this.shop_name = shop_name;
        this.shop_timings = shop_timings;
        this.shop_image_url = shop_image_url;
        this.shop_address = shop_address;
    }

    public String getShopAddress() {
        return shop_address;
    }

    public void setShopAddress(String shop_address) {
        this.shop_address = shop_address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getShopId() {
        return shop_id;
    }

    public void setShopId(String shop_id) {
        this.shop_id = shop_id;
    }

    public String getShopName() {
        return shop_name;
    }

    public void setShopName(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShopTimings() {
        return shop_timings;
    }

    public void setShopTimings(String shop_timings) {
        this.shop_timings = shop_timings;
    }

    public String getShopImageUrl() {
        return shop_image_url;
    }

    public void setShopImageUrl(String shop_image_url) {
        this.shop_image_url = shop_image_url;
    }
}
