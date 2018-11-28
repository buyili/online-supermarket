package com.buyi.commons.util;

import com.buyi.constant.ResponseStatusEnum;
import com.buyi.exception.GlobalException;
import com.google.gson.Gson;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/16 17:11
 */
public class SKUAttrSerializableUtil {
    private static Gson gson = new Gson();

    public static SKUAttrValue[] deserialize(String skuAttr) {
        SKUAttrValue[] skuAttrValues = null;
        try {
            skuAttrValues = gson.fromJson(skuAttr, SKUAttrValue[].class);
        } catch (Exception e) {
            throw new GlobalException(ResponseStatusEnum.PARAMETER_ERR);
        }

        return skuAttrValues;
    }

    public static class SKUAttrValue {
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

    public static void test(){
        SKUAttrValue skuAttrValue = new SKUAttrValue();
        skuAttrValue.setAttrId(1);
        skuAttrValue.setAttrName("buyi");
        skuAttrValue.setValueId(2);
        skuAttrValue.setValueName("name");
        List<SKUAttrValue> list = new ArrayList<>();
        list.add(skuAttrValue);
        String s = gson.toJson(list);
        System.out.println(s);
        SKUAttrValue[] deserialize = deserialize(s);
        System.out.println();
    }
}
