package org.example.clztoolsconsole.sys.user.service;


import lombok.extern.slf4j.Slf4j;
import org.example.clztoolsconsole.sys.user.entity.SysUserRole;
import org.example.clztoolsconsole.sys.user.mapper.SysUserRoleMapper;
import org.example.clztoolsconsole.utils.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SysUserRoleService extends BaseService<SysUserRoleMapper, SysUserRole> {

    @Autowired
    public SysUserRoleService(SysUserRoleMapper sysUserRoleMapper) {
        super(sysUserRoleMapper);
    }
}
