package com.study.microsvehicle.service;

import com.study.microsvehicle.model.VehicleAudit;

import java.util.List;

public interface VehicleAuditService {

    List<VehicleAudit> getUserVehicles(Integer userId);
}
