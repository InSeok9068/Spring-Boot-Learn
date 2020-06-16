package com.example.demo.config.cache;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import net.sf.ehcache.CacheManager;

@Slf4j
@Component
public class CacheManagerCheck implements CommandLineRunner {

	private final CacheManager cacheManager;

	public CacheManagerCheck(CacheManager cacheManager) {
		this.cacheManager = cacheManager;
	}

	@Override
	public void run(String... strings) throws Exception {
		log.info("\n\n" + "=========================================================\n" + "Using cache manager: "
				+ this.cacheManager.getClass().getName() + "\n"
				+ "=========================================================\n\n");
	}
}