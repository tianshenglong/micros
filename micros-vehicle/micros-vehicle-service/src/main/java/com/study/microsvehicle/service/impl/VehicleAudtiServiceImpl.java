package com.study.microsvehicle.service.impl;

import com.google.common.collect.Lists;
import com.study.microsuser.api.feign.UserFeignService;
import com.study.microsuser.model.PnUser;
import com.study.microsvehicle.mapper.VehicleAuditMapper;
import com.study.microsvehicle.model.VehicleAudit;
import com.study.microsvehicle.model.VehicleAuditExample;
import com.study.microsvehicle.service.VehicleAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Description  VehicleAudtiServiceImpl</p>
 *
 * @author tianshenglong
 * @date 2020/12/12 18:54
 * @return
 */
@Service
public class VehicleAudtiServiceImpl implements VehicleAuditService {

    @Autowired
    UserFeignService userFeignService;

    @Autowired
    private VehicleAuditMapper vehicleAuditMapper;


    @Override
    public List<VehicleAudit> getUserVehicles(Integer userId) {

        PnUser user = userFeignService.findById(userId);
        System.out.println(1);

        VehicleAuditExample vehicleAuditExample = new VehicleAuditExample();
        vehicleAuditExample.createCriteria().andUserIdEqualTo("1");

        VehicleAudit vehicleAudit =  vehicleAuditMapper.selectByPrimaryKey("40288afb6daa2c86016dae9135280006") ;

        List<VehicleAudit> list = Lists.newArrayList();
        list.add(vehicleAudit);
        return list;
    }
}
