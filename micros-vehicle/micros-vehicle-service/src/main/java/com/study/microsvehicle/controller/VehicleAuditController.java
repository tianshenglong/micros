package com.study.microsvehicle.controller;

import com.study.microsvehicle.model.VehicleAudit;
import com.study.microsvehicle.service.VehicleAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>Description  VehicleAuditController</p>
 *
 * @author tianshenglong
 * @date 2020/12/14 16:12
 * @return
 */
@RestController
@RequestMapping("/v1/vehicles")
public class VehicleAuditController {

    @Autowired
    private VehicleAuditService vehicleAuditService;


    @GetMapping("/{userId}")
    public List<VehicleAudit> getList(@PathVariable("userId")Integer userId){
        return vehicleAuditService.getUserVehicles(userId);
    }


}
