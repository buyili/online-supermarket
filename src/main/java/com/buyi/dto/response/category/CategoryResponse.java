package com.buyi.dto.response.category;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/19 16:37
 */
public class CategoryResponse implements Serializable {
    private Integer id;
    private String name;
    private Integer parentId;
    private Integer level;
    private List<CategoryResponse> child;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<CategoryResponse> getChild() {
        return child;
    }

    public void setChild(List<CategoryResponse> child) {
        this.child = child;
    }
}
