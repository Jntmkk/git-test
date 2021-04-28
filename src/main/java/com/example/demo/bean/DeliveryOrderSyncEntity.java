package com.example.demo.bean;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 出库同步表(DeliveryOrderSyncEntity)实体类
 *
 * @author makejava
 * @since 2021-03-16 16:11:20
 */
@Data
@Builder
public class DeliveryOrderSyncEntity implements Serializable {
    /**
     * 数据密级S2,商品名称
     */
    private String productName;
    /**
     * 数据密级S2,sku编码
     */
    private String productSkuId;
    /**
     * 数据密级S2,sku条形码
     */
    private String skuBarCode;
    /**
     * 数据密级S2,单位
     */
    private String productUnit;
    /**
     * 数据密级S2,一级分类
     */
    private String firstCategory;
    /**
     * 数据密级S2,二级分类
     */
    private String secondCategory;
    /**
     * 数据密级S2,出库时间
     */
    private Date deliveryTime;
    /**
     * 数据密级S2,出库类型，收银台出库-15，普通出库-100，销售出库-10，盘亏出库-20，报损出库-30，打包拆解-40，采购退货-50，调拨出库-60，分拆出库-80，领料出库-70
     */
    private Double deliveryType;
    /**
     * 数据密级S2,关联单号
     */
    private String refId;
    /**
     * 数据密级S2,操作前数量
     */
    private Double quantityBeforeOperation;
    /**
     * 数据密级S2,出库数量
     */
    private Double quantityOnOperation;
    /**
     * 数据密级S2,剩余库存
     */
    private Double quantityAfterOperation;
    /**
     * 数据密级S2,入库单价
     */
    private Double asnPrice;
    /**
     * 数据密级S2,出库单价
     */
    private Double deliveryPrice;
    /**
     * 数据密级S2，总金额
     */
    private Double totalPrice;
    /**
     * 数据密级S2,批次号
     */
    private String batchNo;
    /**
     * 数据密级S2,生产日期
     */
    private Date producedDate;
    /**
     * 数据密级S2,保质期至
     */
    private Date expirationDate;
    /**
     * 数据密级S1，创建时间
     */
    private Date createTime;

    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 仓库ID
     */
    private Long warehouse_id;
    private String skuId;
}
