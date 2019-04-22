package org.xxpay.dal.dao.model;

import java.io.Serializable;
import java.util.Date;

public class RpNotifyRecord implements Serializable {
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

    private Integer notify_times;

    private Integer limit_notify_times;

    private String url;

    private String merchant_order_no;

    private String merchant_no;

    /**
     * 100:成功 101:失败
     *
     * @mbggenerated
     */
    private String status;

    /**
     * 通知类型
     *
     * @mbggenerated
     */
    private String notify_type;

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

    public Integer getNotify_times() {
        return notify_times;
    }

    public void setNotify_times(Integer notify_times) {
        this.notify_times = notify_times;
    }

    public Integer getLimit_notify_times() {
        return limit_notify_times;
    }

    public void setLimit_notify_times(Integer limit_notify_times) {
        this.limit_notify_times = limit_notify_times;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMerchant_order_no() {
        return merchant_order_no;
    }

    public void setMerchant_order_no(String merchant_order_no) {
        this.merchant_order_no = merchant_order_no;
    }

    public String getMerchant_no() {
        return merchant_no;
    }

    public void setMerchant_no(String merchant_no) {
        this.merchant_no = merchant_no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotify_type() {
        return notify_type;
    }

    public void setNotify_type(String notify_type) {
        this.notify_type = notify_type;
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
        sb.append(", notify_times=").append(notify_times);
        sb.append(", limit_notify_times=").append(limit_notify_times);
        sb.append(", url=").append(url);
        sb.append(", merchant_order_no=").append(merchant_order_no);
        sb.append(", merchant_no=").append(merchant_no);
        sb.append(", status=").append(status);
        sb.append(", notify_type=").append(notify_type);
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
        RpNotifyRecord other = (RpNotifyRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getEdit_time() == null ? other.getEdit_time() == null : this.getEdit_time().equals(other.getEdit_time()))
            && (this.getNotify_times() == null ? other.getNotify_times() == null : this.getNotify_times().equals(other.getNotify_times()))
            && (this.getLimit_notify_times() == null ? other.getLimit_notify_times() == null : this.getLimit_notify_times().equals(other.getLimit_notify_times()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getMerchant_order_no() == null ? other.getMerchant_order_no() == null : this.getMerchant_order_no().equals(other.getMerchant_order_no()))
            && (this.getMerchant_no() == null ? other.getMerchant_no() == null : this.getMerchant_no().equals(other.getMerchant_no()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getNotify_type() == null ? other.getNotify_type() == null : this.getNotify_type().equals(other.getNotify_type()));
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
        result = prime * result + ((getNotify_times() == null) ? 0 : getNotify_times().hashCode());
        result = prime * result + ((getLimit_notify_times() == null) ? 0 : getLimit_notify_times().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getMerchant_order_no() == null) ? 0 : getMerchant_order_no().hashCode());
        result = prime * result + ((getMerchant_no() == null) ? 0 : getMerchant_no().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getNotify_type() == null) ? 0 : getNotify_type().hashCode());
        return result;
    }
}