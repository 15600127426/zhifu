package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpTradePaymentOrder implements Serializable {
    /**
     * id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 版本号
     *
     * @mbggenerated
     */
    private Integer version;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
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
     * 状态(参考枚举:orderstatusenum)
     *
     * @mbggenerated
     */
    private String status;

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
     * 订单金额
     *
     * @mbggenerated
     */
    private BigDecimal order_amount;

    /**
     * 订单来源
     *
     * @mbggenerated
     */
    private String order_from;

    /**
     * 商家名称
     *
     * @mbggenerated
     */
    private String merchant_name;

    /**
     * 商户编号
     *
     * @mbggenerated
     */
    private String merchant_no;

    /**
     * 下单时间
     *
     * @mbggenerated
     */
    private Date order_time;

    /**
     * 下单日期
     *
     * @mbggenerated
     */
    private Date order_date;

    /**
     * 下单ip(客户端ip,在网关页面获取)
     *
     * @mbggenerated
     */
    private String order_ip;

    /**
     * 从哪个页面链接过来的(可用于防诈骗)
     *
     * @mbggenerated
     */
    private String order_referer_url;

    /**
     * 页面回调通知url
     *
     * @mbggenerated
     */
    private String return_url;

    /**
     * 后台异步通知url
     *
     * @mbggenerated
     */
    private String notify_url;

    /**
     * 订单撤销原因
     *
     * @mbggenerated
     */
    private String cancel_reason;

    /**
     * 订单有效期(单位分钟)
     *
     * @mbggenerated
     */
    private Short order_period;

    /**
     * 到期时间
     *
     * @mbggenerated
     */
    private Date expire_time;

    /**
     * 支付方式编号
     *
     * @mbggenerated
     */
    private String pay_way_code;

    /**
     * 支付方式名称
     *
     * @mbggenerated
     */
    private String pay_way_name;

    /**
     * 支付备注
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 交易业务类型  ：消费、充值等
     *
     * @mbggenerated
     */
    private String trx_type;

    /**
     * 支付流水号
     *
     * @mbggenerated
     */
    private String trx_no;

    /**
     * 支付类型编号
     *
     * @mbggenerated
     */
    private String pay_type_code;

    /**
     * 支付类型名称
     *
     * @mbggenerated
     */
    private String pay_type_name;

    /**
     * 资金流入类型
     *
     * @mbggenerated
     */
    private String fund_into_type;

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
    private Integer refund_times;

    /**
     * 成功退款总金额
     *
     * @mbggenerated
     */
    private BigDecimal success_refund_amount;

    private String field1;

    private String field2;

    private String field3;

    private String field4;

    private String field5;

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

    public BigDecimal getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(BigDecimal order_amount) {
        this.order_amount = order_amount;
    }

    public String getOrder_from() {
        return order_from;
    }

    public void setOrder_from(String order_from) {
        this.order_from = order_from;
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

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getOrder_ip() {
        return order_ip;
    }

    public void setOrder_ip(String order_ip) {
        this.order_ip = order_ip;
    }

    public String getOrder_referer_url() {
        return order_referer_url;
    }

    public void setOrder_referer_url(String order_referer_url) {
        this.order_referer_url = order_referer_url;
    }

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getCancel_reason() {
        return cancel_reason;
    }

    public void setCancel_reason(String cancel_reason) {
        this.cancel_reason = cancel_reason;
    }

    public Short getOrder_period() {
        return order_period;
    }

    public void setOrder_period(Short order_period) {
        this.order_period = order_period;
    }

    public Date getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(Date expire_time) {
        this.expire_time = expire_time;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTrx_type() {
        return trx_type;
    }

    public void setTrx_type(String trx_type) {
        this.trx_type = trx_type;
    }

    public String getTrx_no() {
        return trx_no;
    }

    public void setTrx_no(String trx_no) {
        this.trx_no = trx_no;
    }

    public String getPay_type_code() {
        return pay_type_code;
    }

    public void setPay_type_code(String pay_type_code) {
        this.pay_type_code = pay_type_code;
    }

    public String getPay_type_name() {
        return pay_type_name;
    }

    public void setPay_type_name(String pay_type_name) {
        this.pay_type_name = pay_type_name;
    }

    public String getFund_into_type() {
        return fund_into_type;
    }

    public void setFund_into_type(String fund_into_type) {
        this.fund_into_type = fund_into_type;
    }

    public String getIs_refund() {
        return is_refund;
    }

    public void setIs_refund(String is_refund) {
        this.is_refund = is_refund;
    }

    public Integer getRefund_times() {
        return refund_times;
    }

    public void setRefund_times(Integer refund_times) {
        this.refund_times = refund_times;
    }

    public BigDecimal getSuccess_refund_amount() {
        return success_refund_amount;
    }

    public void setSuccess_refund_amount(BigDecimal success_refund_amount) {
        this.success_refund_amount = success_refund_amount;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
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
        sb.append(", product_name=").append(product_name);
        sb.append(", merchant_order_no=").append(merchant_order_no);
        sb.append(", order_amount=").append(order_amount);
        sb.append(", order_from=").append(order_from);
        sb.append(", merchant_name=").append(merchant_name);
        sb.append(", merchant_no=").append(merchant_no);
        sb.append(", order_time=").append(order_time);
        sb.append(", order_date=").append(order_date);
        sb.append(", order_ip=").append(order_ip);
        sb.append(", order_referer_url=").append(order_referer_url);
        sb.append(", return_url=").append(return_url);
        sb.append(", notify_url=").append(notify_url);
        sb.append(", cancel_reason=").append(cancel_reason);
        sb.append(", order_period=").append(order_period);
        sb.append(", expire_time=").append(expire_time);
        sb.append(", pay_way_code=").append(pay_way_code);
        sb.append(", pay_way_name=").append(pay_way_name);
        sb.append(", remark=").append(remark);
        sb.append(", trx_type=").append(trx_type);
        sb.append(", trx_no=").append(trx_no);
        sb.append(", pay_type_code=").append(pay_type_code);
        sb.append(", pay_type_name=").append(pay_type_name);
        sb.append(", fund_into_type=").append(fund_into_type);
        sb.append(", is_refund=").append(is_refund);
        sb.append(", refund_times=").append(refund_times);
        sb.append(", success_refund_amount=").append(success_refund_amount);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", field3=").append(field3);
        sb.append(", field4=").append(field4);
        sb.append(", field5=").append(field5);
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
        RpTradePaymentOrder other = (RpTradePaymentOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getProduct_name() == null ? other.getProduct_name() == null : this.getProduct_name().equals(other.getProduct_name()))
            && (this.getMerchant_order_no() == null ? other.getMerchant_order_no() == null : this.getMerchant_order_no().equals(other.getMerchant_order_no()))
            && (this.getOrder_amount() == null ? other.getOrder_amount() == null : this.getOrder_amount().equals(other.getOrder_amount()))
            && (this.getOrder_from() == null ? other.getOrder_from() == null : this.getOrder_from().equals(other.getOrder_from()))
            && (this.getMerchant_name() == null ? other.getMerchant_name() == null : this.getMerchant_name().equals(other.getMerchant_name()))
            && (this.getMerchant_no() == null ? other.getMerchant_no() == null : this.getMerchant_no().equals(other.getMerchant_no()))
            && (this.getOrder_time() == null ? other.getOrder_time() == null : this.getOrder_time().equals(other.getOrder_time()))
            && (this.getOrder_date() == null ? other.getOrder_date() == null : this.getOrder_date().equals(other.getOrder_date()))
            && (this.getOrder_ip() == null ? other.getOrder_ip() == null : this.getOrder_ip().equals(other.getOrder_ip()))
            && (this.getOrder_referer_url() == null ? other.getOrder_referer_url() == null : this.getOrder_referer_url().equals(other.getOrder_referer_url()))
            && (this.getReturn_url() == null ? other.getReturn_url() == null : this.getReturn_url().equals(other.getReturn_url()))
            && (this.getNotify_url() == null ? other.getNotify_url() == null : this.getNotify_url().equals(other.getNotify_url()))
            && (this.getCancel_reason() == null ? other.getCancel_reason() == null : this.getCancel_reason().equals(other.getCancel_reason()))
            && (this.getOrder_period() == null ? other.getOrder_period() == null : this.getOrder_period().equals(other.getOrder_period()))
            && (this.getExpire_time() == null ? other.getExpire_time() == null : this.getExpire_time().equals(other.getExpire_time()))
            && (this.getPay_way_code() == null ? other.getPay_way_code() == null : this.getPay_way_code().equals(other.getPay_way_code()))
            && (this.getPay_way_name() == null ? other.getPay_way_name() == null : this.getPay_way_name().equals(other.getPay_way_name()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getTrx_type() == null ? other.getTrx_type() == null : this.getTrx_type().equals(other.getTrx_type()))
            && (this.getTrx_no() == null ? other.getTrx_no() == null : this.getTrx_no().equals(other.getTrx_no()))
            && (this.getPay_type_code() == null ? other.getPay_type_code() == null : this.getPay_type_code().equals(other.getPay_type_code()))
            && (this.getPay_type_name() == null ? other.getPay_type_name() == null : this.getPay_type_name().equals(other.getPay_type_name()))
            && (this.getFund_into_type() == null ? other.getFund_into_type() == null : this.getFund_into_type().equals(other.getFund_into_type()))
            && (this.getIs_refund() == null ? other.getIs_refund() == null : this.getIs_refund().equals(other.getIs_refund()))
            && (this.getRefund_times() == null ? other.getRefund_times() == null : this.getRefund_times().equals(other.getRefund_times()))
            && (this.getSuccess_refund_amount() == null ? other.getSuccess_refund_amount() == null : this.getSuccess_refund_amount().equals(other.getSuccess_refund_amount()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()))
            && (this.getField3() == null ? other.getField3() == null : this.getField3().equals(other.getField3()))
            && (this.getField4() == null ? other.getField4() == null : this.getField4().equals(other.getField4()))
            && (this.getField5() == null ? other.getField5() == null : this.getField5().equals(other.getField5()));
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
        result = prime * result + ((getProduct_name() == null) ? 0 : getProduct_name().hashCode());
        result = prime * result + ((getMerchant_order_no() == null) ? 0 : getMerchant_order_no().hashCode());
        result = prime * result + ((getOrder_amount() == null) ? 0 : getOrder_amount().hashCode());
        result = prime * result + ((getOrder_from() == null) ? 0 : getOrder_from().hashCode());
        result = prime * result + ((getMerchant_name() == null) ? 0 : getMerchant_name().hashCode());
        result = prime * result + ((getMerchant_no() == null) ? 0 : getMerchant_no().hashCode());
        result = prime * result + ((getOrder_time() == null) ? 0 : getOrder_time().hashCode());
        result = prime * result + ((getOrder_date() == null) ? 0 : getOrder_date().hashCode());
        result = prime * result + ((getOrder_ip() == null) ? 0 : getOrder_ip().hashCode());
        result = prime * result + ((getOrder_referer_url() == null) ? 0 : getOrder_referer_url().hashCode());
        result = prime * result + ((getReturn_url() == null) ? 0 : getReturn_url().hashCode());
        result = prime * result + ((getNotify_url() == null) ? 0 : getNotify_url().hashCode());
        result = prime * result + ((getCancel_reason() == null) ? 0 : getCancel_reason().hashCode());
        result = prime * result + ((getOrder_period() == null) ? 0 : getOrder_period().hashCode());
        result = prime * result + ((getExpire_time() == null) ? 0 : getExpire_time().hashCode());
        result = prime * result + ((getPay_way_code() == null) ? 0 : getPay_way_code().hashCode());
        result = prime * result + ((getPay_way_name() == null) ? 0 : getPay_way_name().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getTrx_type() == null) ? 0 : getTrx_type().hashCode());
        result = prime * result + ((getTrx_no() == null) ? 0 : getTrx_no().hashCode());
        result = prime * result + ((getPay_type_code() == null) ? 0 : getPay_type_code().hashCode());
        result = prime * result + ((getPay_type_name() == null) ? 0 : getPay_type_name().hashCode());
        result = prime * result + ((getFund_into_type() == null) ? 0 : getFund_into_type().hashCode());
        result = prime * result + ((getIs_refund() == null) ? 0 : getIs_refund().hashCode());
        result = prime * result + ((getRefund_times() == null) ? 0 : getRefund_times().hashCode());
        result = prime * result + ((getSuccess_refund_amount() == null) ? 0 : getSuccess_refund_amount().hashCode());
        result = prime * result + ((getField1() == null) ? 0 : getField1().hashCode());
        result = prime * result + ((getField2() == null) ? 0 : getField2().hashCode());
        result = prime * result + ((getField3() == null) ? 0 : getField3().hashCode());
        result = prime * result + ((getField4() == null) ? 0 : getField4().hashCode());
        result = prime * result + ((getField5() == null) ? 0 : getField5().hashCode());
        return result;
    }
}