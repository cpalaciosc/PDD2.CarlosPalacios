package es.upm.miw.pd.singleton.logger;

import java.util.Date;

public final class Logger {
	private static Logger logger = null;
	private String logs;

	private Logger() {
		this.clear();
	}

	public static Logger getLogger() {
		if (logger == null) {
			logger = new Logger();
		}
		return logger;
	}

	public String getLogs() {
		return logs;
	}

	public void addLog(String log) {
		this.logs = this.logs + ">>> " + log + "\n";
	}

	public void clear() {
		this.logs = new Date().toString() + "\n";
	}
}
