package com.ctrip.ccard.creditcard.vcc.bean.V2;

import java.util.Date;

public class QueryAuthTransactionRequest {
    /**
     * API版本
     */
    private String serviceVersion;
    /**
     * 请求流水号
     */
    private String requestId;
    /**
     * 客户ID
     */
    private String customerId;
    /**
     * 卡ID
     */
    private String cardLogId;
    /**
     * 查询开始时间
     */
    private Date startTime;
    /**
     * 查询结束时间
     */
    private Date endTime;

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCardLogId() {
        return cardLogId;
    }

    public void setCardLogId(String cardLogId) {
        this.cardLogId = cardLogId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "QueryAuthTransactionRequest{" +
                "serviceVersion='" + serviceVersion + '\'' +
                ", requestId='" + requestId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cardLogId='" + cardLogId + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
