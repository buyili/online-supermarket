package com.buyi.dao;

import com.buyi.SpringBootApplicationTestDao;
import com.buyi.dto.request.attr.value.AddAttrValueRequest;
import com.buyi.entity.AttrValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/14 9:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationTestDao.class)
public class AttrValueDaoTest {

    @Resource
    private AttrValueDao attrValueDao;

    @Test
    public void queryById() {
        AttrValue attrValue = attrValueDao.queryById(2);
        System.out.println(attrValue.getName());
    }

    @Test
    public void update() {
        AttrValue attrValue = attrValueDao.queryById(2);
        attrValue.setName("black");
        attrValueDao.update(attrValue);
    }

    @Test
    public void queryByForeignKey() {
        List<AttrValue> attrValues = attrValueDao.queryByForeignKey(1, 2);
        System.out.println(attrValues.size());
    }

    @Test
    public void addList() {
        List<AddAttrValueRequest> requests = new ArrayList<>();
        for(int i = 0; i<2;i++){
            AddAttrValueRequest request = new AddAttrValueRequest();
            request.setAttrId(i);
            request.setGoodsId(i);
            request.setName("name"+i);
            requests.add(request);
        }
        attrValueDao.addList(requests);
    }
}