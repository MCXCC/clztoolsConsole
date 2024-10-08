package org.example.clztoolsconsole.sys.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.clztoolsconsole.sys.department.entity.SysDepartment;
import org.example.clztoolsconsole.utils.BeanEntity;

import java.io.Serial;

@EqualsAndHashCode(callSuper = true)
@Data
public class SysUser extends BeanEntity<SysUser> {
    @Serial
    private static final long serialVersionUID = 1L;
    private String username;
    private String no;
    private String name;
    private String phone;
    private String password;
    private String token;
    private SysDepartment department;

    public SysUser() {
    }
}
