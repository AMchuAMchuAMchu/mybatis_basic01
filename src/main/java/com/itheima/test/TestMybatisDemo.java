package com.itheima.test;

import com.itheima.mapper.AnimeMapper;
import com.itheima.pojo.AnimeInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> mybatis_basic01
 * BelongsPackage ==> com.itheima.test
 * Version ==> 1.0
 * CreateTime ==> 2022-10-03 11:27:38
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class TestMybatisDemo {

    private static InputStream is;

    private static SqlSessionFactory sqlSessionFactory;

    private static SqlSession sqlSession;
    private static AnimeMapper animeMapper;


    static {

        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        sqlSession = sqlSessionFactory.openSession(true);

        animeMapper = sqlSession.getMapper(AnimeMapper.class);

    }


    @Test
    void testDeleteById(){

        animeMapper.deleteById(21);

    }


    @Test
    public void testUpdateById(){

        AnimeInfo animeInfo = new AnimeInfo();

        animeInfo.setId(3);
        animeInfo.setCharacter01("kirito桐人");
        animeMapper.updateById(animeInfo);



    }



    @Test
    public void testSelectAllByConOne(){

        AnimeInfo animeInfo = new AnimeInfo();

        animeInfo.setReleaseTime(2022);
        List<AnimeInfo> animeInfos = animeMapper.selectAllByConOne(animeInfo);
        System.out.println();
        System.out.println();
        System.out.println();
        animeInfos.forEach(System.out::println);

    }









    @Test
    public void testselectByConditions03(){

        HashMap<String, String> animeMap = new HashMap<>();
        String _name = "";
        animeMap.put("name","%"+_name+"%");
        animeMap.put("releaseTime","2022");


        List<AnimeInfo> animeInfos = animeMapper.selectByConditions03(animeMap);

        System.out.println();
        System.out.println();
        System.out.println();

        animeInfos.forEach(System.out::println);


    }


    @Test
    public void testselectByConditions02(){

        AnimeInfo animeInfo = new AnimeInfo();
//        animeInfo.setName("%"+"L"+"%");
        animeInfo.setReleaseTime(2022);

        List<AnimeInfo> animeInfos = animeMapper.selectByConditions02(animeInfo);
        System.out.println();
        System.out.println();
        System.out.println();

        animeInfos.forEach(System.out::println);


    }


    @Test
    public void selectByConditions(){

        String _name = "";

        String name = "%"+_name+"%";

        Integer releaseTime = 2022;

        List<AnimeInfo> animeInfos = animeMapper.selectByConditions(name, releaseTime);

        System.out.println();
        System.out.println();
        System.out.println();

        animeInfos.forEach(System.out::println);


    }

    @Test
    public void testSelectByIdLG() throws IOException {

        InputStream ras = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(ras);

        SqlSession sqlSession = sessionFactory.openSession();

        AnimeMapper mapper = sqlSession.getMapper(AnimeMapper.class);

        List<AnimeInfo> animeInfos = mapper.selectByIdLG(5);
        System.out.println();
        System.out.println();
        System.out.println();

        animeInfos.forEach(System.out::println);

    }

     @Test
     public void testSelectById() throws IOException {

         InputStream ras = Resources.getResourceAsStream("mybatis-config.xml");

         SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ras);

         SqlSession sqlSession = sqlSessionFactory.openSession();

         AnimeMapper mapper = sqlSession.getMapper(AnimeMapper.class);

         AnimeInfo animeInfo = mapper.selectById(5);

         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println(">>"+animeInfo);

         sqlSession.close();


     }

     @Test
     public void testSelectAnimeInfo() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        List<AnimeInfo> animeInfoList = sqlSession.selectList("animeInfo.selectAnimeInfo");
        AnimeMapper mapper = sqlSession.getMapper(AnimeMapper.class);
        List<AnimeInfo> animeInfos = mapper.selectAnimeInfo();
         System.out.println();
         System.out.println();
         System.out.println();

        animeInfos.forEach(System.out::println);

        sqlSession.close();

    }


}
