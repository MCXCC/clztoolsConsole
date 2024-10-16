package org.example.clztoolsconsole.sys.department.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.clztoolsconsole.sys.department.entity.SysDepartment;
import org.example.clztoolsconsole.utils.BaseMapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysDepartmentMapper extends BaseMapper<SysDepartment> {
}
