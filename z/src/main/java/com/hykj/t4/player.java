package com.hykj.t4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class player {

	public static class playerInfo {
		public long id;
		public int dress_material;
		public int exp_material;
		public int rebirth;
		public int rebirthExp;
		public int preMainTaskId;
		public int curMainTaskCompleteCount;
		public int microRewardState;
		public int viceGeneratanceMaterial;
		public int viceGeneratanceInstanceTime;
		public int title_0;
		public int title_1;
		public int title_2;
		public int clientData_0;
		public int clientData_1;
		public int clientData_2;
		public int clientData_3;
		public int clientData_4;
		public int clientData_5;
		public int clientData_6;
		public int clientData_7;
		public int clientData_8;
		public int clientData_9;
	}
	
	public static void run (JdbcTemplate srcJdbc, JdbcTemplate desJdbc) {
		
		String selectStr = "select * from player";

        List<playerInfo> playerInfos = srcJdbc.query(selectStr, new org.springframework.jdbc.core.RowMapper<playerInfo>() {
            @Override
            public playerInfo mapRow(ResultSet resultSet, int i) throws SQLException {
            	playerInfo info = new playerInfo();
            	info.id = resultSet.getLong("id");
            	info.dress_material = resultSet.getInt("dress_material");
            	info.exp_material = resultSet.getInt("exp_material");
            	info.rebirth = resultSet.getInt("rebirth");
            	info.rebirthExp = resultSet.getInt("rebirthExp");
            	info.preMainTaskId = resultSet.getInt("preMainTaskId");
            	info.curMainTaskCompleteCount = resultSet.getInt("curMainTaskCompleteCount");
            	info.microRewardState = resultSet.getInt("microRewardState");
            	info.viceGeneratanceMaterial = resultSet.getInt("viceGeneratanceMaterial");
            	info.viceGeneratanceInstanceTime = resultSet.getInt("viceGeneratanceInstanceTime");
            	info.title_0 = resultSet.getInt("title_0");
            	info.title_1 = resultSet.getInt("title_1");
            	info.title_2 = resultSet.getInt("title_2");
            	info.clientData_0 = resultSet.getInt("clientData_0");
            	info.clientData_1 = resultSet.getInt("clientData_1");
            	info.clientData_2 = resultSet.getInt("clientData_2");
            	info.clientData_3 = resultSet.getInt("clientData_3");
            	info.clientData_4 = resultSet.getInt("clientData_4");
            	info.clientData_5 = resultSet.getInt("clientData_5");
            	info.clientData_6 = resultSet.getInt("clientData_6");
            	info.clientData_7 = resultSet.getInt("clientData_7");
            	info.clientData_8 = resultSet.getInt("clientData_8");
            	info.clientData_9 = resultSet.getInt("clientData_9");
            	
            	return info;
            }
        });
        
        for (playerInfo info : playerInfos) {
        	String updateStr = "update player set " +
        			"dress_material = " + info.dress_material  + "," +
        			"exp_material = " + info.exp_material  + "," +
        			"rebirth = " + info.rebirth  + "," +
        			"rebirthExp = " + info.rebirthExp  + "," +
        			"preMainTaskId = " + info.preMainTaskId  + "," +
        			"curMainTaskCompleteCount = " + info.curMainTaskCompleteCount  + "," +
        			"microRewardState = " + info.microRewardState  + "," +
        			"viceGeneratanceMaterial = " + info.viceGeneratanceMaterial  + "," +
        			"viceGeneratanceInstanceTime = " + info.viceGeneratanceInstanceTime  + "," +
        			"title_0 = " + info.title_0 + "," +
        			"title_1 = " + info.title_1 + "," +
        			"title_2 = " + info.title_2 + "," +
        			"clientData_0 = " + info.clientData_0 + "," +
        			"clientData_1 = " + info.clientData_1 + "," +
        			"clientData_2 = " + info.clientData_2 + "," +
        			"clientData_3 = " + info.clientData_3 + "," +
        			"clientData_4 = " + info.clientData_4 + "," +
        			"clientData_5 = " + info.clientData_5 + "," +
        			"clientData_6 = " + info.clientData_6 + "," +
        			"clientData_7 = " + info.clientData_7 + "," +
        			"clientData_8 = " + info.clientData_8 + "," +
        			"clientData_9 = " + info.clientData_9 +
        			" where id = " + info.id;
        	
        	desJdbc.execute(updateStr);
        }
	}
}
