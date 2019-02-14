package com.hykj.t4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class guild {

	public static class guildInfo {
		public long id;
		public int guildForage;
		public int civilChanllengeTimes;
		public int recent_civil_city_id;
		public int firstCivilWarRecordTime_0;
		public int firstCivilWarRecordTime_1;
		public int firstCivilWarRecordTime_2;
		public int firstCivilWarRecordTime_3;
		public int firstCivilWarRecordTime_4;
		public int firstCivilWarRecordTime_5;
		public int firstCivilWarRecordTime_6;
		public int firstCivilWarRecordTime_7;
		public int firstCivilWarRecordTime_8;
		public int firstCivilWarRecordTime_9;
		public int firstCivilWarRecordTime_10;
		public int firstCivilWarRecordTime_11;
		public int firstCivilWarRecordTime_12;
		public int firstCivilWarRecordTime_13;
		public int firstCivilWarRecordTime_14;
		public int firstCivilWarRecordTime_15;
		public int firstCivilWarRecordTime_16;
		public int firstCivilWarRecordTime_17;
		public int firstCivilWarRecordTime_18;
		public int firstCivilWarRecordTime_19;
		public int firstCivilWarRecordTime_20;
		public int firstCivilWarRecordTime_21;
		public int firstCivilWarRecordTime_22;
		public int firstCivilWarRecordTime_23;
		public int firstCivilWarRecordTime_24;
		public int firstCivilWarRecordTime_25;
		public int firstCivilWarRecordTime_26;
		public int firstCivilWarRecordTime_27;
		public int firstCivilWarRecordTime_28;
		public int firstCivilWarRecordTime_29;
		public int firstCivilWarRecordTime_30;
		public int firstCivilWarRecordTime_31;
	}
	
	public static void run (JdbcTemplate srcJdbc, JdbcTemplate desJdbc) {
		
		String selectStr = "select * from guild";

        List<guildInfo> guildInfos = srcJdbc.query(selectStr, new org.springframework.jdbc.core.RowMapper<guildInfo>() {
            @Override
            public guildInfo mapRow(ResultSet resultSet, int i) throws SQLException {
            	guildInfo info = new guildInfo();
            	info.id = resultSet.getLong("id");
            	info.guildForage = resultSet.getInt("guildForage");
            	info.recent_civil_city_id = resultSet.getInt("recent_civil_city_id");
            	info.civilChanllengeTimes = resultSet.getInt("civilChanllengeTimes");
            	info.firstCivilWarRecordTime_0 = resultSet.getInt("firstCivilWarRecordTime_0");
            	info.firstCivilWarRecordTime_1 = resultSet.getInt("firstCivilWarRecordTime_1");
            	info.firstCivilWarRecordTime_2 = resultSet.getInt("firstCivilWarRecordTime_2");
            	info.firstCivilWarRecordTime_3 = resultSet.getInt("firstCivilWarRecordTime_3");
            	info.firstCivilWarRecordTime_4 = resultSet.getInt("firstCivilWarRecordTime_4");
            	info.firstCivilWarRecordTime_5 = resultSet.getInt("firstCivilWarRecordTime_5");
            	info.firstCivilWarRecordTime_6 = resultSet.getInt("firstCivilWarRecordTime_6");
            	info.firstCivilWarRecordTime_7 = resultSet.getInt("firstCivilWarRecordTime_7");
            	info.firstCivilWarRecordTime_8 = resultSet.getInt("firstCivilWarRecordTime_8");
            	info.firstCivilWarRecordTime_9 = resultSet.getInt("firstCivilWarRecordTime_9");
            	info.firstCivilWarRecordTime_10 = resultSet.getInt("firstCivilWarRecordTime_10");
            	info.firstCivilWarRecordTime_11 = resultSet.getInt("firstCivilWarRecordTime_11");
            	info.firstCivilWarRecordTime_12 = resultSet.getInt("firstCivilWarRecordTime_12");
            	info.firstCivilWarRecordTime_13 = resultSet.getInt("firstCivilWarRecordTime_13");
            	info.firstCivilWarRecordTime_14 = resultSet.getInt("firstCivilWarRecordTime_14");
            	info.firstCivilWarRecordTime_15 = resultSet.getInt("firstCivilWarRecordTime_15");
            	info.firstCivilWarRecordTime_16 = resultSet.getInt("firstCivilWarRecordTime_16");
            	info.firstCivilWarRecordTime_17 = resultSet.getInt("firstCivilWarRecordTime_17");
            	info.firstCivilWarRecordTime_18 = resultSet.getInt("firstCivilWarRecordTime_18");
            	info.firstCivilWarRecordTime_19 = resultSet.getInt("firstCivilWarRecordTime_19");
            	info.firstCivilWarRecordTime_20 = resultSet.getInt("firstCivilWarRecordTime_20");
            	info.firstCivilWarRecordTime_21 = resultSet.getInt("firstCivilWarRecordTime_21");
            	info.firstCivilWarRecordTime_22 = resultSet.getInt("firstCivilWarRecordTime_22");
            	info.firstCivilWarRecordTime_23 = resultSet.getInt("firstCivilWarRecordTime_23");
            	info.firstCivilWarRecordTime_24 = resultSet.getInt("firstCivilWarRecordTime_24");
            	info.firstCivilWarRecordTime_25 = resultSet.getInt("firstCivilWarRecordTime_25");
            	info.firstCivilWarRecordTime_26 = resultSet.getInt("firstCivilWarRecordTime_26");
            	info.firstCivilWarRecordTime_27 = resultSet.getInt("firstCivilWarRecordTime_27");
            	info.firstCivilWarRecordTime_28 = resultSet.getInt("firstCivilWarRecordTime_28");
            	info.firstCivilWarRecordTime_29 = resultSet.getInt("firstCivilWarRecordTime_29");
            	info.firstCivilWarRecordTime_30 = resultSet.getInt("firstCivilWarRecordTime_30");
            	info.firstCivilWarRecordTime_31 = resultSet.getInt("firstCivilWarRecordTime_31");
            	
            	return info;
            }
        });
        
        for (guildInfo info : guildInfos) {
        	String updateStr = "update guild set " +
        			"guildForage = " + info.guildForage  + "," +
        			"recent_civil_city_id = " + info.recent_civil_city_id  + "," +
        			"civilChanllengeTimes = " + info.civilChanllengeTimes  + "," +
        			"firstCivilWarRecordTime_0 = " + info.firstCivilWarRecordTime_0  + "," +
        			"firstCivilWarRecordTime_1 = " + info.firstCivilWarRecordTime_1  + "," +
        			"firstCivilWarRecordTime_2 = " + info.firstCivilWarRecordTime_2  + "," +
        			"firstCivilWarRecordTime_3 = " + info.firstCivilWarRecordTime_3  + "," +
        			"firstCivilWarRecordTime_4 = " + info.firstCivilWarRecordTime_4  + "," +
        			"firstCivilWarRecordTime_5 = " + info.firstCivilWarRecordTime_5  + "," +
        			"firstCivilWarRecordTime_6 = " + info.firstCivilWarRecordTime_6  + "," +
        			"firstCivilWarRecordTime_7 = " + info.firstCivilWarRecordTime_7  + "," +
        			"firstCivilWarRecordTime_8 = " + info.firstCivilWarRecordTime_8  + "," +
        			"firstCivilWarRecordTime_9 = " + info.firstCivilWarRecordTime_9  + "," +
        			"firstCivilWarRecordTime_10 = " + info.firstCivilWarRecordTime_10 + "," +
        			"firstCivilWarRecordTime_11 = " + info.firstCivilWarRecordTime_11 + "," +
        			"firstCivilWarRecordTime_12 = " + info.firstCivilWarRecordTime_12 + "," +
        			"firstCivilWarRecordTime_13 = " + info.firstCivilWarRecordTime_13 + "," +
        			"firstCivilWarRecordTime_14 = " + info.firstCivilWarRecordTime_14 + "," +
        			"firstCivilWarRecordTime_15 = " + info.firstCivilWarRecordTime_15 + "," +
        			"firstCivilWarRecordTime_16 = " + info.firstCivilWarRecordTime_16 + "," +
        			"firstCivilWarRecordTime_17 = " + info.firstCivilWarRecordTime_17 + "," +
        			"firstCivilWarRecordTime_18 = " + info.firstCivilWarRecordTime_18 + "," +
        			"firstCivilWarRecordTime_19 = " + info.firstCivilWarRecordTime_19 + "," +
        			"firstCivilWarRecordTime_20 = " + info.firstCivilWarRecordTime_20 + "," +
        			"firstCivilWarRecordTime_21 = " + info.firstCivilWarRecordTime_21 + "," +
        			"firstCivilWarRecordTime_22 = " + info.firstCivilWarRecordTime_22 + "," +
        			"firstCivilWarRecordTime_23 = " + info.firstCivilWarRecordTime_23 + "," +
        			"firstCivilWarRecordTime_24 = " + info.firstCivilWarRecordTime_24 + "," +
        			"firstCivilWarRecordTime_25 = " + info.firstCivilWarRecordTime_25 + "," +
        			"firstCivilWarRecordTime_26 = " + info.firstCivilWarRecordTime_26 + "," +
        			"firstCivilWarRecordTime_27 = " + info.firstCivilWarRecordTime_27 + "," +
        			"firstCivilWarRecordTime_28 = " + info.firstCivilWarRecordTime_28 + "," +
        			"firstCivilWarRecordTime_29 = " + info.firstCivilWarRecordTime_29 + "," +
        			"firstCivilWarRecordTime_30 = " + info.firstCivilWarRecordTime_30 + "," +
        			"firstCivilWarRecordTime_31 = " + info.firstCivilWarRecordTime_31 +
        			" where id = " + info.id;
        	
        	desJdbc.execute(updateStr);
        }
	}
}
