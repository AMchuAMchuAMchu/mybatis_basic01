package com.itheima.mapper;

import com.itheima.pojo.AnimeInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description ==> TODO
 * BelongsProject ==> mybatis_basic01
 * BelongsPackage ==> com.itheima.mapper
 * Version ==> 1.0
 * CreateTime ==> 2022-10-04 16:22:55
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public interface AnimeMapper {

    List<AnimeInfo> selectAnimeInfo();

    AnimeInfo selectById(Integer id);

    List<AnimeInfo> selectByIdLG(Integer id);

    List<AnimeInfo> selectByConditions(@Param("name") String name,@Param("releaseTime")Integer releaseTime);

    List<AnimeInfo> selectByConditions02(AnimeInfo animeInfo);

    List<AnimeInfo> selectByConditions03(Map<String,String> map);

    List<AnimeInfo> selectAllByConOne(AnimeInfo animeInfo);

    void updateById(AnimeInfo animeInfo);


}
