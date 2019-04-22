package org.xxpay.dal.dao.reconciliation.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpAccountCheckMistakeScratchPool implements Serializable {
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

    /**
     * 商品名称
     *
     * @mbggenerated
     */
    private String product_name;

    /**
     * 商户订单号
     *
     * @mbggenerated
     */
    private String merchant_order_no;

    /**
     * 支付流水号
     *
     * @mbggenerated
     */
    private String trx_no;

    /**
     * 银行订单号
     *
     * @mbggenerated
     */
    private String bank_order_no;

    /**
     * 银行流水号
     *
     * @mbggenerated
     */
    private String bank_trx_no;

    /**
     * 订单金额
     *
     * @mbggenerated
     */
    private BigDecimal order_amount;

    /**
     * 平台收入
     *
     * @mbggenerated
     */
    private BigDecimal plat_income;

    /**
     * 费率
     *
     * @mbggenerated
     */
    private BigDecimal fee_rate;

    /**
     * 平台成本
     *
     * @mbggenerated
     */
    private BigDecimal plat_cost;

    /**
     * 平台利润
     *
     * @mbggenerated
     */
    private BigDecimal plat_profit;

    /**
     * 状态(参考枚举:paymentrecordstatusenum)
     *
     * @mbggenerated
     */
    private String status;

    /**
     * 支付通道编号
     *
     * @mbggenerated
     */
    private String pay_way_code;

    /**
     * 支付通道名称
     *
     * @mbggenerated
     */
    private String pay_way_name;

    /**
     * 支付成功时间
     *
     * @mbggenerated
     */
    private Date pay_success_time;

    /**
     * 完成时间
     *
     * @mbggenerated
     */
    private Date complete_time;

    /**
     * 是否退款(100:是,101:否,默认值为:101)
     *
     * @mbggenerated
     */
    private String is_refund;

    /**
     * 退款次数(默认值为:0)
     *
     * @mbggenerated
     */
    private Short refund_times;

    /**
     * 成功退款总金额
     *
     * @mbggenerated
     */
    private BigDecimal success_refund_amount;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remark;

    private String batch_no;

    private Date bill_date;

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

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getMerchant_order_no() {
        return merchant_order_no;
    }

    public void setMerchant_order_no(String merchant_order_no) {
        this.merchant_order_no = merchant_order_no;
    }

    public String getTrx_no() {
        return trx_no;
    }

    public void setTrx_no(String trx_no) {
        this.trx_no = trx_no;
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

    public BigDecimal getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(BigDecimal order_amount) {
        this.order_amount = order_amount;
    }

    public BigDecimal getPlat_income() {
        return plat_income;
    }

    public void setPlat_income(BigDecimal plat_income) {
        this.plat_income = plat_income;
    }

    public BigDecimal getFee_rate() {
        return fee_rate;
    }

    public void setFee_rate(BigDecimal fee_rate) {
        this.fee_rate = fee_rate;
    }

    public BigDecimal getPlat_cost() {
        return plat_cost;
    }

    public void setPlat_cost(BigDecimal plat_cost) {
        this.plat_cost = plat_cost;
    }

    public BigDecimal getPlat_profit() {
        return plat_profit;
    }

    public void setPlat_profit(BigDecimal plat_profit) {
        this.plat_profit = plat_profit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPay_way_code() {
        return pay_way_code;
    }

    public void setPay_way_code(String pay_way_code) {
        this.pay_way_code = pay_way_code;
    }

    public String getPay_way_name() {
        return pay_way_name;
    }

    public void setPay_way_name(String pay_way_name) {
        this.pay_way_name = pay_way_name;
    }

    public Date getPay_success_time() {
        return pay_success_time;
    }

    public void setPay_success_time(Date pay_success_time) {
        this.pay_success_time = pay_success_time;
    }

    public Date getComplete_time() {
        return complete_time;
    }

    public void setComplete_time(Date complete_time) {
        this.complete_time = complete_time;
    }

    public String getIs_refund() {
        return is_refund;
    }

    public void setIs_refund(String is_refund) {
        this.is_refund = is_refund;
    }

    public Short getRefund_times() {
        return refund_times;
    }

    public void setRefund_times(Short refund_times) {
        this.refund_times = refund_times;
    }

    public BigDecimal getSuccess_refund_amount() {
        return success_refund_amount;
    }

    public void setSuccess_refund_amount(BigDecimal success_refund_amount) {
        this.success_refund_amount = success_refund_amount;
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
        sb.append(", product_name=").append(product_name);
        sb.append(", merchant_order_no=").append(merchant_order_no);
        sb.append(", trx_no=").append(trx_no);
        sb.append(", bank_order_no=").append(bank_order_no);
        sb.append(", bank_trx_no=").append(bank_trx_no);
        sb.append(", order_amount=").append(order_amount);
        sb.append(", plat_income=").append(plat_income);
        sb.append(", fee_rate=").append(fee_rate);
        sb.append(", plat_cost=").append(plat_cost);
        sb.append(", plat_profit=").append(plat_profit);
        sb.append(", status=").append(status);
        sb.append(", pay_way_code=").append(pay_way_code);
        sb.append(", pay_way_name=").append(pay_way_name);
        sb.append(", pay_success_time=").append(pay_success_time);
        sb.append(", complete_time=").append(complete_time);
        sb.append(", is_refund=").append(is_refund);
        sb.append(", refund_times=").append(refund_times);
        sb.append(", success_refund_amount=").append(success_refund_amount);
        sb.append(", remark=").append(remark);
        sb.append(", batch_no=").append(batch_no);
        sb.append(", bill_date=").append(bill_date);
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
        RpAccountCheckMistakeScratchPool other = (RpAccountCheckMistakeScratchPool) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getProduct_name() == null ? other.getProduct_name() == null : this.getProduct_name().equals(other.getProduct_name()))
            && (this.getMerchant_order_no() == null ? other.getMerchant_order_no() == null : this.getMerchant_order_no().equals(other.getMerchant_order_no()))
            && (this.getTrx_no() == null ? other.getTrx_no() == null : this.getTrx_no().equals(other.getTrx_no()))
            && (this.getBank_order_no() == null ? other.getBank_order_no() == null : this.getBank_order_no().equals(other.getBank_order_no()))
            && (this.getBank_trx_no() == null ? other.getBank_trx_no() == null : this.getBank_trx_no().equals(other.getBank_trx_no()))
            && (this.getOrder_amount() == null ? other.getOrder_amount() == null : this.getOrder_amount().equals(other.getOrder_amount()))
            && (this.getPlat_income() == null ? other.getPlat_income() == null : this.getPlat_income().equals(other.getPlat_income()))
            && (this.getFee_rate() == null ? other.getFee_rate() == null : this.getFee_rate().equals(other.getFee_rate()))
            && (this.getPlat_cost() == null ? other.getPlat_cost() == null : this.getPlat_cost().equals(other.getPlat_cost()))
            && (this.getPlat_profit() == null ? other.getPlat_profit() == null : this.getPlat_profit().equals(other.getPlat_profit()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPay_way_code() == null ? other.getPay_way_code() == null : this.getPay_way_code().equals(other.getPay_way_code()))
            && (this.getPay_way_name() == null ? other.getPay_way_name() == null : this.getPay_way_name().equals(other.getPay_way_name()))
            && (this.getPay_success_time() == null ? other.getPay_success_time() == null : this.getPay_success_time().equals(other.getPay_success_time()))
            && (this.getComplete_time() == null ? other.getComplete_time() == null : this.getComplete_time().equals(other.getComplete_time()))
            && (this.getIs_refund() == null ? other.getIs_refund() == null : this.getIs_refund().equals(other.getIs_refund()))
            && (this.getRefund_times() == null ? other.getRefund_times() == null : this.getRefund_times().equals(other.getRefund_times()))
            && (this.getSuccess_refund_amount() == null ? other.getSuccess_refund_amount() == null : this.getSuccess_refund_amount().equals(other.getSuccess_refund_amount()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getBatch_no() == null ? other.getBatch_no() == null : this.getBatch_no().equals(other.getBatch_no()))
            && (this.getBill_date() == null ? other.getBill_date() == null : this.getBill_date().equals(other.getBill_date()));
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
        result = prime * result + ((getProduct_name() == null) ? 0 : getProduct_name().hashCode());
        result = prime * result + ((getMerchant_order_no() == null) ? 0 : getMerchant_order_no().hashCode());
        result = prime * result + ((getTrx_no() == null) ? 0 : getTrx_no().hashCode());
        result = prime * result + ((getBank_order_no() == null) ? 0 : getBank_order_no().hashCode());
        result = prime * result + ((getBank_trx_no() == null) ? 0 : getBank_trx_no().hashCode());
        result = prime * result + ((getOrder_amount() == null) ? 0 : getOrder_amount().hashCode());
        result = prime * result + ((getPlat_income() == null) ? 0 : getPlat_income().hashCode());
        result = prime * result + ((getFee_rate() == null) ? 0 : getFee_rate().hashCode());
        result = prime * result + ((getPlat_cost() == null) ? 0 : getPlat_cost().hashCode());
        result = prime * result + ((getPlat_profit() == null) ? 0 : getPlat_profit().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPay_way_code() == null) ? 0 : getPay_way_code().hashCode());
        result = prime * result + ((getPay_way_name() == null) ? 0 : getPay_way_name().hashCode());
        result = prime * result + ((getPay_success_time() == null) ? 0 : getPay_success_time().hashCode());
        result = prime * result + ((getComplete_time() == null) ? 0 : getComplete_time().hashCode());
        result = prime * result + ((getIs_refund() == null) ? 0 : getIs_refund().hashCode());
        result = prime * result + ((getRefund_times() == null) ? 0 : getRefund_times().hashCode());
        result = prime * result + ((getSuccess_refund_amount() == null) ? 0 : getSuccess_refund_amount().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getBatch_no() == null) ? 0 : getBatch_no().hashCode());
        result = prime * result + ((getBill_date() == null) ? 0 : getBill_date().hashCode());
        return result;
    }
}