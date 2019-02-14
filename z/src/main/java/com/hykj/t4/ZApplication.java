package com.hykj.t4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.jdbc.support.rowset.SqlRowSetMetaData;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
public class ZApplication {
	
	public static class ServerInfo {
		public String ip;
		int port;
		public String dbName;
		public String user;
		public String pwd;
		
		public ServerInfo(String ip, int port, String dbname, String user, String pwd) {
			this.ip = ip;
			this.port = port;
			this.dbName = dbname;
			this.user = user;
			this.pwd = pwd;
		}
	}
	
	private static ServerInfo serverInfo = new ServerInfo("118.25.79.93", 3578, "legend_game_merge_10_22", "lbcq", "lbCq2018-->");
	
	public static void main(String[] args) {
//		Func1();
//		Func2();
		System.out.println(">>> begin");
		SpringApplication.run(ZApplication.class, args);
		System.out.println(">>> end");

		Func3();
	}

	@SuppressWarnings("unchecked")
	public static List<ServerInfo> GetServerList1() {
		
		List<ServerInfo> serverList = Arrays.asList(
				new ServerInfo("118.25.81.213", 3578, "legend_game", "lbcq", "lbCq2018-->"),	//18
				new ServerInfo("118.25.80.73", 3578, "legend_game", "lbcq", "lbCq2018-->"),	//19
				new ServerInfo("212.64.20.110", 3578, "legend_game", "lbcq", "lbCq2018-->"),	//20
				new ServerInfo("118.25.79.93", 3578, "legend_game21", "lbcq", "lbCq2018-->"),	//21
				new ServerInfo("118.25.79.182", 3578, "legend_game30001022", "lbcq", "lbCq2018-->")	//22
				);
		
		return serverList;
	}
	
	@SuppressWarnings("unchecked")
	public static List<ServerInfo> GetServerList2() {
		List<ServerInfo> serverList = Arrays.asList(
				new ServerInfo("118.25.80.73", 3578, "legend_game", "lbcq", "lbCq2018-->"),	//19
//				new ServerInfo("212.64.20.110", 3578, "legend_game", "lbcq", "lbCq2018-->"),	//20
//				new ServerInfo("118.25.79.93", 3578, "legend_game21", "lbcq", "lbCq2018-->"),	//21
				new ServerInfo("118.25.79.182", 3578, "legend_game30001022", "lbcq", "lbCq2018-->")	//22		
				);
		
		return serverList;
	}

	@SuppressWarnings("unchecked")
	public static List<ServerInfo> GetServerList3() {
		List<ServerInfo> serverList = Arrays.asList(
				new ServerInfo("118.25.81.231", 3578, "legend_game_30001001_22", "lbcq", "lbCq2018-->"),		//30001002
				new ServerInfo("118.25.79.93", 3578, "legend_game_30001023_28", "lbcq", "lbCq2018-->"),		//30001002
				new ServerInfo("122.152.193.137", 3578, "legend_game_30001030", "lbcq", "lbCq2018-->"),	//30001003
				new ServerInfo("118.25.79.56", 3578, "legend_game_30001029", "lbcq", "lbCq2018-->")	//30001004
				);
		
		return serverList;
	}
	
