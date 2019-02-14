package com.hykj.t4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class character {

	public static class characterInfo {
		public long id;
		public long pid;
		public int lingbao;
		public int lingbaoExp;
		public int skill_0;
		public int skill_1;
		public int skill_2;
		public int skill_3;
		public int skill_4;
		public int artifice_0;
		public int artifice_1;
		public int artifice_2;
		public int artifice_3;
		public int artifice_4;
		public int artifice_5;
		public int artifice_6;
		public int artifice_7;
		public int artifice_8;
		public int artificeMax_0;
		public int artificeMax_1;
		public int artificeMax_2;
		public int artificeMax_3;
		public int artificeMax_4;
		public int artificeMax_5;
		public int artificeMax_6;
		public int artificeMax_7;
		public int artificeMax_8;
		public int artificeTimes_0;
		public int artificeTimes_1;
		public int artificeTimes_2;
		public int artificeTimes_3;
		public int artificeTimes_4;
		public int artificeTimes_5;
		public int artificeTimes_6;
		public int artificeTimes_7;
		public int artificeTimes_8;
	}
	
	public static void run (JdbcTemplate srcJdbc, JdbcTemplate desJdbc) {
		
		String selectStr = "select * from `character`";

        List<characterInfo> characterInfos = srcJdbc.query(selectStr, new org.springframework.jdbc.core.RowMapper<characterInfo>() {
            @Override
            public characterInfo mapRow(ResultSet resultSet, int i) throws SQLException {
            	characterInfo info = new characterInfo();
            	info.id = resultSet.getLong("id");
            	info.pid = resultSet.getLong("pid");
            	info.lingbao = resultSet.getInt("lingbao");
            	info.lingbaoExp = resultSet.getInt("lingbaoExp");
            	info.skill_0 = resultSet.getInt("skill_0");
            	info.skill_1 = resultSet.getInt("skill_1");
            	info.skill_2 = resultSet.getInt("skill_2");
            	info.skill_3 = resultSet.getInt("skill_3");
            	info.skill_4 = resultSet.getInt("skill_4");
            	info.artifice_0 = resultSet.getInt("artifice_0");
            	info.artifice_1 = resultSet.getInt("artifice_1");
            	info.artifice_2 = resultSet.getInt("artifice_2");
            	info.artifice_3 = resultSet.getInt("artifice_3");
            	info.artifice_4 = resultSet.getInt("artifice_4");
            	info.artifice_5 = resultSet.getInt("artifice_5");
            	info.artifice_6 = resultSet.getInt("artifice_6");
            	info.artifice_7 = resultSet.getInt("artifice_7");
            	info.artifice_8 = resultSet.getInt("artifice_8");
            	info.artificeMax_0 = resultSet.getInt("artificeMax_0");
            	info.artificeMax_1 = resultSet.getInt("artificeMax_1");
            	info.artificeMax_2 = resultSet.getInt("artificeMax_2");
            	info.artificeMax_3 = resultSet.getInt("artificeMax_3");
            	info.artificeMax_4 = resultSet.getInt("artificeMax_4");
            	info.artificeMax_5 = resultSet.getInt("artificeMax_5");
            	info.artificeMax_6 = resultSet.getInt("artificeMax_6");
            	info.artificeMax_7 = resultSet.getInt("artificeMax_7");
            	info.artificeMax_8 = resultSet.getInt("artificeMax_8");
            	info.artificeTimes_0 = resultSet.getInt("artificeTimes_0");
            	info.artificeTimes_1 = resultSet.getInt("artificeTimes_1");
            	info.artificeTimes_2 = resultSet.getInt("artificeTimes_2");
            	info.artificeTimes_3 = resultSet.getInt("artificeTimes_3");
            	info.artificeTimes_4 = resultSet.getInt("artificeTimes_4");
            	info.artificeTimes_5 = resultSet.getInt("artificeTimes_5");
            	info.artificeTimes_6 = resultSet.getInt("artificeTimes_6");
            	info.artificeTimes_7 = resultSet.getInt("artificeTimes_7");
            	info.artificeTimes_8 = resultSet.getInt("artificeTimes_8");
            	
            	return info;
            }
        });
        
        for (characterInfo info : characterInfos) {
        	String updateStr = "update `character` set " +
        			"lingbao = " + info.lingbao  + "," +
        			"lingbaoExp = " + info.lingbaoExp  + "," +
        			"skill_0 = " + info.skill_0 + "," +
        			"skill_1 = " + info.skill_1 + "," +
        			"skill_2 = " + info.skill_2 + "," +
        			"skill_3 = " + info.skill_3 + "," +
        			"skill_4 = " + info.skill_4 + "," +
        			"artifice_0 = " + info.artifice_0 + "," +
        			"artifice_1 = " + info.artifice_1 + "," +
        			"artifice_2 = " + info.artifice_2 + "," +
        			"artifice_3 = " + info.artifice_3 + "," +
        			"artifice_4 = " + info.artifice_4 + "," +
        			"artifice_5 = " + info.artifice_5 + "," +
        			"artifice_6 = " + info.artifice_6 + "," +
        			"artifice_7 = " + info.artifice_7 + "," +
        			"artifice_8 = " + info.artifice_8 + "," +
        			"artificeMax_0 = " + info.artificeMax_0 + "," +
        			"artificeMax_1 = " + info.artificeMax_1 + "," +
        			"artificeMax_2 = " + info.artificeMax_2 + "," +
        			"artificeMax_3 = " + info.artificeMax_3 + "," +
        			"artificeMax_4 = " + info.artificeMax_4 + "," +
        			"artificeMax_5 = " + info.artificeMax_5 + "," +
        			"artificeMax_6 = " + info.artificeMax_6 + "," +
        			"artificeMax_7 = " + info.artificeMax_7 + "," +
        			"artificeMax_8 = " + info.artificeMax_8 + "," +
        			"artificeTimes_0 = " + info.artificeTimes_0 + "," +
        			"artificeTimes_1 = " + info.artificeTimes_1 + "," +
        			"artificeTimes_2 = " + info.artificeTimes_2 + "," +
        			"artificeTimes_3 = " + info.artificeTimes_3 + "," +
        			"artificeTimes_4 = " + info.artificeTimes_4 + "," +
        			"artificeTimes_5 = " + info.artificeTimes_5 + "," +
        			"artificeTimes_6 = " + info.artificeTimes_6 + "," +
        			"artificeTimes_7 = " + info.artificeTimes_7 + "," +
        			"artificeTimes_8 = " + info.artificeTimes_8 + 
        			" where id = " + info.id + " and pid=" + info.pid;
        	
        	desJdbc.execute(updateStr);
        }
	}
}
