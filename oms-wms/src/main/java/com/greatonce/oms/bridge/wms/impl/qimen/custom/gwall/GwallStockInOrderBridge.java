package com.greatonce.oms.bridge.wms.impl.qimen.custom.gwall;

import com.greatonce.oms.bridge.wms.impl.qimen.QimenStockInOrderBridge;
import com.greatonce.oms.domain.enums.WmsType;
import org.springframework.stereotype.Component;

/**
 * 巨沃入库单接口.
 *
 * @author ginta
 * @author Shenzhen Greatonce Co Ltd
 * @version 2018-08-25
 */
@Component
public class GwallStockInOrderBridge extends QimenStockInOrderBridge {

  @Override
  public WmsType[] supports() {
    return new WmsType[]{WmsType.QIMEN_GWALL};
  }
}
