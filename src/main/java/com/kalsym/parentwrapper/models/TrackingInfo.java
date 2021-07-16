package com.kalsym.parentwrapper.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tracking_info")
@Setter
@Getter
@NoArgsConstructor
public class TrackingInfo {

    @Id
    String deliveryId;

    String trackingNo;
    String merchantTrackingUrl;
    String customerTrackingUrl;

}
