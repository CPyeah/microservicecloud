package org.cp.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@NoArgsConstructor
//@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable// entity --orm--- db_table
{
    private Long deptno; // 主键
    private String dname; // 部门名称
    private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }

    public Long getDeptno() {
        return deptno;
    }

    public Dept setDeptno(Long deptno) {
        this.deptno = deptno;
        return this;
    }

    public String getDname() {
        return dname;
    }

    public Dept setDname(String dname) {
        this.dname = dname;
        return this;
    }

    public String getDb_source() {
        return db_source;
    }

    public Dept setDb_source(String db_source) {
        this.db_source = db_source;
        return this;
    }
}
