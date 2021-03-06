package com.greatonce.oms.bo.trade;

import com.greatonce.oms.domain.trade.ExchangeApplyOrder;
import com.greatonce.oms.domain.trade.RefundApplyOrder;
import com.greatonce.oms.domain.trade.SalesOrderDetail;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: cca
 * Date: 2018-05-14
 * Time: 16:00
 * Description:
 *
 * 保存退换货单 的 BO
 */
public class ReturnOrderSaveBO {

  private String returnType;

  private Long inVirtualWarehouseId;

  private String inVirtualWarehouseName;

  private String remark;

  private String boxNo;

  private String expressNo;

  private List<RefundApplyOrder> refundApplyOrders;

  private List<ExchangeApplyOrder> exchangeApplyOrders;

  private Long storeId;

  private List<InDetail> inDetails;

  private List<OutDetail> outDetails;

  private List<SalesOrderDetail> sourceDetail;

  private String creator;

  public String getExpressNo() {
    return expressNo;
  }

  public void setExpressNo(String expressNo) {
    this.expressNo = expressNo;
  }

  public String getReturnType() {
    return returnType;
  }

  public void setReturnType(String returnType) {
    this.returnType = returnType;
  }

  public Long getInVirtualWarehouseId() {
    return inVirtualWarehouseId;
  }

  public void setInVirtualWarehouseId(Long inVirtualWarehouseId) {
    this.inVirtualWarehouseId = inVirtualWarehouseId;
  }

  public String getInVirtualWarehouseName() {
    return inVirtualWarehouseName;
  }

  public void setInVirtualWarehouseName(String inVirtualWarehouseName) {
    this.inVirtualWarehouseName = inVirtualWarehouseName;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public List<RefundApplyOrder> getRefundApplyOrders() {
    return refundApplyOrders;
  }

  public void setRefundApplyOrders(List<RefundApplyOrder> refundApplyOrders) {
    this.refundApplyOrders = refundApplyOrders;
  }

  public List<ExchangeApplyOrder> getExchangeApplyOrders() {
    return exchangeApplyOrders;
  }

  public void setExchangeApplyOrders(List<ExchangeApplyOrder> exchangeApplyOrders) {
    this.exchangeApplyOrders = exchangeApplyOrders;
  }

  public Long getStoreId() {
    return storeId;
  }

  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }

  public List<InDetail> getInDetails() {
    return inDetails;
  }

  public void setInDetails(List<InDetail> inDetails) {
    this.inDetails = inDetails;
  }

  public List<OutDetail> getOutDetails() {
    return outDetails;
  }

  public void setOutDetails(List<OutDetail> outDetails) {
    this.outDetails = outDetails;
  }

  public String getBoxNo() {
    return boxNo;
  }

  public void setBoxNo(String boxNo) {
    this.boxNo = boxNo;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public List<SalesOrderDetail> getSourceDetail() {
    return sourceDetail;
  }

  public void setSourceDetail(List<SalesOrderDetail> sourceDetail) {
    this.sourceDetail = sourceDetail;
  }
}
