package com.buyi.commons.util;

import com.buyi.constant.ResponseStatusEnum;
import com.buyi.exception.GlobalException;

import java.util.regex.Pattern;

/**
 * Created by 1132989278@qq.com on 2018/11/26 10:34
 */
public class FormatUtil {

   public static void validateTelephone(String telephone){
       if(!Pattern.matches("\\d{11}",telephone)){
           throw new GlobalException("telephone format is error!",ResponseStatusEnum.PARAMETER_ERR);
       }
   }
}
