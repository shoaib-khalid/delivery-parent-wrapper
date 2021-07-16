package com.kalsym.parentwrapper.models.mqtt;

import com.kalsym.parentwrapper.models.enums.Status;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class StatusMessage {
    private Status status;
    private Date timestamp;

    public StatusMessage(Status status){
        this.status = status;
        this.timestamp = new Date();
    }
}
