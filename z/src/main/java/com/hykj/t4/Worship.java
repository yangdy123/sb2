package com.hykj.t4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class Worship {
	public static class worshipInfo {
		public long id;
		public long pid;
		public int worshipTimes_0;
		public int worshipTimes_1;
		public int worshipTimes_2;
		public int worshipTimes_3;
		public int worshipTimes_4;
		public int worshipTimes_5;
		public int worshipTimes_6;
		public int worshipTimes_7;
		public int worshipTimes_8;
		public int worshipTimes_9;
		public int worshipTimes_10;
		public int worshipTimes_11;
		public int worshipTimes_12;
		public int worshipTimes_13;
		public int worshipTimes_14;
		public int worshipTimes_15;
		public int worshipTimes_16;
		public int worshipTimes_17;
		public int worshipTimes_18;
		public int worshipTimes_19;
		public int worshipTimes_20;
		public int worshipTimes_21;
		public int worshipTimes_22;
		public int worshipTimes_23;
		public int worshipTimes_24;
		public int worshipTimes_25;
		public int worshipTimes_26;
		public int worshipTimes_27;
		public int worshipTimes_28;
		public int worshipTimes_29;
		public int worshipTimes_30;
		public int worshipTimes_31;
		public int worshipTimes_32;
		public int worshipTimes_33;
		public int worshipTimes_34;
		public int worshipTimes_35;
		public int worshipTimes_36;
		public int worshipTimes_37;
		public int worshipTimes_38;
		public int worshipTimes_39;
		public int worshipTimes_40;
		public int worshipTimes_41;
		public int worshipTimes_42;
		public int worshipTimes_43;
		public int worshipTimes_44;
		public int worshipTimes_45;
		public int worshipTimes_46;
		public int worshipTimes_47;
		public int worshipTimes_48;
		public int worshipTimes_49;
		public int beWorshipTimes_0;
		public int beWorshipTimes_1;
		public int beWorshipTimes_2;
		public int beWorshipTimes_3;
		public int beWorshipTimes_4;
		public int beWorshipTimes_5;
		public int beWorshipTimes_6;
		public int beWorshipTimes_7;
		public int beWorshipTimes_8;
		public int beWorshipTimes_9;
		public int beWorshipTimes_10;
		public int beWorshipTimes_11;
		public int beWorshipTimes_12;
		public int beWorshipTimes_13;
		public int beWorshipTimes_14;
		public int beWorshipTimes_15;
		public int beWorshipTimes_16;
		public int beWorshipTimes_17;
		public int beWorshipTimes_18;
		public int beWorshipTimes_19;
		public int beWorshipTimes_20;
		public int beWorshipTimes_21;
		public int beWorshipTimes_22;
		public int beWorshipTimes_23;
		public int beWorshipTimes_24;
		public int beWorshipTimes_25;
	}
	
	public static void run (JdbcTemplate srcJdbc, JdbcTemplate desJdbc) {
		
		String selectStr = "select * from worship";

        List<worshipInfo> worshipInfos = srcJdbc.query(selectStr, new org.springframework.jdbc.core.RowMapper<worshipInfo>() {
            @Override
            public worshipInfo mapRow(ResultSet resultSet, int i) throws SQLException {
            	worshipInfo info = new worshipInfo();
            	info.id = resultSet.getLong("id");
            	info.pid = resultSet.getLong("pid");
            	info.worshipTimes_0 = resultSet.getInt("worshipTimes_0");
            	info.worshipTimes_1 = resultSet.getInt("worshipTimes_1");
            	info.worshipTimes_2 = resultSet.getInt("worshipTimes_2");
            	info.worshipTimes_3 = resultSet.getInt("worshipTimes_3");
            	info.worshipTimes_4 = resultSet.getInt("worshipTimes_4");
            	info.worshipTimes_5 = resultSet.getInt("worshipTimes_5");
            	info.worshipTimes_6 = resultSet.getInt("worshipTimes_6");
            	info.worshipTimes_7 = resultSet.getInt("worshipTimes_7");
            	info.worshipTimes_8 = resultSet.getInt("worshipTimes_8");
            	info.worshipTimes_9 = resultSet.getInt("worshipTimes_9");
            	info.worshipTimes_10 = resultSet.getInt("worshipTimes_10");
            	info.worshipTimes_11 = resultSet.getInt("worshipTimes_11");
            	info.worshipTimes_12 = resultSet.getInt("worshipTimes_12");
            	info.worshipTimes_13 = resultSet.getInt("worshipTimes_13");
            	info.worshipTimes_14 = resultSet.getInt("worshipTimes_14");
            	info.worshipTimes_15 = resultSet.getInt("worshipTimes_15");
            	info.worshipTimes_16 = resultSet.getInt("worshipTimes_16");
            	info.worshipTimes_17 = resultSet.getInt("worshipTimes_17");
            	info.worshipTimes_18 = resultSet.getInt("worshipTimes_18");
            	info.worshipTimes_19 = resultSet.getInt("worshipTimes_19");
            	info.worshipTimes_20 = resultSet.getInt("worshipTimes_20");
            	info.worshipTimes_21 = resultSet.getInt("worshipTimes_21");
            	info.worshipTimes_22 = resultSet.getInt("worshipTimes_22");
            	info.worshipTimes_23 = resultSet.getInt("worshipTimes_23");
            	info.worshipTimes_24 = resultSet.getInt("worshipTimes_24");
            	info.worshipTimes_25 = resultSet.getInt("worshipTimes_25");

            	info.beWorshipTimes_0= resultSet.getInt("beWorshipTimes_0");
            	info.beWorshipTimes_1= resultSet.getInt("beWorshipTimes_1");
            	info.beWorshipTimes_2= resultSet.getInt("beWorshipTimes_2");
            	info.beWorshipTimes_3= resultSet.getInt("beWorshipTimes_3");
            	info.beWorshipTimes_4= resultSet.getInt("beWorshipTimes_4");
            	info.beWorshipTimes_5= resultSet.getInt("beWorshipTimes_5");
            	info.beWorshipTimes_6= resultSet.getInt("beWorshipTimes_6");
            	info.beWorshipTimes_7= resultSet.getInt("beWorshipTimes_7");
            	info.beWorshipTimes_8= resultSet.getInt("beWorshipTimes_8");
            	info.beWorshipTimes_9= resultSet.getInt("beWorshipTimes_9");
            	info.beWorshipTimes_10 = resultSet.getInt("beWorshipTimes_10");
            	info.beWorshipTimes_11 = resultSet.getInt("beWorshipTimes_11");
            	info.beWorshipTimes_12 = resultSet.getInt("beWorshipTimes_12");
            	info.beWorshipTimes_13 = resultSet.getInt("beWorshipTimes_13");
            	info.beWorshipTimes_14 = resultSet.getInt("beWorshipTimes_14");
            	info.beWorshipTimes_15 = resultSet.getInt("beWorshipTimes_15");
            	info.beWorshipTimes_16 = resultSet.getInt("beWorshipTimes_16");
            	info.beWorshipTimes_17 = resultSet.getInt("beWorshipTimes_17");
            	info.beWorshipTimes_18 = resultSet.getInt("beWorshipTimes_18");
            	info.beWorshipTimes_19 = resultSet.getInt("beWorshipTimes_19");
            	info.beWorshipTimes_20 = resultSet.getInt("beWorshipTimes_20");
            	info.beWorshipTimes_21 = resultSet.getInt("beWorshipTimes_21");
            	info.beWorshipTimes_22 = resultSet.getInt("beWorshipTimes_22");
            	info.beWorshipTimes_23 = resultSet.getInt("beWorshipTimes_23");
            	info.beWorshipTimes_24 = resultSet.getInt("beWorshipTimes_24");
            	info.beWorshipTimes_25 = resultSet.getInt("beWorshipTimes_25");
            	
            	return info;
            }
        });
        
        for (worshipInfo info : worshipInfos) {
        	String updateStr = "update worship set " +
//        			"worshipTimes_0 = " + info.worshipTimes_0  + "," +
//        			"worshipTimes_1 = " + info.worshipTimes_1  + "," +
//        			"worshipTimes_2 = " + info.worshipTimes_2  + "," +
//        			"worshipTimes_3 = " + info.worshipTimes_3  + "," +
//        			"worshipTimes_4 = " + info.worshipTimes_4  + "," +
//        			"worshipTimes_5 = " + info.worshipTimes_5  + "," +
//        			"worshipTimes_6 = " + info.worshipTimes_6  + "," +
//        			"worshipTimes_7 = " + info.worshipTimes_7  + "," +
//        			"worshipTimes_8 = " + info.worshipTimes_8  + "," +
//        			"worshipTimes_9 = " + info.worshipTimes_9  + "," +
//        			"worshipTimes_10 = " + info.worshipTimes_10 + "," +
//        			"worshipTimes_11 = " + info.worshipTimes_11 + "," +
//        			"worshipTimes_12 = " + info.worshipTimes_12 + "," +
//        			"worshipTimes_13 = " + info.worshipTimes_13 + "," +
//        			"worshipTimes_14 = " + info.worshipTimes_14 + "," +
//        			"worshipTimes_15 = " + info.worshipTimes_15 + "," +
//        			"worshipTimes_16 = " + info.worshipTimes_16 + "," +
//        			"worshipTimes_17 = " + info.worshipTimes_17 + "," +
//        			"worshipTimes_18 = " + info.worshipTimes_18 + "," +
//        			"worshipTimes_19 = " + info.worshipTimes_19 + "," +
//        			"worshipTimes_20 = " + info.worshipTimes_20 + "," +
//        			"worshipTimes_21 = " + info.worshipTimes_21 + "," +
//        			"worshipTimes_22 = " + info.worshipTimes_22 + "," +
//        			"worshipTimes_23 = " + info.worshipTimes_23 + "," +
        			"worshipTimes_24 = " + info.worshipTimes_24 + "," +
        			"worshipTimes_25 = " + info.worshipTimes_25 + "," +
        			"beWorshipTimes_0 = " + info.beWorshipTimes_0 + "," +
        			"beWorshipTimes_1 = " + info.beWorshipTimes_1 + "," +
        			"beWorshipTimes_2 = " + info.beWorshipTimes_2 + "," +
        			"beWorshipTimes_3 = " + info.beWorshipTimes_3 + "," +
        			"beWorshipTimes_4 = " + info.beWorshipTimes_4 + "," +
        			"beWorshipTimes_5 = " + info.beWorshipTimes_5 + "," +
        			"beWorshipTimes_6 = " + info.beWorshipTimes_6 + "," +
        			"beWorshipTimes_7 = " + info.beWorshipTimes_7 + "," +
        			"beWorshipTimes_8 = " + info.beWorshipTimes_8 + "," +
        			"beWorshipTimes_9 = " + info.beWorshipTimes_9 + "," +
        			"beWorshipTimes_10 = " + info.beWorshipTimes_10 + "," +
        			"beWorshipTimes_11 = " + info.beWorshipTimes_11 + "," +
        			"beWorshipTimes_12 = " + info.beWorshipTimes_12 + "," +
        			"beWorshipTimes_13 = " + info.beWorshipTimes_13 + "," +
        			"beWorshipTimes_14 = " + info.beWorshipTimes_14 + "," +
        			"beWorshipTimes_15 = " + info.beWorshipTimes_15 + "," +
        			"beWorshipTimes_16 = " + info.beWorshipTimes_16 + "," +
        			"beWorshipTimes_17 = " + info.beWorshipTimes_17 + "," +
        			"beWorshipTimes_18 = " + info.beWorshipTimes_18 + "," +
        			"beWorshipTimes_19 = " + info.beWorshipTimes_19 + "," +
        			"beWorshipTimes_20 = " + info.beWorshipTimes_20 + "," +
        			"beWorshipTimes_21 = " + info.beWorshipTimes_21 + "," +
        			"beWorshipTimes_22 = " + info.beWorshipTimes_22 + "," +
        			"beWorshipTimes_23 = " + info.beWorshipTimes_23 + "," +
        			"beWorshipTimes_24 = " + info.beWorshipTimes_24 + "," +
        			"beWorshipTimes_25 = " + info.beWorshipTimes_25 +
        			" where id = " + info.id + " and pid = " + info.pid;
        	
        	desJdbc.execute(updateStr);
        }
	}
}
