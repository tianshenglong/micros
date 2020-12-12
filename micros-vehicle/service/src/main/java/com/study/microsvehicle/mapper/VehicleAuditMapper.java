package com.study.microsvehicle.mapper;

import com.study.microsvehicle.model.VehicleAudit;
import com.study.microsvehicle.model.VehicleAuditExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VehicleAuditMapper {
    int countByExample(VehicleAuditExample example);

    int deleteByExample(VehicleAuditExample example);

    int deleteByPrimaryKey(String id);

    int insert(VehicleAudit record);

    int insertSelective(VehicleAudit record);

    List<VehicleAudit> selectByExampleWithBLOBs(VehicleAuditExample example);

    List<VehicleAudit> selectByExample(VehicleAuditExample example);

    VehicleAudit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VehicleAudit record, @Param("example") VehicleAuditExample example);

    int updateByExampleWithBLOBs(@Param("record") VehicleAudit record, @Param("example") VehicleAuditExample example);

    int updateByExample(@Param("record") VehicleAudit record, @Param("example") VehicleAuditExample example);

    int updateByPrimaryKeySelective(VehicleAudit record);

    int updateByPrimaryKeyWithBLOBs(VehicleAudit record);

    int updateByPrimaryKey(VehicleAudit record);
}