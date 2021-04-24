package com.jcode.loomzy.bookservice.models;

public class ServiceItem {
    private String serviceImageUrl, serviceName;

    public ServiceItem(String serviceImageUrl, String serviceName) {
        this.serviceImageUrl = serviceImageUrl;
        this.serviceName = serviceName;
    }

    public String getServiceImageUrl() {
        return serviceImageUrl;
    }

    public String getServiceName() {
        return serviceName;
    }
}