	public static JdbcTemplate GetJdbc(ServerInfo serverInfo) {

	     HikariConfig config = new HikariConfig();
//	     config.setDataSourceClassName("com.zaxxer.hikari.HikariDataSource");
	     config.setUsername(serverInfo.user);
	     config.setPassword(serverInfo.pwd);
	     config.setJdbcUrl("jdbc:mysql://" + serverInfo.ip + ":" + serverInfo.port + "/" + serverInfo.dbName);
//	     config.setDriverClassName("com.mysql.jdbc.Driver");

	     HikariDataSource ds = new HikariDataSource(config);
         ds.setConnectionTimeout(5000);
         ds.setValidationTimeout(5000);
         ds.setIdleTimeout(30000);
         ds.setLeakDetectionThreshold(60000);
         ds.setMaxLifetime(1800000);
         ds.setMinimumIdle(5);
         ds.setMaximumPoolSize(8);
//         ds.setPassword(serverInfo.user);
//         ds.setUsername(serverInfo.pwd);
//         ds.setJdbcUrl("jdbc:mysql://" + serverInfo.ip + ":" + serverInfo.port + "/" + serverInfo.dbName);	      
	      
//		// JDBC模板依赖于连接池来获得数据的连接，所以必须先要构造连接池
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
////		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://" + serverInfo.ip + ":" + serverInfo.port + "/" + serverInfo.dbName);
//		dataSource.setUsername(serverInfo.user);
//		dataSource.setPassword(serverInfo.pwd);
////		dataSource.set
////		jdbc:mysql://{game.game_dbhost}/{game.game_dbname}?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false		
//		// 创建JDBC模板
//		JdbcTemplate jdbcTemplate = new JdbcTemplate();
//		// 这里也可以使用构造方法
//		jdbcTemplate.setDataSource(dataSource);
//		
 		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(ds);
		
		return jdbcTemplate;
	}
	
	public static void Func1() {
		JdbcTemplate desJdbc = GetJdbc(serverInfo);
		List<ServerInfo> serverList = GetServerList1();
		for (ServerInfo srcServer : serverList) {
			JdbcTemplate srcJdbc = GetJdbc(srcServer);
			System.out.println(srcServer.ip);
			Worship.run(srcJdbc, desJdbc);
		}
	}

	public static void Func2() {
		JdbcTemplate desJdbc = GetJdbc(serverInfo);
		List<ServerInfo> serverList = GetServerList2();
		for (ServerInfo srcServer : serverList) {
			JdbcTemplate srcJdbc = GetJdbc(srcServer);
			
			player.run(srcJdbc, desJdbc);
			character.run(srcJdbc, desJdbc);
			guild.run(srcJdbc, desJdbc);
		}
	}
	
