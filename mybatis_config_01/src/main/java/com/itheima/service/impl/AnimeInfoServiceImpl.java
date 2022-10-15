package com.itheima.service.impl;

import com.itheima.dao.AnimeInfoDao;
import com.itheima.domain.AnimeInfo;
import com.itheima.service.IAnimeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> mybatis_basic01
 * BelongsPackage ==> com.itheima.service.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-10-15 09:40:22
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class AnimeInfoServiceImpl implements IAnimeInfoService {

    /**
    * Description ==> 自动装配AnimInfoDao
    * Return Type ==>
    * Params args ==>
    * Create Time ==> 2022/10/15 9:45
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    @Autowired
    private AnimeInfoDao animeInfoDao;

    /**
    * Description ==> service层插入一条数据
    * Return Type ==> boolean
    * Params args ==> [com.itheima.domain.AnimeInfo]
    * Create Time ==> 2022/10/15 9:45
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    @Override
    public boolean insertOne(AnimeInfo animeInfo) {
        return animeInfoDao.insertOne(animeInfo)>0;
    }

    /**
    * Description ==> service层根据ＩＤ删除一条数据
    * Return Type ==> boolean
    * Params args ==> [java.lang.Integer]
    * Create Time ==> 2022/10/15 9:45
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    @Override
    public boolean deleteById(Integer id) {
        return animeInfoDao.deleteById(id)>0;
    }

    /**
    * Description ==> service层根据ID更新一条数据
    * Return Type ==> boolean
    * Params args ==> [com.itheima.domain.AnimeInfo]
    * Create Time ==> 2022/10/15 9:46
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    @Override
    public boolean updateById(AnimeInfo animeInfo) {
        return animeInfoDao.updateById(animeInfo)>0;
    }

    /**
    * Description ==> service层根据ID查询一条数据
    * Return Type ==> com.itheima.domain.AnimeInfo
    * Params args ==> [java.lang.Integer]
    * Create Time ==> 2022/10/15 9:46
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    @Override
    public AnimeInfo selectById(Integer id) {
        return animeInfoDao.selectById(id);
    }

    /**
    * Description ==> service查询所有数据
    * Return Type ==> java.util.List<com.itheima.domain.AnimeInfo>
    * Params args ==> []
    * Create Time ==> 2022/10/15 9:47
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    @Override
    public List<AnimeInfo> selectAll() {
        return animeInfoDao.selectAll();
    }
}
