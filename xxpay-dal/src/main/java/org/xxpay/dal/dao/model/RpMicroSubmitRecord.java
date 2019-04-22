package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.util.Date;

public class RpMicroSubmitRecord implements Serializable {
    /**
     * 编号
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
     * 创建者
     *
     * @mbggenerated
     */
    private String creater;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date edit_time;

    /**
     * 修改者
     *
     * @mbggenerated
     */
    private String editor;

    /**
     * 状态
     *
     * @mbggenerated
     */
    private String status;

    /**
     * 业务申请编号
     *
     * @mbggenerated
     */
    private String business_code;

    /**
     * 小微商户号
     *
     * @mbggenerated
     */
    private String sub_mch_id;

    /**
     * 身份证人像面照片
     *
     * @mbggenerated
     */
    private String id_card_copy;

    /**
     * 身份证国徽面照片
     *
     * @mbggenerated
     */
    private String id_card_national;

    /**
     * 身份证姓名
     *
     * @mbggenerated
     */
    private String id_card_name;

    /**
     * 身份证号码
     *
     * @mbggenerated
     */
    private String id_card_number;

    /**
     * 身份证有效期限
     *
     * @mbggenerated
     */
    private String id_card_valid_time;

    /**
     * 开户名称
     *
     * @mbggenerated
     */
    private String account_bank;

    /**
     * 开户银行省市编码
     *
     * @mbggenerated
     */
    private String bank_address_code;

    /**
     * 银行账号
     *
     * @mbggenerated
     */
    private String account_number;

    /**
     * 门店名称
     *
     * @mbggenerated
     */
    private String store_name;

    /**
     * 门店省市编码
     *
     * @mbggenerated
     */
    private String store_address_code;

    /**
     * 门店街道名称
     *
     * @mbggenerated
     */
    private String store_street;

    /**
     * 门店门口照片
     *
     * @mbggenerated
     */
    private String store_entrance_pic;

    /**
     * 店内环境照片
     *
     * @mbggenerated
     */
    private String indoor_pic;

    /**
     * 商户简称
     *
     * @mbggenerated
     */
    private String merchant_shortname;

    /**
     * 客服电话
     *
     * @mbggenerated
     */
    private String service_phone;

    /**
     * 服务描述
     *
     * @mbggenerated
     */
    private String product_desc;

    /**
     * 费率
     *
     * @mbggenerated
     */
    private String rate;

    /**
     * 手机号码
     *
     * @mbggenerated
     */
    private String contact_phone;

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

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBusiness_code() {
        return business_code;
    }

    public void setBusiness_code(String business_code) {
        this.business_code = business_code;
    }

    public String getSub_mch_id() {
        return sub_mch_id;
    }

    public void setSub_mch_id(String sub_mch_id) {
        this.sub_mch_id = sub_mch_id;
    }

    public String getId_card_copy() {
        return id_card_copy;
    }

    public void setId_card_copy(String id_card_copy) {
        this.id_card_copy = id_card_copy;
    }

    public String getId_card_national() {
        return id_card_national;
    }

    public void setId_card_national(String id_card_national) {
        this.id_card_national = id_card_national;
    }

    public String getId_card_name() {
        return id_card_name;
    }

    public void setId_card_name(String id_card_name) {
        this.id_card_name = id_card_name;
    }

    public String getId_card_number() {
        return id_card_number;
    }

    public void setId_card_number(String id_card_number) {
        this.id_card_number = id_card_number;
    }

    public String getId_card_valid_time() {
        return id_card_valid_time;
    }

    public void setId_card_valid_time(String id_card_valid_time) {
        this.id_card_valid_time = id_card_valid_time;
    }

    public String getAccount_bank() {
        return account_bank;
    }

    public void setAccount_bank(String account_bank) {
        this.account_bank = account_bank;
    }

    public String getBank_address_code() {
        return bank_address_code;
    }

