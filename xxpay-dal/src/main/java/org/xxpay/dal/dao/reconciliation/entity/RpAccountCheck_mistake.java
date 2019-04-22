package org.xxpay.dal.dao.reconciliation.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpAccountCheck_mistake implements Serializable {
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

    private String account_check_batch_no;

    private Date bill_date;

    private String bank_type;

    private Date order_time;

    private String merchant_name;

    private String merchant_no;

    private String order_no;

    private Date trade_time;

    private String trx_no;

    private BigDecimal order_amount;

    private BigDecimal refund_amount;

    private String trade_status;

    private BigDecimal fee;

    private Date bank_trade_time;

    private String bank_order_no;

    private String bank_trx_no;

    private String bank_trade_status;

    private BigDecimal bank_amount;

    private BigDecimal bank_refund_amount;

    private BigDecimal bank_fee;

    private String err_type;

    private String handle_status;

    private String handle_value;

    private String handle_remark;

    private String operator_name;

    private String operator_account_no;

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

    public String getAccount_check_batch_no() {
        return account_check_batch_no;
    }

    public void setAccount_check_batch_no(String account_check_batch_no) {
        this.account_check_batch_no = account_check_batch_no;
    }

    public Date getBill_date() {
        return bill_date;
    }

    public void setBill_date(Date bill_date) {
        this.bill_date = bill_date;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    public String getMerchant_no() {
        return merchant_no;
    }

    public void setMerchant_no(String merchant_no) {
        this.merchant_no = merchant_no;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public Date getTrade_time() {
        return trade_time;
    }

    public void setTrade_time(Date trade_time) {
        this.trade_time = trade_time;
    }

    public String getTrx_no() {
        return trx_no;
    }

    public void setTrx_no(String trx_no) {
        this.trx_no = trx_no;
    }

    public BigDecimal getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(BigDecimal order_amount) {
        this.order_amount = order_amount;
    }

    public BigDecimal getRefund_amount() {
        return refund_amount;
    }

    public void setRefund_amount(BigDecimal refund_amount) {
        this.refund_amount = refund_amount;
    }

    public String getTrade_status() {
        return trade_status;
    }

    public void setTrade_status(String trade_status) {
        this.trade_status = trade_status;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Date getBank_trade_time() {
        return bank_trade_time;
    }

    public void setBank_trade_time(Date bank_trade_time) {
        this.bank_trade_time = bank_trade_time;
    }

    public String getBank_order_no() {
        return bank_order_no;
    }

    public void setBank_order_no(String bank_order_no) {
        this.bank_order_no = bank_order_no;
    }

    public String getBank_trx_no() {
        return bank_trx_no;
    }

    public void setBank_trx_no(String bank_trx_no) {
        this.bank_trx_no = bank_trx_no;
    }

    public String getBank_trade_status() {
        return bank_trade_status;
    }

    public void setBank_trade_status(String bank_trade_status) {
        this.bank_trade_status = bank_trade_status;
    }

    public BigDecimal getBank_amount() {
        return bank_amount;
    }

    public void setBank_amount(BigDecimal bank_amount) {
        this.bank_amount = bank_amount;
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

    public String getErr_type() {
        return err_type;
    }

    public void setErr_type(String err_type) {
        this.err_type = err_type;
    }

    public String getHandle_status() {
        return handle_status;
    }

    public void setHandle_status(String handle_status) {
        this.handle_status = handle_status;
    }

    public String getHandle_value() {
        return handle_value;
    }

    public void setHandle_value(String handle_value) {
        this.handle_value = handle_value;
    }

    public String getHandle_remark() {
        return handle_remark;
    }

    public void setHandle_remark(String handle_remark) {
        this.handle_remark = handle_remark;
    }

    public String getOperator_name() {
        return operator_name;
    }

    public void setOperator_name(String operator_name) {
        this.operator_name = operator_name;
    }

    public String getOperator_account_no() {
        return operator_account_no;
    }

    public void setOperator_account_no(String operator_account_no) {
        this.operator_account_no = operator_account_no;
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
        sb.append(", account_check_batch_no=").append(account_check_batch_no);
        sb.append(", bill_date=").append(bill_date);
        sb.append(", bank_type=").append(bank_type);
        sb.append(", order_time=").append(order_time);
        sb.append(", merchant_name=").append(merchant_name);
        sb.append(", merchant_no=").append(merchant_no);
        sb.append(", order_no=").append(order_no);
        sb.append(", trade_time=").append(trade_time);
        sb.append(", trx_no=").append(trx_no);
        sb.append(", order_amount=").append(order_amount);
        sb.append(", refund_amount=").append(refund_amount);
        sb.append(", trade_status=").append(trade_status);
        sb.append(", fee=").append(fee);
        sb.append(", bank_trade_time=").append(bank_trade_time);
        sb.append(", bank_order_no=").append(bank_order_no);
        sb.append(", bank_trx_no=").append(bank_trx_no);
        sb.append(", bank_trade_status=").append(bank_trade_status);
        sb.append(", bank_amount=").append(bank_amount);
        sb.append(", bank_refund_amount=").append(bank_refund_amount);
        sb.append(", bank_fee=").append(bank_fee);
        sb.append(", err_type=").append(err_type);
        sb.append(", handle_status=").append(handle_status);
        sb.append(", handle_value=").append(handle_value);
        sb.append(", handle_remark=").append(handle_remark);
        sb.append(", operator_name=").append(operator_name);
        sb.append(", operator_account_no=").append(operator_account_no);
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
        RpAccountCheck_mistake other = (RpAccountCheck_mistake) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAccount_check_batch_no() == null ? other.getAccount_check_batch_no() == null : this.getAccount_check_batch_no().equals(other.getAccount_check_batch_no()))
            && (this.getBill_date() == null ? other.getBill_date() == null : this.getBill_date().equals(other.getBill_date()))
            && (this.getBank_type() == null ? other.getBank_type() == null : this.getBank_type().equals(other.getBank_type()))
            && (this.getOrder_time() == null ? other.getOrder_time() == null : this.getOrder_time().equals(other.getOrder_time()))
            && (this.getMerchant_name() == null ? other.getMerchant_name() == null : this.getMerchant_name().equals(other.getMerchant_name()))
            && (this.getMerchant_no() == null ? other.getMerchant_no() == null : this.getMerchant_no().equals(other.getMerchant_no()))
            && (this.getOrder_no() == null ? other.getOrder_no() == null : this.getOrder_no().equals(other.getOrder_no()))
            && (this.getTrade_time() == null ? other.getTrade_time() == null : this.getTrade_time().equals(other.getTrade_time()))
            && (this.getTrx_no() == null ? other.getTrx_no() == null : this.getTrx_no().equals(other.getTrx_no()))
            && (this.getOrder_amount() == null ? other.getOrder_amount() == null : this.getOrder_amount().equals(other.getOrder_amount()))
            && (this.getRefund_amount() == null ? other.getRefund_amount() == null : this.getRefund_amount().equals(other.getRefund_amount()))
            && (this.getTrade_status() == null ? other.getTrade_status() == null : this.getTrade_status().equals(other.getTrade_status()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getBank_trade_time() == null ? other.getBank_trade_time() == null : this.getBank_trade_time().equals(other.getBank_trade_time()))
            && (this.getBank_order_no() == null ? other.getBank_order_no() == null : this.getBank_order_no().equals(other.getBank_order_no()))
            && (this.getBank_trx_no() == null ? other.getBank_trx_no() == null : this.getBank_trx_no().equals(other.getBank_trx_no()))
            && (this.getBank_trade_status() == null ? other.getBank_trade_status() == null : this.getBank_trade_status().equals(other.getBank_trade_status()))
            && (this.getBank_amount() == null ? other.getBank_amount() == null : this.getBank_amount().equals(other.getBank_amount()))
            && (this.getBank_refund_amount() == null ? other.getBank_refund_amount() == null : this.getBank_refund_amount().equals(other.getBank_refund_amount()))
            && (this.getBank_fee() == null ? other.getBank_fee() == null : this.getBank_fee().equals(other.getBank_fee()))
            && (this.getErr_type() == null ? other.getErr_type() == null : this.getErr_type().equals(other.getErr_type()))
            && (this.getHandle_status() == null ? other.getHandle_status() == null : this.getHandle_status().equals(other.getHandle_status()))
            && (this.getHandle_value() == null ? other.getHandle_value() == null : this.getHandle_value().equals(other.getHandle_value()))
            && (this.getHandle_remark() == null ? other.getHandle_remark() == null : this.getHandle_remark().equals(other.getHandle_remark()))
            && (this.getOperator_name() == null ? other.getOperator_name() == null : this.getOperator_name().equals(other.getOperator_name()))
            && (this.getOperator_account_no() == null ? other.getOperator_account_no() == null : this.getOperator_account_no().equals(other.getOperator_account_no()));
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
        result = prime * result + ((getAccount_check_batch_no() == null) ? 0 : getAccount_check_batch_no().hashCode());
        result = prime * result + ((getBill_date() == null) ? 0 : getBill_date().hashCode());
        result = prime * result + ((getBank_type() == null) ? 0 : getBank_type().hashCode());
        result = prime * result + ((getOrder_time() == null) ? 0 : getOrder_time().hashCode());
        result = prime * result + ((getMerchant_name() == null) ? 0 : getMerchant_name().hashCode());
        result = prime * result + ((getMerchant_no() == null) ? 0 : getMerchant_no().hashCode());
        result = prime * result + ((getOrder_no() == null) ? 0 : getOrder_no().hashCode());
        result = prime * result + ((getTrade_time() == null) ? 0 : getTrade_time().hashCode());
        result = prime * result + ((getTrx_no() == null) ? 0 : getTrx_no().hashCode());
        result = prime * result + ((getOrder_amount() == null) ? 0 : getOrder_amount().hashCode());
        result = prime * result + ((getRefund_amount() == null) ? 0 : getRefund_amount().hashCode());
        result = prime * result + ((getTrade_status() == null) ? 0 : getTrade_status().hashCode());
        result = prime * result + ((getFee() == null) ? 0 : getFee().hashCode());
        result = prime * result + ((getBank_trade_time() == null) ? 0 : getBank_trade_time().hashCode());
        result = prime * result + ((getBank_order_no() == null) ? 0 : getBank_order_no().hashCode());
        result = prime * result + ((getBank_trx_no() == null) ? 0 : getBank_trx_no().hashCode());
        result = prime * result + ((getBank_trade_status() == null) ? 0 : getBank_trade_status().hashCode());
        result = prime * result + ((getBank_amount() == null) ? 0 : getBank_amount().hashCode());
        result = prime * result + ((getBank_refund_amount() == null) ? 0 : getBank_refund_amount().hashCode());
        result = prime * result + ((getBank_fee() == null) ? 0 : getBank_fee().hashCode());
        result = prime * result + ((getErr_type() == null) ? 0 : getErr_type().hashCode());
        result = prime * result + ((getHandle_status() == null) ? 0 : getHandle_status().hashCode());
        result = prime * result + ((getHandle_value() == null) ? 0 : getHandle_value().hashCode());
        result = prime * result + ((getHandle_remark() == null) ? 0 : getHandle_remark().hashCode());
        result = prime * result + ((getOperator_name() == null) ? 0 : getOperator_name().hashCode());
        result = prime * result + ((getOperator_account_no() == null) ? 0 : getOperator_account_no().hashCode());
        return result;
    }
}