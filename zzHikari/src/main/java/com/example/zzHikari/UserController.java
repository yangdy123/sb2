package com.example.zzHikari;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @SuppressWarnings("unchecked")
	@RequestMapping("/")
    public List<Player> getPlayer() {
//    	List<Player> list = jdbcTemplate.query("select id,name from player limit 10", new BeanPropertyRowMapper(Player.class));

        List<Player> serverConfigList = jdbcTemplate.query("select id,name from player limit 10", new RowMapper<Player>() {
            @Override
            public Player mapRow(ResultSet resultSet, int i) throws SQLException {
            	Player player = new Player();
            	player.id = resultSet.getLong("id");
            	player.name = resultSet.getString("name");

            	return player;
            }
        });
        
    	return serverConfigList;
    }

//    @SuppressWarnings("unchecked")
//	@RequestMapping("/")
//    public List<String> getPlayerName() {
//    	List<String> list = jdbcTemplate.queryForList("select name from player limit 10");
////    	List<Player> players = new ArrayList<>();
////    	for (int i = 0; i < list.size(); i ++) {
////    		Map<K, V>list.get(index)
////    		list.get(i)..get("id").
////    	}
//    	return list;
//    }
//    
//	@Autowired
//	private UserService UserService;
//	
//	@RequestMapping("/user/{id}")
//	public User getById(@PathVariable Long id) {
//		log.info("id={}",id);
//		return UserService.getById(id);
//	}
}
