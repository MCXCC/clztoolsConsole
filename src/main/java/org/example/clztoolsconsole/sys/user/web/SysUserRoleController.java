package org.example.clztoolsconsole.sys.user.web;

import org.example.clztoolsconsole.sys.user.entity.SysUserRole;
import org.example.clztoolsconsole.sys.user.mapper.SysUserRoleMapper;
import org.example.clztoolsconsole.sys.user.service.SysUserRoleService;
import org.example.clztoolsconsole.utils.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sys/userRole")
public class SysUserRoleController extends BaseController<SysUserRoleService, SysUserRoleMapper, SysUserRole> {
    private final SysUserRoleService sysUserRoleService;

    @Autowired
    public SysUserRoleController(SysUserRoleService sysUserRoleService) {
        super(sysUserRoleService);
        this.sysUserRoleService = sysUserRoleService;
    }
}
