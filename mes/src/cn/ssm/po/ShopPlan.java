package cn.ssm.po;

public class ShopPlan {
    private Integer planId;

    private String client;

    private String planNo;

    private String materialNo;

    private String shopName;

    private String materialName;

    private String planPeople;

    private String planDate;

    private String planNum;

    private String onlineDate;

    private String producedNum;

    private String completedDate;

    private String processSort;

    private Integer isNew;

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client == null ? null : client.trim();
    }

    public String getPlanNo() {
        return planNo;
    }

    public void setPlanNo(String planNo) {
        this.planNo = planNo == null ? null : planNo.trim();
    }

    public String getMaterialNo() {
        return materialNo;
    }

    public void setMaterialNo(String materialNo) {
        this.materialNo = materialNo == null ? null : materialNo.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public String getPlanPeople() {
        return planPeople;
    }

    public void setPlanPeople(String planPeople) {
        this.planPeople = planPeople == null ? null : planPeople.trim();
    }

    public String getPlanDate() {
        return planDate;
    }

    public void setPlanDate(String planDate) {
        this.planDate = planDate == null ? null : planDate.trim();
    }

    public String getPlanNum() {
        return planNum;
    }

    public void setPlanNum(String planNum) {
        this.planNum = planNum == null ? null : planNum.trim();
    }

    public String getOnlineDate() {
        return onlineDate;
    }

    public void setOnlineDate(String onlineDate) {
        this.onlineDate = onlineDate == null ? null : onlineDate.trim();
    }

    public String getProducedNum() {
        return producedNum;
    }

    public void setProducedNum(String producedNum) {
        this.producedNum = producedNum == null ? null : producedNum.trim();
    }

    public String getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(String completedDate) {
        this.completedDate = completedDate == null ? null : completedDate.trim();
    }

    public String getProcessSort() {
        return processSort;
    }

    public void setProcessSort(String processSort) {
        this.processSort = processSort == null ? null : processSort.trim();
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }
}