    public void setBank_address_code(String bank_address_code) {
        this.bank_address_code = bank_address_code;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getStore_address_code() {
        return store_address_code;
    }

    public void setStore_address_code(String store_address_code) {
        this.store_address_code = store_address_code;
    }

    public String getStore_street() {
        return store_street;
    }

    public void setStore_street(String store_street) {
        this.store_street = store_street;
    }

    public String getStore_entrance_pic() {
        return store_entrance_pic;
    }

    public void setStore_entrance_pic(String store_entrance_pic) {
        this.store_entrance_pic = store_entrance_pic;
    }

    public String getIndoor_pic() {
        return indoor_pic;
    }

    public void setIndoor_pic(String indoor_pic) {
        this.indoor_pic = indoor_pic;
    }

    public String getMerchant_shortname() {
        return merchant_shortname;
    }

    public void setMerchant_shortname(String merchant_shortname) {
        this.merchant_shortname = merchant_shortname;
    }

    public String getService_phone() {
        return service_phone;
    }

    public void setService_phone(String service_phone) {
        this.service_phone = service_phone;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
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
        sb.append(", creater=").append(creater);
        sb.append(", edit_time=").append(edit_time);
        sb.append(", editor=").append(editor);
        sb.append(", status=").append(status);
        sb.append(", business_code=").append(business_code);
        sb.append(", sub_mch_id=").append(sub_mch_id);
        sb.append(", id_card_copy=").append(id_card_copy);
        sb.append(", id_card_national=").append(id_card_national);
        sb.append(", id_card_name=").append(id_card_name);
        sb.append(", id_card_number=").append(id_card_number);
        sb.append(", id_card_valid_time=").append(id_card_valid_time);
        sb.append(", account_bank=").append(account_bank);
        sb.append(", bank_address_code=").append(bank_address_code);
        sb.append(", account_number=").append(account_number);
        sb.append(", store_name=").append(store_name);
        sb.append(", store_address_code=").append(store_address_code);
        sb.append(", store_street=").append(store_street);
        sb.append(", store_entrance_pic=").append(store_entrance_pic);
        sb.append(", indoor_pic=").append(indoor_pic);
        sb.append(", merchant_shortname=").append(merchant_shortname);
        sb.append(", service_phone=").append(service_phone);
        sb.append(", product_desc=").append(product_desc);
        sb.append(", rate=").append(rate);
        sb.append(", contact_phone=").append(contact_phone);
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
        RpMicroSubmitRecord other = (RpMicroSubmitRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBusiness_code() == null ? other.getBusiness_code() == null : this.getBusiness_code().equals(other.getBusiness_code()))
            && (this.getSub_mch_id() == null ? other.getSub_mch_id() == null : this.getSub_mch_id().equals(other.getSub_mch_id()))
            && (this.getId_card_copy() == null ? other.getId_card_copy() == null : this.getId_card_copy().equals(other.getId_card_copy()))
            && (this.getId_card_national() == null ? other.getId_card_national() == null : this.getId_card_national().equals(other.getId_card_national()))
            && (this.getId_card_name() == null ? other.getId_card_name() == null : this.getId_card_name().equals(other.getId_card_name()))
            && (this.getId_card_number() == null ? other.getId_card_number() == null : this.getId_card_number().equals(other.getId_card_number()))
            && (this.getId_card_valid_time() == null ? other.getId_card_valid_time() == null : this.getId_card_valid_time().equals(other.getId_card_valid_time()))
            && (this.getAccount_bank() == null ? other.getAccount_bank() == null : this.getAccount_bank().equals(other.getAccount_bank()))
            && (this.getBank_address_code() == null ? other.getBank_address_code() == null : this.getBank_address_code().equals(other.getBank_address_code()))
            && (this.getAccount_number() == null ? other.getAccount_number() == null : this.getAccount_number().equals(other.getAccount_number()))
            && (this.getStore_name() == null ? other.getStore_name() == null : this.getStore_name().equals(other.getStore_name()))
            && (this.getStore_address_code() == null ? other.getStore_address_code() == null : this.getStore_address_code().equals(other.getStore_address_code()))
            && (this.getStore_street() == null ? other.getStore_street() == null : this.getStore_street().equals(other.getStore_street()))
            && (this.getStore_entrance_pic() == null ? other.getStore_entrance_pic() == null : this.getStore_entrance_pic().equals(other.getStore_entrance_pic()))
            && (this.getIndoor_pic() == null ? other.getIndoor_pic() == null : this.getIndoor_pic().equals(other.getIndoor_pic()))
            && (this.getMerchant_shortname() == null ? other.getMerchant_shortname() == null : this.getMerchant_shortname().equals(other.getMerchant_shortname()))
            && (this.getService_phone() == null ? other.getService_phone() == null : this.getService_phone().equals(other.getService_phone()))
            && (this.getProduct_desc() == null ? other.getProduct_desc() == null : this.getProduct_desc().equals(other.getProduct_desc()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getContact_phone() == null ? other.getContact_phone() == null : this.getContact_phone().equals(other.getContact_phone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getEdit_time() == null) ? 0 : getEdit_time().hashCode());
        result = prime * result + ((getEditor() == null) ? 0 : getEditor().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBusiness_code() == null) ? 0 : getBusiness_code().hashCode());
        result = prime * result + ((getSub_mch_id() == null) ? 0 : getSub_mch_id().hashCode());
        result = prime * result + ((getId_card_copy() == null) ? 0 : getId_card_copy().hashCode());
        result = prime * result + ((getId_card_national() == null) ? 0 : getId_card_national().hashCode());
        result = prime * result + ((getId_card_name() == null) ? 0 : getId_card_name().hashCode());
        result = prime * result + ((getId_card_number() == null) ? 0 : getId_card_number().hashCode());
        result = prime * result + ((getId_card_valid_time() == null) ? 0 : getId_card_valid_time().hashCode());
        result = prime * result + ((getAccount_bank() == null) ? 0 : getAccount_bank().hashCode());
        result = prime * result + ((getBank_address_code() == null) ? 0 : getBank_address_code().hashCode());
        result = prime * result + ((getAccount_number() == null) ? 0 : getAccount_number().hashCode());
        result = prime * result + ((getStore_name() == null) ? 0 : getStore_name().hashCode());
        result = prime * result + ((getStore_address_code() == null) ? 0 : getStore_address_code().hashCode());
        result = prime * result + ((getStore_street() == null) ? 0 : getStore_street().hashCode());
        result = prime * result + ((getStore_entrance_pic() == null) ? 0 : getStore_entrance_pic().hashCode());
        result = prime * result + ((getIndoor_pic() == null) ? 0 : getIndoor_pic().hashCode());
        result = prime * result + ((getMerchant_shortname() == null) ? 0 : getMerchant_shortname().hashCode());
        result = prime * result + ((getService_phone() == null) ? 0 : getService_phone().hashCode());
        result = prime * result + ((getProduct_desc() == null) ? 0 : getProduct_desc().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getContact_phone() == null) ? 0 : getContact_phone().hashCode());
        return result;
    }
}