package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.util.Date;

public class PmsOperatorLog implements Serializable {
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

    private Long operator_id;

    private String operator_name;

    /**
     * 操作类型（1:增加，2:修改，3:删除，4:查询）
     *
     * @mbggenerated
     */
    private String operate_type;

    private String ip;

    private String content;

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

    public Long getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(Long operator_id) {
        this.operator_id = operator_id;
    }

    public String getOperator_name() {
        return operator_name;
    }

    public void setOperator_name(String operator_name) {
        this.operator_name = operator_name;
    }

    public String getOperate_type() {
        return operate_type;
    }

    public void setOperate_type(String operate_type) {
        this.operate_type = operate_type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        sb.append(", operator_id=").append(operator_id);
        sb.append(", operator_name=").append(operator_name);
        sb.append(", operate_type=").append(operate_type);
        sb.append(", ip=").append(ip);
        sb.append(", content=").append(content);
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
        PmsOperatorLog other = (PmsOperatorLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getOperator_id() == null ? other.getOperator_id() == null : this.getOperator_id().equals(other.getOperator_id()))
            && (this.getOperator_name() == null ? other.getOperator_name() == null : this.getOperator_name().equals(other.getOperator_name()))
            && (this.getOperate_type() == null ? other.getOperate_type() == null : this.getOperate_type().equals(other.getOperate_type()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
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
        result = prime * result + ((getOperator_id() == null) ? 0 : getOperator_id().hashCode());
        result = prime * result + ((getOperator_name() == null) ? 0 : getOperator_name().hashCode());
        result = prime * result + ((getOperate_type() == null) ? 0 : getOperate_type().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}