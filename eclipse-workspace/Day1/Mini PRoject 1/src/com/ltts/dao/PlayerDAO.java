package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configuration.MyConnection;
import com.ltts.model.Player;

public class PlayerDAO {

	public List<Player> getAllPlayers(){
		List<Player> li=new ArrayList<Player>();
		
		return li;
		}
		
		public Player getPlayerById(int id) {
			Player p = new Player();
				
			return p;
		}
		
			public boolean insertPlayer(Player p) throws Exception
			{
				Connection c= MyConnection.getConnection();
				PreparedStatement ps= c.prepareStatement("");
				return true;
		
		} 
	}
