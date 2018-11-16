package com.buyi.dto.request.attr.value;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/15 15:38
 */
public class ModifyAttrValueRequest implements Serializable {

    @NotNull
    private Integer id;

    private String name;
}
