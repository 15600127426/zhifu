package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.util.Date;

public class PmsRole implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Long id;

    private Long version;

    /**
     * 创建人
     *
     * @mbggenerated
     */
    private String creater;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date create_time;

    /**
     * 修改人
     *
     * @mbggenerated
     */
    private String editor;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date edit_time;

    private String status;

    private String remark;

    /**
     * 角色类型（1:超级管理员角色，0:普通操作员角色）
     *
     * @mbggenerated
     */
    private String role_code;

    private String role_name;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Date getEdit_time() {
        return edit_time;
    }

    public void setEdit_time(Date edit_time) {
        this.edit_time = edit_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRole_code() {
        return role_code;
    }

    public void setRole_code(String role_code) {
        this.role_code = role_code;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", creater=").append(creater);
        sb.append(", create_time=").append(create_time);
        sb.append(", editor=").append(editor);
        sb.append(", edit_time=").append(edit_time);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", role_code=").append(role_code);
        sb.append(", role_name=").append(role_name);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PmsRole other = (PmsRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getRole_code() == null ? other.getRole_code() == null : this.getRole_code().equals(other.getRole_code()))
            && (this.getRole_name() == null ? other.getRole_name() == null : this.getRole_name().equals(other.getRole_name()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getEditor() == null) ? 0 : getEditor().hashCode());
        result = prime * result + ((getEdit_time() == null) ? 0 : getEdit_time().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getRole_code() == null) ? 0 : getRole_code().hashCode());
        result = prime * result + ((getRole_name() == null) ? 0 : getRole_name().hashCode());
        return result;
    }
}