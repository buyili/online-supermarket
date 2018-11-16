package com.buyi.commons.util;

import com.buyi.constant.ResponseStatusEnum;
import com.buyi.exception.GlobalException;
import com.google.gson.Gson;

import javax.annotation.Resource;

/**
 * Created by 1132989278@qq.com on 2018/11/16 17:11
 */
public class SKUAttrSerializableUtil {
    @Resource
    private static Gson gson;

    public static SKUAttrValue[] deserialize(String skuAttr) {
        SKUAttrValue[] skuAttrValues = null;
        try {
            skuAttrValues = gson.fromJson(skuAttr, SKUAttrValue[].class);
        } catch (Exception e) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }

        return skuAttrValues;
    }

    public class SKUAttrValue {
        private Integer attrId;
        private String attrName;
        private Integer valueId;
        private String valueName;

        public Integer getAttrId() {
            return attrId;
        }

        public void setAttrId(Integer attrId) {
            this.attrId = attrId;
        }

        public String getAttrName() {
            return attrName;
        }

        public void setAttrName(String attrName) {
            this.attrName = attrName;
        }

        public Integer getValueId() {
            return valueId;
        }

        public void setValueId(Integer valueId) {
            this.valueId = valueId;
        }

        public String getValueName() {
            return valueName;
        }

        public void setValueName(String valueName) {
            this.valueName = valueName;
        }
    }
}
