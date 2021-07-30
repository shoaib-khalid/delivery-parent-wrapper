package com.kalsym.parentwrapper.controllers;


import com.kalsym.parentwrapper.models.Delivery;
import com.kalsym.parentwrapper.models.HttpResponse;

import com.kalsym.parentwrapper.models.enums.HttpStatus;
import com.kalsym.parentwrapper.services.DeliveryService;
import com.kalsym.parentwrapper.utils.LogUtil;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;

public class DeliveryController {

    public HttpResponse getPrice(HttpServletRequest request, Delivery delivery,  DeliveryService deliveryService){
        String logprefix = request.getRequestURI() + " ";
        String location = Thread.currentThread().getStackTrace()[1].getMethodName();
        HttpResponse response = new HttpResponse(request.getRequestURI());
        response.setSuccessStatus(HttpStatus.OK);
        response.setData(deliveryService.addQuotation(request, delivery));

        LogUtil.info(logprefix, location, "Quotation Response : ", new JSONObject(response).toString());
        return response;
    }

    public HttpResponse placeDeliveryOrder (HttpServletRequest request, String quotationId, DeliveryService deliveryService){
        String logprefix = request.getRequestURI() + " ";
        String location = Thread.currentThread().getStackTrace()[1].getMethodName();

        HttpResponse response = new HttpResponse(request.getRequestURI());
        Delivery delivery = deliveryService.placeDeliveryOrder(request, quotationId);

        if(delivery != null)
        {
            response.setSuccessStatus(HttpStatus.OK);
            response.setData(delivery);
        }
        else{
            response.setStatus(404);
            response.setData("QUOTATION RECORD NOT FOUND");
        }

        LogUtil.info(logprefix, location, "PlaceOrder Response : ", new JSONObject(response).toString());

        return response;
    }

}
