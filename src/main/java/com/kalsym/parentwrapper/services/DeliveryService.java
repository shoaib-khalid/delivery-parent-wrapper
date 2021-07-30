package com.kalsym.parentwrapper.services;

import com.kalsym.parentwrapper.models.Delivery;

import javax.servlet.http.HttpServletRequest;

public abstract class DeliveryService {

    public abstract Delivery addQuotation(HttpServletRequest httpServletRequest, Delivery delivery);
    public abstract Delivery placeDeliveryOrder(HttpServletRequest httpServletRequest, String quotationId);

}
