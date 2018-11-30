package com.buyi.service.impl;

import com.buyi.dao.AttrDao;
import com.buyi.dto.request.attr.ModifyAttrRequest;
import com.buyi.entity.Attr;
import com.buyi.service.AttrService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/15 15:27
 */
@Service
public class AttrServiceImpl implements AttrService {

    @Resource
    private AttrDao attrDao;

    @Override
    public Attr queryById(int id) {
        return attrDao.queryById(id);
    }

    @Override
    public void add(List<Attr> attrs) {
        for (Attr attr : attrs) {
            attrDao.add(attr);
        }
    }

    @Override
    public void modify(ModifyAttrRequest request) {
        Attr attr = new Attr();
        BeanUtils.copyProperties(request, attr);
        attrDao.update(attr);
    }

    @Override
    public List<Attr> queryByCategoryId(int categoryId) {
        List<Attr> attrs = attrDao.queryByCategoryId(categoryId);
        return attrs;
    }

    @Override
    public void delete(int id) {
        attrDao.delete(id);
    }
}
