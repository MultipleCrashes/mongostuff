package com.redis.service;


import java.util.Set;

import redis.clients.jedis.Jedis;
public class RedisClient {
	
	
	public static void main(String args[]) {
	Jedis jedishandle = new Jedis("localhost");
	System.out.println("Setting key vlaue to redis");
	for(int i=0; i<=100; i++)
	{
		String x = Integer.toString(i);
		System.out.println("Entering into redis " + i);
	jedishandle.set(x,"x");
	}
	System.out.println("Connection to redis client success");
	System.out.println("Connection to redis client successful");
	Set<String> keys = jedishandle.keys("harish");
	System.out.println("All keys in redis" + keys);
	
	}
}
