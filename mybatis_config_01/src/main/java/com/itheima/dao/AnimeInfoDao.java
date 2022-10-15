package com.itheima.dao;

import com.itheima.domain.AnimeInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> mybatis_basic01
 * BelongsPackage ==> com.itheima.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-15 09:29:28
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public interface AnimeInfoDao {

    /**
    * Description ==> 插入一条数据
    * Return Type ==> java.lang.Integer
    * Params args ==> [com.itheima.domain.AnimeInfo]
    * Create Time ==> 2022/10/15 9:42
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    @Insert("insert into anime_info values (#{name},#{release_time},#{character01},#{character02},#{id})")
    Integer insertOne(AnimeInfo animeInfo);

    /**
    * Description ==> 根据ID删除一条数据
    * Return Type ==> java.lang.Integer
    * Params args ==> [java.lang.Integer]
    * Create Time ==> 2022/10/15 9:43
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    @Delete("delete from anime_info where id = #{id}")
    Integer deleteById(Integer id);

    /**
    * Description ==> 通过ID更新一条数据
    * Return Type ==> java.lang.Integer
    * Params args ==> [com.itheima.domain.AnimeInfo]
    * Create Time ==> 2022/10/15 9:44
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    @Update("update anime_info set " +
            "release_time = #{release_time},character01 = #{character01},character02 = #{character02},name = #{name},id = #{id} where id = #{id}")
    Integer updateById(AnimeInfo animeInfo);

    /**
    * Description ==> 根据ID查询一条数据
    * Return Type ==> com.itheima.domain.AnimeInfo
    * Params args ==> [java.lang.Integer]
    * Create Time ==> 2022/10/15 9:44
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    @Select("select * from anime_info where id = #{id}")
    AnimeInfo selectById(Integer id);

    /**
    * Description ==> 查询所有数据
    * Return Type ==> java.util.List<com.itheima.domain.AnimeInfo>
    * Params args ==> []
    * Create Time ==> 2022/10/15 9:44
    * author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_start
    */
    @Select("select * from anime_info")
    List<AnimeInfo> selectAll();



}