	public static void Func3() {
		List<String> tables = Arrays.asList(
"RechargeRebateGain",		
"SouthBeatsInfo",
"TableVersionInfo",				
"account",				
"achievement",				
"activity",				
"activityRecord",				
"arena_competitor",				
"arena_fight_record",				
"character",				
"chatMessage",				
"citySpy",				
"city_message",				
"city_reward_draw_record",				
"civilPlayerData",				
"civilWarReport",				
"civilWarRole",				
"civilWarTechnology",				
"clientdata",				
"clientguide",				
"confReward",				
"dailyPlayerRefresh",				
"dailyWorldRefresh",				
"dailyactive",				
"dress",				
"droiyan",				
"droiyan_record",				
"droiyan_treasure",				
"equip",				
"equipBase",				
"fixedTimeMail",				
"friend",				
"friendApply",				
"globalMail",				
"globalRichRisk",				
"godReward",				
"godRewardRecord",				
"guild",				
"guildApply",				
"guildBoard",				
"guildBoss",				
"guildBossChallenge",				
"guildCity",				
"guildLog",				
"guildMember",				
"guildMemberSkill",				
"guildTaskLog",				
"guild_rank_record",				
"guildwarGuildResult",				
"guildwarResult",				
"guildwarapply",				
"guildwarpuppet",				
"instance_info",				
"item",				
"lingbao",				
"longnvApply",				
"longnvResult",				
"longnvWarResult",				
"longnvwarpuppet",				
"lottery",				
"marry",				
"marry_apply",				
"marry_divorce_apply",				
"newtitle",				
"player",				
"playerIcon",				
"playerIconBorder",				
"playerMail",				
"playerRechargeInfo",				
"playerRechargeRecord",				
"playerRecord",				
"playerSetting",				
"player_find_treasure",				
"player_goods",				
"qunying_gift",				
"rankInfo",				
"rank_record",				
"rebirth",				
"rechargeOrder",				
"rechargeOrderZhijiang",				
"rechargeReset",				
"red_packet",				
"red_packet_pick",				
"richRiskAvatar",				
"richRiskExchange",				
"serverConfig",				
"southBeatsData",				
"sswEnroll",				
"sswGuess",				
"sswRedPacket",				
"steal_gold",				
"steal_gold_news",				
"storeRecord",				
"taskInfo",				
"team",				
"title",				
"unlockFunctionReward",				
"unlockReward",				
"viceGeneral",				
"viceGeneralBase",				
"vipRecord",				
"warSpirit",				
"warSpiritTreasureRecord",				
"worldBoss",				
"worldBossChallenge",				
"worldBossKillRecord",				
"worship"
);
		
		List<ServerInfo> serverList = GetServerList3();
		int i = 0;
		Map<String, String[]> firstColoumNames = new HashMap<>();
		for (ServerInfo srcServer : serverList) {
			System.out.println("\n#####" + srcServer.ip);
			JdbcTemplate srcJdbc = GetJdbc(srcServer);
			for (String table : tables) {
//				String sql = "select * from `" + table + "` limit 1";  
//				RowCountCallbackHandler rcch = new RowCountCallbackHandler();  
//				srcJdbc.query(sql, rcch);
//				String[] coloumnName = rcch.getColumnNames();
				String[] coloumnName = GetColumns(srcJdbc, table);
				if (i == 0) {
					if (coloumnName == null) {
						System.out.println("\n+++++" + table + ":");
						System.out.println("     table null");
						continue;
					}
					firstColoumNames.put(table, coloumnName);
				} else {
					String[] firstColoumnName = firstColoumNames.get(table);
					if (coloumnName == null) {
						System.out.println("\n+++++" + table + ":");
						System.out.println("     table null");
						continue;
					}
					if (firstColoumnName == null) {
						continue;
					}
					if (firstColoumnName.length != coloumnName.length) {
						System.out.println("\n+++++" + table + ":");
						System.out.println("     lolumn nums error");
						continue;
					}
					if (firstColoumnName != null) {
						for(int j = 1; j < firstColoumnName.length; j ++) {
							if (! firstColoumnName[j].equals(coloumnName[j])) {
								System.out.println("\n+++++" + table + ":");
								System.out.println("     >>> " + coloumnName[j]); 
							}
						}
					}
				}
			}
			
			i ++;
		}  
	}
	
	public static String[] GetColumns(JdbcTemplate jdbcTemplate, String tableName) {
		List<String> columns = new ArrayList<>();
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet("select * from `" + tableName +"` limit 0");
		SqlRowSetMetaData metaData = rowSet.getMetaData();
		int columnCount = metaData.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {  
			columns.add(metaData.getColumnName(i));
//			Map<String,String> fieldMap = new HashMap<String,String>();
//			fieldMap.put("ColumnName", metaData.getColumnName(i));
//			fieldMap.put("ColumnType", String.valueOf(metaData.getColumnType(i)));
//			fieldMap.put("ColumnTypeName", metaData.getColumnTypeName(i));
//			fieldMap.put("CatalogName", metaData.getCatalogName(i));
//			fieldMap.put("ColumnClassName", metaData.getColumnClassName(i));
//			fieldMap.put("ColumnLabel", metaData.getColumnLabel(i));
//			fieldMap.put("Precision", String.valueOf(metaData.getPrecision(i)));
//			fieldMap.put("Scale", String.valueOf(metaData.getScale(i)));
//			fieldMap.put("SchemaName", metaData.getSchemaName(i));
//			fieldMap.put("TableName", metaData.getTableName(i));
//			fieldMap.put("SchemaName", metaData.getSchemaName(i));
//			System.out.println(fieldMap);
		}
		String[] strings = new String[columns.size()];
		columns.toArray(strings);
		return strings;
	}
}

