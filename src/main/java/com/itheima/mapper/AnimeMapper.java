package com.itheima.mapper;

import com.itheima.pojo.AnimeInfo;

import java.util.List;

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

}
