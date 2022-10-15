package com.itheima.service;

import com.itheima.domain.AnimeInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> mybatis_basic01
 * BelongsPackage ==> com.itheima.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-15 09:37:40
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Transactional
public interface IAnimeInfoService {

    boolean insertOne(AnimeInfo animeInfo);

    boolean deleteById(Integer id);

    boolean updateById(AnimeInfo animeInfo);

    AnimeInfo selectById(Integer id);

    List<AnimeInfo> selectAll();



}
