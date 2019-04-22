package org.xxpay.dal.dao.reconciliation.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpAccountCheckBatch implements Serializable {
    private String id;

    private Integer version;

    private Date create_time;

    /**
     * 修改者
     *
     * @mbggenerated
     */
    private String editor;

    /**
     * 创建者
     *
     * @mbggenerated
     */
    private String creater;

    /**
     * 最后修改时间
     *
     * @mbggenerated
     */
    private Date edit_time;

    private String status;

    private String remark;

    private String batch_no;

    private Date bill_date;

    private String bill_type;

    private String handle_status;

    private String bank_type;

    private Integer mistake_count;

    private Integer unhandle_mistake_count;

    private Integer trade_count;

    private Integer bank_trade_count;

    private BigDecimal trade_amount;

    private BigDecimal bank_trade_amount;

    private BigDecimal refund_amount;

    private BigDecimal bank_refund_amount;

    private BigDecimal bank_fee;

    private String org_check_file_path;

    private String release_check_file_path;

    private String release_status;

    private String check_fail_msg;

    private String bank_err_msg;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
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

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public Date getBill_date() {
        return bill_date;
    }

    public void setBill_date(Date bill_date) {
        this.bill_date = bill_date;
    }

    public String getBill_type() {
        return bill_type;
    }

    public void setBill_type(String bill_type) {
        this.bill_type = bill_type;
    }

    public String getHandle_status() {
        return handle_status;
    }

    public void setHandle_status(String handle_status) {
        this.handle_status = handle_status;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public Integer getMistake_count() {
        return mistake_count;
    }

    public void setMistake_count(Integer mistake_count) {
        this.mistake_count = mistake_count;
    }

    public Integer getUnhandle_mistake_count() {
        return unhandle_mistake_count;
    }

    public void setUnhandle_mistake_count(Integer unhandle_mistake_count) {
        this.unhandle_mistake_count = unhandle_mistake_count;
    }

    public Integer getTrade_count() {
        return trade_count;
    }

    public void setTrade_count(Integer trade_count) {
        this.trade_count = trade_count;
    }

    public Integer getBank_trade_count() {
        return bank_trade_count;
    }

    public void setBank_trade_count(Integer bank_trade_count) {
        this.bank_trade_count = bank_trade_count;
    }

    public BigDecimal getTrade_amount() {
        return trade_amount;
    }

    public void setTrade_amount(BigDecimal trade_amount) {
        this.trade_amount = trade_amount;
    }

    public BigDecimal getBank_trade_amount() {
        return bank_trade_amount;
    }

    public void setBank_trade_amount(BigDecimal bank_trade_amount) {
        this.bank_trade_amount = bank_trade_amount;
    }

    public BigDecimal getRefund_amount() {
        return refund_amount;
    }

    public void setRefund_amount(BigDecimal refund_amount) {
        this.refund_amount = refund_amount;
    }

    public BigDecimal getBank_refund_amount() {
        return bank_refund_amount;
    }

    public void setBank_refund_amount(BigDecimal bank_refund_amount) {
        this.bank_refund_amount = bank_refund_amount;
    }

    public BigDecimal getBank_fee() {
        return bank_fee;
    }

    public void setBank_fee(BigDecimal bank_fee) {
        this.bank_fee = bank_fee;
    }

    public String getOrg_check_file_path() {
        return org_check_file_path;
    }

    public void setOrg_check_file_path(String org_check_file_path) {
        this.org_check_file_path = org_check_file_path;
    }

    public String getRelease_check_file_path() {
        return release_check_file_path;
    }

    public void setRelease_check_file_path(String release_check_file_path) {
        this.release_check_file_path = release_check_file_path;
    }

    public String getRelease_status() {
        return release_status;
    }

    public void setRelease_status(String release_status) {
        this.release_status = release_status;
    }

    public String getCheck_fail_msg() {
        return check_fail_msg;
    }

    public void setCheck_fail_msg(String check_fail_msg) {
        this.check_fail_msg = check_fail_msg;
    }

    public String getBank_err_msg() {
        return bank_err_msg;
    }

    public void setBank_err_msg(String bank_err_msg) {
        this.bank_err_msg = bank_err_msg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", create_time=").append(create_time);
        sb.append(", editor=").append(editor);
        sb.append(", creater=").append(creater);
        sb.append(", edit_time=").append(edit_time);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", batch_no=").append(batch_no);
        sb.append(", bill_date=").append(bill_date);
        sb.append(", bill_type=").append(bill_type);
        sb.append(", handle_status=").append(handle_status);
        sb.append(", bank_type=").append(bank_type);
        sb.append(", mistake_count=").append(mistake_count);
        sb.append(", unhandle_mistake_count=").append(unhandle_mistake_count);
        sb.append(", trade_count=").append(trade_count);
        sb.append(", bank_trade_count=").append(bank_trade_count);
        sb.append(", trade_amount=").append(trade_amount);
        sb.append(", bank_trade_amount=").append(bank_trade_amount);
        sb.append(", refund_amount=").append(refund_amount);
        sb.append(", bank_refund_amount=").append(bank_refund_amount);
        sb.append(", bank_fee=").append(bank_fee);
        sb.append(", org_check_file_path=").append(org_check_file_path);
        sb.append(", release_check_file_path=").append(release_check_file_path);
        sb.append(", release_status=").append(release_status);
        sb.append(", check_fail_msg=").append(check_fail_msg);
        sb.append(", bank_err_msg=").append(bank_err_msg);
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
        RpAccountCheckBatch other = (RpAccountCheckBatch) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getBatch_no() == null ? other.getBatch_no() == null : this.getBatch_no().equals(other.getBatch_no()))
            && (this.getBill_date() == null ? other.getBill_date() == null : this.getBill_date().equals(other.getBill_date()))
            && (this.getBill_type() == null ? other.getBill_type() == null : this.getBill_type().equals(other.getBill_type()))
            && (this.getHandle_status() == null ? other.getHandle_status() == null : this.getHandle_status().equals(other.getHandle_status()))
            && (this.getBank_type() == null ? other.getBank_type() == null : this.getBank_type().equals(other.getBank_type()))
            && (this.getMistake_count() == null ? other.getMistake_count() == null : this.getMistake_count().equals(other.getMistake_count()))
            && (this.getUnhandle_mistake_count() == null ? other.getUnhandle_mistake_count() == null : this.getUnhandle_mistake_count().equals(other.getUnhandle_mistake_count()))
            && (this.getTrade_count() == null ? other.getTrade_count() == null : this.getTrade_count().equals(other.getTrade_count()))
            && (this.getBank_trade_count() == null ? other.getBank_trade_count() == null : this.getBank_trade_count().equals(other.getBank_trade_count()))
            && (this.getTrade_amount() == null ? other.getTrade_amount() == null : this.getTrade_amount().equals(other.getTrade_amount()))
            && (this.getBank_trade_amount() == null ? other.getBank_trade_amount() == null : this.getBank_trade_amount().equals(other.getBank_trade_amount()))
            && (this.getRefund_amount() == null ? other.getRefund_amount() == null : this.getRefund_amount().equals(other.getRefund_amount()))
            && (this.getBank_refund_amount() == null ? other.getBank_refund_amount() == null : this.getBank_refund_amount().equals(other.getBank_refund_amount()))
            && (this.getBank_fee() == null ? other.getBank_fee() == null : this.getBank_fee().equals(other.getBank_fee()))
            && (this.getOrg_check_file_path() == null ? other.getOrg_check_file_path() == null : this.getOrg_check_file_path().equals(other.getOrg_check_file_path()))
            && (this.getRelease_check_file_path() == null ? other.getRelease_check_file_path() == null : this.getRelease_check_file_path().equals(other.getRelease_check_file_path()))
            && (this.getRelease_status() == null ? other.getRelease_status() == null : this.getRelease_status().equals(other.getRelease_status()))
            && (this.getCheck_fail_msg() == null ? other.getCheck_fail_msg() == null : this.getCheck_fail_msg().equals(other.getCheck_fail_msg()))
            && (this.getBank_err_msg() == null ? other.getBank_err_msg() == null : this.getBank_err_msg().equals(other.getBank_err_msg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getEditor() == null) ? 0 : getEditor().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getEdit_time() == null) ? 0 : getEdit_time().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getBatch_no() == null) ? 0 : getBatch_no().hashCode());
        result = prime * result + ((getBill_date() == null) ? 0 : getBill_date().hashCode());
        result = prime * result + ((getBill_type() == null) ? 0 : getBill_type().hashCode());
        result = prime * result + ((getHandle_status() == null) ? 0 : getHandle_status().hashCode());
        result = prime * result + ((getBank_type() == null) ? 0 : getBank_type().hashCode());
        result = prime * result + ((getMistake_count() == null) ? 0 : getMistake_count().hashCode());
        result = prime * result + ((getUnhandle_mistake_count() == null) ? 0 : getUnhandle_mistake_count().hashCode());
        result = prime * result + ((getTrade_count() == null) ? 0 : getTrade_count().hashCode());
        result = prime * result + ((getBank_trade_count() == null) ? 0 : getBank_trade_count().hashCode());
        result = prime * result + ((getTrade_amount() == null) ? 0 : getTrade_amount().hashCode());
        result = prime * result + ((getBank_trade_amount() == null) ? 0 : getBank_trade_amount().hashCode());
        result = prime * result + ((getRefund_amount() == null) ? 0 : getRefund_amount().hashCode());
        result = prime * result + ((getBank_refund_amount() == null) ? 0 : getBank_refund_amount().hashCode());
        result = prime * result + ((getBank_fee() == null) ? 0 : getBank_fee().hashCode());
        result = prime * result + ((getOrg_check_file_path() == null) ? 0 : getOrg_check_file_path().hashCode());
        result = prime * result + ((getRelease_check_file_path() == null) ? 0 : getRelease_check_file_path().hashCode());
        result = prime * result + ((getRelease_status() == null) ? 0 : getRelease_status().hashCode());
        result = prime * result + ((getCheck_fail_msg() == null) ? 0 : getCheck_fail_msg().hashCode());
        result = prime * result + ((getBank_err_msg() == null) ? 0 : getBank_err_msg().hashCode());
        return result;
    }
}