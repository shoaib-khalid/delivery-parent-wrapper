package com.kalsym.parentwrapper.controllers;


import com.kalsym.parentwrapper.models.Delivery;
import com.kalsym.parentwrapper.models.HttpResponse;

import com.kalsym.parentwrapper.models.enums.HttpStatus;
import com.kalsym.parentwrapper.services.ParentService;

import javax.servlet.http.HttpServletRequest;

public class ParentWrapperController {

    public HttpResponse getPrice(HttpServletRequest request, Delivery delivery,  ParentService deliveryService){
        String logprefix = request.getRequestURI() + " ";
        String location = Thread.currentThread().getStackTrace()[1].getMethodName();

        HttpResponse response = new HttpResponse(request.getRequestURI());
        response.setSuccessStatus(HttpStatus.OK);
        response.setData(deliveryService.addQuotation(delivery));

        return response;
    }

    public HttpResponse placeDeliveryOrder (HttpServletRequest request, String quotationId, ParentService deliveryService){
        HttpResponse response = new HttpResponse(request.getRequestURI());
        response.setSuccessStatus(HttpStatus.OK);
        response.setData(deliveryService.placeDeliveryOrder(quotationId));
        return response;
    }

}
