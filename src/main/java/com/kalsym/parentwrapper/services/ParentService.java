package com.kalsym.parentwrapper.services;

import com.kalsym.parentwrapper.models.Delivery;

public abstract class ParentService {

    public abstract Delivery addQuotation(Delivery delivery);
    public abstract Delivery placeDeliveryOrder(String quotationId);

}
