package org.xxpay.dal.dao.account.entity;

import java.io.Serializable;
import java.util.Date;

public class RpSettRecordAnnex implements Serializable {
    private String id;

    private Date create_time;

    private Date edit_time;

    private Long version;

    private String remark;

    private String is_delete;

    private String annex_name;

    private String annex_address;

    private String settlement_id;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getEdit_time() {
        return edit_time;
    }

    public void setEdit_time(Date edit_time) {
        this.edit_time = edit_time;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(String is_delete) {
        this.is_delete = is_delete;
    }

    public String getAnnex_name() {
        return annex_name;
    }

    public void setAnnex_name(String annex_name) {
        this.annex_name = annex_name;
    }

    public String getAnnex_address() {
        return annex_address;
    }

    public void setAnnex_address(String annex_address) {
        this.annex_address = annex_address;
    }

    public String getSettlement_id() {
        return settlement_id;
    }

    public void setSettlement_id(String settlement_id) {
        this.settlement_id = settlement_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", create_time=").append(create_time);
        sb.append(", edit_time=").append(edit_time);
        sb.append(", version=").append(version);
        sb.append(", remark=").append(remark);
        sb.append(", is_delete=").append(is_delete);
        sb.append(", annex_name=").append(annex_name);
        sb.append(", annex_address=").append(annex_address);
        sb.append(", settlement_id=").append(settlement_id);
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
        RpSettRecordAnnex other = (RpSettRecordAnnex) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()))
            && (this.getAnnex_name() == null ? other.getAnnex_name() == null : this.getAnnex_name().equals(other.getAnnex_name()))
            && (this.getAnnex_address() == null ? other.getAnnex_address() == null : this.getAnnex_address().equals(other.getAnnex_address()))
            && (this.getSettlement_id() == null ? other.getSettlement_id() == null : this.getSettlement_id().equals(other.getSettlement_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getEdit_time() == null) ? 0 : getEdit_time().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        result = prime * result + ((getAnnex_name() == null) ? 0 : getAnnex_name().hashCode());
        result = prime * result + ((getAnnex_address() == null) ? 0 : getAnnex_address().hashCode());
        result = prime * result + ((getSettlement_id() == null) ? 0 : getSettlement_id().hashCode());
        return result;
    }
}