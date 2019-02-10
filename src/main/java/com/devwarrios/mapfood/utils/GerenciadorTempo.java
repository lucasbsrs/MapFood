package com.devwarrios.mapfood.utils;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GerenciadorTempo {

	private static Clock clock = Clock.fixed(Instant.parse("2019-02-05T16:45:42.01Z"), ZoneId.of("America/Sao_Paulo"));

	public GerenciadorTempo() {
	}

	public static LocalDateTime agora() {
		return LocalDateTime.now(clock);
	}
}