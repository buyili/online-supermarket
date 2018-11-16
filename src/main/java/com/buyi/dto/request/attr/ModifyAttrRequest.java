package com.buyi.dto.request.attr;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by 1132989278@qq.com on 2018/11/15 15:28
 */
public class ModifyAttrRequest implements Serializable {

    @NotNull
    private Integer id;

    private String name;

    private Integer isSKU;
}
