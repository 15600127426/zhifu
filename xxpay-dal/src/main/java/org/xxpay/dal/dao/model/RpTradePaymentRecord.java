package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpTradePaymentRecord implements Serializable {
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
     * 状态(参考枚举:paymentrecordstatusenum)
     *
     * @mbggenerated
     */
    private String status;

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
     * 商家名称
     *
     * @mbggenerated
     */
    private String merchant_name;

    /**
     * 商家编号
     *
     * @mbggenerated
     */
    private String merchant_no;

    /**
     * 付款人编号
     *
     * @mbggenerated
     */
    private String payer_user_no;

    /**
     * 付款人名称
     *
     * @mbggenerated
     */
    private String payer_name;

    /**
     * 付款方支付金额
     *
     * @mbggenerated
     */
    private BigDecimal payer_pay_amount;

    /**
     * 付款方手续费
     *
     * @mbggenerated
     */
    private BigDecimal payer_fee;

    /**
     * 付款方账户类型(参考账户类型枚举:accounttypeenum)
     *
     * @mbggenerated
     */
    private String payer_account_type;

    /**
     * 收款人编号
     *
     * @mbggenerated
     */
    private String receiver_user_no;

    /**
     * 收款人名称
     *
     * @mbggenerated
     */
    private String receiver_name;

    /**
     * 收款方支付金额
     *
     * @mbggenerated
     */
    private BigDecimal receiver_pay_amount;

    /**
     * 收款方手续费
     *
     * @mbggenerated
     */
    private BigDecimal receiver_fee;

    /**
     * 收款方账户类型(参考账户类型枚举:accounttypeenum)
     *
     * @mbggenerated
     */
    private String receiver_account_type;

    /**
     * 下单ip(客户端ip,从网关中获取)
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
    private Integer refund_times;

    /**
     * 成功退款总金额
     *
     * @mbggenerated
     */
    private BigDecimal success_refund_amount;

    /**
     * 交易业务类型  ：消费、充值等
     *
     * @mbggenerated
     */
    private String trx_type;

    /**
     * 订单来源
     *
     * @mbggenerated
     */
    private String order_from;

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
     * 备注
     *
     * @mbggenerated
     */
    private String remark;

    private String field1;

    private String field2;

    private String field3;

    private String field4;

    private String field5;

    /**
     * 银行返回信息
     *
     * @mbggenerated
     */
    private String bank_return_msg;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getPayer_user_no() {
        return payer_user_no;
    }

    public void setPayer_user_no(String payer_user_no) {
        this.payer_user_no = payer_user_no;
    }

    public String getPayer_name() {
        return payer_name;
    }

    public void setPayer_name(String payer_name) {
        this.payer_name = payer_name;
    }

    public BigDecimal getPayer_pay_amount() {
        return payer_pay_amount;
    }

    public void setPayer_pay_amount(BigDecimal payer_pay_amount) {
        this.payer_pay_amount = payer_pay_amount;
    }

    public BigDecimal getPayer_fee() {
        return payer_fee;
    }

    public void setPayer_fee(BigDecimal payer_fee) {
        this.payer_fee = payer_fee;
    }

    public String getPayer_account_type() {
        return payer_account_type;
    }

    public void setPayer_account_type(String payer_account_type) {
        this.payer_account_type = payer_account_type;
    }

    public String getReceiver_user_no() {
        return receiver_user_no;
    }

    public void setReceiver_user_no(String receiver_user_no) {
        this.receiver_user_no = receiver_user_no;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public BigDecimal getReceiver_pay_amount() {
        return receiver_pay_amount;
    }

    public void setReceiver_pay_amount(BigDecimal receiver_pay_amount) {
        this.receiver_pay_amount = receiver_pay_amount;
    }

    public BigDecimal getReceiver_fee() {
        return receiver_fee;
    }

    public void setReceiver_fee(BigDecimal receiver_fee) {
        this.receiver_fee = receiver_fee;
    }

    public String getReceiver_account_type() {
        return receiver_account_type;
    }

    public void setReceiver_account_type(String receiver_account_type) {
        this.receiver_account_type = receiver_account_type;
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

    public String getTrx_type() {
        return trx_type;
    }

    public void setTrx_type(String trx_type) {
        this.trx_type = trx_type;
    }

    public String getOrder_from() {
        return order_from;
    }

    public void setOrder_from(String order_from) {
        this.order_from = order_from;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getBank_return_msg() {
        return bank_return_msg;
    }

    public void setBank_return_msg(String bank_return_msg) {
        this.bank_return_msg = bank_return_msg;
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
        sb.append(", status=").append(status);
        sb.append(", editor=").append(editor);
        sb.append(", creater=").append(creater);
        sb.append(", edit_time=").append(edit_time);
        sb.append(", product_name=").append(product_name);
        sb.append(", merchant_order_no=").append(merchant_order_no);
        sb.append(", trx_no=").append(trx_no);
        sb.append(", bank_order_no=").append(bank_order_no);
        sb.append(", bank_trx_no=").append(bank_trx_no);
        sb.append(", merchant_name=").append(merchant_name);
        sb.append(", merchant_no=").append(merchant_no);
        sb.append(", payer_user_no=").append(payer_user_no);
        sb.append(", payer_name=").append(payer_name);
        sb.append(", payer_pay_amount=").append(payer_pay_amount);
        sb.append(", payer_fee=").append(payer_fee);
        sb.append(", payer_account_type=").append(payer_account_type);
        sb.append(", receiver_user_no=").append(receiver_user_no);
        sb.append(", receiver_name=").append(receiver_name);
        sb.append(", receiver_pay_amount=").append(receiver_pay_amount);
        sb.append(", receiver_fee=").append(receiver_fee);
        sb.append(", receiver_account_type=").append(receiver_account_type);
        sb.append(", order_ip=").append(order_ip);
        sb.append(", order_referer_url=").append(order_referer_url);
        sb.append(", order_amount=").append(order_amount);
        sb.append(", plat_income=").append(plat_income);
        sb.append(", fee_rate=").append(fee_rate);
        sb.append(", plat_cost=").append(plat_cost);
        sb.append(", plat_profit=").append(plat_profit);
        sb.append(", return_url=").append(return_url);
        sb.append(", notify_url=").append(notify_url);
        sb.append(", pay_way_code=").append(pay_way_code);
        sb.append(", pay_way_name=").append(pay_way_name);
        sb.append(", pay_success_time=").append(pay_success_time);
        sb.append(", complete_time=").append(complete_time);
        sb.append(", is_refund=").append(is_refund);
        sb.append(", refund_times=").append(refund_times);
        sb.append(", success_refund_amount=").append(success_refund_amount);
        sb.append(", trx_type=").append(trx_type);
        sb.append(", order_from=").append(order_from);
        sb.append(", pay_type_code=").append(pay_type_code);
        sb.append(", pay_type_name=").append(pay_type_name);
        sb.append(", fund_into_type=").append(fund_into_type);
        sb.append(", remark=").append(remark);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", field3=").append(field3);
        sb.append(", field4=").append(field4);
        sb.append(", field5=").append(field5);
        sb.append(", bank_return_msg=").append(bank_return_msg);
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
        RpTradePaymentRecord other = (RpTradePaymentRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getProduct_name() == null ? other.getProduct_name() == null : this.getProduct_name().equals(other.getProduct_name()))
            && (this.getMerchant_order_no() == null ? other.getMerchant_order_no() == null : this.getMerchant_order_no().equals(other.getMerchant_order_no()))
            && (this.getTrx_no() == null ? other.getTrx_no() == null : this.getTrx_no().equals(other.getTrx_no()))
            && (this.getBank_order_no() == null ? other.getBank_order_no() == null : this.getBank_order_no().equals(other.getBank_order_no()))
            && (this.getBank_trx_no() == null ? other.getBank_trx_no() == null : this.getBank_trx_no().equals(other.getBank_trx_no()))
            && (this.getMerchant_name() == null ? other.getMerchant_name() == null : this.getMerchant_name().equals(other.getMerchant_name()))
            && (this.getMerchant_no() == null ? other.getMerchant_no() == null : this.getMerchant_no().equals(other.getMerchant_no()))
            && (this.getPayer_user_no() == null ? other.getPayer_user_no() == null : this.getPayer_user_no().equals(other.getPayer_user_no()))
            && (this.getPayer_name() == null ? other.getPayer_name() == null : this.getPayer_name().equals(other.getPayer_name()))
            && (this.getPayer_pay_amount() == null ? other.getPayer_pay_amount() == null : this.getPayer_pay_amount().equals(other.getPayer_pay_amount()))
            && (this.getPayer_fee() == null ? other.getPayer_fee() == null : this.getPayer_fee().equals(other.getPayer_fee()))
            && (this.getPayer_account_type() == null ? other.getPayer_account_type() == null : this.getPayer_account_type().equals(other.getPayer_account_type()))
            && (this.getReceiver_user_no() == null ? other.getReceiver_user_no() == null : this.getReceiver_user_no().equals(other.getReceiver_user_no()))
            && (this.getReceiver_name() == null ? other.getReceiver_name() == null : this.getReceiver_name().equals(other.getReceiver_name()))
            && (this.getReceiver_pay_amount() == null ? other.getReceiver_pay_amount() == null : this.getReceiver_pay_amount().equals(other.getReceiver_pay_amount()))
            && (this.getReceiver_fee() == null ? other.getReceiver_fee() == null : this.getReceiver_fee().equals(other.getReceiver_fee()))
            && (this.getReceiver_account_type() == null ? other.getReceiver_account_type() == null : this.getReceiver_account_type().equals(other.getReceiver_account_type()))
            && (this.getOrder_ip() == null ? other.getOrder_ip() == null : this.getOrder_ip().equals(other.getOrder_ip()))
            && (this.getOrder_referer_url() == null ? other.getOrder_referer_url() == null : this.getOrder_referer_url().equals(other.getOrder_referer_url()))
            && (this.getOrder_amount() == null ? other.getOrder_amount() == null : this.getOrder_amount().equals(other.getOrder_amount()))
            && (this.getPlat_income() == null ? other.getPlat_income() == null : this.getPlat_income().equals(other.getPlat_income()))
            && (this.getFee_rate() == null ? other.getFee_rate() == null : this.getFee_rate().equals(other.getFee_rate()))
            && (this.getPlat_cost() == null ? other.getPlat_cost() == null : this.getPlat_cost().equals(other.getPlat_cost()))
            && (this.getPlat_profit() == null ? other.getPlat_profit() == null : this.getPlat_profit().equals(other.getPlat_profit()))
            && (this.getReturn_url() == null ? other.getReturn_url() == null : this.getReturn_url().equals(other.getReturn_url()))
            && (this.getNotify_url() == null ? other.getNotify_url() == null : this.getNotify_url().equals(other.getNotify_url()))
            && (this.getPay_way_code() == null ? other.getPay_way_code() == null : this.getPay_way_code().equals(other.getPay_way_code()))
            && (this.getPay_way_name() == null ? other.getPay_way_name() == null : this.getPay_way_name().equals(other.getPay_way_name()))
            && (this.getPay_success_time() == null ? other.getPay_success_time() == null : this.getPay_success_time().equals(other.getPay_success_time()))
            && (this.getComplete_time() == null ? other.getComplete_time() == null : this.getComplete_time().equals(other.getComplete_time()))
            && (this.getIs_refund() == null ? other.getIs_refund() == null : this.getIs_refund().equals(other.getIs_refund()))
            && (this.getRefund_times() == null ? other.getRefund_times() == null : this.getRefund_times().equals(other.getRefund_times()))
            && (this.getSuccess_refund_amount() == null ? other.getSuccess_refund_amount() == null : this.getSuccess_refund_amount().equals(other.getSuccess_refund_amount()))
            && (this.getTrx_type() == null ? other.getTrx_type() == null : this.getTrx_type().equals(other.getTrx_type()))
            && (this.getOrder_from() == null ? other.getOrder_from() == null : this.getOrder_from().equals(other.getOrder_from()))
            && (this.getPay_type_code() == null ? other.getPay_type_code() == null : this.getPay_type_code().equals(other.getPay_type_code()))
            && (this.getPay_type_name() == null ? other.getPay_type_name() == null : this.getPay_type_name().equals(other.getPay_type_name()))
            && (this.getFund_into_type() == null ? other.getFund_into_type() == null : this.getFund_into_type().equals(other.getFund_into_type()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()))
            && (this.getField3() == null ? other.getField3() == null : this.getField3().equals(other.getField3()))
            && (this.getField4() == null ? other.getField4() == null : this.getField4().equals(other.getField4()))
            && (this.getField5() == null ? other.getField5() == null : this.getField5().equals(other.getField5()))
            && (this.getBank_return_msg() == null ? other.getBank_return_msg() == null : this.getBank_return_msg().equals(other.getBank_return_msg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getEditor() == null) ? 0 : getEditor().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getEdit_time() == null) ? 0 : getEdit_time().hashCode());
        result = prime * result + ((getProduct_name() == null) ? 0 : getProduct_name().hashCode());
        result = prime * result + ((getMerchant_order_no() == null) ? 0 : getMerchant_order_no().hashCode());
        result = prime * result + ((getTrx_no() == null) ? 0 : getTrx_no().hashCode());
        result = prime * result + ((getBank_order_no() == null) ? 0 : getBank_order_no().hashCode());
        result = prime * result + ((getBank_trx_no() == null) ? 0 : getBank_trx_no().hashCode());
        result = prime * result + ((getMerchant_name() == null) ? 0 : getMerchant_name().hashCode());
        result = prime * result + ((getMerchant_no() == null) ? 0 : getMerchant_no().hashCode());
        result = prime * result + ((getPayer_user_no() == null) ? 0 : getPayer_user_no().hashCode());
        result = prime * result + ((getPayer_name() == null) ? 0 : getPayer_name().hashCode());
        result = prime * result + ((getPayer_pay_amount() == null) ? 0 : getPayer_pay_amount().hashCode());
        result = prime * result + ((getPayer_fee() == null) ? 0 : getPayer_fee().hashCode());
        result = prime * result + ((getPayer_account_type() == null) ? 0 : getPayer_account_type().hashCode());
        result = prime * result + ((getReceiver_user_no() == null) ? 0 : getReceiver_user_no().hashCode());
        result = prime * result + ((getReceiver_name() == null) ? 0 : getReceiver_name().hashCode());
        result = prime * result + ((getReceiver_pay_amount() == null) ? 0 : getReceiver_pay_amount().hashCode());
        result = prime * result + ((getReceiver_fee() == null) ? 0 : getReceiver_fee().hashCode());
        result = prime * result + ((getReceiver_account_type() == null) ? 0 : getReceiver_account_type().hashCode());
        result = prime * result + ((getOrder_ip() == null) ? 0 : getOrder_ip().hashCode());
        result = prime * result + ((getOrder_referer_url() == null) ? 0 : getOrder_referer_url().hashCode());
        result = prime * result + ((getOrder_amount() == null) ? 0 : getOrder_amount().hashCode());
        result = prime * result + ((getPlat_income() == null) ? 0 : getPlat_income().hashCode());
        result = prime * result + ((getFee_rate() == null) ? 0 : getFee_rate().hashCode());
        result = prime * result + ((getPlat_cost() == null) ? 0 : getPlat_cost().hashCode());
        result = prime * result + ((getPlat_profit() == null) ? 0 : getPlat_profit().hashCode());
        result = prime * result + ((getReturn_url() == null) ? 0 : getReturn_url().hashCode());
        result = prime * result + ((getNotify_url() == null) ? 0 : getNotify_url().hashCode());
        result = prime * result + ((getPay_way_code() == null) ? 0 : getPay_way_code().hashCode());
        result = prime * result + ((getPay_way_name() == null) ? 0 : getPay_way_name().hashCode());
        result = prime * result + ((getPay_success_time() == null) ? 0 : getPay_success_time().hashCode());
        result = prime * result + ((getComplete_time() == null) ? 0 : getComplete_time().hashCode());
        result = prime * result + ((getIs_refund() == null) ? 0 : getIs_refund().hashCode());
        result = prime * result + ((getRefund_times() == null) ? 0 : getRefund_times().hashCode());
        result = prime * result + ((getSuccess_refund_amount() == null) ? 0 : getSuccess_refund_amount().hashCode());
        result = prime * result + ((getTrx_type() == null) ? 0 : getTrx_type().hashCode());
        result = prime * result + ((getOrder_from() == null) ? 0 : getOrder_from().hashCode());
        result = prime * result + ((getPay_type_code() == null) ? 0 : getPay_type_code().hashCode());
        result = prime * result + ((getPay_type_name() == null) ? 0 : getPay_type_name().hashCode());
        result = prime * result + ((getFund_into_type() == null) ? 0 : getFund_into_type().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getField1() == null) ? 0 : getField1().hashCode());
        result = prime * result + ((getField2() == null) ? 0 : getField2().hashCode());
        result = prime * result + ((getField3() == null) ? 0 : getField3().hashCode());
        result = prime * result + ((getField4() == null) ? 0 : getField4().hashCode());
        result = prime * result + ((getField5() == null) ? 0 : getField5().hashCode());
        result = prime * result + ((getBank_return_msg() == null) ? 0 : getBank_return_msg().hashCode());
        return result;
    }
}